from collections import OrderedDict

import pytest
from jinja2 import UndefinedError
from rich.prompt import InvalidResponse

from cookiecutter.environment import StrictEnvironment
from cookiecutter.prompt import (
    YesNoPrompt,
    choose_nested_template,
    process_json,
    prompt_choice_for_config,
    prompt_for_config,
    render_variable,
)


def test_yes_no_prompt_accepts_common_values_and_rejects_unknown():
    prompt = YesNoPrompt()

    assert prompt.process_response("YES") is True
    assert prompt.process_response("off") is False
    with pytest.raises(InvalidResponse):
        prompt.process_response("maybe")


def test_process_json_returns_ordered_dict_and_rejects_non_dict():
    result = process_json('{"a": 1, "b": 2}')

    assert result == OrderedDict([("a", 1), ("b", 2)])
    with pytest.raises(InvalidResponse):
        process_json("[1, 2]")


def test_render_variable_handles_nested_structures_and_templates():
    env = StrictEnvironment()
    cookiecutter_dict = {"project": "Demo App"}

    result = render_variable(
        env,
        {"slug": "{{ cookiecutter.project.lower().replace(' ', '-') }}", "enabled": True},
        cookiecutter_dict,
    )

    assert result == {"slug": "demo-app", "enabled": True}


def test_prompt_choice_for_config_no_input_returns_first_rendered_choice():
    env = StrictEnvironment()

    result = prompt_choice_for_config(
        {"name": "demo"},
        env,
        "license",
        ["{{ cookiecutter.name }}-MIT", "BSD"],
        no_input=True,
    )

    assert result == "demo-MIT"


def test_prompt_choice_for_config_rejects_empty_choices_with_no_input():
    with pytest.raises(ValueError):
        prompt_choice_for_config({}, StrictEnvironment(), "empty", [], no_input=True)


def test_prompt_for_config_no_input_renders_values_and_private_keys():
    context = {"cookiecutter": OrderedDict([("project", "Demo"), ("slug", "{{ cookiecutter.project|lower }}"), ("_copy_without_render", ["*.png"])])}

    result = prompt_for_config(context, no_input=True)

    assert result["project"] == "Demo"
    assert result["slug"] == "demo"
    assert result["_copy_without_render"] == ["*.png"]


def test_render_variable_propagates_undefined_error():
    with pytest.raises(UndefinedError):
        render_variable(StrictEnvironment(), "{{ cookiecutter.missing }}", {})


def test_choose_nested_template_rejects_absolute_path(tmp_path):
    context = {"cookiecutter": {"templates": {"bad": {"path": str(tmp_path)}}}}

    with pytest.raises(ValueError, match="Illegal template path"):
        choose_nested_template(context, tmp_path, no_input=True)

