import json

import pytest

from cookiecutter import replay


def test_get_file_name_adds_json_suffix_once(tmp_path):
    assert replay.get_file_name(tmp_path, "demo").endswith("demo.json")
    assert replay.get_file_name(tmp_path, "demo.json").endswith("demo.json")


def test_dump_and_load_round_trip_context(tmp_path):
    context = {"cookiecutter": {"project": "demo"}}

    replay.dump(tmp_path, "demo", context)

    assert json.loads((tmp_path / "demo.json").read_text(encoding="utf-8")) == context
    assert replay.load(tmp_path, "demo") == context


def test_dump_and_load_require_cookiecutter_key(tmp_path):
    with pytest.raises(ValueError):
        replay.dump(tmp_path, "bad", {"other": {}})

    (tmp_path / "bad.json").write_text('{"other": {}}', encoding="utf-8")
    with pytest.raises(ValueError):
        replay.load(tmp_path, "bad")

