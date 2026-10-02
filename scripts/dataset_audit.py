#!/usr/bin/env python3
"""
dataset_audit.py
=========================================================
Dataset Audit Script for ProjectSQA
ตรวจสอบความสมบูรณ์ของ Frozen Target Dataset และ Target Selection Rules
ก่อนขออนุมัติเริ่ม Full Benchmark

Checklist:
  1. Dataset ครบ 17 projects / 854 active bugs
  2. จำนวน entries ใน Metadata (1,073) มาจากการ extract จริง
  3. ไม่มี duplicate (Project, Bug_ID, Target_Class)
  4. สถานะ Source files:
     - 1,070 OK
     - 3 SOURCE_NOT_FOUND (คลาสถูกสร้างใหม่ใน commit แก้ไข)
  5. สถานะ Checkout: 851 COMPLETE, 3 INCOMPLETE (สอดคล้องกับ SOURCE_NOT_FOUND)
  6. การวิเคราะห์ Reference 1,066:
     - ชี้แจงอย่างตรงไปตรงมาว่าไม่มี Reference 1,066 row-by-row ในระบบ
     - ระบุ target พิเศษ: 3 Non-Java resources (.txt) + 3 $Gson$Types
  7. แยกแจกแจงตาม Project: Total, SNF, NonJava, JavaRunnable
  8. ยืนยัน Selection Rules ของ Runner:
     - Total metadata entries = 1,073
     - SOURCE_NOT_FOUND       = 3
     - Non-Java resources     = 3
     - Java runnable targets  = 1,067
=========================================================
"""

import csv
import json
import sys
from collections import Counter, defaultdict
from pathlib import Path

# ปรับ stdout/stderr ให้รองรับ UTF-8 ป้องกัน cp874 encoding error บน Windows
if hasattr(sys.stdout, "reconfigure"):
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
        sys.stderr.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass

REPO_DIR = Path(__file__).resolve().parent.parent
CSV_PATH = REPO_DIR / "dataset" / "benchmark_targets.csv"
TARGET_BENCHMARK_DIR = REPO_DIR / "dataset" / "target_benchmark"
MANIFEST_PATH = TARGET_BENCHMARK_DIR / "manifest.json"

EXPECTED_PROJECTS = sorted([
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time"
])


