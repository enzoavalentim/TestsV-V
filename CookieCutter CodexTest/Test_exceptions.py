from jinja2 import TemplateError

from cookiecutter.exceptions import CookiecutterException, UndefinedVariableInTemplate


def test_undefined_variable_exception_string_includes_details():
    error = TemplateError("missing variable")
    exc = UndefinedVariableInTemplate("Unable to render", error, {"cookiecutter": {}})

    message = str(exc)

    assert "Unable to render" in message
    assert "missing variable" in message
    assert "cookiecutter" in message


def test_cookiecutter_exceptions_share_base_class():
    assert issubclass(UndefinedVariableInTemplate, CookiecutterException)

