#!/usr/bin/env python3

import csv
import json
import re
from collections import Counter
from pathlib import Path
from statistics import mean, median


ROOT = Path(__file__).resolve().parents[1]
EVAL_ROOT = ROOT / "evaluation"
COVERAGE_ROOT = EVAL_ROOT / "coverage"
OUT = EVAL_ROOT / "final"

TOOLS = ["evosuite", "kex", "gemini", "claude"]

BENCHMARK_SIZE = 854

# KEX coverage cases that were executed only as diagnostics.
KEX_DIAGNOSTIC_COVERAGE = {
    ("Lang", "1"),
    ("Math", "1"),
}


def read_json(path):
    try:
        return json.loads(
            path.read_text(
                encoding="utf-8",
                errors="replace",
            )
        )
    except Exception as exc:
        print(f"[WARN] Cannot read {path}: {exc}")
        return None


def pct(a, b):
    if not b:
        return ""
    return round(a / b * 100, 3)


def avg(values):
    if not values:
        return ""
    return round(mean(values), 3)


def med(values):
    if not values:
        return ""
    return round(median(values), 3)


def weighted_pct(covered_values, total_values):
    covered = sum(covered_values)
    total = sum(total_values)

    if total == 0:
        return ""

    return round(
        covered / total * 100,
        3,
    )


def write_csv(path, rows, fields=None):
    path.parent.mkdir(
        parents=True,
        exist_ok=True,
    )

    if fields is None:
        if not rows:
            return
        fields = list(rows[0].keys())

    with path.open(
        "w",
        newline="",
        encoding="utf-8-sig",
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=fields,
        )
        writer.writeheader()
        writer.writerows(rows)


def load_evaluation(tool):
    results = {}

    root = EVAL_ROOT / tool

    for path in root.rglob("summary.json"):

        # Do not include intentionally excluded KEX summaries.
        if "_excluded_timeout_summaries" in path.parts:
            continue

        data = read_json(path)
        if not data:
            continue

        project = str(data.get("project", "")).strip()
        bug_id = str(data.get("bug_id", "")).strip()

        if not project or not bug_id:
            continue

        key = (project, bug_id)

        if key in results:
            raise RuntimeError(
                f"Duplicate evaluation result: "
                f"{tool} {project}-{bug_id}"
            )

        results[key] = data

    return results


def load_coverage(tool):
    results = {}

    root = COVERAGE_ROOT / tool

    for path in root.rglob("summary.json"):
        data = read_json(path)
        if not data:
            continue

        project = str(data.get("project", "")).strip()
        bug_id = str(data.get("bug_id", "")).strip()

        if not project or not bug_id:
            continue

        key = (project, bug_id)

        if key in results:
            raise RuntimeError(
                f"Duplicate coverage result: "
                f"{tool} {project}-{bug_id}"
            )

        results[key] = data

    return results


def protocol_coverage(tool, coverage):
    if tool != "kex":
        return dict(coverage)

    return {
        key: value
        for key, value in coverage.items()
        if key not in KEX_DIAGNOSTIC_COVERAGE
    }


def try_load_universe_from_evosuite_generation():
    root = ROOT / "DynaMOSA-EvoSuite" / "Result_Round2"

    if not root.exists():
        return set()

    universe = set()

    for path in root.rglob("*_result.json"):
        data = read_json(path)

        if data:
            project = str(
                data.get("project", "")
            ).strip()

            bug_id = str(
                data.get("bug_id", "")
            ).strip()

            if project and bug_id:
                universe.add(
                    (project, bug_id)
                )
                continue

        # Fallback: attempt to parse file name such as
        # Chart_1_result.json.
        match = re.search(
            r"([A-Za-z]+)[_-](\d+)_result$",
            path.stem,
        )

        if match:
            universe.add(
                (
                    match.group(1),
                    match.group(2),
                )
            )

    return universe


def bug_sort_key(key):
    project, bug_id = key

    try:
        number = int(bug_id)
    except Exception:
        number = 10**9

    return (project, number)


# ------------------------------------------------------------
# Load all data
# ------------------------------------------------------------

evaluations = {
    tool: load_evaluation(tool)
    for tool in TOOLS
}

coverage_raw = {
    tool: load_coverage(tool)
    for tool in TOOLS
}

