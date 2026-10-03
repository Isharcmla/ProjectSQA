#!/usr/bin/env python3

import csv
from pathlib import Path

import matplotlib.pyplot as plt


ROOT = Path(__file__).resolve().parents[1]
FINAL = ROOT / "evaluation" / "final"
INPUT = FINAL / "ai_token_common_summary.csv"
OUT = FINAL / "charts" / "ai_token"

OUT.mkdir(parents=True, exist_ok=True)


with INPUT.open(
    encoding="utf-8-sig",
    newline=""
) as f:
    rows = list(csv.DictReader(f))


LABELS = {
    "gemini": "Gemini",
    "claude": "Claude",
}


def labels():
    return [
        LABELS[row["tool"]]
        for row in rows
    ]


def values(field):
    return [
        float(row[field])
        for row in rows
    ]


def add_labels(ax, bars, digits=2, suffix=""):
    for bar in bars:
        value = bar.get_height()

        ax.annotate(
            f"{value:.{digits}f}{suffix}",
            xy=(
                bar.get_x()
                + bar.get_width() / 2,
                value
            ),
            xytext=(0, 4),
            textcoords="offset points",
            ha="center",
            va="bottom",
            fontsize=9,
        )


def save(fig, filename):
    path = OUT / filename

    fig.tight_layout()

    fig.savefig(
        path,
        dpi=300,
        bbox_inches="tight"
    )

    plt.close(fig)

    print("CREATED", path)


# --------------------------------------------------
# 1. Average Tokens per Bug
# --------------------------------------------------

fig, ax = plt.subplots(figsize=(7, 5))

bars = ax.bar(
    labels(),
    values("avg_tokens_per_common_bug")
)

ax.set_title(
    "Average Token Usage per Bug\n"
    "(534 Common Bugs)"
)

ax.set_ylabel("Average Tokens per Bug")
ax.set_xlabel("AI Model")

add_labels(
    ax,
    bars,
    digits=0
)

save(
    fig,
    "05_ai_avg_tokens_per_bug.png"
)


# --------------------------------------------------
# 2. Evaluation Success Rate
# --------------------------------------------------

fig, ax = plt.subplots(figsize=(7, 5))

bars = ax.bar(
    labels(),
    values(
        "evaluation_success_rate_common_pct"
    )
)

ax.set_title(
    "Evaluation Success Rate\n"
    "(534 Common Bugs)"
)

ax.set_ylabel("Evaluation Success Rate (%)")
ax.set_xlabel("AI Model")
ax.set_ylim(0, 100)

add_labels(
    ax,
    bars,
    digits=2,
    suffix="%"
)

save(
    fig,
    "06_ai_evaluation_success.png"
)


# --------------------------------------------------
# 3. Fault Detection Rate
# --------------------------------------------------

fig, ax = plt.subplots(figsize=(7, 5))

bars = ax.bar(
    labels(),
    values(
        "fault_detection_rate_common_pct"
    )
)

ax.set_title(
    "Fault Detection Rate\n"
    "(534 Common Bugs)"
)

ax.set_ylabel("Fault Detection Rate (%)")
ax.set_xlabel("AI Model")

add_labels(
    ax,
    bars,
    digits=2,
    suffix="%"
)

save(
    fig,
    "07_ai_fault_detection_rate.png"
)


# --------------------------------------------------
# 4. Detected Bugs per 1M Tokens
# --------------------------------------------------

fig, ax = plt.subplots(figsize=(7, 5))

bars = ax.bar(
    labels(),
    values(
        "detected_bugs_per_million_tokens"
    )
)

ax.set_title(
    "Detected Bugs per 1 Million Tokens\n"
    "(534 Common Bugs)"
)

ax.set_ylabel("Detected Bugs / 1M Tokens")
ax.set_xlabel("AI Model")

add_labels(
    ax,
    bars,
    digits=3
)

save(
    fig,
    "08_ai_bugs_per_million_tokens.png"
)


print()
print("ALL AI TOKEN CHARTS CREATED")
print("Output:")
print(" evaluation/final/charts/ai_token/")
