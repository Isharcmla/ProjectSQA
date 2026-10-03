#!/usr/bin/env python3

import csv
import json
from collections import Counter, defaultdict
from pathlib import Path
from statistics import mean, median


ROOT = Path(__file__).resolve().parents[1]
FINAL = ROOT / "evaluation" / "final"

TOOLS = {
    "gemini": {
        "result": ROOT / "Gemini" / "Result",
        "testcode": ROOT / "Gemini" / "TestCode",
    },
    "claude": {
        "result": ROOT / "Claude" / "Result",
        "testcode": ROOT / "Claude" / "TestCode",
    },
}

BENCHMARK_SIZE = 854


def read_json(path):
    try:
        return json.loads(
            path.read_text(
                encoding="utf-8",
                errors="replace"
            )
        )
    except Exception:
        return None


def pct(a, b):
    if not b:
        return ""
    return round(a / b * 100, 3)


def avg(values):
    if not values:
        return ""
    return round(mean(values), 2)


def med(values):
    if not values:
        return ""
    return round(median(values), 2)


def ratio(a, b):
    if not b:
        return ""
    return round(a / b, 2)


def write_csv(path, rows):
    path.parent.mkdir(
        parents=True,
        exist_ok=True
    )

    if not rows:
        return

    with path.open(
        "w",
        newline="",
        encoding="utf-8-sig"
    ) as f:
        writer = csv.DictWriter(
            f,
            fieldnames=list(rows[0].keys())
        )
        writer.writeheader()
        writer.writerows(rows)


def call_fingerprint(project, bug_id, row):
    usage = row.get("usage", {}) or {}

    return (
        str(project),
        str(bug_id),
        str(row.get("class", "")),
        str(row.get("timestamp", "")),
        str(row.get("prompt_file", "")),
        int(usage.get("total_tokens", 0) or 0),
    )


def extract_all_calls(tool, root):
    """
    Read BOTH layouts:

    1) Standalone class result:
       {..., "usage": {...}}

    2) Bug summary:
       {..., "class_results": [{..., "usage": {...}}]}

    Duplicate API calls are merged by fingerprint.
    Standalone records are preferred over embedded records.
    """

    calls = {}
    stats = Counter()

    # Pass 1: embedded summary records
    for path in root.rglob("*.json"):
        stats["json_files"] += 1

        data = read_json(path)

        if data is None:
            stats["invalid_json"] += 1
            continue

        project = str(
            data.get("project", "")
        ).strip()

        bug_id = str(
            data.get("bug_id", "")
        ).strip()

        if not project or not bug_id:
            continue

        class_results = data.get(
            "class_results"
        )

        if isinstance(class_results, list):
            stats["summary_files"] += 1

            for row in class_results:
                if not isinstance(row, dict):
                    continue

                if not isinstance(
                    row.get("usage"),
                    dict
                ):
                    continue

                stats["embedded_usage_records"] += 1

                key = call_fingerprint(
                    project,
                    bug_id,
                    row
                )

                calls[key] = {
                    "tool": tool,
                    "project": project,
                    "bug_id": bug_id,
                    "row": row,
                    "source": "embedded",
                    "path": str(
                        path.relative_to(ROOT)
                    ),
                }

    # Pass 2: standalone records override embedded copies
    for path in root.rglob("*.json"):
        data = read_json(path)

        if data is None:
            continue

        usage = data.get("usage")

        if not isinstance(usage, dict):
            continue

        project = str(
            data.get("project", "")
        ).strip()

        bug_id = str(
            data.get("bug_id", "")
        ).strip()

        if not project or not bug_id:
            continue

        stats["top_level_usage_files"] += 1

        key = call_fingerprint(
            project,
            bug_id,
            data
        )

        calls[key] = {
            "tool": tool,
            "project": project,
            "bug_id": bug_id,
            "row": data,
            "source": "standalone",
            "path": str(
                path.relative_to(ROOT)
            ),
        }

    stats["unique_api_calls"] = len(calls)

    return calls, stats


def load_evaluation(tool):
    out = {}

    root = ROOT / "evaluation" / tool

    for path in root.rglob("summary.json"):
        data = read_json(path)

        if not data:
            continue

        project = str(
            data.get("project", "")
        ).strip()

        bug_id = str(
            data.get("bug_id", "")
        ).strip()

        if project and bug_id:
            out[(project, bug_id)] = data

    return out