coverage_protocol = {
    tool: protocol_coverage(
        tool,
        coverage_raw[tool],
    )
    for tool in TOOLS
}


# ------------------------------------------------------------
# Determine the exact Defects4J benchmark universe
# ------------------------------------------------------------

universe = try_load_universe_from_evosuite_generation()

if len(universe) != BENCHMARK_SIZE:
    # Fallback to union of every benchmark result available.
    universe = set()

    for tool in TOOLS:
        universe.update(
            evaluations[tool].keys()
        )
        universe.update(
            coverage_raw[tool].keys()
        )

if len(universe) != BENCHMARK_SIZE:
    raise RuntimeError(
        f"Expected {BENCHMARK_SIZE} benchmark bugs, "
        f"but found {len(universe)} unique Project-Bug pairs."
    )


# ------------------------------------------------------------
# Master table: exactly 854 bugs x 4 tools = 3416 rows
# ------------------------------------------------------------

master = []

for tool in TOOLS:
    for project, bug_id in sorted(
        universe,
        key=bug_sort_key,
    ):
        key = (project, bug_id)

        ev = evaluations[tool].get(
            key,
            {},
        )

        cov = coverage_raw[tool].get(
            key,
            {},
        )

        classifications = ev.get(
            "classification_counts",
            {},
        ) or {}

        diagnostic_excluded = (
            tool == "kex"
            and key in KEX_DIAGNOSTIC_COVERAGE
        )

        master.append({
            "tool": tool,
            "project": project,
            "bug_id": bug_id,

            "benchmark_case": True,

            "has_evaluation":
                bool(ev),

            "evaluation_status":
                ev.get(
                    "evaluation_status",
                    "missing",
                ),

            "generation_status":
                ev.get(
                    "generation_status",
                    "unknown",
                ),

            "generated_files":
                ev.get(
                    "generated_files",
                    "",
                ),

            "candidate_tests":
                ev.get(
                    "candidate_tests",
                    "",
                ),

            "valid_non_revealing":
                classifications.get(
                    "valid_non_revealing",
                    0,
                ),

            "invalid_or_unstable":
                classifications.get(
                    "invalid_or_unstable",
                    0,
                ),

            "fixed_regression_or_unstable":
                classifications.get(
                    "fixed_regression_or_unstable",
                    0,
                ),

            "bug_revealing_tests":
                ev.get(
                    "bug_revealing_tests",
                    "",
                ),

            "bug_detected":
                ev.get(
                    "bug_detected",
                    "",
                ),

            "has_coverage":
                bool(cov),

            "coverage_status":
                cov.get(
                    "status",
                    "missing",
                ),

            "coverage_protocol_included":
                bool(cov)
                and not diagnostic_excluded,

            "diagnostic_excluded":
                diagnostic_excluded,

            "prepared_files":
                cov.get(
                    "prepared_files",
                    "",
                ),

            "lines_total":
                cov.get(
                    "lines_total",
                    "",
                ),

            "lines_covered":
                cov.get(
                    "lines_covered",
                    "",
                ),

            "line_coverage":
                cov.get(
                    "line_coverage",
                    "",
                ),

            "conditions_total":
                cov.get(
                    "conditions_total",
                    "",
                ),

            "conditions_covered":
                cov.get(
                    "conditions_covered",
                    "",
                ),

            "condition_coverage":
                cov.get(
                    "condition_coverage",
                    "",
                ),

            "failing_test_count":
                cov.get(
                    "failing_test_count",
                    "",
                ),
        })


write_csv(
    OUT / "master_results.csv",
    master,
)


# ------------------------------------------------------------
# Technique summary
# ------------------------------------------------------------

technique_rows = []

