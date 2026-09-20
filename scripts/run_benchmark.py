#!/usr/bin/env python3
"""
run_benchmark.py
=========================================================
Universal Benchmark Runner สำหรับเปรียบเทียบ
Kex (Reanimator) และ EvoSuite/DynaMOSA บน Defects4J

รองรับ 3 โหมด:
  --project X --bug N     รันเดี่ยวเฉพาะบั๊กเดียว
  --sample-17             รันตัวแทนโปรเจกต์ละ 1 บั๊ก (17 บั๊ก)
  --all-bugs              รันทุก active bug ใน Defects4J ทั้งหมด
เพิ่ม --resume เพื่อรันต่อจากจุดที่ค้างไว้ (อ่านจาก progress.json)

ตัวอย่างการใช้:
  python3 run_benchmark.py --project Lang --bug 1 --tool kex
  python3 run_benchmark.py --project Lang --bug 1 --tool evosuite
  python3 run_benchmark.py --sample-17 --tool kex
  python3 run_benchmark.py --all-bugs --tool kex --resume

สถานะของแต่ละ task:
  success  = tool ทำงานสำเร็จ
  failed   = tool หรือ checkout/compile ล้มเหลว
  timeout  = tool ใช้เวลาเกิน benchmark timeout
=========================================================
"""

import argparse
import csv
import json
import shutil
import subprocess
import os
import sys
import tarfile
import time
from datetime import datetime
from pathlib import Path

# ---------- Config: ปรับ path ให้ตรงกับเครื่องของคุณ ----------
BASE_DIR = Path.home() / "kex-testing"
CHECKOUT_DIR = BASE_DIR / "checkouts"
RESULT_DIR = BASE_DIR / "results"
LOG_DIR = BASE_DIR / "logs"
PROGRESS_FILE = BASE_DIR / "progress.json"
KEX_HOME = Path("/opt/kex")
BENCHMARK_TIMEOUT = 300

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
    return {"completed": [], "failed": [], "timed_out": []}


def save_progress(progress):
    progress.setdefault("completed", [])
    progress.setdefault("failed", [])
    progress.setdefault("timed_out", [])
    with open(PROGRESS_FILE, "w", encoding="utf-8") as f:
        json.dump(progress, f, indent=2, ensure_ascii=False)


def already_done(progress, task_id):
    return task_id in progress["completed"]


def set_task_status(progress, task_id, status):
    """ให้ task หนึ่งอยู่ได้เพียงสถานะเดียวใน progress.json"""
    progress.setdefault("completed", [])
    progress.setdefault("failed", [])
    progress.setdefault("timed_out", [])

    # ลบสถานะเก่าของ task ก่อน
    for key in ("completed", "failed", "timed_out"):
        progress[key] = [x for x in progress[key] if x != task_id]

    # เพิ่มสถานะใหม่
    if status == "success":
        progress["completed"].append(task_id)
    elif status == "timeout":
        progress["timed_out"].append(task_id)
    elif status == "failed":
        progress["failed"].append(task_id)
    else:
        raise ValueError(f"Unknown task status: {status}")


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

    # ทุก attempt ต้องเริ่มจาก fresh Defects4J checkout
    # ป้องกัน source/build/generated artifacts จากรอบก่อนปนกับรอบใหม่
    if work_dir.exists():
        shutil.rmtree(work_dir)

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


