#!/usr/bin/env python3
"""
batch_evaluate.py
=========================================================
Batch Evaluation Runner for Defects4J Generated Tests
Runs evaluate_tests.py across all generated bugs for a specified tool
(Gemini, Claude, EvoSuite, Kex) with resume support and progress logging.

Usage:
  # Evaluate all completed Gemini test suites
  python3 scripts/batch_evaluate.py --tool gemini

  # Evaluate a specific project
  python3 scripts/batch_evaluate.py --tool gemini --project Lang

  # Dry run to see remaining tasks
  python3 scripts/batch_evaluate.py --tool gemini --dry-run

  # Via Docker:
  docker exec -it sqa_kex_container python3 /workspace/scripts/batch_evaluate.py --tool gemini
=========================================================
"""

import argparse
import json
import os
import signal
import subprocess
import sys
import time
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Tuple

if hasattr(sys.stdout, "reconfigure"):
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
        sys.stderr.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass

# Detect workspace root (/workspace in Docker or local git repo root)
REPO_DIR = Path("/workspace")
if not REPO_DIR.exists():
    REPO_DIR = Path(__file__).resolve().parent.parent

SCRIPTS_DIR = REPO_DIR / "scripts"
EVALUATE_SCRIPT = SCRIPTS_DIR / "evaluate_tests.py"
LOGS_DIR = REPO_DIR / "logs"
LOGS_DIR.mkdir(parents=True, exist_ok=True)


def get_test_dir(tool: str) -> Path:
    """Return root directory where generated test files are stored."""
    if tool == "gemini":
        return REPO_DIR / "Gemini" / "TestCode"
    elif tool == "claude":
        return REPO_DIR / "Claude" / "TestCode"
    elif tool == "evosuite":
        return REPO_DIR / "DynaMOSA-EvoSuite" / "TestCode"
    elif tool == "kex":
        return REPO_DIR / "Reanimator-Kex" / "TestCode"
    else:
        raise ValueError(f"Unknown tool: {tool}")


def scan_available_targets(tool: str, project_filter: Optional[str] = None) -> List[Tuple[str, str, int]]:
    """Scan and return list of (project, bug_id, num_test_files) that have generated tests."""
    base_dir = get_test_dir(tool)
    if not base_dir.is_dir():
        print(f"[WARN] Test directory not found: {base_dir}")
        return []

    targets = []

    if tool in ("gemini", "claude"):
        # Folder structure: <TestCode>/<Project>/<Bug_ID>/*.java
        for proj_dir in sorted(base_dir.iterdir()):
            if not proj_dir.is_dir() or proj_dir.name.startswith("."):
                continue
            if project_filter and proj_dir.name.lower() != project_filter.lower():
                continue

            for bug_dir in sorted(
                proj_dir.iterdir(),
                key=lambda p: int(p.name) if p.name.isdigit() else 9999,
            ):
                if not bug_dir.is_dir():
                    continue
                java_files = [f for f in bug_dir.glob("*.java") if not f.name.startswith(".")]
                if java_files:
                    targets.append((proj_dir.name, bug_dir.name, len(java_files)))

    elif tool in ("evosuite", "kex"):
        # Folder structure: <TestCode>/<Project>/<Project>_<Bug_ID>_*.java
        for proj_dir in sorted(base_dir.iterdir()):
            if not proj_dir.is_dir() or proj_dir.name.startswith("."):
                continue
            if project_filter and proj_dir.name.lower() != project_filter.lower():
                continue

            bug_files: Dict[str, int] = {}
            for java_file in proj_dir.glob(f"{proj_dir.name}_*.java"):
                parts = java_file.stem.split("_")
                if len(parts) >= 2 and parts[1].isdigit():
                    b_id = parts[1]
                    bug_files[b_id] = bug_files.get(b_id, 0) + 1

            for b_id in sorted(bug_files.keys(), key=lambda x: int(x)):
                targets.append((proj_dir.name, b_id, bug_files[b_id]))

    return targets