def has_testcode(tool, project, bug_id):
    root = TOOLS[tool]["testcode"] / project / str(bug_id)

    if not root.exists():
        return False

    return any(
        p.is_file()
        for p in root.glob("*.java")
    )


# --------------------------------------------------
# Load API calls
# --------------------------------------------------

all_calls = {}
stats_by_tool = {}

for tool, paths in TOOLS.items():
    calls, stats = extract_all_calls(
        tool,
        paths["result"]
    )

    all_calls[tool] = calls
    stats_by_tool[tool] = stats


evaluations = {
    tool: load_evaluation(tool)
    for tool in TOOLS
}


# --------------------------------------------------
# Aggregate API calls by bug
# --------------------------------------------------

bugs = {
    tool: defaultdict(list)
    for tool in TOOLS
}

for tool in TOOLS:
    for call in all_calls[tool].values():
        key = (
            call["project"],
            call["bug_id"]
        )
        bugs[tool][key].append(call)


per_bug_rows = []
bug_metrics = {
    tool: {}
    for tool in TOOLS
}


for tool in TOOLS:

    for key, calls in bugs[tool].items():

        project, bug_id = key

        prompt_tokens = 0
        completion_tokens = 0
        total_tokens = 0

        call_success = 0
        call_failed = 0
        truncated_calls = 0

        for call in calls:
            row = call["row"]
            usage = row.get(
                "usage",
                {}
            ) or {}

            prompt_tokens += int(
                usage.get(
                    "prompt_tokens",
                    0
                ) or 0
            )

            completion_tokens += int(
                usage.get(
                    "completion_tokens",
                    0
                ) or 0
            )

            total_tokens += int(
                usage.get(
                    "total_tokens",
                    0
                ) or 0
            )

            generation_status = str(
                row.get(
                    "generation_status",
                    row.get(
                        "status",
                        "unknown"
                    )
                )
            ).lower()

            if generation_status == "success":
                call_success += 1
            else:
                call_failed += 1

            finish_reason = str(
                row.get(
                    "finish_reason",
                    ""
                )
            ).lower()

            if finish_reason in {
                "length",
                "max_tokens",
                "max_token",
            }:
                truncated_calls += 1

        testcode_available = has_testcode(
            tool,
            project,
            bug_id
        )

        ev = evaluations[tool].get(
            key,
            {}
        )

        evaluation_status = ev.get(
            "evaluation_status",
            "missing"
        )

        bug_detected = (
            ev.get("bug_detected")
            is True
        )

        metrics = {
            "tool": tool,
            "project": project,
            "bug_id": bug_id,

            "api_calls":
                len(calls),

            "api_call_success":
                call_success,

            "api_call_failed":
                call_failed,

            "truncated_calls":
                truncated_calls,

            "prompt_tokens":
                prompt_tokens,

            "completion_tokens":
                completion_tokens,

            "total_tokens":
                total_tokens,

            "testcode_available":
                testcode_available,

            "evaluation_status":
                evaluation_status,

            "evaluation_success":
                evaluation_status == "success",

            "bug_detected":
                bug_detected,

            "bug_revealing_tests":
                ev.get(
                    "bug_revealing_tests",
                    ""
                ),
        }

        per_bug_rows.append(metrics)
        bug_metrics[tool][key] = metrics


per_bug_rows.sort(
    key=lambda r: (
        r["tool"],
        r["project"],
        int(r["bug_id"])
        if str(r["bug_id"]).isdigit()
        else 999999
    )
)

write_csv(
    FINAL / "ai_token_per_bug.csv",
    per_bug_rows
)


# --------------------------------------------------
# Overall per-tool summary
# --------------------------------------------------

overall_rows = []

