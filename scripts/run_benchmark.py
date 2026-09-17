#!/usr/bin/env python3
"""
run_benchmark.py
=========================================================
Universal Benchmark Runner สำหรับรัน Kex (Reanimator) กับ Defects4J
รองรับ 3 โหมด:
  --project X --bug N     รันเดี่ยวเฉพาะบั๊กเดียว
  --sample-17             รันตัวแทนโปรเจกต์ละ 1 บั๊ก (17 บั๊ก)
  --all-bugs              รันทุก active bug ใน Defects4J ทั้งหมด
เพิ่ม --resume เพื่อรันต่อจากจุดที่ค้างไว้ (อ่านจาก progress.json)

ตัวอย่างการใช้:
  python3 run_benchmark.py --project Lang --bug 1
  python3 run_benchmark.py --sample-17
  python3 run_benchmark.py --all-bugs --resume
=========================================================
"""

import argparse
import csv
import json
import os
import shutil
import subprocess
import sys
import time
from datetime import datetime
from pathlib import Path

# ---------- Config: ปรับ path ให้ตรงกับเครื่องของคุณ ----------
BASE_DIR = Path.home() / "kex-testing"
CHECKOUT_DIR = BASE_DIR / "checkouts"
RESULT_DIR = BASE_DIR / "results"
LOG_DIR = BASE_DIR / "logs"
PROGRESS_FILE = BASE_DIR / "progress.json"
KEX_HOME = Path.home() / "kex"

ALL_PROJECTS = [
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time"
]

# Path ของ Git repo (mount ผ่าน docker-compose ที่ ../:/workspace)
# ถ้ารันนอก Docker ให้แก้ path นี้ให้ตรงกับตำแหน่ง ProjectSQA ในเครื่องจริง
REPO_DIR = Path("/workspace")

TOOL_TO_REPO_FOLDER = {
    "kex": "Reanimator-Kex",
    "evosuite": "DynaMOSA-EvoSuite",
}

for d in (CHECKOUT_DIR, RESULT_DIR, LOG_DIR):
    d.mkdir(parents=True, exist_ok=True)


# ---------- Progress tracking (สำหรับ --resume) ----------
def load_progress():
    if PROGRESS_FILE.exists():
        with open(PROGRESS_FILE, "r", encoding="utf-8") as f:
            return json.load(f)
    return {"completed": [], "failed": []}


def save_progress(progress):
    with open(PROGRESS_FILE, "w", encoding="utf-8") as f:
        json.dump(progress, f, indent=2, ensure_ascii=False)


def already_done(progress, task_id):
    return task_id in progress["completed"] or task_id in progress["failed"]


# ---------- Defects4J helpers ----------
def get_bug_ids(project):
    """ดึงรายชื่อ bug id ทั้งหมดของ project"""
    result = subprocess.run(
        ["defects4j", "bids", "-p", project],
        capture_output=True, text=True
    )
    return result.stdout.strip().split("\n") if result.stdout.strip() else []


def checkout_and_compile(project, bug_id, log_file):
    """checkout + compile 1 bug คืนค่า (success, work_dir)"""
    work_dir = CHECKOUT_DIR / f"{project}_{bug_id}_buggy"

    with open(log_file, "a", encoding="utf-8") as log:
        log.write(f"\n=== Checkout {project}-{bug_id} ===\n")
        r1 = subprocess.run(
            ["defects4j", "checkout", "-p", project, "-v", f"{bug_id}b", "-w", str(work_dir)],
            stdout=log, stderr=log
        )
        if r1.returncode != 0:
            return False, work_dir

        log.write(f"\n=== Compile {project}-{bug_id} ===\n")
        r2 = subprocess.run(
            ["defects4j", "compile", "-w", str(work_dir)],
            stdout=log, stderr=log
        )
        if r2.returncode != 0:
            return False, work_dir

    return True, work_dir