# ---------- EvoSuite / DynaMOSA runner ----------
def run_evosuite(project, bug_id, target_classes, log_file,
                  timeout_sec=BENCHMARK_TIMEOUT):
    """Generate tests using Defects4J gen_tests.pl + EvoSuite DynaMOSA."""

    gen_tests = Path("/opt/defects4j/framework/bin/gen_tests.pl")

    # แยก output ของแต่ละ bug เพื่อไม่ให้ artifact เก่าปนกัน
    output_root = RESULT_DIR / "evosuite_raw" / project / str(bug_id)

    if output_root.exists():
        shutil.rmtree(output_root)
    output_root.mkdir(parents=True, exist_ok=True)

    # gen_tests.pl -c ต้องการไฟล์ class ละ 1 บรรทัด
    classes_file = output_root / "target_classes.txt"
    classes_file.write_text(
        "".join(f"{c}\n" for c in target_classes),
        encoding="utf-8"
    )

    cmd = [
        str(gen_tests),
        "-g", "evosuite",
        "-p", project,
        "-v", f"{bug_id}b",
        "-n", "1",
        "-o", str(output_root),
        "-b", str(timeout_sec),
        "-c", str(classes_file),
    ]

    with open(log_file, "a", encoding="utf-8") as log:
        log.write(
            f"\n=== Run EvoSuite/DynaMOSA on {project}-{bug_id}b ===\n"
        )
        log.write(f"Target classes: {target_classes}\n")
        log.write(f"Command: {' '.join(cmd)}\n")

        try:
            # gen_tests.pl มี budget ภายในอยู่แล้ว
            # เพิ่ม grace period สำหรับ checkout/compile/archive
            process_timeout = timeout_sec + 180

            result = subprocess.run(
                cmd,
                stdout=log,
                stderr=log,
                timeout=process_timeout
            )

            log.write(f"\n[EVOSUITE EXIT CODE] {result.returncode}\n")

            if result.returncode == 0:
                return "success", output_root

            return "failed", output_root

        except subprocess.TimeoutExpired:
            log.write(
                f"\n[TIMEOUT] EvoSuite/DynaMOSA เกิน "
                f"{process_timeout} วินาที\n"
            )
            return "timeout", output_root


def defects4j_export(work_dir, prop):
    """Export a property from Defects4J."""
    result = subprocess.run(
        ["defects4j", "export", "-p", prop, "-w", str(work_dir)],
        stdout=subprocess.PIPE,
        stderr=subprocess.STDOUT,
        text=True,
    )

    if result.returncode != 0:
        raise RuntimeError(
            f"defects4j export {prop} failed for {work_dir}\n"
            f"{result.stdout}"
        )

    lines = [
        line.strip()
        for line in result.stdout.splitlines()
        if line.strip()
        and not line.startswith("Running ant")
    ]

    if not lines:
        raise RuntimeError(f"No value returned for {prop}")

    return lines[-1]


# ---------- Kex runner ----------
def run_kex(work_dir, classes_dir, target_class, log_file, timeout_sec=BENCHMARK_TIMEOUT):
    """รัน Kex กับ target class เดียว

    คืนสถานะ "success", "failed" หรือ "timeout"
    อ้างอิง syntax จริงจาก https://github.com/vorpal-research/kex README:
      python ./kex.py --classpath <arg> --target <arg> --output <arg> --mode <arg>
    mode ที่ใช้ได้: crash, symbolic, concolic, libchecker, defectchecker
    """
    kex_script = KEX_HOME / "kex.py"

    # แยก output ตาม target class
    # ป้องกันผลของ class ก่อนหน้าถูกลบเมื่อ bug มีหลาย classes.modified
    safe_target = target_class.replace(".", "_").replace("$", "_")
    output_dir = work_dir / "kex-output" / safe_target

    # ล้างเฉพาะ output ของ target class นี้จากการรันครั้งก่อน
    if output_dir.exists():
        shutil.rmtree(output_dir)

    output_dir.mkdir(parents=True, exist_ok=True)

    # Kex needs both project classes and compile-time dependencies.
    project_classes = str(Path(work_dir) / classes_dir)

    try:
        compile_cp = defects4j_export(work_dir, "cp.compile")
    except Exception as exc:
        compile_cp = ""
        print(f"[WARN] Cannot export cp.compile: {exc}")

    if compile_cp:
        kex_classpath = project_classes + os.pathsep + compile_cp
    else:
        kex_classpath = project_classes

    cmd = [
        "python3", str(kex_script),
        "--classpath", kex_classpath,
        "--target", target_class,
        "--mode", "concolic",   # concolic ให้ผลใกล้เคียง Reanimator paper มากที่สุด
        "--output", str(output_dir),
    ]

    with open(log_file, "a", encoding="utf-8") as log:
        log.write(f"\n=== Run Kex on {target_class} ===\n")
        log.write(f"Kex classpath: {kex_classpath}\n")
        log.write(f"Command: {' '.join(cmd)}\n")
        try:
            result = subprocess.run(
                cmd, stdout=log, stderr=log, timeout=timeout_sec
            )
            log.write(f"\n[KEX EXIT CODE] {result.returncode}\n")
            if result.returncode == 0:
                return "success"
            return "failed"
        except subprocess.TimeoutExpired:
            log.write(f"\n[TIMEOUT] Kex เกิน {timeout_sec} วินาที ข้ามไป\n")
            return "timeout"


