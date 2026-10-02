#!/usr/bin/env python3

import argparse
import json
import os
import re
import shutil
import signal
import subprocess
import sys
import tarfile
import tempfile
from pathlib import Path


REPO_DIR = Path("/workspace")

EVOSUITE_ROOT = (
    REPO_DIR
    / "DynaMOSA-EvoSuite"
    / "TestCode"
)

KEX_ROOT = (
    REPO_DIR
    / "Reanimator-Kex"
    / "TestCode"
)

OUTPUT_ROOT = (
    REPO_DIR
    / "evaluation"
    / "coverage"
)


def run_command(cmd, cwd=None, timeout=None):
    process = subprocess.Popen(
        cmd,
        cwd=cwd,
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
        start_new_session=True,
    )

    try:
        output, _ = process.communicate(
            timeout=timeout,
        )

        return process.returncode, output

    except subprocess.TimeoutExpired:
        # Kill the whole process group:
        # defects4j -> ant -> java -> JUnit
        try:
            os.killpg(
                os.getpgid(process.pid),
                signal.SIGTERM,
            )
        except ProcessLookupError:
            pass

        try:
            output, _ = process.communicate(
                timeout=5,
            )

        except subprocess.TimeoutExpired:
            try:
                os.killpg(
                    os.getpgid(process.pid),
                    signal.SIGKILL,
                )
            except ProcessLookupError:
                pass

            output, _ = process.communicate()

        return 124, output or ""


def extract_package(text):
    match = re.search(
        r"^\s*package\s+([A-Za-z0-9_.$]+)\s*;",
        text,
        flags=re.MULTILINE,
    )

    if match:
        return match.group(1)

    return ""


def extract_public_class(text):
    match = re.search(
        r"^\s*public\s+class\s+"
        r"([A-Za-z_$][A-Za-z0-9_$]*)",
        text,
        flags=re.MULTILINE,
    )

    if match:
        return match.group(1)

    return None


def prepare_evosuite_sources(
    project,
    bug_id,
    suite_root,
):
    source_dir = EVOSUITE_ROOT / project

    pattern = f"{project}_{bug_id}_*.java"
    source_files = sorted(source_dir.glob(pattern))

    if not source_files:
        raise RuntimeError(
            f"No EvoSuite files found: "
            f"{source_dir}/{pattern}"
        )

    prepared = []

    for src in source_files:
        text = src.read_text(
            encoding="utf-8",
            errors="replace",
        )

        class_name = extract_public_class(text)

        if not class_name:
            print(
                f"  [SKIP] no public class: "
                f"{src.name}"
            )
            continue

        package = extract_package(text)

        if package:
            dest_dir = (
                suite_root
                / Path(package.replace(".", "/"))
            )
        else:
            dest_dir = suite_root

        dest_dir.mkdir(
            parents=True,
            exist_ok=True,
        )

        # Java filename must match public class name.
        dest = dest_dir / f"{class_name}.java"

        shutil.copy2(src, dest)

        prepared.append({
            "source": str(src),
            "destination": str(dest),
            "package": package,
            "class_name": class_name,
        })

    if not prepared:
        raise RuntimeError(
            "No usable EvoSuite Java sources"
        )

    return prepared


def prepare_kex_sources(
    project,
    bug_id,
    suite_root,
):
    source_dir = KEX_ROOT / project

    pattern = f"{project}_{bug_id}_*.java"
    source_files = sorted(source_dir.glob(pattern))

    if not source_files:
        raise RuntimeError(
            f"No KEX files found: "
            f"{source_dir}/{pattern}"
        )

    prepared = []

    for src in source_files:
        text = src.read_text(
            encoding="utf-8",
            errors="replace",
        )

        class_name = extract_public_class(text)

        if not class_name:
            print(
                f"  [SKIP] no public class: "
                f"{src.name}"
            )
            continue

        package = extract_package(text)

        if package:
            dest_dir = (
                suite_root
                / Path(package.replace(".", "/"))
            )
        else:
            dest_dir = suite_root

        dest_dir.mkdir(
            parents=True,
            exist_ok=True,
        )

        # Java filename must match public class name.
        dest = dest_dir / f"{class_name}.java"

        shutil.copy2(src, dest)

        prepared.append({
            "source": str(src),
            "destination": str(dest),
            "package": package,
            "class_name": class_name,
        })

    if not prepared:
        raise RuntimeError(
            "No usable KEX Java sources"
        )

    return prepared


