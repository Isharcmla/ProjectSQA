#!/usr/bin/env python3

import argparse
import json
import subprocess
import sys
import time
from collections import Counter
from pathlib import Path


REPO_DIR = Path(__file__).resolve().parents[1]

TOOL_CONFIG = {
    "evosuite": {
        "generation_dir": (
            REPO_DIR
            / "DynaMOSA-EvoSuite"
            / "Result_Round2"
        ),
        "coverage_dir": (
            REPO_DIR
            / "evaluation"
            / "coverage"
            / "evosuite"
        ),
    },
    "kex": {
        "generation_dir": (
            REPO_DIR
            / "Reanimator-Kex"
            / "Result_Round2"
        ),
        "coverage_dir": (
            REPO_DIR
            / "evaluation"
            / "coverage"
            / "kex"
        ),
    },
}

EVALUATOR = (
    REPO_DIR
    / "scripts"
    / "evaluate_coverage.py"
)


def load_generation_cases(tool):
    cases = []

    generation_dir = (
        TOOL_CONFIG[tool]["generation_dir"]
    )

    for path in sorted(
        generation_dir.rglob("*_result.json")
    ):
        try:
            data = json.loads(
                path.read_text(
                    encoding="utf-8",
                    errors="replace",
                )
            )
        except (
            OSError,
            json.JSONDecodeError,
        ) as exc:
            print(
                f"[WARN] Cannot read {path}: {exc}",
                file=sys.stderr,
            )
            continue

        if data.get("status") != "success":
            continue

        project = data.get("project")
        bug_id = data.get("bug_id")

        if project is None or bug_id is None:
            print(
                f"[WARN] Missing project/bug_id: {path}",
                file=sys.stderr,
            )
            continue

        cases.append(
            (
                str(project),
                str(bug_id),
                path,
            )
        )

    return cases


def read_existing_summary(
    tool,
    project,
    bug_id,
):
    coverage_dir = (
        TOOL_CONFIG[tool]["coverage_dir"]
    )

    path = (
        coverage_dir
        / project
        / str(bug_id)
        / "summary.json"
    )

    if not path.is_file():
        return None

    try:
        return json.loads(
            path.read_text(
                encoding="utf-8",
                errors="replace",
            )
        )
    except (
        OSError,
        json.JSONDecodeError,
    ):
        return None


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Run coverage evaluation "
            "for all successful generation cases."
        )
    )

    parser.add_argument(
        "--tool",
        required=True,
        choices=[
            "evosuite",
            "kex",
        ],
        help=(
            "Generated-test tool to evaluate."
        ),
    )

    parser.add_argument(
        "--timeout",
        type=int,
        default=600,
        help=(
            "Timeout passed to "
            "evaluate_coverage.py "
            "(default: 600 seconds)"
        ),
    )

    parser.add_argument(
        "--rerun",
        action="store_true",
        help=(
            "Re-run cases even when a valid "
            "summary.json already exists."
        ),
    )

    parser.add_argument(
        "--limit",
        type=int,
        default=None,
        help=(
            "Run at most N pending cases. "
            "Useful for testing the runner."
        ),
    )

    args = parser.parse_args()

    cases = load_generation_cases(
        args.tool
    )

    print("=" * 70)
    print(
        f"{args.tool.upper()} "
        f"FULL COVERAGE BENCHMARK"
    )
    print("=" * 70)
    print(f"Generation success cases : {len(cases)}")

    existing = []
    pending = []

    for project, bug_id, source in cases:
        summary = read_existing_summary(
            args.tool,
            project,
            bug_id,
        )

        if summary is not None and not args.rerun:
            existing.append(
                (
                    project,
                    bug_id,
                    summary,
                )
            )
        else:
            pending.append(
                (
                    project,
                    bug_id,
                    source,
                )
            )

    print(f"Existing summaries       : {len(existing)}")
    print(f"Pending                  : {len(pending)}")
    print()

    if args.limit is not None:
        pending = pending[:args.limit]
        print(
            f"Limit                    : "
            f"{args.limit}"
        )
        print(
            f"Will run                 : "
            f"{len(pending)}"
        )
        print()

    run_counts = Counter()
    started = time.time()

    total = len(pending)

    for index, (
        project,
        bug_id,
        source,
    ) in enumerate(pending, start=1):

        print()
        print("#" * 70)
        print(
            f"[{index}/{total}] "
            f"{project}-{bug_id}"
        )
        print("#" * 70)

        cmd = [
            sys.executable,
            str(EVALUATOR),
            "--project",
            project,
            "--bug",
            bug_id,
            "--tool",
            args.tool,
            "--timeout",
            str(args.timeout),
        ]

        try:
            result = subprocess.run(
                cmd,
                cwd=REPO_DIR,
            )

            exit_code = result.returncode

        except KeyboardInterrupt:
            print()
            print("Interrupted by user.")
            print(
                "Completed summaries are preserved."
            )
            return 130

        summary = read_existing_summary(
            args.tool,
            project,
            bug_id,
        )

        if summary is None:
            status = (
                "runner_error"
                if exit_code != 0
                else "missing_summary"
            )
        else:
            status = summary.get(
                "status",
                "unknown",
            )

        run_counts[status] += 1

        print()
        print(
            f"[RESULT] {project}-{bug_id}: "
            f"{status} "
            f"(exit={exit_code})"
        )

    elapsed = time.time() - started

    print()
    print("=" * 70)
    print("RUN SUMMARY")
    print("=" * 70)

    print(
        f"Generation success : "
        f"{len(cases)}"
    )

    print(
        f"Skipped existing   : "
        f"{len(existing)}"
    )

    print(
        f"Attempted          : "
        f"{len(pending)}"
    )

    for key in sorted(run_counts):
        print(
            f"{key:20s}: "
            f"{run_counts[key]}"
        )

    print(
        f"Elapsed seconds     : "
        f"{elapsed:.1f}"
    )

    return 0


if __name__ == "__main__":
    sys.exit(main())