def get_target_classes(work_dir, log_file):
    """ดึงรายชื่อ class ที่มีบั๊กจริง (classes.modified)"""
    result = subprocess.run(
        ["defects4j", "export", "-p", "classes.modified", "-w", str(work_dir)],
        capture_output=True, text=True
    )
    return [c.strip() for c in result.stdout.strip().split("\n") if c.strip()]


def get_classes_dir(work_dir):
    """ดึง path ของ compiled classes"""
    result = subprocess.run(
        ["defects4j", "export", "-p", "dir.bin.classes", "-w", str(work_dir)],
        capture_output=True, text=True
    )
    return result.stdout.strip()


# ---------- EvoSuite runner (ผ่าน Defects4J integration สำเร็จรูป) ----------
def run_evosuite(work_dir, log_file, timeout_sec=300):
    """รัน EvoSuite ผ่าน `defects4j test -tool evosuite`
    Defects4J จัดการ DynaMOSA (default algorithm ของ EvoSuite >=1.2.0) ให้เอง
    ไม่ต้อง config อะไรเพิ่มเติม คืนค่า True/False ว่าสำเร็จไหม
    """
    with open(log_file, "a", encoding="utf-8") as log:
        log.write(f"\n=== Run EvoSuite (DynaMOSA) on {work_dir} ===\n")
        try:
            result = subprocess.run(
                ["defects4j", "test", "-w", str(work_dir), "-tool", "evosuite"],
                stdout=log, stderr=log, timeout=timeout_sec
            )
            return result.returncode == 0
        except subprocess.TimeoutExpired:
            log.write(f"\n[TIMEOUT] EvoSuite เกิน {timeout_sec} วินาที ข้ามไป\n")
            return False


# ---------- Kex runner ----------
def run_kex(work_dir, classes_dir, target_class, log_file, timeout_sec=120):
    """รัน Kex กับ target class เดียว คืนค่า True/False ว่าสำเร็จไหม
    อ้างอิง syntax จริงจาก https://github.com/vorpal-research/kex README:
      python ./kex.py --classpath <arg> --target <arg> --output <arg> --mode <arg>
    mode ที่ใช้ได้: crash, symbolic, concolic, libchecker, defectchecker
    """
    kex_script = KEX_HOME / "kex.py"
    output_dir = work_dir / "kex-output"
    output_dir.mkdir(exist_ok=True)

    cmd = [
        "python3", str(kex_script),
        "--classpath", str(Path(work_dir) / classes_dir),
        "--target", target_class,
        "--mode", "concolic",   # concolic ให้ผลใกล้เคียง Reanimator paper มากที่สุด
        "--output", str(output_dir),
    ]

    with open(log_file, "a", encoding="utf-8") as log:
        log.write(f"\n=== Run Kex on {target_class} ===\n")
        log.write(f"Command: {' '.join(cmd)}\n")
        try:
            result = subprocess.run(
                cmd, stdout=log, stderr=log, timeout=timeout_sec
            )
            return result.returncode == 0
        except subprocess.TimeoutExpired:
            log.write(f"\n[TIMEOUT] Kex เกิน {timeout_sec} วินาที ข้ามไป\n")
            return False


def find_generated_test_files(work_dir, tool):
    """หาไฟล์ .java (test) ที่ถูกสร้างขึ้นใหม่จากการรัน tool นี้
    - kex: อยู่ที่ work_dir/kex-output แน่นอน (เรากำหนดเอง)
    - evosuite: ตำแหน่งจริงอาจต่างกันตาม version ของ Defects4J
      ใช้วิธี "หาไฟล์ .java ทั้งหมดใต้ work_dir ที่ชื่อลงท้ายด้วย ESTest หรือ Test
      และถูกแก้ไขล่าสุด" เป็น fallback ที่ปลอดภัยกว่าการ hardcode path เดียว
      *** ควรตรวจสอบ path จริงหลังรันครั้งแรก แล้วปรับโค้ดส่วนนี้ให้เจาะจงขึ้น ***
    """
    if tool == "kex":
        output_dir = work_dir / "kex-output"
        return list(output_dir.rglob("*.java")) if output_dir.exists() else []

    elif tool == "evosuite":
        # EvoSuite ผ่าน defects4j มักตั้งชื่อไฟล์ลงท้ายด้วย ESTest.java
        candidates = list(work_dir.rglob("*ESTest.java"))
        if not candidates:
            # fallback: หาไฟล์ที่มีคำว่า Test ในชื่อ ที่ไม่ใช่ test เดิมของโปรเจกต์
            candidates = list(work_dir.rglob("*_ESTest*.java"))
        return candidates

    return []