for tool in TOOLS:

    rows = list(
        bug_metrics[tool].values()
    )

    call_rows = list(
        all_calls[tool].values()
    )

    token_values = [
        r["total_tokens"]
        for r in rows
    ]

    total_tokens = sum(
        token_values
    )

    prompt_tokens = sum(
        r["prompt_tokens"]
        for r in rows
    )

    completion_tokens = sum(
        r["completion_tokens"]
        for r in rows
    )

    testcode_cases = sum(
        1
        for r in rows
        if r["testcode_available"]
    )

    eval_success = sum(
        1
        for r in rows
        if r["evaluation_success"]
    )

    detected = sum(
        1
        for r in rows
        if r["bug_detected"]
    )

    api_success = 0
    api_failed = 0
    truncated = 0

    for call in call_rows:
        row = call["row"]

        status = str(
            row.get(
                "generation_status",
                row.get("status", "")
            )
        ).lower()

        if status == "success":
            api_success += 1
        else:
            api_failed += 1

        finish_reason = str(
            row.get(
                "finish_reason",
                ""
            )
        ).lower()

        if finish_reason in {
            "length",
            "max_tokens",
            "max_token",
        }:
            truncated += 1

    overall_rows.append({
        "tool":
            tool,

        "benchmark_bugs":
            BENCHMARK_SIZE,

        "bugs_with_token_data":
            len(rows),

        "bug_token_coverage_pct":
            pct(
                len(rows),
                BENCHMARK_SIZE
            ),

        "unique_api_calls":
            len(call_rows),

        "api_generation_success_calls":
            api_success,

        "api_generation_failed_calls":
            api_failed,

        "api_generation_success_rate_pct":
            pct(
                api_success,
                len(call_rows)
            ),

        "truncated_api_calls":
            truncated,

        "prompt_tokens":
            prompt_tokens,

        "completion_tokens":
            completion_tokens,

        "total_tokens":
            total_tokens,

        "avg_tokens_per_attempted_bug":
            avg(token_values),

        "median_tokens_per_attempted_bug":
            med(token_values),

        "testcode_available_bugs":
            testcode_cases,

        "testcode_available_rate_854_pct":
            pct(
                testcode_cases,
                BENCHMARK_SIZE
            ),

        "evaluation_success_with_token_data":
            eval_success,

        "evaluation_success_rate_token_cases_pct":
            pct(
                eval_success,
                len(rows)
            ),

        "bugs_detected_with_token_data":
            detected,

        "fault_detection_rate_token_cases_pct":
            pct(
                detected,
                len(rows)
            ),

        "total_tokens_per_testcode_bug":
            ratio(
                total_tokens,
                testcode_cases
            ),

        "total_tokens_per_eval_success":
            ratio(
                total_tokens,
                eval_success
            ),

        "total_tokens_per_detected_bug":
            ratio(
                total_tokens,
                detected
            ),

        "detected_bugs_per_million_tokens":
            round(
                detected
                / total_tokens
                * 1_000_000,
                4
            )
            if total_tokens
            else "",
    })


write_csv(
    FINAL / "ai_token_summary.csv",
    overall_rows
)


# --------------------------------------------------
# FAIR Gemini vs Claude:
# exact same bug IDs with token data on both sides
# --------------------------------------------------

common_keys = (
    set(bug_metrics["gemini"])
    & set(bug_metrics["claude"])
)

common_rows = []

for tool in TOOLS:

    rows = [
        bug_metrics[tool][key]
        for key in common_keys
    ]

    total_tokens = sum(
        r["total_tokens"]
        for r in rows
    )

    prompt_tokens = sum(
        r["prompt_tokens"]
        for r in rows
    )

    completion_tokens = sum(
        r["completion_tokens"]
        for r in rows
    )

    token_values = [
        r["total_tokens"]
        for r in rows
    ]

    testcode_cases = sum(
        1
        for r in rows
        if r["testcode_available"]
    )

    eval_success = sum(
        1
        for r in rows
        if r["evaluation_success"]
    )

    detected = sum(
        1
        for r in rows
        if r["bug_detected"]
    )

    api_calls = sum(
        r["api_calls"]
        for r in rows
    )

    api_success = sum(
        r["api_call_success"]
        for r in rows
    )

    common_rows.append({
        "tool":
            tool,

        "common_token_bugs":
            len(common_keys),

        "api_calls":
            api_calls,

        "api_generation_success_calls":
            api_success,

        "api_generation_success_rate_pct":
            pct(
                api_success,
                api_calls
            ),

        "prompt_tokens":
            prompt_tokens,

        "completion_tokens":
            completion_tokens,

        "total_tokens":
            total_tokens,

        "avg_tokens_per_common_bug":
            avg(token_values),

        "median_tokens_per_common_bug":
            med(token_values),

        "testcode_available":
            testcode_cases,

        "testcode_success_rate_common_pct":
            pct(
                testcode_cases,
                len(common_keys)
            ),

        "evaluation_success":
            eval_success,

        "evaluation_success_rate_common_pct":
            pct(
                eval_success,
                len(common_keys)
            ),

        "bugs_detected":
            detected,

        "fault_detection_rate_common_pct":
            pct(
                detected,
                len(common_keys)
            ),

        "tokens_per_testcode_success":
            ratio(
                total_tokens,
                testcode_cases
            ),

        "tokens_per_evaluation_success":
            ratio(
                total_tokens,
                eval_success
            ),

        "tokens_per_detected_bug":
            ratio(
                total_tokens,
                detected
            ),

        "detected_bugs_per_million_tokens":
            round(
                detected
                / total_tokens
                * 1_000_000,
                4
            )
            if total_tokens
            else "",
    })