def find_generated_test_files(work_dir, tool):
    """ค้นหา generated Java tests ของ Kex หรือ EvoSuite/DynaMOSA."""

    work_dir = Path(work_dir)

    if tool == "kex":
        output_dir = work_dir / "kex-output"
        return list(output_dir.rglob("*.java")) if output_dir.exists() else []

    if tool == "evosuite":
        # gen_tests.pl คืน test suite เป็น .tar.bz2
        archives = list(work_dir.rglob("*.tar.bz2"))

        if not archives:
            return []

        extract_dir = work_dir / "extracted_tests"

        if extract_dir.exists():
            shutil.rmtree(extract_dir)

        extract_dir.mkdir(parents=True, exist_ok=True)

        for archive in archives:
            with tarfile.open(archive, "r:bz2") as tar:
                tar.extractall(extract_dir)

        # รวม ESTest.java และ ESTest_scaffolding.java
        return sorted(extract_dir.rglob("*ESTest*.java"))

    return []



def append_to_summary_csv(repo_folder, row):
    """เพิ่มหรืออัปเดตผล benchmark ใน summary.csv

    ใช้ (project, bug_id) เป็น key:
    - ถ้ายังไม่มี -> เพิ่มแถวใหม่
    - ถ้ามีแล้ว -> แทนที่แถวเดิม
    เพื่อป้องกันผล benchmark ของ bug เดิมซ้ำกัน
    """
    summary_path = REPO_DIR / repo_folder / "Result_Round2" / "summary.csv"
    summary_path.parent.mkdir(parents=True, exist_ok=True)

    fieldnames = [
        "project",
        "bug_id",
        "status",
        "num_test_files_generated",
        "elapsed_sec",
        "timestamp",
    ]

    rows = []

    if summary_path.exists():
        with open(summary_path, "r", newline="", encoding="utf-8") as f:
            reader = csv.DictReader(f)
            rows = list(reader)

    # ลบ record เก่าของ project + bug เดียวกัน
    rows = [
        r for r in rows
        if not (
            r.get("project") == str(row["project"])
            and r.get("bug_id") == str(row["bug_id"])
        )
    ]

    # เพิ่มผลล่าสุด
    rows.append({
        key: row.get(key, "")
        for key in fieldnames
    })

    # เรียง project และ bug id เพื่อให้อ่านง่าย
    def sort_key(r):
        try:
            bug = int(r.get("bug_id", 0))
        except ValueError:
            bug = 0
        return (r.get("project", ""), bug)

    rows.sort(key=sort_key)

    # เขียนไฟล์ใหม่ทั้งหมด
    with open(summary_path, "w", newline="", encoding="utf-8") as f:
        writer = csv.DictWriter(
            f,
            fieldnames=fieldnames,
            lineterminator="\n"
        )
        writer.writeheader()
        writer.writerows(rows)



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

    # ลบ generated tests ของ bug นี้จากรอบก่อน
    # เพื่อป้องกัน artifact เก่าปนกับ benchmark รอบใหม่
    prefix = f"{project}_{bug_id}_"
    for old_file in test_target_dir.glob(f"{prefix}*.java"):
        old_file.unlink()

    test_files = find_generated_test_files(work_dir, tool)
    copied_count = 0

    # Detect duplicate basenames. Kex may generate helper classes with the
    # same filename in different Java packages (e.g. ReflectionUtils.java).
    basename_counts = {}
    for tf in test_files:
        basename_counts[tf.name] = (
            basename_counts.get(tf.name, 0) + 1
        )

    for tf in test_files:
        if tool == "kex" and basename_counts[tf.name] > 1:
            # Preserve the Java package path for duplicate helper files.
            package_parts = []

            try:
                text = tf.read_text(
                    encoding="utf-8",
                    errors="replace",
                )
                for line in text.splitlines():
                    line = line.strip()
                    if line.startswith("package ") and line.endswith(";"):
                        package_name = line[8:-1].strip()
                        package_parts = package_name.split(".")
                        break
            except OSError:
                package_parts = []

            if package_parts:
                dest = (
                    test_target_dir
                    / "_support"
                    / str(bug_id)
                    / Path(*package_parts)
                    / tf.name
                )
            else:
                dest = (
                    test_target_dir
                    / "_support"
                    / str(bug_id)
                    / tf.parent.name
                    / tf.name
                )

            dest.parent.mkdir(
                parents=True,
                exist_ok=True,
            )
        else:
            dest = (
                test_target_dir
                / f"{project}_{bug_id}_{tf.name}"
            )

        shutil.copy2(tf, dest)
        copied_count += 1

    if copied_count == 0:
        print(f"      [WARN] ไม่พบไฟล์ test ที่สร้างจาก {tool} ใน {work_dir} "
              f"— ตรวจสอบ path ใน find_generated_test_files() อีกครั้ง")

    # 3) อัปเดต summary.csv
    # ใช้สถานะรวมที่ run_one_bug() คำนวณไว้
    status = bug_result.get("status", "unknown")

    append_to_summary_csv(repo_folder, {
        "project": project,
        "bug_id": bug_id,
        "status": status,
        "num_test_files_generated": copied_count,
        "elapsed_sec": bug_result.get("elapsed_sec"),
        "timestamp": datetime.now().isoformat(timespec="seconds"),
    })

    print(f"      [REPO] copy ผลลัพธ์ + {copied_count} test files เข้า {repo_folder}/ เรียบร้อย")


