import logging

from cookiecutter.log import configure_logger


def test_configure_logger_adds_stream_handler_and_resets_existing_handlers():
    logger = logging.getLogger("cookiecutter")
    logger.addHandler(logging.NullHandler())

    configured = configure_logger(stream_level="INFO")

    assert configured is logger
    assert configured.level == logging.DEBUG
    assert len(configured.handlers) == 1
    assert configured.handlers[0].level == logging.INFO


def test_configure_logger_adds_debug_file_handler(tmp_path):
    debug_file = tmp_path / "debug.log"

    logger = configure_logger(stream_level="DEBUG", debug_file=str(debug_file))
    logger.debug("hello")

    assert len(logger.handlers) == 2
    assert "hello" in debug_file.read_text(encoding="utf-8")