write_csv(
    FINAL / "ai_token_common_summary.csv",
    common_rows
)


# --------------------------------------------------
# Console report
# --------------------------------------------------

print("=" * 78)
print("AI TOKEN DATA - OVERALL")
print("=" * 78)

for row in overall_rows:

    print()
    print(row["tool"].upper())

    print(
        "  Bugs with token data : "
        f'{row["bugs_with_token_data"]}/854 '
        f'({row["bug_token_coverage_pct"]}%)'
    )

    print(
        "  Unique API calls      : "
        f'{row["unique_api_calls"]}'
    )

    print(
        "  API call success      : "
        f'{row["api_generation_success_calls"]}/'
        f'{row["unique_api_calls"]} '
        f'({row["api_generation_success_rate_pct"]}%)'
    )

    print(
        "  Total tokens          : "
        f'{row["total_tokens"]:,}'
    )

    print(
        "  Avg tokens/bug        : "
        f'{row["avg_tokens_per_attempted_bug"]:,.2f}'
    )

    print(
        "  Median tokens/bug     : "
        f'{row["median_tokens_per_attempted_bug"]:,.2f}'
    )

    print(
        "  TestCode available    : "
        f'{row["testcode_available_bugs"]}/854'
    )

    print(
        "  Evaluation success    : "
        f'{row["evaluation_success_with_token_data"]}'
    )

    print(
        "  Bugs detected         : "
        f'{row["bugs_detected_with_token_data"]}'
    )


print()
print("=" * 78)
print("FAIR TOKEN COMPARISON - SAME BUGS")
print("=" * 78)

print(
    "Common bugs with token data:",
    len(common_keys)
)

for row in common_rows:

    print()
    print(row["tool"].upper())

    print(
        "  API calls             : "
        f'{row["api_calls"]}'
    )

    print(
        "  API generation success: "
        f'{row["api_generation_success_rate_pct"]}%'
    )

    print(
        "  Total tokens          : "
        f'{row["total_tokens"]:,}'
    )

    print(
        "  Avg tokens/bug        : "
        f'{row["avg_tokens_per_common_bug"]:,.2f}'
    )

    print(
        "  Median tokens/bug     : "
        f'{row["median_tokens_per_common_bug"]:,.2f}'
    )

    print(
        "  TestCode available    : "
        f'{row["testcode_available"]}/'
        f'{row["common_token_bugs"]} '
        f'({row["testcode_success_rate_common_pct"]}%)'
    )

    print(
        "  Evaluation success    : "
        f'{row["evaluation_success"]}/'
        f'{row["common_token_bugs"]} '
        f'({row["evaluation_success_rate_common_pct"]}%)'
    )

    print(
        "  Bugs detected         : "
        f'{row["bugs_detected"]}/'
        f'{row["common_token_bugs"]} '
        f'({row["fault_detection_rate_common_pct"]}%)'
    )

    print(
        "  Tokens / eval success : "
        f'{row["tokens_per_evaluation_success"]}'
    )

    print(
        "  Tokens / detected bug : "
        f'{row["tokens_per_detected_bug"]}'
    )

    print(
        "  Bugs / 1M tokens      : "
        f'{row["detected_bugs_per_million_tokens"]}'
    )


print()
print("Created:")
print(" evaluation/final/ai_token_per_bug.csv")
print(" evaluation/final/ai_token_summary.csv")
print(" evaluation/final/ai_token_common_summary.csv")