def is_already_evaluated(tool: str, project: str, bug_id: str) -> bool:
    """Check if summary.json already exists for this target."""
    summary_file = REPO_DIR / "evaluation" / tool / project / str(bug_id) / "summary.json"
    return summary_file.is_file()


def get_summary_result(tool: str, project: str, bug_id: str) -> Optional[Dict]:
    """Read existing summary.json if available."""
    summary_file = REPO_DIR / "evaluation" / tool / project / str(bug_id) / "summary.json"
    if summary_file.is_file():
        try:
            return json.loads(summary_file.read_text(encoding="utf-8", errors="replace"))
        except Exception:
            pass
    return None


class BatchEvaluator:
    def __init__(
        self,
        tool: str = "gemini",
        project_filter: Optional[str] = None,
        bug_filter: Optional[str] = None,
        timeout: int = 15,
        force: bool = False,
        limit: Optional[int] = None,
        dry_run: bool = False,
    ):
        self.tool = tool.lower()
        self.project_filter = project_filter
        self.bug_filter = str(bug_filter) if bug_filter else None
        self.timeout = timeout
        self.force = force
        self.limit = limit
        self.dry_run = dry_run
        self.interrupted = False

        signal.signal(signal.SIGINT, self._handle_interrupt)
        signal.signal(signal.SIGTERM, self._handle_interrupt)

    def _handle_interrupt(self, signum, frame):
        print("\n\n[BatchEvaluator] Received interrupt signal (Ctrl+C). Stopping gracefully...")
        self.interrupted = True

    def run(self):
        print("=" * 75)
        print(f" BATCH EVALUATION RUNNER: {self.tool.upper()}")
        print(f" Time: {datetime.now().strftime('%Y-%m-%d %H:%M:%S')}")
        print(f" Repo dir: {REPO_DIR}")
        if self.project_filter:
            print(f" Filter Project: {self.project_filter}")
        if self.bug_filter:
            print(f" Filter Bug: {self.bug_filter}")
        print(f" Timeout per test: {self.timeout}s")
        print(f" Force re-eval: {self.force}")
        print("=" * 75)

        targets = scan_available_targets(self.tool, self.project_filter)

        if self.bug_filter:
            targets = [t for t in targets if t[1] == self.bug_filter]

        if not targets:
            print(f"[!] No targets found for tool='{self.tool}'.")
            return

        total_targets = len(targets)
        to_run = []
        already_done_count = 0

        for proj, bug, files in targets:
            if not self.force and is_already_evaluated(self.tool, proj, bug):
                already_done_count += 1
            else:
                to_run.append((proj, bug, files))

        print(f"\nTarget Summary:")
        print(f"  Total targets found : {total_targets:,}")
        print(f"  Already evaluated   : {already_done_count:,} (will be skipped)")
        print(f"  Remaining to run    : {len(to_run):,}")

        if self.limit and len(to_run) > self.limit:
            to_run = to_run[: self.limit]
            print(f"  Limit applied       : running first {len(to_run):,} targets")

        if self.dry_run:
            print("\n[DRY RUN] Remaining targets that would be evaluated:")
            for proj, bug, files in to_run[:50]:
                print(f"  - {proj}-{bug} ({files} test files)")
            if len(to_run) > 50:
                print(f"  ... and {len(to_run) - 50} more")
            return

        if not to_run:
            print("\nAll targets are already evaluated! Nothing to do.")
            return

        print("\n" + "=" * 75)
        print(" STARTING BATCH EVALUATION")
        print("=" * 75)

        eval_start_time = time.perf_counter()
        stats = {
            "success": 0,
            "bugs_detected": 0,
            "compile_failed": 0,
            "runtime_error": 0,
        }

        for idx, (proj, bug, files) in enumerate(to_run, start=1):
            if self.interrupted:
                print(f"\n[BatchEvaluator] Stopped early at {idx-1}/{len(to_run)}. Progress preserved.")
                break

            pct = (idx / len(to_run)) * 100
            print(f"\n[{idx}/{len(to_run)}] ({pct:5.1f}%) [EVAL] {proj}-{bug} ({files} files)... ", end="", flush=True)

            cmd = [
                sys.executable,
                str(EVALUATE_SCRIPT),
                "--project", proj,
                "--bug", str(bug),
                "--tool", self.tool,
                "--timeout", str(self.timeout),
            ]

            target_start = time.perf_counter()
            proc = subprocess.run(cmd, stdout=subprocess.PIPE, stderr=subprocess.STDOUT, text=True)
            elapsed = round(time.perf_counter() - target_start, 1)

            summary = get_summary_result(self.tool, proj, bug)

            if proc.returncode == 0 and summary:
                eval_status = summary.get("evaluation_status", "success")
                detected = summary.get("bug_detected", False)
                revealing = summary.get("bug_revealing_tests", 0)
                candidates = summary.get("candidate_tests", 0)

                stats["success"] += 1
                if detected:
                    stats["bugs_detected"] += 1
                    status_badge = f"\033[92mBUG DETECTED ({revealing}/{candidates})\033[0m"
                else:
                    status_badge = f"OK (revealing=0/{candidates})"

                print(f"-> {status_badge} ({elapsed}s)")

            elif summary and summary.get("evaluation_status") == "compile_failed":
                stats["compile_failed"] += 1
                print(f"-> \033[93mCOMPILE_FAILED\033[0m ({elapsed}s)")

            else:
                stats["runtime_error"] += 1
                first_err = ""
                for line in proc.stdout.splitlines():
                    if "Error" in line or "Exception" in line or "FAILED" in line:
                        first_err = line.strip()
                        break
                print(f"-> \033[91mERROR (exit={proc.returncode})\033[0m: {first_err[:80]} ({elapsed}s)")

        total_elapsed_min = round((time.perf_counter() - eval_start_time) / 60, 1)

        print("\n" + "=" * 75)
        print(" BATCH EVALUATION SUMMARY")
        print("=" * 75)
        print(f"  Tool               : {self.tool.upper()}")
        print(f"  Targets Attempted  : {stats['success'] + stats['compile_failed'] + stats['runtime_error']}")
        print(f"  Success (Ran)      : {stats['success']}")
        print(f"  Bugs Detected      : {stats['bugs_detected']}")
        print(f"  Compile Failed     : {stats['compile_failed']}")
        print(f"  Runtime / Errors   : {stats['runtime_error']}")
        print(f"  Total Time Taken   : {total_elapsed_min} minutes")
        print(f"  Results Directory  : {REPO_DIR / 'evaluation' / self.tool}")
        print("=" * 75)


def main():
    parser = argparse.ArgumentParser(description="Batch Evaluation Runner for Defects4J generated tests")
    parser.add_argument("--tool", default="gemini", choices=["gemini", "claude", "evosuite", "kex"])
    parser.add_argument("--project", default=None, help="Filter by project (e.g. Lang, Math)")
    parser.add_argument("--bug", default=None, help="Filter by bug id (e.g. 1)")
    parser.add_argument("--timeout", type=int, default=15, help="Timeout per test in seconds (default: 15)")
    parser.add_argument("--limit", type=int, default=None, help="Limit number of targets to evaluate")
    parser.add_argument("--force", action="store_true", help="Re-evaluate even if already evaluated")
    parser.add_argument("--dry-run", action="store_true", help="Only list targets to be run")

    args = parser.parse_args()

    evaluator = BatchEvaluator(
        tool=args.tool,
        project_filter=args.project,
        bug_filter=args.bug,
        timeout=args.timeout,
        force=args.force,
        limit=args.limit,
        dry_run=args.dry_run,
    )
    evaluator.run()


if __name__ == "__main__":
    main()