def run_evaluation(project, bug_id, tool, timeout_sec=15):
    """
    Evaluate generated tests against buggy and fixed versions.

    Evaluation failure does NOT change generation status.
    """
    evaluator = REPO_DIR / "scripts" / "evaluate_tests.py"

    if not evaluator.is_file():
        print(f"  [EVAL] evaluator not found: {evaluator}")
        return "not_found"

    print(f"  [EVAL] {project}-{bug_id}-{tool}")

    cmd = [
        sys.executable,
        str(evaluator),
        "--project", str(project),
        "--bug", str(bug_id),
        "--tool", str(tool),
        "--timeout", str(timeout_sec),
    ]

    try:
        result = subprocess.run(
            cmd,
            cwd=str(REPO_DIR),
            text=True,
        )
    except Exception as exc:
        print(f"  [EVAL] ERROR: {exc}")
        return "error"

    if result.returncode == 0:
        print(f"  [EVAL] SUCCESS")
        return "success"

    print(
        f"  [EVAL] FAILED "
        f"(exit={result.returncode})"
    )
    return "failed"


# ---------- Main task runner (ใช้ร่วมกันทุกโหมด) ----------
def run_one_bug(project, bug_id, progress, tool="kex", resume=False):
    """tool: 'kex' (Reanimator/Member 2) หรือ 'evosuite' (DynaMOSA/Member 1)"""
    task_id = f"{project}-{bug_id}-{tool}"
    log_file = LOG_DIR / f"{project}_{bug_id}_{tool}.log"

    if resume and already_done(progress, task_id):
        print(f"  [SKIP] {task_id} (ทำไปแล้ว)")
        return

    print(f"  [RUN]  {task_id} ...")
    start_time = time.time()

    ok, work_dir = checkout_and_compile(project, bug_id, log_file)
    if not ok:
        print(f"  [FAIL] {task_id} -> checkout/compile ไม่ผ่าน (ดู log ที่ {log_file})")
        set_task_status(progress, task_id, "failed")
        save_progress(progress)
        return

    bug_result = {
        "project": project,
        "bug_id": bug_id,
        "tool": tool,
        "elapsed_sec": None,
    }

    # classes.modified ใช้เป็น target เดียวกันทั้ง Kex และ DynaMOSA
    target_classes = get_target_classes(work_dir, log_file)
    bug_result["target_classes"] = target_classes

    # ตำแหน่งที่ copy_to_repo() จะค้นหา generated tests
    artifact_dir = work_dir

    if tool == "evosuite":
        status, evosuite_output = run_evosuite(
            project,
            bug_id,
            target_classes,
            log_file
        )
        bug_result["evosuite_result"] = status
        artifact_dir = evosuite_output

    elif tool == "kex":
        classes_dir = get_classes_dir(work_dir)
        bug_result["kex_results"] = {}

        # ล้าง Kex artifacts ของ bug นี้หนึ่งครั้งก่อนเริ่ม benchmark
        # จากนั้น run_kex() จะแยก output ของแต่ละ target class
        kex_output_root = work_dir / "kex-output"
        if kex_output_root.exists():
            shutil.rmtree(kex_output_root)
        kex_output_root.mkdir(parents=True, exist_ok=True)

        for tc in target_classes:
            status = run_kex(
                work_dir,
                classes_dir,
                tc,
                log_file
            )
            bug_result["kex_results"][tc] = status

    else:
        print(f"  [ERROR] ไม่รู้จัก tool: {tool}")
        return

    bug_result["elapsed_sec"] = round(time.time() - start_time, 2)

    result_dir = RESULT_DIR / tool / project / str(bug_id)
    result_dir.mkdir(parents=True, exist_ok=True)

    # Count generated test files before deciding final task status.
    generated_test_files = find_generated_test_files(
        artifact_dir,
        tool,
    )
    num_test_files_generated = len(generated_test_files)

    bug_result["num_test_files_generated"] = (
        num_test_files_generated
    )

    # ตัดสินสถานะรวมของ task
    if tool == "kex":
        statuses = list(bug_result["kex_results"].values())

        if statuses and all(s == "success" for s in statuses):
            task_status = "success"
        elif "timeout" in statuses:
            task_status = "timeout"
        else:
            task_status = "failed"

    elif tool == "evosuite":
        task_status = bug_result["evosuite_result"]

    # A successful generator run must produce at least one test file.
    if (
        task_status == "success"
        and num_test_files_generated == 0
    ):
        print(
            f"  [FAIL] {task_id} -> generator reported success "
            f"but generated 0 test files"
        )
        task_status = "failed"

    bug_result["status"] = task_status

    # เขียน JSON หลังทราบสถานะรวม
    with open(result_dir / f"{tool}_result.json", "w", encoding="utf-8") as f:
        json.dump(bug_result, f, indent=2, ensure_ascii=False)

    # Copy artifacts ไม่ว่าสถานะใด เพื่อเก็บหลักฐานการทดลอง
    copy_to_repo(tool, project, bug_id, artifact_dir, bug_result)

    # Evaluate generated tests only when generation succeeded.
    # Evaluation status is intentionally separate from generation status.
    if task_status == "success":
        evaluation_status = run_evaluation(
            project,
            bug_id,
            tool,
        )
    else:
        evaluation_status = "not_run"

    bug_result["evaluation_status"] = evaluation_status

    # Update benchmark result JSON with evaluation status.
    with open(
        result_dir / f"{tool}_result.json",
        "w",
        encoding="utf-8",
    ) as f:
        json.dump(
            bug_result,
            f,
            indent=2,
            ensure_ascii=False,
        )

    if task_status == "success":
        print(f"  [DONE] {task_id} ({bug_result['elapsed_sec']}s)")
        set_task_status(progress, task_id, "success")

    elif task_status == "timeout":
        print(f"  [TIMEOUT] {task_id} ({bug_result['elapsed_sec']}s)")
        set_task_status(progress, task_id, "timeout")

    else:
        print(f"  [FAIL] {task_id} ({bug_result['elapsed_sec']}s)")
        set_task_status(progress, task_id, "failed")

    save_progress(progress)


