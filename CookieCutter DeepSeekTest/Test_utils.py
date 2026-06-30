import os
import stat

from jinja2 import Environment

from cookiecutter import utils
from cookiecutter.environment import StrictEnvironment


def test_make_sure_path_exists_creates_nested_directories(tmp_path):
    target = tmp_path / "a" / "b"

    utils.make_sure_path_exists(target)

    assert target.is_dir()


def test_work_in_changes_and_restores_current_directory(tmp_path):
    before = os.getcwd()

    with utils.work_in(tmp_path):
        assert os.getcwd() == str(tmp_path)

    assert os.getcwd() == before


def test_make_executable_adds_execute_bit(tmp_path):
    script = tmp_path / "script.sh"
    script.write_text("#!/bin/sh\n", encoding="utf-8")

    utils.make_executable(script)

    assert os.stat(script).st_mode & stat.S_IEXEC


def test_simple_filter_registers_filter_on_environment():
    def shout(value):
        return value.upper()

    env = Environment(extensions=[utils.simple_filter(shout)])

    assert env.from_string("{{ 'hi'|shout }}").render() == "HI"


def test_create_tmp_repo_dir_copies_repository(tmp_path):
    repo = tmp_path / "repo"
    repo.mkdir()
    (repo / "cookiecutter.json").write_text("{}", encoding="utf-8")

    copied = utils.create_tmp_repo_dir(repo)

    assert copied.name == "repo"
    assert (copied / "cookiecutter.json").is_file()
    utils.rmtree(copied.parent)


def test_create_env_with_context_applies_jinja_options():
    env = utils.create_env_with_context(
        {"cookiecutter": {"_jinja2_env_vars": {"variable_start_string": "[["}}}
    )

    assert isinstance(env, StrictEnvironment)
    assert env.variable_start_string == "[["

