#!/usr/bin/env python3

import argparse
import csv
import json
import re
import shutil
import subprocess
import sys
import tempfile
from collections import Counter
from pathlib import Path


REPO_DIR = Path("/workspace")
CHECKOUT_ROOT = Path("/root/kex-testing/checkouts")

EVOSUITE_RUNTIME_JAR = Path(
    "/opt/defects4j/framework/lib/test_generation/runtime/"
    "evosuite-standalone-runtime-1.1.0.jar"
)

JUNIT4_JAR = Path(
    "/opt/defects4j/framework/projects/lib/"
    "junit-4.12-hamcrest-1.3.jar"
)


SINGLE_METHOD_RUNNER_SOURCE = r"""
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;

public class SingleMethodRunner {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.err.println(
                "Usage: SingleMethodRunner <class> <method>"
            );
            System.exit(2);
        }

        Class<?> testClass = Class.forName(args[0]);

        Request request = Request.method(
            testClass,
            args[1]
        );

        Result result = new JUnitCore().run(request);

        if (!result.wasSuccessful()) {
            result.getFailures().forEach(
                failure -> System.err.println(failure.toString())
            );
            System.exit(1);
        }

        System.exit(0);
    }
}
"""




KEX_RUNTIME_DEPS_DIR = Path("/opt/kex/runtime-deps/lib")

KEX_RUNTIME_JARS = [
    KEX_RUNTIME_DEPS_DIR / "hamcrest-core-1.3.jar",
    KEX_RUNTIME_DEPS_DIR / "junit-4.13.2.jar",
    KEX_RUNTIME_DEPS_DIR / "kex-intrinsics-0.1.2.jar",
    KEX_RUNTIME_DEPS_DIR / "kex-rt-0.0.1.jar",
    KEX_RUNTIME_DEPS_DIR / "mockito-core-4.11.0.jar",
]

def run_command(cmd, timeout=None):
    """Run command and return (exit_code, stdout+stderr)."""
    try:
        result = subprocess.run(
            cmd,
            stdout=subprocess.PIPE,
            stderr=subprocess.STDOUT,
            text=True,
            timeout=timeout,
        )
        return result.returncode, result.stdout
    except subprocess.TimeoutExpired as exc:
        output = exc.stdout or ""
        if isinstance(output, bytes):
            output = output.decode(errors="replace")
        return 124, output


def defects4j_export(work_dir, prop):
    code, output = run_command(
        ["defects4j", "export", "-p", prop, "-w", str(work_dir)]
    )

    if code != 0:
        raise RuntimeError(
            f"defects4j export {prop} failed for {work_dir}\n{output}"
        )

    lines = [
        line.strip()
        for line in output.splitlines()
        if line.strip()
        and not line.startswith("Running ant")
    ]

    if not lines:
        raise RuntimeError(f"No value returned for {prop}")

    return lines[-1]


def ensure_checkout(project, bug_id, version):
    """
    version = 'buggy' or 'fixed'
    """
    suffix = "b" if version == "buggy" else "f"
    work_dir = CHECKOUT_ROOT / f"{project}_{bug_id}_{version}"

    if not work_dir.exists():
        print(f"  [CHECKOUT] {project}-{bug_id}{suffix}")

        code, output = run_command(
            [
                "defects4j",
                "checkout",
                "-p", project,
                "-v", f"{bug_id}{suffix}",
                "-w", str(work_dir),
            ]
        )

        if code != 0:
            raise RuntimeError(
                f"Checkout failed: {project}-{bug_id}{suffix}\n{output}"
            )

    print(f"  [COMPILE] {version}")

    code, output = run_command(
        ["defects4j", "compile", "-w", str(work_dir)]
    )

    if code != 0:
        raise RuntimeError(
            f"Compile failed: {work_dir}\n{output}"
        )

    return work_dir