# ---------- CLI ----------
def main():
    parser = argparse.ArgumentParser(
        description="Kex + EvoSuite/DynaMOSA Benchmark Runner on Defects4J"
    )
    parser.add_argument("--project", type=str, help="ระบุ project เดียว เช่น Lang")
    parser.add_argument("--bug", type=str, help="ระบุ bug id เดียว เช่น 1")
    parser.add_argument("--sample-17", action="store_true", help="รันตัวแทนโปรเจกต์ละ 1 บั๊ก")
    parser.add_argument("--all-bugs", action="store_true", help="รันทุก bug ในทุก project")
    parser.add_argument("--resume", action="store_true", help="ข้ามงานที่ทำไปแล้ว (อ่านจาก progress.json)")
    parser.add_argument("--tool", type=str, default="kex", choices=["kex", "evosuite"],
                         help="เลือกเครื่องมือ: kex (Reanimator, default) หรือ evosuite (DynaMOSA)")
    args = parser.parse_args()

    # โหลด progress เดิมเสมอ เพื่อไม่ให้ผลของ tool/project ก่อนหน้าถูกเขียนทับ
    progress = load_progress()

    if args.project and args.bug:
        run_one_bug(args.project, args.bug, progress, tool=args.tool, resume=args.resume)

    elif args.sample_17:
        for project in ALL_PROJECTS:
            bug_ids = get_bug_ids(project)
            if bug_ids:
                print(f"\n[Project: {project}] เลือก bug ตัวแทน: {bug_ids[0]}")
                run_one_bug(project, bug_ids[0], progress, tool=args.tool, resume=args.resume)

    elif args.all_bugs:
        for project in ALL_PROJECTS:
            bug_ids = get_bug_ids(project)
            print(f"\n[Project: {project}] พบ {len(bug_ids)} bugs")
            for bug_id in bug_ids:
                run_one_bug(project, bug_id, progress, tool=args.tool, resume=args.resume)

    else:
        parser.print_help()
        sys.exit(1)

    # สรุปเฉพาะ tool ที่กำลังรัน
    tool_suffix = f"-{args.tool}"

    completed_count = sum(
        1 for task in progress.get("completed", [])
        if task.endswith(tool_suffix)
    )
    failed_count = sum(
        1 for task in progress.get("failed", [])
        if task.endswith(tool_suffix)
    )
    timed_out_count = sum(
        1 for task in progress.get("timed_out", [])
        if task.endswith(tool_suffix)
    )

    print("\n=========================================")
    print(f"Tool: {args.tool}")
    print(
        f"เสร็จสิ้น: "
        f"{completed_count} สำเร็จ, "
        f"{failed_count} ล้มเหลว, "
        f"{timed_out_count} timeout"
    )
    print(f"ดูรายละเอียดที่ {RESULT_DIR}")
    print("=========================================")


if __name__ == "__main__":
    main()
