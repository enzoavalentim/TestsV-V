import os

import pytest

from cookiecutter import config
from cookiecutter.exceptions import ConfigDoesNotExistException, InvalidConfiguration


def test_expand_path_expands_environment_and_user(monkeypatch, tmp_path):
    monkeypatch.setenv("COOKIECUTTER_TEST_HOME", str(tmp_path))

    expanded = config._expand_path("$COOKIECUTTER_TEST_HOME/project")

    assert expanded == os.path.join(str(tmp_path), "project")


def test_merge_configs_merges_nested_without_mutating_default():
    default = {"nested": {"keep": "yes", "replace": "old"}, "plain": "old"}
    overwrite = {"nested": {"replace": "new"}, "plain": "new"}

    merged = config.merge_configs(default, overwrite)

    assert merged == {"nested": {"keep": "yes", "replace": "new"}, "plain": "new"}
    assert default["nested"]["replace"] == "old"


def test_get_config_reads_yaml_and_expands_paths(tmp_path):
    cfg = tmp_path / "cookiecutterrc"
    cfg.write_text(
        "cookiecutters_dir: $HOME/custom-cookiecutters\n"
        "replay_dir: ~/custom-replay\n",
        encoding="utf-8",
    )

    result = config.get_config(cfg)

    assert result["cookiecutters_dir"].endswith("custom-cookiecutters")
    assert result["replay_dir"].endswith("custom-replay")


def test_get_config_rejects_missing_and_non_mapping(tmp_path):
    with pytest.raises(ConfigDoesNotExistException):
        config.get_config(tmp_path / "missing.yml")

    cfg = tmp_path / "bad.yml"
    cfg.write_text("- not\n- a\n- mapping\n", encoding="utf-8")
    with pytest.raises(InvalidConfiguration):
        config.get_config(cfg)