for tool in TOOLS:
    ev_rows = list(
        evaluations[tool].values()
    )

    cov_rows = list(
        coverage_protocol[tool].values()
    )

    ev_success = [
        row
        for row in ev_rows
        if row.get("evaluation_status") == "success"
    ]

    compile_failed = [
        row
        for row in ev_rows
        if row.get("evaluation_status")
        == "compile_failed"
    ]

    detected = [
        row
        for row in ev_rows
        if row.get("bug_detected") is True
    ]

    cov_success = [
        row
        for row in cov_rows
        if row.get("status") == "success"
    ]

    line_rows = [
        row
        for row in cov_success
        if int(
            row.get("lines_total", 0) or 0
        ) > 0
    ]

    condition_rows = [
        row
        for row in cov_success
        if int(
            row.get("conditions_total", 0) or 0
        ) > 0
    ]

    line_values = [
        float(row["line_coverage"])
        for row in line_rows
        if row.get("line_coverage")
        not in (None, "")
    ]

    condition_values = [
        float(row["condition_coverage"])
        for row in condition_rows
        if row.get("condition_coverage")
        not in (None, "")
    ]

    candidate_tests = sum(
        int(
            row.get(
                "candidate_tests",
                0,
            ) or 0
        )
        for row in ev_rows
    )

    revealing_tests = sum(
        int(
            row.get(
                "bug_revealing_tests",
                0,
            ) or 0
        )
        for row in ev_rows
    )

    technique_rows.append({
        "tool":
            tool,

        "benchmark_bugs":
            BENCHMARK_SIZE,

        "evaluation_cases_available":
            len(ev_rows),

        "evaluation_success":
            len(ev_success),

        "compile_failed":
            len(compile_failed),

        "evaluation_success_rate_available_pct":
            pct(
                len(ev_success),
                len(ev_rows),
            ),

        "evaluation_success_rate_854_pct":
            pct(
                len(ev_success),
                BENCHMARK_SIZE,
            ),

        "bugs_detected":
            len(detected),

        "overall_fault_detection_rate_854_pct":
            pct(
                len(detected),
                BENCHMARK_SIZE,
            ),

        "fault_detection_rate_eval_success_pct":
            pct(
                len(detected),
                len(ev_success),
            ),

        "candidate_tests":
            candidate_tests,

        "bug_revealing_tests":
            revealing_tests,

        "coverage_cases_attempted":
            len(cov_rows),

        "coverage_success":
            len(cov_success),

        "coverage_success_rate_attempted_pct":
            pct(
                len(cov_success),
                len(cov_rows),
            ),

        "coverage_success_rate_854_pct":
            pct(
                len(cov_success),
                BENCHMARK_SIZE,
            ),

        "mean_line_coverage_success_pct":
            avg(line_values),

        "median_line_coverage_success_pct":
            med(line_values),

        "weighted_line_coverage_success_pct":
            weighted_pct(
                [
                    int(
                        row.get(
                            "lines_covered",
                            0,
                        ) or 0
                    )
                    for row in line_rows
                ],
                [
                    int(
                        row.get(
                            "lines_total",
                            0,
                        ) or 0
                    )
                    for row in line_rows
                ],
            ),

        "mean_condition_coverage_success_pct":
            avg(condition_values),

        "median_condition_coverage_success_pct":
            med(condition_values),

        "weighted_condition_coverage_success_pct":
            weighted_pct(
                [
                    int(
                        row.get(
                            "conditions_covered",
                            0,
                        ) or 0
                    )
                    for row in condition_rows
                ],
                [
                    int(
                        row.get(
                            "conditions_total",
                            0,
                        ) or 0
                    )
                    for row in condition_rows
                ],
            ),
    })


write_csv(
    OUT / "technique_summary.csv",
    technique_rows,
)


# ------------------------------------------------------------
# Evaluation status counts
# ------------------------------------------------------------

evaluation_status_rows = []

for tool in TOOLS:
    counts = Counter(
        row.get(
            "evaluation_status",
            "unknown",
        )
        for row in evaluations[tool].values()
    )

    missing = (
        BENCHMARK_SIZE
        - len(evaluations[tool])
    )

    counts["missing"] += missing

    for status, count in sorted(
        counts.items()
    ):
        evaluation_status_rows.append({
            "tool": tool,
            "status": status,
            "count": count,
            "percent_of_854":
                pct(
                    count,
                    BENCHMARK_SIZE,
                ),
        })


write_csv(
    OUT / "evaluation_status_counts.csv",
    evaluation_status_rows,
)


# ------------------------------------------------------------
# Coverage status counts
# Main protocol only.
# Missing means no protocol coverage result for that benchmark bug.
# ------------------------------------------------------------

coverage_status_rows = []

