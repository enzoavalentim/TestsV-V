import pytest

from cookiecutter import repository
from cookiecutter.exceptions import RepositoryNotFound


def test_is_repo_url_and_zip_file_detect_expected_values():
    assert repository.is_repo_url("https://example.com/repo.git") is True
    assert repository.is_repo_url("local-template") is False
    assert repository.is_zip_file("template.ZIP") is True
    assert repository.is_zip_file("template.tar.gz") is False


def test_expand_abbreviations_supports_exact_and_prefix_matches():
    abbreviations = {"gh": "https://github.com/{0}.git", "local": "template-dir"}

    assert repository.expand_abbreviations("local", abbreviations) == "template-dir"
    assert repository.expand_abbreviations("gh:owner/repo", abbreviations) == "https://github.com/owner/repo.git"
    assert repository.expand_abbreviations("plain", abbreviations) == "plain"


def test_repository_has_cookiecutter_json_requires_directory_and_file(tmp_path):
    repo = tmp_path / "repo"
    repo.mkdir()

    assert repository.repository_has_cookiecutter_json(str(repo)) is False
    (repo / "cookiecutter.json").write_text("{}", encoding="utf-8")
    assert repository.repository_has_cookiecutter_json(str(repo)) is True


def test_determine_repo_dir_finds_local_repo_and_directory(tmp_path):
    repo = tmp_path / "repo"
    nested = repo / "nested"
    nested.mkdir(parents=True)
    (nested / "cookiecutter.json").write_text("{}", encoding="utf-8")

    result, cleanup = repository.determine_repo_dir(
        str(repo), {}, tmp_path / "clone-cache", None, True, directory="nested"
    )

    assert result == str(nested)
    assert cleanup is False


def test_determine_repo_dir_raises_for_missing_repo(tmp_path):
    with pytest.raises(RepositoryNotFound):
        repository.determine_repo_dir("missing", {}, tmp_path, None, True)