def append_to_summary_csv(repo_folder, row):
    """เพิ่มแถวผลลัพธ์ลงใน Result_Round2/summary.csv ของสายนั้นๆ"""
    summary_path = REPO_DIR / repo_folder / "Result_Round2" / "summary.csv"
    summary_path.parent.mkdir(parents=True, exist_ok=True)
    file_exists = summary_path.exists()

    with open(summary_path, "a", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(f, fieldnames=row.keys())
        if not file_exists:
            writer.writeheader()
        writer.writerow(row)


def copy_to_repo(tool, project, bug_id, work_dir, bug_result):
    """Copy ผลลัพธ์ทั้งหมด (JSON + test code) เข้าโฟลเดอร์ repo จริง
    เรียกอัตโนมัติหลังจากรันแต่ละบั๊กเสร็จใน run_one_bug()
    """
    repo_folder = TOOL_TO_REPO_FOLDER.get(tool)
    if repo_folder is None:
        return

    if not REPO_DIR.exists():
        print(f"      [WARN] ไม่พบ {REPO_DIR} — ข้ามการ copy เข้า repo "
              f"(ตรวจสอบว่า mount volume ถูกต้องใน docker-compose.yml)")
        return

    # 1) Copy ผล JSON เข้า Result_Round2/<Project>/
    result_target_dir = REPO_DIR / repo_folder / "Result_Round2" / project
    result_target_dir.mkdir(parents=True, exist_ok=True)
    result_filename = f"{project}_{bug_id}_result.json"
    with open(result_target_dir / result_filename, "w", encoding="utf-8") as f:
        json.dump(bug_result, f, indent=2, ensure_ascii=False)

    # 2) Copy ไฟล์ test code เข้า TestCode/<Project>/
    test_target_dir = REPO_DIR / repo_folder / "TestCode" / project
    test_target_dir.mkdir(parents=True, exist_ok=True)
    test_files = find_generated_test_files(work_dir, tool)
    copied_count = 0
    for tf in test_files:
        dest = test_target_dir / f"{project}_{bug_id}_{tf.name}"
        shutil.copy2(tf, dest)
        copied_count += 1

    if copied_count == 0:
        print(f"      [WARN] ไม่พบไฟล์ test ที่สร้างจาก {tool} ใน {work_dir} "
              f"— ตรวจสอบ path ใน find_generated_test_files() อีกครั้ง")

    # 3) อัปเดต summary.csv
    status = bug_result.get(f"{tool}_result") or \
        ("success" if any(v == "success" for v in bug_result.get(f"{tool}_results", {}).values()) else "failed")

    append_to_summary_csv(repo_folder, {
        "project": project,
        "bug_id": bug_id,
        "status": status,
        "num_test_files_generated": copied_count,
        "elapsed_sec": bug_result.get("elapsed_sec"),
        "timestamp": datetime.now().isoformat(timespec="seconds"),
    })

    print(f"      [REPO] copy ผลลัพธ์ + {copied_count} test files เข้า {repo_folder}/ เรียบร้อย")


# ---------- Main task runner (ใช้ร่วมกันทุกโหมด) ----------
def run_one_bug(project, bug_id, progress, tool="kex"):
    """tool: 'kex' (Reanimator/Member 2) หรือ 'evosuite' (DynaMOSA/Member 1)"""
    task_id = f"{project}-{bug_id}-{tool}"
    log_file = LOG_DIR / f"{project}_{bug_id}_{tool}.log"

    if already_done(progress, task_id):
        print(f"  [SKIP] {task_id} (ทำไปแล้ว)")
        return

    print(f"  [RUN]  {task_id} ...")
    start_time = time.time()

    ok, work_dir = checkout_and_compile(project, bug_id, log_file)
    if not ok:
        print(f"  [FAIL] {task_id} -> checkout/compile ไม่ผ่าน (ดู log ที่ {log_file})")
        progress["failed"].append(task_id)
        save_progress(progress)
        return

    bug_result = {
        "project": project,
        "bug_id": bug_id,
        "tool": tool,
        "elapsed_sec": None,
    }

    if tool == "evosuite":
        success = run_evosuite(work_dir, log_file)
        bug_result["evosuite_result"] = "success" if success else "failed"

    elif tool == "kex":
        classes_dir = get_classes_dir(work_dir)
        target_classes = get_target_classes(work_dir, log_file)
        bug_result["target_classes"] = target_classes
        bug_result["kex_results"] = {}
        for tc in target_classes:
            success = run_kex(work_dir, classes_dir, tc, log_file)
            bug_result["kex_results"][tc] = "success" if success else "failed"

    else:
        print(f"  [ERROR] ไม่รู้จัก tool: {tool}")
        return

    bug_result["elapsed_sec"] = round(time.time() - start_time, 2)

    result_dir = RESULT_DIR / tool / project / str(bug_id)
    result_dir.mkdir(parents=True, exist_ok=True)
    with open(result_dir / f"{tool}_result.json", "w", encoding="utf-8") as f:
        json.dump(bug_result, f, indent=2, ensure_ascii=False)

    print(f"  [DONE] {task_id} ({bug_result['elapsed_sec']}s)")

    # Copy ผลลัพธ์เข้า repo จริงอัตโนมัติ (Reanimator-Kex/ หรือ DynaMOSA-EvoSuite/)
    copy_to_repo(tool, project, bug_id, work_dir, bug_result)

    progress["completed"].append(task_id)
    save_progress(progress)


# ---------- CLI ----------
def main():
    parser = argparse.ArgumentParser(description="Kex Benchmark Runner on Defects4J")
    parser.add_argument("--project", type=str, help="ระบุ project เดียว เช่น Lang")
    parser.add_argument("--bug", type=str, help="ระบุ bug id เดียว เช่น 1")
    parser.add_argument("--sample-17", action="store_true", help="รันตัวแทนโปรเจกต์ละ 1 บั๊ก")
    parser.add_argument("--all-bugs", action="store_true", help="รันทุก bug ในทุก project")
    parser.add_argument("--resume", action="store_true", help="ข้ามงานที่ทำไปแล้ว (อ่านจาก progress.json)")
    parser.add_argument("--tool", type=str, default="kex", choices=["kex", "evosuite"],
                         help="เลือกเครื่องมือ: kex (Reanimator, default) หรือ evosuite (DynaMOSA)")
    args = parser.parse_args()

    progress = load_progress() if args.resume else {"completed": [], "failed": []}

    if args.project and args.bug:
        run_one_bug(args.project, args.bug, progress, tool=args.tool)

    elif args.sample_17:
        for project in ALL_PROJECTS:
            bug_ids = get_bug_ids(project)
            if bug_ids:
                print(f"\n[Project: {project}] เลือก bug ตัวแทน: {bug_ids[0]}")
                run_one_bug(project, bug_ids[0], progress, tool=args.tool)

    elif args.all_bugs:
        for project in ALL_PROJECTS:
            bug_ids = get_bug_ids(project)
            print(f"\n[Project: {project}] พบ {len(bug_ids)} bugs")
            for bug_id in bug_ids:
                run_one_bug(project, bug_id, progress, tool=args.tool)

    else:
        parser.print_help()
        sys.exit(1)

    print("\n=========================================")
    print(f"เสร็จสิ้น: {len(progress['completed'])} สำเร็จ, {len(progress['failed'])} ล้มเหลว")
    print(f"ดูรายละเอียดที่ {RESULT_DIR}")
    print("=========================================")


if __name__ == "__main__":
    main()