def get_test_source_dir(tool, project, bug_id=None):
    if tool == "kex":
        return REPO_DIR / "Reanimator-Kex" / "TestCode" / project

    if tool == "evosuite":
        return REPO_DIR / "DynaMOSA-EvoSuite" / "TestCode" / project

    if tool == "gemini":
        if bug_id is None:
            raise ValueError("bug_id is required for Gemini")
        return (
            REPO_DIR
            / "Gemini"
            / "TestCode"
            / project
            / str(bug_id)
        )

    if tool == "claude":
        if bug_id is None:
            raise ValueError("bug_id is required for Claude")
        return (
            REPO_DIR
            / "Claude"
            / "TestCode"
            / project
            / str(bug_id)
        )

    raise ValueError(f"Unknown tool: {tool}")


def prepare_kex_sources(project, bug_id, source_dir, eval_src):
    pattern = f"{project}_{bug_id}_*.java"
    files = sorted(source_dir.glob(pattern))

    if not files:
        raise RuntimeError(
            f"No Kex generated files found: {source_dir}/{pattern}"
        )

    prepared = []

    # Copy package-aware Kex support/helper sources.
    # These files are compiled but are NOT executable candidate tests.
    support_dir = source_dir / "_support" / str(bug_id)

    if support_dir.is_dir():
        for support_src in sorted(
            support_dir.rglob("*.java")
        ):
            relative_path = support_src.relative_to(
                support_dir
            )
            support_dest = eval_src / relative_path

            support_dest.parent.mkdir(
                parents=True,
                exist_ok=True,
            )

            shutil.copy2(
                support_src,
                support_dest,
            )

    for src in files:
        text = src.read_text(errors="replace")

        match = re.search(
            r"^\s*public\s+class\s+([A-Za-z_$][A-Za-z0-9_$]*)",
            text,
            flags=re.MULTILINE,
        )

        if not match:
            print(f"  [SKIP] no public class: {src.name}")
            continue

        class_name = match.group(1)
        dest = eval_src / f"{class_name}.java"
        shutil.copy2(src, dest)

        package_match = re.search(
            r"^\s*package\s+([A-Za-z0-9_.$]+)\s*;",
            text,
            flags=re.MULTILINE,
        )

        package = package_match.group(1) if package_match else ""

        prepared.append({
            "source": dest,
            "class_name": class_name,
            "package": package,
            "fqcn": f"{package}.{class_name}" if package else class_name,
        })

    return prepared


def prepare_evosuite_sources(project, bug_id, source_dir, eval_src):
    pattern = f"{project}_{bug_id}_*.java"
    files = sorted(source_dir.glob(pattern))

    if not files:
        raise RuntimeError(
            f"No EvoSuite generated files found: {source_dir}/{pattern}"
        )

    for src in files:
        text = src.read_text(errors="replace")

        match = re.search(
            r"^\s*public\s+class\s+([A-Za-z_$][A-Za-z0-9_$]*)",
            text,
            flags=re.MULTILINE,
        )

        if not match:
            continue

        class_name = match.group(1)
        shutil.copy2(src, eval_src / f"{class_name}.java")

    # Only *_ESTest classes are executable JUnit test classes.
    prepared = []

    for src in sorted(eval_src.glob("*_ESTest.java")):
        text = src.read_text(errors="replace")

        match = re.search(
            r"^\s*public\s+class\s+([A-Za-z_$][A-Za-z0-9_$]*)",
            text,
            flags=re.MULTILINE,
        )

        if not match:
            continue

        class_name = match.group(1)

        package_match = re.search(
            r"^\s*package\s+([A-Za-z0-9_.$]+)\s*;",
            text,
            flags=re.MULTILINE,
        )

        package = package_match.group(1) if package_match else ""

        prepared.append({
            "source": src,
            "class_name": class_name,
            "package": package,
            "fqcn": f"{package}.{class_name}" if package else class_name,
        })

    return prepared


