from collections import OrderedDict

import pytest

from cookiecutter.environment import StrictEnvironment
from cookiecutter.exceptions import ContextDecodingException, OutputDirExistsException
from cookiecutter.generate import (
    apply_overwrites_to_context,
    generate_context,
    generate_file,
    is_copy_only_path,
    render_and_create_dir,
)


def test_is_copy_only_path_matches_patterns_and_missing_config():
    context = {"cookiecutter": {"_copy_without_render": ["*.png", "static/*"]}}

    assert is_copy_only_path("logo.png", context) is True
    assert is_copy_only_path("static/app.js", context) is True
    assert is_copy_only_path("README.md", context) is False
    assert is_copy_only_path("README.md", {"cookiecutter": {}}) is False


def test_apply_overwrites_to_context_handles_choice_bool_and_nested_values():
    context = {"color": ["red", "blue"], "enabled": False, "meta": {"name": "old"}}

    apply_overwrites_to_context(
        context,
        {"color": "blue", "enabled": "yes", "meta": {"name": "new", "extra": "value"}},
    )

    assert context["color"][0] == "blue"
    assert context["enabled"] is True
    assert context["meta"] == {"name": "new", "extra": "value"}


def test_apply_overwrites_to_context_rejects_invalid_choice():
    with pytest.raises(ValueError):
        apply_overwrites_to_context({"color": ["red"]}, {"color": "green"})


def test_generate_context_reads_json_and_applies_extra_context(tmp_path):
    context_file = tmp_path / "cookiecutter.json"
    context_file.write_text('{"project": "demo", "license": ["MIT", "BSD"]}', encoding="utf-8")

    result = generate_context(str(context_file), extra_context={"license": "BSD"})

    assert result == OrderedDict([("cookiecutter", OrderedDict([("project", "demo"), ("license", ["BSD", "MIT"])]))])


def test_generate_context_wraps_invalid_json(tmp_path):
    context_file = tmp_path / "cookiecutter.json"
    context_file.write_text("{invalid", encoding="utf-8")

    with pytest.raises(ContextDecodingException):
        generate_context(str(context_file))


def test_render_and_create_dir_creates_and_rejects_existing(tmp_path):
    env = StrictEnvironment()
    context = {"cookiecutter": {"project": "demo"}}

    created, was_new = render_and_create_dir("{{ cookiecutter.project }}", context, tmp_path, env)

    assert created.is_dir()
    assert was_new is True
    with pytest.raises(OutputDirExistsException):
        render_and_create_dir("{{ cookiecutter.project }}", context, tmp_path, env)


def test_generate_file_renders_content_and_filename(tmp_path):
    template_root = tmp_path / "template"
    project_dir = tmp_path / "output"
    template_root.mkdir()
    project_dir.mkdir()
    infile = "{{ cookiecutter.name }}.txt"
    (template_root / infile).write_text("Hello {{ cookiecutter.name }}\n", encoding="utf-8")
    env = StrictEnvironment()
    env.loader = __import__("jinja2").FileSystemLoader(str(template_root))

    with __import__("cookiecutter.utils").utils.work_in(template_root):
        generate_file(str(project_dir), infile, {"cookiecutter": {"name": "World"}}, env)

    assert (project_dir / "World.txt").read_text(encoding="utf-8") == "Hello World"
