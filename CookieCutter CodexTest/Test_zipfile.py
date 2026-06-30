from zipfile import ZipFile

import pytest

from cookiecutter.exceptions import InvalidZipRepository
from cookiecutter.zipfile import unzip


def test_unzip_extracts_local_zip_with_top_level_directory(tmp_path):
    archive = tmp_path / "repo.zip"
    with ZipFile(archive, "w") as zf:
        zf.writestr("repo/", "")
        zf.writestr("repo/cookiecutter.json", "{}")

    result = unzip(str(archive), is_url=False, clone_to_dir=tmp_path / "cache")

    assert result.endswith("repo")
    assert __import__("pathlib").Path(result, "cookiecutter.json").is_file()


def test_unzip_rejects_empty_zip_and_missing_top_level_directory(tmp_path):
    empty = tmp_path / "empty.zip"
    with ZipFile(empty, "w"):
        pass

    with pytest.raises(InvalidZipRepository, match="empty"):
        unzip(str(empty), is_url=False, clone_to_dir=tmp_path / "cache1")

    bad = tmp_path / "bad.zip"
    with ZipFile(bad, "w") as zf:
        zf.writestr("cookiecutter.json", "{}")

    with pytest.raises(InvalidZipRepository, match="top-level"):
        unzip(str(bad), is_url=False, clone_to_dir=tmp_path / "cache2")


def test_unzip_downloads_url_with_mocked_requests(tmp_path, monkeypatch):
    archive = tmp_path / "source.zip"
    with ZipFile(archive, "w") as zf:
        zf.writestr("repo/", "")
        zf.writestr("repo/cookiecutter.json", "{}")
    data = archive.read_bytes()

    class Response:
        def iter_content(self, chunk_size):
            assert chunk_size == 1024
            yield data

    monkeypatch.setattr("cookiecutter.zipfile.requests.get", lambda *_args, **_kwargs: Response())

    result = unzip("https://example.com/repo.zip", is_url=True, clone_to_dir=tmp_path / "cache", no_input=True)

    assert result.endswith("repo")