for tool in TOOLS:
    counts = Counter(
        row.get(
            "status",
            "unknown",
        )
        for row in coverage_protocol[tool].values()
    )

    missing = (
        BENCHMARK_SIZE
        - len(
            coverage_protocol[tool]
        )
    )

    counts["missing"] += missing

    for status, count in sorted(
        counts.items()
    ):
        coverage_status_rows.append({
            "tool": tool,
            "status": status,
            "count": count,
            "percent_of_854":
                pct(
                    count,
                    BENCHMARK_SIZE,
                ),
        })


write_csv(
    OUT / "coverage_status_counts.csv",
    coverage_status_rows,
)


# ------------------------------------------------------------
# Common successful evaluation comparison
# Same exact bugs for all four tools.
# ------------------------------------------------------------

common_eval_success = set(universe)

for tool in TOOLS:
    successful = {
        key
        for key, row
        in evaluations[tool].items()
        if row.get(
            "evaluation_status"
        ) == "success"
    }

    common_eval_success &= successful


common_eval_rows = []

for tool in TOOLS:
    detected = sum(
        1
        for key in common_eval_success
        if evaluations[tool][key].get(
            "bug_detected"
        ) is True
    )

    revealing = sum(
        int(
            evaluations[tool][key].get(
                "bug_revealing_tests",
                0,
            ) or 0
        )
        for key in common_eval_success
    )

    common_eval_rows.append({
        "tool":
            tool,

        "common_evaluation_success_cases":
            len(common_eval_success),

        "bugs_detected":
            detected,

        "fault_detection_rate_common_pct":
            pct(
                detected,
                len(common_eval_success),
            ),

        "bug_revealing_tests":
            revealing,
    })


write_csv(
    OUT / "common_evaluation_summary.csv",
    common_eval_rows,
)


# ------------------------------------------------------------
# Common successful coverage comparison
# Same exact bugs where all four tools produced valid coverage.
# ------------------------------------------------------------

common_coverage_success = set(universe)

for tool in TOOLS:
    successful = {
        key
        for key, row
        in coverage_protocol[tool].items()
        if row.get("status") == "success"
    }

    common_coverage_success &= successful


common_coverage_rows = []

for tool in TOOLS:
    rows = [
        coverage_protocol[tool][key]
        for key in common_coverage_success
    ]

    line_rows = [
        row
        for row in rows
        if int(
            row.get(
                "lines_total",
                0,
            ) or 0
        ) > 0
    ]

    condition_rows = [
        row
        for row in rows
        if int(
            row.get(
                "conditions_total",
                0,
            ) or 0
        ) > 0
    ]

    line_values = [
        float(row["line_coverage"])
        for row in line_rows
        if row.get("line_coverage")
        not in (None, "")
    ]

    condition_values = [
        float(row["condition_coverage"])
        for row in condition_rows
        if row.get("condition_coverage")
        not in (None, "")
    ]

    common_coverage_rows.append({
        "tool":
            tool,

        "common_coverage_success_cases":
            len(common_coverage_success),

        "mean_line_coverage_pct":
            avg(line_values),

        "median_line_coverage_pct":
            med(line_values),

        "weighted_line_coverage_pct":
            weighted_pct(
                [
                    int(
                        row.get(
                            "lines_covered",
                            0,
                        ) or 0
                    )
                    for row in line_rows
                ],
                [
                    int(
                        row.get(
                            "lines_total",
                            0,
                        ) or 0
                    )
                    for row in line_rows
                ],
            ),

        "mean_condition_coverage_pct":
            avg(condition_values),

        "median_condition_coverage_pct":
            med(condition_values),

        "weighted_condition_coverage_pct":
            weighted_pct(
                [
                    int(
                        row.get(
                            "conditions_covered",
                            0,
                        ) or 0
                    )
                    for row in condition_rows
                ],
                [
                    int(
                        row.get(
                            "conditions_total",
                            0,
                        ) or 0
                    )
                    for row in condition_rows
                ],
            ),
    })


write_csv(
    OUT / "common_coverage_summary.csv",
    common_coverage_rows,
)


# ------------------------------------------------------------
# Project summary
# ------------------------------------------------------------

projects = sorted({
    project
    for project, bug_id in universe
})

project_rows = []

