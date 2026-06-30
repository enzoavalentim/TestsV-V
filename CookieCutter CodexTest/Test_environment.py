import pytest
from jinja2 import UndefinedError

from cookiecutter.environment import StrictEnvironment
from cookiecutter.exceptions import UnknownExtension


def test_strict_environment_loads_default_filters_and_globals():
    env = StrictEnvironment()

    assert "jsonify" in env.filters
    assert "slugify" in env.filters
    assert "random_ascii_string" in env.globals
    assert "uuid4" in env.globals


def test_strict_environment_raises_for_undefined_variables():
    env = StrictEnvironment()

    with pytest.raises(UndefinedError):
        env.from_string("{{ missing }}").render()


def test_strict_environment_wraps_unknown_extensions():
    context = {"cookiecutter": {"_extensions": ["does.not.Exist"]}}

    with pytest.raises(UnknownExtension):
        StrictEnvironment(context=context)

