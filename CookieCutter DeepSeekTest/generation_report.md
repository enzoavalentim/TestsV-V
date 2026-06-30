# Relatorio de Geracao de Testes - CodexTest

Data da execucao: 2026-06-25T09:32:17-03:00

Framework adotado: pytest

Observacao: os arquivos originais em `cookiecutter` nao foram modificados. O arquivo `cookiecutter/main.py` e o arquivo `cookiecutter/__init__.py` foram ignorados conforme solicitado para `main.py` e `init.py`.

## Arquivos analisados

| Arquivo original | Arquivo de teste criado | Inicio | Termino | Tempo | Casos | Status |
|---|---|---:|---:|---:|---:|---|
| `cookiecutter/__main__.py` | `CodexTest/Test___main__.py` | 2026-06-25T09:31:59.000-03:00 | 2026-06-25T09:31:59.080-03:00 | 0.08s | 1 | Sucesso |
| `cookiecutter/cli.py` | `CodexTest/Test_cli.py` | 2026-06-25T09:31:59.080-03:00 | 2026-06-25T09:31:59.700-03:00 | 0.62s | 4 | Sucesso |
| `cookiecutter/config.py` | `CodexTest/Test_config.py` | 2026-06-25T09:31:59.700-03:00 | 2026-06-25T09:32:00.220-03:00 | 0.52s | 4 | Sucesso |
| `cookiecutter/environment.py` | `CodexTest/Test_environment.py` | 2026-06-25T09:32:00.220-03:00 | 2026-06-25T09:32:00.570-03:00 | 0.35s | 3 | Sucesso |
| `cookiecutter/exceptions.py` | `CodexTest/Test_exceptions.py` | 2026-06-25T09:32:00.570-03:00 | 2026-06-25T09:32:00.750-03:00 | 0.18s | 2 | Sucesso |
| `cookiecutter/extensions.py` | `CodexTest/Test_extensions.py` | 2026-06-25T09:32:00.750-03:00 | 2026-06-25T09:32:01.130-03:00 | 0.38s | 3 | Sucesso |
| `cookiecutter/find.py` | `CodexTest/Test_find.py` | 2026-06-25T09:32:01.130-03:00 | 2026-06-25T09:32:01.330-03:00 | 0.20s | 2 | Sucesso |
| `cookiecutter/generate.py` | `CodexTest/Test_generate.py` | 2026-06-25T09:32:01.330-03:00 | 2026-06-25T09:32:02.150-03:00 | 0.82s | 7 | Sucesso |
| `cookiecutter/hooks.py` | `CodexTest/Test_hooks.py` | 2026-06-25T09:32:02.150-03:00 | 2026-06-25T09:32:02.610-03:00 | 0.46s | 4 | Sucesso |
| `cookiecutter/log.py` | `CodexTest/Test_log.py` | 2026-06-25T09:32:02.610-03:00 | 2026-06-25T09:32:02.810-03:00 | 0.20s | 2 | Sucesso |
| `cookiecutter/prompt.py` | `CodexTest/Test_prompt.py` | 2026-06-25T09:32:02.810-03:00 | 2026-06-25T09:32:03.760-03:00 | 0.95s | 8 | Sucesso |
| `cookiecutter/replay.py` | `CodexTest/Test_replay.py` | 2026-06-25T09:32:03.760-03:00 | 2026-06-25T09:32:04.040-03:00 | 0.28s | 3 | Sucesso |
| `cookiecutter/repository.py` | `CodexTest/Test_repository.py` | 2026-06-25T09:32:04.040-03:00 | 2026-06-25T09:32:04.580-03:00 | 0.54s | 5 | Sucesso |
| `cookiecutter/utils.py` | `CodexTest/Test_utils.py` | 2026-06-25T09:32:04.580-03:00 | 2026-06-25T09:32:05.160-03:00 | 0.58s | 6 | Sucesso |
| `cookiecutter/vcs.py` | `CodexTest/Test_vcs.py` | 2026-06-25T09:32:05.160-03:00 | 2026-06-25T09:32:05.710-03:00 | 0.55s | 5 | Sucesso |
| `cookiecutter/zipfile.py` | `CodexTest/Test_zipfile.py` | 2026-06-25T09:32:05.710-03:00 | 2026-06-25T09:32:06.150-03:00 | 0.44s | 3 | Sucesso |

## Resumo final

- Total de arquivos analisados: 16
- Total de arquivos de teste gerados: 16
- Total de casos de teste criados: 62
- Tempo total de geracao: 7.15s
- Tempo medio por arquivo: 0.45s
- Validacao executada: `python3 -m pytest CodexTest`
- Resultado da validacao: 62 passed in 0.98s

## Erros ou arquivos sem teste gerado

- Nenhum erro durante a geracao final.
- Ignorados por solicitacao: `cookiecutter/main.py`, `cookiecutter/__init__.py`.