def create_archive(
    suite_root,
    archive_path,
):
    with tarfile.open(
        archive_path,
        "w:bz2",
    ) as tar:

        for path in sorted(
            suite_root.rglob("*.java")
        ):
            arcname = path.relative_to(
                suite_root
            )

            tar.add(
                path,
                arcname=str(arcname),
            )


def checkout_bug(
    project,
    bug_id,
    checkout_dir,
):
    version = f"{bug_id}b"

    cmd = [
        "defects4j",
        "checkout",
        "-p", project,
        "-v", version,
        "-w", str(checkout_dir),
    ]

    return run_command(
        cmd,
        timeout=600,
    )


def parse_coverage_output(output):
    patterns = {
        "lines_total": (
            r"Lines total:\s*(\d+)"
        ),
        "lines_covered": (
            r"Lines covered:\s*(\d+)"
        ),
        "conditions_total": (
            r"Conditions total:\s*(\d+)"
        ),
        "conditions_covered": (
            r"Conditions covered:\s*(\d+)"
        ),
        "line_coverage": (
            r"Line coverage:\s*"
            r"([0-9.]+)%"
        ),
        "condition_coverage": (
            r"Condition coverage:\s*"
            r"([0-9.]+)%"
        ),
    }

    data = {}

    for key, pattern in patterns.items():
        match = re.search(pattern, output)

        if not match:
            return None

        if "coverage" in key:
            data[key] = float(
                match.group(1)
            )
        else:
            data[key] = int(
                match.group(1)
            )

    return data


def save_failure(
    result_dir,
    project,
    bug_id,
    tool,
    status,
    output,
    prepared_files=0,
):
    result_dir.mkdir(
        parents=True,
        exist_ok=True,
    )

    summary = {
        "project": project,
        "bug_id": str(bug_id),
        "tool": tool,
        "status": status,
        "prepared_files": prepared_files,
    }

    (
        result_dir / "summary.json"
    ).write_text(
        json.dumps(
            summary,
            indent=2,
            ensure_ascii=False,
        ) + "\n",
        encoding="utf-8",
    )

    (
        result_dir / "error.txt"
    ).write_text(
        output,
        encoding="utf-8",
        errors="replace",
    )