def prepare_ai_sources(project, bug_id, source_dir, eval_src):
    """Prepare Gemini/Claude generated JUnit Java sources."""
    files = sorted(source_dir.glob("*.java"))

    if not files:
        raise RuntimeError(
            f"No AI generated Java files found: {source_dir}/*.java"
        )

    prepared = []

    for src in files:
        text = src.read_text(errors="replace")

        match = re.search(
            r"^\s*public\s+class\s+([A-Za-z_$][A-Za-z0-9_$]*)",
            text,
            flags=re.MULTILINE,
        )

        if not match:
            print(f"  [SKIP] no public class: {src.name}")
            continue

        class_name = match.group(1)

        package_match = re.search(
            r"^\s*package\s+([A-Za-z0-9_.$]+)\s*;",
            text,
            flags=re.MULTILINE,
        )

        package = package_match.group(1) if package_match else ""

        dest = eval_src / f"{class_name}.java"
        shutil.copy2(src, dest)

        prepared.append({
            "source": dest,
            "class_name": class_name,
            "package": package,
            "fqcn": f"{package}.{class_name}" if package else class_name,
        })

    if not prepared:
        raise RuntimeError(
            f"No executable AI test classes found: {source_dir}"
        )

    return prepared


def expand_ai_methods(tests):
    """Expand Gemini/Claude JUnit 4 classes into individual test methods."""
    expanded = []

    for test in tests:
        text = test["source"].read_text(errors="replace")

        methods = re.findall(
            r"@Test(?:\s*\([^)]*\))?\s*"
            r"(?:public\s+)?void\s+"
            r"([A-Za-z_$][A-Za-z0-9_$]*)\s*\(",
            text,
            flags=re.MULTILINE,
        )

        for method_name in methods:
            item = dict(test)
            item["method_name"] = method_name
            item["display_name"] = (
                f"{test['class_name']}#{method_name}"
            )
            expanded.append(item)

    return expanded


def expand_evosuite_methods(tests):
    """
    Convert EvoSuite test classes into individual JUnit test methods.

    Example:
        NumberUtils_ESTest
    becomes:
        NumberUtils_ESTest#test000
        NumberUtils_ESTest#test001
        ...
    """
    expanded = []

    for test in tests:
        text = test["source"].read_text(errors="replace")

        methods = re.findall(
            r"@Test(?:\s*\([^)]*\))?\s*"
            r"public\s+void\s+"
            r"([A-Za-z_$][A-Za-z0-9_$]*)\s*\(",
            text,
            flags=re.MULTILINE,
        )

        for method_name in methods:
            item = dict(test)
            item["method_name"] = method_name
            item["display_name"] = (
                f"{test['class_name']}#{method_name}"
            )
            expanded.append(item)

    return expanded

def compile_single_method_runner(
    eval_src,
    eval_classes,
    classpath,
):
    runner_source = eval_src / "SingleMethodRunner.java"
    runner_source.write_text(SINGLE_METHOD_RUNNER_SOURCE)

    return run_command(
        [
            "javac",
            "-cp", classpath,
            "-d", str(eval_classes),
            str(runner_source),
        ],
        timeout=60,
    )


def compile_sources(eval_src, eval_classes, classpath):
    java_files = sorted(eval_src.rglob("*.java"))

    if not java_files:
        raise RuntimeError("No Java files prepared for compilation")

    cmd = [
        "javac",
        "-cp", classpath,
        "-d", str(eval_classes),
    ] + [str(f) for f in java_files]

    return run_command(cmd, timeout=300)


def is_kex_helper(test):
    name = test["class_name"]

    return name in {
        "EqualityUtils",
        "ReflectionUtils",
    }


def run_junit(test, eval_classes, classpath, timeout_sec):
    cp = f"{eval_classes}:{classpath}"

    code, output = run_command(
        [
            "java",
            "-cp", cp,
            "org.junit.runner.JUnitCore",
            test["fqcn"],
        ],
        timeout=timeout_sec,
    )

    if code == 0:
        return "PASS", output

    if code == 124:
        return "TIMEOUT", output

    return "FAIL", output


def run_junit_method(
    test,
    eval_classes,
    classpath,
    timeout_sec,
):
    cp = f"{eval_classes}:{classpath}"

    code, output = run_command(
        [
            "java",
            "-cp", cp,
            "SingleMethodRunner",
            test["fqcn"],
            test["method_name"],
        ],
        timeout=timeout_sec,
    )

    if code == 0:
        return "PASS", output

    if code == 124:
        return "TIMEOUT", output

    return "FAIL", output