for tool in TOOLS:
    for project in projects:

        project_keys = {
            key
            for key in universe
            if key[0] == project
        }

        benchmark_cases = len(
            project_keys
        )

        eval_available = [
            evaluations[tool][key]
            for key in project_keys
            if key in evaluations[tool]
        ]

        eval_success = [
            row
            for row in eval_available
            if row.get(
                "evaluation_status"
            ) == "success"
        ]

        detected = [
            row
            for row in eval_available
            if row.get(
                "bug_detected"
            ) is True
        ]

        cov_available = [
            coverage_protocol[tool][key]
            for key in project_keys
            if key in coverage_protocol[tool]
        ]

        cov_success = [
            row
            for row in cov_available
            if row.get("status") == "success"
        ]

        line_values = [
            float(
                row["line_coverage"]
            )
            for row in cov_success
            if int(
                row.get(
                    "lines_total",
                    0,
                ) or 0
            ) > 0
            and row.get(
                "line_coverage"
            ) not in (None, "")
        ]

        condition_values = [
            float(
                row["condition_coverage"]
            )
            for row in cov_success
            if int(
                row.get(
                    "conditions_total",
                    0,
                ) or 0
            ) > 0
            and row.get(
                "condition_coverage"
            ) not in (None, "")
        ]

        project_rows.append({
            "tool":
                tool,

            "project":
                project,

            "benchmark_bugs":
                benchmark_cases,

            "evaluation_available":
                len(eval_available),

            "evaluation_success":
                len(eval_success),

            "bugs_detected":
                len(detected),

            "overall_fdr_project_pct":
                pct(
                    len(detected),
                    benchmark_cases,
                ),

            "coverage_attempted":
                len(cov_available),

            "coverage_success":
                len(cov_success),

            "coverage_success_rate_project_pct":
                pct(
                    len(cov_success),
                    benchmark_cases,
                ),

            "mean_line_coverage_success_pct":
                avg(line_values),

            "mean_condition_coverage_success_pct":
                avg(condition_values),
        })


write_csv(
    OUT / "project_summary.csv",
    project_rows,
)


# ------------------------------------------------------------
# Console output
# ------------------------------------------------------------

print("=" * 78)
print("FINAL BENCHMARK AGGREGATION - 854 DEFECTS4J BUGS")
print("=" * 78)

print(
    f"\nBenchmark universe verified: "
    f"{len(universe)} bugs"
)

for row in technique_rows:
    print()
    print(row["tool"].upper())

    print(
        "  Evaluation available : "
        f'{row["evaluation_cases_available"]}/'
        f'{BENCHMARK_SIZE}'
    )

    print(
        "  Evaluation success   : "
        f'{row["evaluation_success"]}/'
        f'{BENCHMARK_SIZE} '
        f'({row["evaluation_success_rate_854_pct"]}%)'
    )

    print(
        "  Bugs detected        : "
        f'{row["bugs_detected"]}/'
        f'{BENCHMARK_SIZE}'
    )

    print(
        "  Overall FDR (854)    : "
        f'{row["overall_fault_detection_rate_854_pct"]}%'
    )

    print(
        "  FDR if eval succeeds : "
        f'{row["fault_detection_rate_eval_success_pct"]}%'
    )

    print(
        "  Coverage success     : "
        f'{row["coverage_success"]}/'
        f'{BENCHMARK_SIZE} '
        f'({row["coverage_success_rate_854_pct"]}%)'
    )

    print(
        "  Mean Line Coverage   : "
        f'{row["mean_line_coverage_success_pct"]}% '
        "(successful coverage only)"
    )

    print(
        "  Mean Condition Cov.  : "
        f'{row["mean_condition_coverage_success_pct"]}% '
        "(conditions_total > 0)"
    )


print()
print("-" * 78)

print(
    "Common successful evaluation cases:",
    len(common_eval_success),
)

print(
    "Common successful coverage cases  :",
    len(common_coverage_success),
)

print()
print("Created:")
print(" evaluation/final/master_results.csv")
print(" evaluation/final/technique_summary.csv")
print(" evaluation/final/evaluation_status_counts.csv")
print(" evaluation/final/coverage_status_counts.csv")
print(" evaluation/final/common_evaluation_summary.csv")
print(" evaluation/final/common_coverage_summary.csv")
print(" evaluation/final/project_summary.csv")

print()
print(
    "NOTE: KEX Lang-1 and Math-1 diagnostic coverage "
    "are retained in master_results.csv but excluded "
    "from main coverage aggregates."
)
