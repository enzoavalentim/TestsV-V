from cookiecutter.__main__ import main
from cookiecutter.cli import main as cli_main


def test_main_is_cli_entrypoint():
    assert main is cli_main

