import pytest

from cookiecutter.environment import StrictEnvironment
from cookiecutter.exceptions import NonTemplatedInputDirException
from cookiecutter.find import find_template


def test_find_template_returns_cookiecutter_directory(tmp_path):
    template_dir = tmp_path / "{{ cookiecutter.project_slug }}"
    template_dir.mkdir()

    result = find_template(tmp_path, StrictEnvironment())

    assert result == template_dir


def test_find_template_raises_when_no_template_dir_exists(tmp_path):
    (tmp_path / "plain").mkdir()

    with pytest.raises(NonTemplatedInputDirException):
        find_template(tmp_path, StrictEnvironment())

