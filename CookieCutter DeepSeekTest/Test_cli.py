from collections import OrderedDict

import click
import pytest

from cookiecutter import cli


def test_version_msg_contains_cookiecutter_and_python():
    message = cli.version_msg()

    assert "Cookiecutter" in message
    assert "Python" in message


def test_validate_extra_context_returns_ordered_dict():
    result = cli.validate_extra_context(None, None, ("name=demo", "answer=42"))

    assert result == OrderedDict([("name", "demo"), ("answer", "42")])


def test_validate_extra_context_rejects_invalid_value():
    with pytest.raises(click.BadParameter):
        cli.validate_extra_context(None, None, ("missing-separator",))


def test_list_installed_templates_prints_only_valid_templates(tmp_path, monkeypatch, capsys):
    template_root = tmp_path / "templates"
    valid = template_root / "valid-template"
    invalid = template_root / "invalid-template"
    valid.mkdir(parents=True)
    invalid.mkdir()
    (valid / "cookiecutter.json").write_text("{}", encoding="utf-8")

    monkeypatch.setattr(
        cli,
        "get_user_config",
        lambda *_args: {"cookiecutters_dir": str(template_root)},
    )

    cli.list_installed_templates(False, None)

    output = capsys.readouterr().out
    assert "1 installed templates" in output
    assert "valid-template" in output
    assert "invalid-template" not in output