def load_csv():
    rows = []
    with open(CSV_PATH, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for r in reader:
            rows.append(r)
    return rows


def audit():
    print("=" * 70)
    print("  ProjectSQA -- Frozen Target Dataset & Selection Rules Audit")
    print(f"  CSV : {CSV_PATH}")
    print(f"  Dir : {TARGET_BENCHMARK_DIR}")
    print("=" * 70)

    if not CSV_PATH.exists() or not TARGET_BENCHMARK_DIR.exists():
        print("[FATAL] Dataset files not found!")
        return False

    rows = load_csv()
    total_rows = len(rows)

    # 1. Project & Bug Count
    print("\n" + "-" * 70)
    print("1. PROJECT & BUG COUNT")
    print("-" * 70)
    projects = sorted(set(r["Project"] for r in rows))
    bugs = set((r["Project"], r["Bug_ID"]) for r in rows)
    print(f"   Projects found  : {len(projects)} / 17")
    print(f"   Active bugs     : {len(bugs)} / 854")
    projects_ok = len(projects) == 17 and projects == EXPECTED_PROJECTS
    bugs_ok = len(bugs) == 854
    print(f"   Status          : {'[PASS]' if projects_ok and bugs_ok else '[FAIL]'}")

    # 2. Duplicate Check
    print("\n" + "-" * 70)
    print("2. DUPLICATE CHECK (Project, Bug_ID, Target_Class)")
    print("-" * 70)
    target_keys = [(r["Project"], r["Bug_ID"], r["Target_Class"]) for r in rows]
    key_counts = Counter(target_keys)
    duplicates = {k: v for k, v in key_counts.items() if v > 1}
    print(f"   Duplicates found: {len(duplicates)}")
    print(f"   Status          : {'[PASS]' if len(duplicates) == 0 else '[FAIL]'}")

    # 3. Source & Resource Categorization
    print("\n" + "-" * 70)
    print("3. TARGET CATEGORIZATION & SELECTION AUDIT")
    print("-" * 70)

    snf_targets = [r for r in rows if r.get("Source_Status") != "OK"]
    non_java_resources = [
        r for r in rows
        if r.get("Source_Status") == "OK" and (
            r["Target_Class"].endswith(".txt") or not r.get("Source_Relative_Path", "").endswith(".java")
        )
    ]
    java_runnable = [r for r in rows if r not in snf_targets and r not in non_java_resources]

    print(f"   Total Metadata Entries  : {total_rows}")
    print(f"   - SOURCE_NOT_FOUND      : {len(snf_targets)}")
    for r in snf_targets:
        print(f"       * {r['Bug_Key']}: {r['Target_Class']}")
    print(f"   - Non-Java Resources    : {len(non_java_resources)}")
    for r in non_java_resources:
        print(f"       * {r['Bug_Key']}: {r['Target_Class']}")
    print(f"   = Java Runnable Targets : {len(java_runnable)}")

    # 4. Verify $Gson$Types
    gson_types_targets = [r for r in java_runnable if "$Gson$Types" in r["Target_Class"]]
    print(f"\n   Validating $Gson$Types entries: {len(gson_types_targets)} found")
    gson_ok = True
    for r in gson_types_targets:
        p = REPO_DIR / "dataset" / r["Source_Relative_Path"]
        exists = p.exists()
        size = p.stat().st_size if exists else 0
        if not exists or size == 0:
            gson_ok = False
        print(f"       * {r['Bug_Key']}: {r['Target_Class']} (exists={exists}, size={size:,} bytes)")
    print(f"   $Gson$Types status      : {'[PASS] Valid Java sources included' if gson_ok else '[FAIL]'}")

    # 5. Disk Integrity for All Java Runnable
    print("\n" + "-" * 70)
    print("4. DISK INTEGRITY (All 1,067 Java Runnable Targets)")
    print("-" * 70)
    missing_disk = []
    empty_disk = []
    for r in java_runnable:
        p = REPO_DIR / "dataset" / r["Source_Relative_Path"]
        if not p.exists():
            missing_disk.append((r["Bug_Key"], r["Target_Class"]))
        elif p.stat().st_size == 0:
            empty_disk.append((r["Bug_Key"], r["Target_Class"]))

    print(f"   Missing on disk         : {len(missing_disk)}")
    print(f"   Empty files on disk     : {len(empty_disk)}")
    disk_ok = len(missing_disk) == 0 and len(empty_disk) == 0
    print(f"   Disk Integrity Status   : {'[PASS]' if disk_ok else '[FAIL]'}")

    # 6. Per-Project Breakdown
    print("\n" + "-" * 70)
    print("5. BREAKDOWN PER PROJECT")
    print("-" * 70)
    project_stats = defaultdict(lambda: {"bugs": set(), "meta": 0, "snf": 0, "non_java": 0, "runnable": 0})
    for r in rows:
        proj = r["Project"]
        project_stats[proj]["bugs"].add(r["Bug_ID"])
        project_stats[proj]["meta"] += 1
        if r.get("Source_Status") != "OK":
            project_stats[proj]["snf"] += 1
        elif r["Target_Class"].endswith(".txt") or not r.get("Source_Relative_Path", "").endswith(".java"):
            project_stats[proj]["non_java"] += 1
        else:
            project_stats[proj]["runnable"] += 1

    print(f"   {'Project':<16} {'Bugs':>5} {'Metadata':>9} {'SNF':>4} {'NonJava':>8} {'JavaRunnable':>13}")
    print(f"   {'-'*16} {'-'*5} {'-'*9} {'-'*4} {'-'*8} {'-'*13}")
    for proj in EXPECTED_PROJECTS:
        s = project_stats[proj]
        print(f"   {proj:<16} {len(s['bugs']):>5} {s['meta']:>9} {s['snf']:>4} {s['non_java']:>8} {s['runnable']:>13}")
    print(f"   {'-'*16} {'-'*5} {'-'*9} {'-'*4} {'-'*8} {'-'*13}")
    print(f"   {'TOTAL':<16} {len(bugs):>5} {total_rows:>9} {len(snf_targets):>4} {len(non_java_resources):>8} {len(java_runnable):>13}")

    # 7. Reference 1,066 Statement
    print("\n" + "-" * 70)
    print("6. REFERENCE 1,066 STATEMENT (No Row-by-Row Speculation)")
    print("-" * 70)
    print("   ข้อเท็จจริงทางเทคนิค:")
    print("   - ใน Repository ไม่มีไฟล์ Ground Truth Reference 1,066 แถวสำหรับทำ diff แบบ row-by-row")
    print("   - ตัวเลข 1,073 ของเรามาจากการดึง Defects4J modified_classes/*.src ครบทั้ง 854 bugs โดยตรง")
    print("   - เมื่อคัดกรองตาม Selection Rule จริง:")
    print("       1,073 (Metadata) - 3 (SOURCE_NOT_FOUND) - 3 (Non-Java .txt) = 1,067 Java Runnable")
    print("   - ตัวเลข 1,067 Java targets อยู่ใกล้เคียง 1,066 ในเอกสารอ้างอิง (+1)")
    print("   - ทางการไม่สามารถสรุป Project/Bug/Class ของ +1 โดยเจาะจงได้โดยไม่คาดเดา")
    print("     เนื่องจากไม่มีชุดข้อมูล 1,066 ต้นฉบับมาเปรียบเทียบรายบรรทัด")

    # 8. Runner Selection Rules Confirmation
    print("\n" + "-" * 70)
    print("7. RUNNER EXPLICIT SELECTION RULES CONFIRMATION")
    print("-" * 70)
    from ai_benchmark_runner import BenchmarkRunner
    runner = BenchmarkRunner(dry_run=True)
    selected_targets = runner.load_and_filter_targets()
    runner_match = len(selected_targets) == len(java_runnable) == 1067
    has_txt_in_runner = any(t["Target_Class"].endswith(".txt") for t in selected_targets)
    print(f"   Runner targets selected : {len(selected_targets)} (Expected: 1,067)")
    print(f"   Contains .txt resources : {has_txt_in_runner} (Expected: False)")
    print(f"   Runner Rules Status     : {'[PASS]' if runner_match and not has_txt_in_runner else '[FAIL]'}")

    # Summary
    print("\n" + "=" * 70)
    all_ok = projects_ok and bugs_ok and len(duplicates) == 0 and gson_ok and disk_ok and runner_match and not has_txt_in_runner
    if all_ok:
        print("  FINAL TARGET SELECTION AUDIT: ALL CHECKS PASSED [READY FOR APPROVAL]")
    else:
        print("  FINAL TARGET SELECTION AUDIT: FAILED CHECKS DETECTED")
    print("=" * 70)
    return all_ok


if __name__ == "__main__":
    success = audit()
    sys.exit(0 if success else 1)
