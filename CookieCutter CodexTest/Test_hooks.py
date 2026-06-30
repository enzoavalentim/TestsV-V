import errno
import os

import pytest

from cookiecutter import hooks
from cookiecutter.exceptions import FailedHookException


def test_valid_hook_accepts_supported_hook_and_rejects_backup():
    assert hooks.valid_hook("pre_gen_project.py", "pre_gen_project") is True
    assert hooks.valid_hook("pre_gen_project.py~", "pre_gen_project") is False
    assert hooks.valid_hook("unknown.py", "unknown") is False


def test_find_hook_returns_matching_absolute_scripts(tmp_path, monkeypatch):
    hooks_dir = tmp_path / "hooks"
    hooks_dir.mkdir()
    (hooks_dir / "pre_gen_project.py").write_text("print('ok')", encoding="utf-8")
    (hooks_dir / "post_gen_project.py").write_text("print('skip')", encoding="utf-8")
    monkeypatch.chdir(tmp_path)

    result = hooks.find_hook("pre_gen_project")

    assert result == [os.path.abspath(hooks_dir / "pre_gen_project.py")]


def test_run_script_raises_failed_hook_for_nonzero_exit(monkeypatch, tmp_path):
    script = tmp_path / "hook.sh"
    script.write_text("#!/bin/sh\nexit 1\n", encoding="utf-8")

    with pytest.raises(FailedHookException):
        hooks.run_script(str(script), tmp_path)


def test_run_script_converts_enoexec_to_failed_hook(monkeypatch, tmp_path):
    script = tmp_path / "hook.sh"
    script.write_text("", encoding="utf-8")

    class BadPopen:
        def __init__(self, *_args, **_kwargs):
            raise OSError(errno.ENOEXEC, "bad executable")

    monkeypatch.setattr(hooks.subprocess, "Popen", BadPopen)

    with pytest.raises(FailedHookException, match="missing a shebang"):
        hooks.run_script(str(script), tmp_path)

