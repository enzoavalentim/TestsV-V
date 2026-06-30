import re
import uuid
import json

from jinja2 import Environment

from cookiecutter.environment import StrictEnvironment
from cookiecutter.extensions import TimeExtension


def test_jsonify_and_slugify_filters_render_expected_values():
    env = StrictEnvironment()

    rendered_json = env.from_string("{{ value|jsonify(0) }}").render(value={"b": 1, "a": 2})
    assert json.loads(rendered_json) == {"a": 2, "b": 1}
    assert env.from_string("{{ value|slugify }}").render(value="Hello World!") == "hello-world"


def test_random_string_and_uuid_globals_have_expected_shape():
    env = StrictEnvironment()

    random_value = env.globals["random_ascii_string"](12)
    uuid_value = env.globals["uuid4"]()

    assert len(random_value) == 12
    assert random_value.isalpha()
    assert str(uuid.UUID(uuid_value)) == uuid_value


def test_time_extension_formats_current_date():
    rendered = Environment(extensions=[TimeExtension]).from_string("{% now 'UTC', '%Y' %}").render()

    assert re.fullmatch(r"\d{4}", rendered)