def classify(buggy, fixed):
    if buggy == "FAIL" and fixed == "PASS":
        return "bug_revealing"

    if buggy == "PASS" and fixed == "PASS":
        return "valid_non_revealing"

    if buggy == "FAIL" and fixed == "FAIL":
        return "invalid_or_unstable"

    if buggy == "PASS" and fixed == "FAIL":
        return "fixed_regression_or_unstable"

    return "timeout_or_other"


def evaluate(project, bug_id, tool, timeout_sec):
    print()
    print("=" * 70)
    print(f"EVALUATE: {project}-{bug_id} / {tool}")
    print("=" * 70)

    buggy_dir = ensure_checkout(project, bug_id, "buggy")
    fixed_dir = ensure_checkout(project, bug_id, "fixed")

    print("  [CLASSPATH] buggy")
    cp_buggy = defects4j_export(buggy_dir, "cp.test")

    print("  [CLASSPATH] fixed")
    cp_fixed = defects4j_export(fixed_dir, "cp.test")

    source_dir = get_test_source_dir(
        tool,
        project,
        bug_id,
    )

    eval_root = Path(
        tempfile.mkdtemp(
            prefix=f"evaluate_{tool}_{project}_{bug_id}_"
        )
    )

    eval_src = eval_root / "src"
    eval_classes = eval_root / "classes"
    eval_src.mkdir()
    eval_classes.mkdir()

    try:
        print(f"  [PREPARE] {tool}")

        if tool == "kex":
            tests = prepare_kex_sources(
                project,
                bug_id,
                source_dir,
                eval_src,
            )

            executable_tests = [
                t for t in tests
                if not is_kex_helper(t)
            ]

        elif tool == "evosuite":
            evosuite_classes = prepare_evosuite_sources(
                project,
                bug_id,
                source_dir,
                eval_src,
            )

            executable_tests = expand_evosuite_methods(
                evosuite_classes
            )

        elif tool in ("gemini", "claude"):
            ai_classes = prepare_ai_sources(
                project,
                bug_id,
                source_dir,
                eval_src,
            )

            executable_tests = expand_ai_methods(
                ai_classes
            )

        else:
            raise ValueError(f"Unknown tool: {tool}")

        prepared_file_count = len(list(eval_src.rglob("*.java")))

        print(f"  [FILES] {prepared_file_count}")
        print(f"  [TESTS] {len(executable_tests)}")

        if not executable_tests:
            raise RuntimeError(
                f"No executable tests found for "
                f"{tool}/{project}/{bug_id}"
            )

        print("  [JAVAC]")

        # Generated tests are evaluated with a consistent JUnit 4 runtime.
        if not JUNIT4_JAR.is_file():
            raise RuntimeError(
                f"JUnit 4 JAR not found: {JUNIT4_JAR}"
            )

        if tool == "evosuite":
            if not EVOSUITE_RUNTIME_JAR.is_file():
                raise RuntimeError(
                    f"EvoSuite runtime JAR not found: {EVOSUITE_RUNTIME_JAR}"
                )

            extra_cp = (
                f"{JUNIT4_JAR}:"
                f"{EVOSUITE_RUNTIME_JAR}"
            )

        elif tool == "kex":
            missing_kex_jars = [
                jar
                for jar in KEX_RUNTIME_JARS
                if not jar.is_file()
            ]

            if missing_kex_jars:
                raise RuntimeError(
                    "Kex runtime JARs not found: "
                    + ", ".join(
                        str(jar)
                        for jar in missing_kex_jars
                    )
                )

            extra_cp = ":".join(
                str(jar)
                for jar in KEX_RUNTIME_JARS
            )

        else:
            extra_cp = str(JUNIT4_JAR)

        # Put JUnit 4 before Defects4J's project classpath.
        # Some old projects (e.g. Cli-1) expose JUnit 3.x in cp.test.
        compile_cp = f"{extra_cp}:{cp_buggy}"
        run_cp_buggy = f"{extra_cp}:{cp_buggy}"
        run_cp_fixed = f"{extra_cp}:{cp_fixed}"

        # Compile against buggy classpath first.
        code, compile_output = compile_sources(
            eval_src,
            eval_classes,
            compile_cp,
        )

        if code != 0:
            print()
            print("COMPILE FAILED")
            print(compile_output[:8000])
            return 2

        print("  [JAVAC] SUCCESS")

        if tool in ("evosuite", "gemini", "claude"):
            runner_code, runner_output = (
                compile_single_method_runner(
                    eval_src,
                    eval_classes,
                    compile_cp,
                )
            )

            if runner_code != 0:
                print()
                print("RUNNER COMPILE FAILED")
                print(runner_output[:8000])
                return 2

            print("  [RUNNER] SUCCESS")

        rows = []

        for index, test in enumerate(executable_tests, start=1):
            runner = (
                run_junit_method
                if tool in ("evosuite", "gemini", "claude")
                else run_junit
            )

            buggy_result, buggy_output = runner(
                test,
                eval_classes,
                run_cp_buggy,
                timeout_sec,
            )

            fixed_result, fixed_output = runner(
                test,
                eval_classes,
                run_cp_fixed,
                timeout_sec,
            )

            category = classify(
                buggy_result,
                fixed_result,
            )

            method_name = test.get("method_name", "")
            display_name = test.get(
                "display_name",
                test["class_name"],
            )

            rows.append({
                "test": display_name,
                "fqcn": test["fqcn"],
                "method": method_name,
                "buggy": buggy_result,
                "fixed": fixed_result,
                "classification": category,
            })

            print(
                f"{index:4d} "
                f"{display_name[:48]:48} "
                f"{buggy_result:7} "
                f"{fixed_result:7} "
                f"{category}"
            )

        counts = Counter(
            row["classification"]
            for row in rows
        )

        result_dir = (
            REPO_DIR
            / "evaluation"
            / tool
            / project
            / str(bug_id)
        )

        result_dir.mkdir(parents=True, exist_ok=True)

        csv_path = result_dir / "tests.csv"
        json_path = result_dir / "summary.json"

        with csv_path.open("w", newline="") as f:
            writer = csv.DictWriter(
                f,
                lineterminator="\n",
                fieldnames=[
                    "test",
                    "fqcn",
                    "method",
                    "buggy",
                    "fixed",
                    "classification",
                ],
            )

            writer.writeheader()
            writer.writerows(rows)

        summary = {
            "project": project,
            "bug_id": str(bug_id),
            "tool": tool,
            "generated_files": prepared_file_count,
            "candidate_tests": len(executable_tests),
            "classification_counts": dict(counts),
            "bug_revealing_tests": counts.get(
                "bug_revealing", 0
            ),
            "bug_detected": counts.get(
                "bug_revealing", 0
            ) > 0,
            "generation_status": "success",
            "evaluation_status": "success",
        }

        json_path.write_text(
            json.dumps(
                summary,
                indent=2,
                ensure_ascii=False,
            )
            + "\n"
        )

        print()
        print("=" * 70)
        print("SUMMARY")
        print("=" * 70)
        print(f"Generated files : {prepared_file_count}")
        print(f"Candidate tests : {len(executable_tests)}")

        for key in sorted(counts):
            print(f"{key:25} : {counts[key]}")

        print(
            f"Bug revealing   : "
            f"{summary['bug_revealing_tests']}"
        )
        print(
            f"Bug detected    : "
            f"{summary['bug_detected']}"
        )

        print()
        print(f"CSV  : {csv_path}")
        print(f"JSON : {json_path}")

        return 0

    finally:
        shutil.rmtree(eval_root, ignore_errors=True)


def main():
    parser = argparse.ArgumentParser(
        description=(
            "Evaluate generated tests on Defects4J "
            "buggy and fixed versions."
        )
    )

    parser.add_argument(
        "--project",
        required=True,
        help="Defects4J project, e.g. Lang",
    )

    parser.add_argument(
        "--bug",
        required=True,
        help="Bug ID, e.g. 1",
    )

    parser.add_argument(
        "--tool",
        required=True,
        choices=["kex", "evosuite", "gemini", "claude"],
    )

    parser.add_argument(
        "--timeout",
        type=int,
        default=15,
        help="Timeout per test/version in seconds",
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
