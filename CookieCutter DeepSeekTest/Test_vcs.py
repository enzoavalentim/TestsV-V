import subprocess

import pytest

from cookiecutter import vcs
from cookiecutter.exceptions import RepositoryCloneFailed, RepositoryNotFound, UnknownRepoType, VCSNotInstalled


def test_identify_repo_detects_explicit_and_implicit_types():
    assert vcs.identify_repo("git+https://example.com/repo") == ("git", "https://example.com/repo")
    assert vcs.identify_repo("https://bitbucket.org/team/repo") == ("hg", "https://bitbucket.org/team/repo")


def test_identify_repo_rejects_unknown_type():
    with pytest.raises(UnknownRepoType):
        vcs.identify_repo("svn+https://example.com/repo")


def test_is_vcs_installed_uses_which(monkeypatch):
    monkeypatch.setattr(vcs, "which", lambda name: f"/usr/bin/{name}" if name == "git" else None)

    assert vcs.is_vcs_installed("git") is True
    assert vcs.is_vcs_installed("hg") is False


def test_clone_raises_when_vcs_is_not_installed(monkeypatch, tmp_path):
    monkeypatch.setattr(vcs, "is_vcs_installed", lambda _repo_type: False)

    with pytest.raises(VCSNotInstalled):
        vcs.clone("git+https://example.com/repo.git", clone_to_dir=tmp_path)


def test_clone_maps_not_found_and_branch_errors(monkeypatch, tmp_path):
    monkeypatch.setattr(vcs, "is_vcs_installed", lambda _repo_type: True)

    def not_found(*_args, **_kwargs):
        raise subprocess.CalledProcessError(1, "git", output=b"not found")

    monkeypatch.setattr(vcs.subprocess, "check_output", not_found)
    with pytest.raises(RepositoryNotFound):
        vcs.clone("git+https://example.com/repo.git", clone_to_dir=tmp_path)

    def bad_branch(*_args, **_kwargs):
        raise subprocess.CalledProcessError(1, "git", output=b"error: pathspec")

    monkeypatch.setattr(vcs.subprocess, "check_output", bad_branch)
    with pytest.raises(RepositoryCloneFailed):
        vcs.clone("git+https://example.com/repo.git", checkout="missing", clone_to_dir=tmp_path)