def evaluate(
    project,
    bug_id,
    tool,
    timeout_sec,
):
    print()
    print("=" * 70)
    print(
        f"COVERAGE: "
        f"{project}-{bug_id} / {tool}"
    )
    print("=" * 70)

    result_dir = (
        OUTPUT_ROOT
        / tool
        / project
        / str(bug_id)
    )

    result_dir.mkdir(
        parents=True,
        exist_ok=True,
    )

    with tempfile.TemporaryDirectory(
        prefix=(
            f"coverage_{tool}_"
            f"{project}_{bug_id}_"
        )
    ) as tmp:

        tmp_root = Path(tmp)

        suite_root = (
            tmp_root / "suite"
        )

        checkout_dir = (
            tmp_root / "checkout"
        )

        archive_path = (
            tmp_root
            / (
                f"{project}-"
                f"{bug_id}b-"
                f"{tool}.1.tar.bz2"
            )
        )

        suite_root.mkdir(
            parents=True
        )

        print("  [PREPARE]")

        try:
            if tool == "evosuite":
                prepared = prepare_evosuite_sources(
                    project,
                    bug_id,
                    suite_root,
                )
            elif tool == "kex":
                prepared = prepare_kex_sources(
                    project,
                    bug_id,
                    suite_root,
                )
            else:
                raise RuntimeError(
                    f"Unsupported tool: {tool}"
                )
        except Exception as e:
            save_failure(
                result_dir,
                project,
                bug_id,
                tool,
                "prepare_failed",
                repr(e),
            )

            print(
                f"PREPARE FAILED: {e}"
            )

            return 2

        print(
            f"  [FILES] {len(prepared)}"
        )

        print("  [ARCHIVE]")

        create_archive(
            suite_root,
            archive_path,
        )

        print("  [CHECKOUT]")

        code, output = checkout_bug(
            project,
            bug_id,
            checkout_dir,
        )

        if code != 0:
            save_failure(
                result_dir,
                project,
                bug_id,
                tool,
                "checkout_failed",
                output,
                len(prepared),
            )

            print("CHECKOUT FAILED")
            print(output[-4000:])

            return 2

        print("  [COVERAGE]")

        code, coverage_output = (
            run_command(
                [
                    "defects4j",
                    "coverage",
                    "-s",
                    str(archive_path),
                ],
                cwd=checkout_dir,
                timeout=timeout_sec,
            )
        )

        coverage = parse_coverage_output(
            coverage_output
        )

        if (
            code != 0
            or coverage is None
        ):
            status = (
                "timeout"
                if code == 124
                else "coverage_failed"
            )

            save_failure(
                result_dir,
                project,
                bug_id,
                tool,
                status,
                coverage_output,
                len(prepared),
            )

            print()
            print(
                f"COVERAGE FAILED "
                f"(exit={code})"
            )
            print(
                coverage_output[-5000:]
            )

            return 2

        failing_tests = (
            checkout_dir / "failing_tests"
        )

        failing_text = ""

        if failing_tests.is_file():
            failing_text = (
                failing_tests.read_text(
                    encoding="utf-8",
                    errors="replace",
                )
            )

        raw_failing_test_count = len(
            re.findall(
                r"^--- ",
                failing_text,
                flags=re.MULTILINE,
            )
        )

        helper_failure_count = 0

        if tool == "kex":
            helper_failure_count = len(
                re.findall(
                    r"^--- .*\.(?:EqualityUtils|ReflectionUtils)$",
                    failing_text,
                    flags=re.MULTILINE,
                )
            )

        failing_test_count = max(
            0,
            raw_failing_test_count
            - helper_failure_count,
        )

        summary = {
            "project": project,
            "bug_id": str(bug_id),
            "tool": tool,
            "status": "success",
            "prepared_files": len(prepared),
            **coverage,
            "has_failing_tests": (
                failing_test_count > 0
            ),
            "failing_test_count": (
                failing_test_count
            ),
            "raw_failing_test_count": (
                raw_failing_test_count
            ),
            "helper_failure_count": (
                helper_failure_count
            ),
        }

        (
            result_dir / "summary.json"
        ).write_text(
            json.dumps(
                summary,
                indent=2,
                ensure_ascii=False,
            ) + "\n",
            encoding="utf-8",
        )

        (
            result_dir / "coverage_output.txt"
        ).write_text(
            coverage_output,
            encoding="utf-8",
            errors="replace",
        )

        if failing_text.strip():
            (
                result_dir
                / "failing_tests.txt"
            ).write_text(
                failing_text,
                encoding="utf-8",
                errors="replace",
            )

        print()
        print("=" * 70)
        print("SUMMARY")
        print("=" * 70)

        print(
            f"Prepared files     : "
            f"{len(prepared)}"
        )

        print(
            f"Lines              : "
            f"{coverage['lines_covered']}/"
            f"{coverage['lines_total']}"
        )

        print(
            f"Line coverage      : "
            f"{coverage['line_coverage']:.1f}%"
        )

        print(
            f"Conditions         : "
            f"{coverage['conditions_covered']}/"
            f"{coverage['conditions_total']}"
        )

        print(
            f"Condition coverage : "
            f"{coverage['condition_coverage']:.1f}%"
        )

        print(
            f"Failing tests      : "
            f"{failing_test_count > 0}"
        )

        print(
            f"Failing test count : "
            f"{failing_test_count}"
        )

        print()
        print(
            "JSON : "
            f"{result_dir / 'summary.json'}"
        )

        return 0


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Evaluate Defects4J coverage "
            "for generated tests"
        )
    )

    parser.add_argument(
        "--project",
        required=True,
    )

    parser.add_argument(
        "--bug",
        required=True,
    )

    parser.add_argument(
        "--tool",
        default="evosuite",
        choices=["evosuite", "kex"],
    )

    parser.add_argument(
        "--timeout",
        type=int,
        default=600,
        help=(
            "Timeout in seconds for "
            "defects4j coverage"
        ),
    )

    args = parser.parse_args()

    return evaluate(
        args.project,
        args.bug,
        args.tool,
        args.timeout,
    )


if __name__ == "__main__":
    sys.exit(main())
