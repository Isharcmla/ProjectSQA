#!/usr/bin/env python3

import csv
from pathlib import Path

import matplotlib.pyplot as plt


ROOT = Path(__file__).resolve().parents[1]
FINAL = ROOT / "evaluation" / "final"
OUT = FINAL / "charts"

OUT.mkdir(parents=True, exist_ok=True)

LABELS = {
    "evosuite": "DynaMOSA\n(EvoSuite)",
    "kex": "Reanimator\n(KEX)",
    "gemini": "Gemini",
    "claude": "Claude",
}


def read_csv(name):
    with (FINAL / name).open(
        encoding="utf-8-sig",
        newline=""
    ) as f:
        return list(csv.DictReader(f))


def save(fig, name):
    path = OUT / name
    fig.tight_layout()
    fig.savefig(
        path,
        dpi=300,
        bbox_inches="tight"
    )
    plt.close(fig)
    print("CREATED", path)


def add_labels(ax, bars, suffix="%"):
    for bar in bars:
        value = bar.get_height()
        ax.annotate(
            f"{value:.2f}{suffix}",
            xy=(
                bar.get_x() + bar.get_width() / 2,
                value
            ),
            xytext=(0, 3),
            textcoords="offset points",
            ha="center",
            va="bottom",
            fontsize=8,
        )


tech = read_csv("technique_summary.csv")
common_eval = read_csv(
    "common_evaluation_summary.csv"
)
common_cov = read_csv(
    "common_coverage_summary.csv"
)

tools = [row["tool"] for row in tech]
labels = [LABELS[t] for t in tools]


# --------------------------------------------------
# 1. Overall Fault Detection Rate / 854
# --------------------------------------------------

values = [
    float(
        row["overall_fault_detection_rate_854_pct"]
    )
    for row in tech
]

fig, ax = plt.subplots(figsize=(8, 5))

bars = ax.bar(
    labels,
    values
)

ax.set_title(
    "Overall Fault Detection Rate on 854 Defects4J Bugs"
)
ax.set_ylabel("Fault Detection Rate (%)")
ax.set_xlabel("Technique")

add_labels(ax, bars)

save(
    fig,
    "01_overall_fault_detection_rate.png"
)


# --------------------------------------------------
# 2. Evaluation and Coverage Success / 854
# --------------------------------------------------

eval_values = [
    float(
        row["evaluation_success_rate_854_pct"]
    )
    for row in tech
]

coverage_values = [
    float(
        row["coverage_success_rate_854_pct"]
    )
    for row in tech
]

x = list(range(len(tools)))
width = 0.36

fig, ax = plt.subplots(figsize=(9, 5))

bars1 = ax.bar(
    [i - width / 2 for i in x],
    eval_values,
    width,
    label="Evaluation Success"
)

bars2 = ax.bar(
    [i + width / 2 for i in x],
    coverage_values,
    width,
    label="Coverage Success"
)

ax.set_title(
    "End-to-End Success Rate on 854 Defects4J Bugs"
)
ax.set_ylabel("Success Rate (%)")
ax.set_xlabel("Technique")
ax.set_xticks(x)
ax.set_xticklabels(labels)
ax.set_ylim(0, 110)
ax.legend()

add_labels(ax, bars1)
add_labels(ax, bars2)

save(
    fig,
    "02_evaluation_coverage_success.png"
)


# --------------------------------------------------
# 3. Common-case Coverage
# --------------------------------------------------

common_tools = [
    row["tool"]
    for row in common_cov
]

common_labels = [
    LABELS[t]
    for t in common_tools
]

line_values = [
    float(
        row["mean_line_coverage_pct"]
    )
    for row in common_cov
]

condition_values = [
    float(
        row["mean_condition_coverage_pct"]
    )
    for row in common_cov
]

x = list(range(len(common_tools)))

fig, ax = plt.subplots(figsize=(9, 5))

bars1 = ax.bar(
    [i - width / 2 for i in x],
    line_values,
    width,
    label="Mean Line Coverage"
)

bars2 = ax.bar(
    [i + width / 2 for i in x],
    condition_values,
    width,
    label="Mean Condition Coverage"
)

ax.set_title(
    "Coverage on 129 Common Successful Cases"
)
ax.set_ylabel("Coverage (%)")
ax.set_xlabel("Technique")
ax.set_xticks(x)
ax.set_xticklabels(common_labels)
ax.set_ylim(0, 110)
ax.legend()

add_labels(ax, bars1)
add_labels(ax, bars2)

save(
    fig,
    "03_common_case_coverage.png"
)


# --------------------------------------------------
# 4. Common-case Fault Detection
# --------------------------------------------------

common_eval_tools = [
    row["tool"]
    for row in common_eval
]

common_eval_labels = [
    LABELS[t]
    for t in common_eval_tools
]

common_fdr = [
    float(
        row["fault_detection_rate_common_pct"]
    )
    for row in common_eval
]

fig, ax = plt.subplots(figsize=(8, 5))

bars = ax.bar(
    common_eval_labels,
    common_fdr
)

ax.set_title(
    "Fault Detection Rate on 143 Common Successful Evaluations"
)
ax.set_ylabel("Fault Detection Rate (%)")
ax.set_xlabel("Technique")

add_labels(ax, bars)

save(
    fig,
    "04_common_case_fault_detection.png"
)


print()
print("ALL CHARTS CREATED")
print("Output directory:")
print(" evaluation/final/charts/")
