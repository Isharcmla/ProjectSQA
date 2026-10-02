#!/usr/bin/env python3
"""
build_target_benchmark.py
=============================================================================
Defects4J Frozen Benchmark Target Dataset Builder & Verifier for ProjectSQA
=============================================================================

หน้าที่:
  1. ดึง Active Bug IDs และ Target Modified Classes จาก Defects4J Environment
  2. Checkout source code จาก Buggy version ของแต่ละ Bug มาเก็บเป็น Frozen Snapshot
  3. จัดโครงสร้าง Directory:
       dataset/target_benchmark/<Project>_<Bug_ID>b/
         ├── metadata.json
         ├── defects4j_info.txt
         └── source/<fully/qualified/package/path>/<Class>.java
  4. สร้าง dataset/benchmark_targets.csv (1 แถวต่อ 1 Target Class)
  5. สร้าง dataset/target_benchmark/manifest.json
  6. รองรับการ Resume (--resume), การทดสอบ Pilot (--project, --bug, --sample-17),
     และการตรวจสอบความสมบูรณ์ (--verify)

ข้อกำหนดสำคัญ:
  - ใช้ Defects4J ของ ProjectSQA (/opt/defects4j) เท่านั้น
  - เก็บ temporary checkout ในโฟลเดอร์แยกต่างหาก (default: /tmp/project_sqa_target_extract/)
    และลบออกทันทีหลัง copy source เสร็จ (ห้ามแตะ /root/kex-testing/checkouts/)
  - คำนวณจำนวน Target จริง ห้าม hardcode 1,066
=============================================================================
"""

import argparse
import csv
import hashlib
import json
import os
import shutil
import subprocess
import sys
from datetime import datetime, timezone
from pathlib import Path
from typing import Dict, List, Optional, Tuple, Any

# Projects ในขอบเขตของ Benchmark (17 projects)
SUPPORTED_PROJECTS = [
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time"
]

REPO_ROOT = Path(__file__).resolve().parent.parent
DEFAULT_DEFECTS4J_HOME = Path(os.environ.get("DEFECTS4J_HOME", "/opt/defects4j"))
DEFAULT_DATASET_DIR = REPO_ROOT / "dataset"
DEFAULT_TARGET_BENCHMARK_DIR = DEFAULT_DATASET_DIR / "target_benchmark"
DEFAULT_CSV_PATH = DEFAULT_DATASET_DIR / "benchmark_targets.csv"
DEFAULT_TEMP_DIR = Path("/tmp/project_sqa_target_extract")


# =====================================================================
# Utility & Hashing Functions
# =====================================================================

def calculate_sha256(filepath: Path) -> str:
    """คำนวณ SHA256 checksum ของไฟล์"""
    h = hashlib.sha256()
    with open(filepath, "rb") as f:
        while chunk := f.read(65536):
            h.update(chunk)
    return h.hexdigest()


def get_defects4j_commit(defects4j_home: Path) -> str:
    """ดึง Git commit hash ของ Defects4J repository"""
    try:
        res = subprocess.run(
            ["git", "-C", str(defects4j_home), "rev-parse", "HEAD"],
            capture_output=True, text=True, check=True
        )
        return res.stdout.strip()
    except Exception:
        return "UNKNOWN_COMMIT"


def class_name_to_relpath(class_name: str) -> str:
    """
    แปลง Fully Qualified Class Name เช่น:
      org.apache.commons.lang3.math.NumberUtils -> org/apache/commons/lang3/math/NumberUtils.java
      com.google.gson.internal.$Gson$Types      -> com/google/gson/internal/$Gson$Types.java
      src.main.resources.org...lang.txt         -> src/main/resources/org/.../lang.txt
    หากเป็น inner class (มี $) ให้ชี้ไปที่ outer class .java เว้นแต่ชื่อคลาสขึ้นต้นด้วย $
    """
    if class_name.endswith(".txt"):
        parts = class_name.split(".")
        filename = parts[-2] + ".txt"
        dirs = parts[:-2]
        return "/".join(dirs + [filename])

    pkg_parts = class_name.split(".")
    simple_name = pkg_parts[-1]
    pkg = pkg_parts[:-1]
    if "$" in simple_name and not simple_name.startswith("$"):
        simple_name = simple_name.split("$")[0]
    return "/".join(pkg + [simple_name]) + ".java"


# =====================================================================
# Defects4J Interaction Helpers
# =====================================================================

def run_d4j_cmd(args: List[str], cwd: Optional[Path] = None, timeout: int = 120) -> Tuple[int, str, str]:
    """รันคำสั่ง defects4j CLI พร้อม timeout"""
    try:
        res = subprocess.run(
            args,
            cwd=str(cwd) if cwd else None,
            capture_output=True,
            text=True,
            timeout=timeout
        )
        return res.returncode, res.stdout.strip(), res.stderr.strip()
    except subprocess.TimeoutExpired:
        return -1, "", f"Timeout after {timeout} seconds"
    except Exception as e:
        return -1, "", str(e)


def get_active_bugs(project: str) -> List[str]:
    """ดึงรายชื่อ active bug ids ทั้งหมดของ project ผ่าน defects4j bids -p <project>"""
    code, stdout, stderr = run_d4j_cmd(["defects4j", "bids", "-p", project])
    if code != 0:
        print(f"  [ERROR] defects4j bids -p {project} ล้มเหลว: {stderr}")
        return []
    bugs = [b.strip() for b in stdout.split("\n") if b.strip()]
    return bugs


def get_modified_classes_from_metadata(defects4j_home: Path, project: str, bug_id: str) -> List[str]:
    """อ่านรายชื่อ Target Modified Classes จาก framework metadata โดยตรง"""
    src_file = defects4j_home / "framework" / "projects" / project / "modified_classes" / f"{bug_id}.src"
    if src_file.exists():
        with open(src_file, "r", encoding="utf-8") as f:
            classes = [line.strip() for line in f if line.strip()]
        return classes
    return []


# =====================================================================
# Extraction Logic per Bug
# =====================================================================

def extract_bug_target(
    project: str,
    bug_id: str,
    defects4j_home: Path,
    output_dir: Path,
    temp_base_dir: Path,
    resume: bool = False
) -> Dict[str, Any]:
    """
    สกัดข้อมูลและ source code ของ 1 bug:
      - Checkout buggy version ไปยัง temp directory
      - Export dir.src.classes, tests.trigger, tests.relevant
      - Copy Target Classes ไปยัง target_benchmark/<Bug_Key>/source/...
      - คำนวณ SHA256 และเขียน metadata.json + defects4j_info.txt
      - ลบ temp directory ทันที
    """
    bug_key = f"{project}_{bug_id}b"
    version_str = f"{bug_id}b"
    bug_dir = output_dir / bug_key
    metadata_file = bug_dir / "metadata.json"
    info_file = bug_dir / "defects4j_info.txt"
    source_root = bug_dir / "source"

    # 1. ตรวจสอบ Resume ก่อน
    if resume and metadata_file.exists() and info_file.exists():
        try:
            with open(metadata_file, "r", encoding="utf-8") as f:
                meta = json.load(f)
            if meta.get("extraction_status") == "COMPLETE":
                # ตรวจว่าไฟล์ source ทุกตัวมีอยู่จริง
                all_files_ok = True
                for sf in meta.get("source_files", []):
                    rel = sf.get("relative_path")
                    if not rel or not (bug_dir / rel).exists():
                        all_files_ok = False
                        break
                if all_files_ok:
                    print(f"  [SKIP] {bug_key} ทำเสร็จสมบูรณ์แล้ว (--resume)")
                    return meta
        except Exception:
            pass  # ถ้า metadata เสียหาย ให้ทำใหม่

    print(f"\n[Processing: {bug_key}]")

    # 2. อ่าน Target Modified Classes
    target_classes = get_modified_classes_from_metadata(defects4j_home, project, bug_id)
    if not target_classes:
        print(f"  [WARN] ไม่พบ modified_classes สำหรับ {bug_key} ใน framework metadata")

    # 3. เตรียม temp checkout directory
    temp_dir = temp_base_dir / bug_key
    if temp_dir.exists():
        shutil.rmtree(temp_dir, ignore_errors=True)
    temp_dir.mkdir(parents=True, exist_ok=True)

    # 4. Checkout buggy version
    print(f"  -> Checkout Defects4J: {project} {version_str}")
    c_code, c_out, c_err = run_d4j_cmd(
        ["defects4j", "checkout", "-p", project, "-v", version_str, "-w", str(temp_dir)],
        timeout=180
    )
    if c_code != 0:
        print(f"  [ERROR] Checkout ล้มเหลว: {c_err}")
        shutil.rmtree(temp_dir, ignore_errors=True)
        return {
            "schema_version": 1,
            "project": project,
            "bug_id": int(bug_id) if bug_id.isdigit() else bug_id,
            "version": version_str,
            "bug_key": bug_key,
            "num_target_classes": len(target_classes),
            "target_classes": target_classes,
            "source_root": "source",
            "source_files": [
                {
                    "target_class": tc,
                    "relative_path": None,
                    "status": "CHECKOUT_FAILED",
                    "sha256": None
                } for tc in target_classes
            ],
            "extraction_status": "FAILED",
            "error_detail": f"Checkout failed: {c_err}",
            "extracted_at_utc": datetime.now(timezone.utc).isoformat()
        }

    # 5. Export dir.src.classes
    e_code, src_dir_rel, _ = run_d4j_cmd(
        ["defects4j", "export", "-p", "dir.src.classes", "-w", str(temp_dir)],
        timeout=60
    )
    src_dir_rel = src_dir_rel if (e_code == 0 and src_dir_rel) else "src"

    # Export fallback target classes ถ้าใน metadata ไม่มี
    if not target_classes:
        m_code, mod_out, _ = run_d4j_cmd(
            ["defects4j", "export", "-p", "classes.modified", "-w", str(temp_dir)],
            timeout=60
        )
        if m_code == 0 and mod_out:
            target_classes = [c.strip() for c in mod_out.split("\n") if c.strip()]

    # Export test info สำหรับ defects4j_info.txt
    _, trigger_tests, _ = run_d4j_cmd(
        ["defects4j", "export", "-p", "tests.trigger", "-w", str(temp_dir)],
        timeout=60
    )
    _, relevant_tests, _ = run_d4j_cmd(
        ["defects4j", "export", "-p", "tests.relevant", "-w", str(temp_dir)],
        timeout=60
    )

    # 6. คัดลอก Source Code ของ Target Classes
    bug_dir.mkdir(parents=True, exist_ok=True)
    source_root.mkdir(parents=True, exist_ok=True)

    source_files_records = []
    overall_status = "COMPLETE"

    for tc in target_classes:
        class_relpath = class_name_to_relpath(tc)
        src_path_in_checkout = temp_dir / src_dir_rel / class_relpath

        # บางโปรเจกต์อาจมี source หลายที่ หากไม่เจอตรงๆ ให้ค้นหาใน temp_dir
        if not src_path_in_checkout.exists():
            matched = list(temp_dir.glob(f"**/{class_relpath}"))
            if not matched:
                matched = list(temp_dir.glob(f"**/{Path(class_relpath).name}"))
            if matched:
                src_path_in_checkout = matched[0]

        target_dest = source_root / class_relpath

        if src_path_in_checkout.exists():
            target_dest.parent.mkdir(parents=True, exist_ok=True)
            shutil.copy2(src_path_in_checkout, target_dest)
            file_sha = calculate_sha256(target_dest)
            rel_to_bug_dir = f"source/{class_relpath}"

            source_files_records.append({
                "target_class": tc,
                "relative_path": rel_to_bug_dir,
                "status": "OK",
                "sha256": file_sha
            })
            print(f"  [COPIED] {tc} -> {rel_to_bug_dir}")
        else:
            print(f"  [MISSING] ไม่พบ source file สำหรับ {tc} (searched: {class_relpath})")
            source_files_records.append({
                "target_class": tc,
                "relative_path": None,
                "status": "SOURCE_NOT_FOUND",
                "sha256": None
            })
            overall_status = "INCOMPLETE"

    # 7. เขียน defects4j_info.txt
    trigger_lines = trigger_tests.strip().split("\n") if trigger_tests.strip() else []
    relevant_lines = relevant_tests.strip().split("\n") if relevant_tests.strip() else []

    with open(info_file, "w", encoding="utf-8") as f:
        f.write(f"Project: {project}\n")
        f.write(f"Bug ID: {bug_id}\n")
        f.write(f"Version: {version_str}\n")
        f.write(f"Bug Key: {bug_key}\n\n")
        f.write("Target Classes:\n")
        for tc in target_classes:
            f.write(f"- {tc}\n")
        f.write(f"\nNumber of Target Classes: {len(target_classes)}\n")
        f.write(f"Source Directory: {src_dir_rel}\n\n")
        f.write("Triggering Tests:\n")
        if trigger_lines:
            for tt in trigger_lines:
                f.write(f"- {tt}\n")
        else:
            f.write("N/A\n")
        f.write("\nRelevant Tests:\n")
        if relevant_lines:
            for rt in relevant_lines:
                f.write(f"- {rt}\n")
        else:
            f.write("N/A\n")

    # 8. เขียน metadata.json
    meta_data = {
        "schema_version": 1,
        "project": project,
        "bug_id": int(bug_id) if bug_id.isdigit() else bug_id,
        "version": version_str,
        "bug_key": bug_key,
        "num_target_classes": len(target_classes),
        "target_classes": target_classes,
        "source_root": "source",
        "source_files": source_files_records,
        "extraction_status": overall_status,
        "extracted_at_utc": datetime.now(timezone.utc).isoformat()
    }

    with open(metadata_file, "w", encoding="utf-8") as f:
        json.dump(meta_data, f, indent=2, ensure_ascii=False)

    # 9. ลบ temp checkout directory ทันที
    shutil.rmtree(temp_dir, ignore_errors=True)
    print(f"  [DONE] {bug_key} extraction status: {overall_status} (Cleaned temp checkout)")
    return meta_data


# =====================================================================
# Catalog & Manifest Generation
# =====================================================================

def rebuild_catalog_and_manifest(
    target_benchmark_dir: Path,
    csv_path: Path,
    defects4j_home: Path
) -> Tuple[int, int, int]:
    """
    สแกนโฟลเดอร์ใน target_benchmark_dir แล้วสร้าง:
      1. benchmark_targets.csv (1 row per target class)
      2. manifest.json
    คืนค่า (total_projects, total_bugs, total_targets)
    """
    csv_rows = []
    projects_seen = set()
    total_bugs = 0
    total_targets = 0
    complete_bugs = 0
    source_files_ok = 0
    source_files_missing = 0

    # เรียงลำดับโฟลเดอร์ตามชื่อ
    bug_dirs = sorted([d for d in target_benchmark_dir.iterdir() if d.is_dir() and d.name.endswith("b")])

    for bug_dir in bug_dirs:
        meta_file = bug_dir / "metadata.json"
        if not meta_file.exists():
            continue

        try:
            with open(meta_file, "r", encoding="utf-8") as f:
                meta = json.load(f)
        except Exception:
            continue

        proj = meta.get("project", "")
        bid = meta.get("bug_id", "")
        bkey = meta.get("bug_key", bug_dir.name)
        ver = meta.get("version", f"{bid}b")
        status = meta.get("extraction_status", "")

        projects_seen.add(proj)
        total_bugs += 1
        if status == "COMPLETE":
            complete_bugs += 1

        source_files = meta.get("source_files", [])
        num_targets = len(source_files)

        for idx, sf in enumerate(source_files, start=1):
            total_targets += 1
            tc = sf.get("target_class", "")
            rel_path = sf.get("relative_path")
            s_status = sf.get("status", "UNKNOWN")
            sha = sf.get("sha256") or ""

            if s_status == "OK":
                source_files_ok += 1
            else:
                source_files_missing += 1

            full_rel_source = f"target_benchmark/{bkey}/{rel_path}" if rel_path else ""
            meta_rel = f"target_benchmark/{bkey}/metadata.json"
            info_rel = f"target_benchmark/{bkey}/defects4j_info.txt"

            csv_rows.append({
                "Project": proj,
                "Bug_ID": bid,
                "Bug_Key": bkey,
                "Version": ver,
                "Target_Class": tc,
                "Target_Index": idx,
                "Targets_In_Bug": num_targets,
                "Source_Relative_Path": full_rel_source,
                "Source_Status": s_status,
                "Source_SHA256": sha,
                "Metadata_Path": meta_rel,
                "Defects4J_Info_Path": info_rel
            })

    # บันทึก benchmark_targets.csv
    csv_path.parent.mkdir(parents=True, exist_ok=True)
    fieldnames = [
        "Project", "Bug_ID", "Bug_Key", "Version", "Target_Class",
        "Target_Index", "Targets_In_Bug", "Source_Relative_Path",
        "Source_Status", "Source_SHA256", "Metadata_Path", "Defects4J_Info_Path"
    ]
    with open(csv_path, "w", encoding="utf-8", newline="") as f:
        writer = csv.DictWriter(f, fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(csv_rows)

    # บันทึก manifest.json
    manifest = {
        "schema_version": 1,
        "source": "Defects4J",
        "projects": len(projects_seen),
        "total_active_bugs": total_bugs,
        "total_target_classes": total_targets,
        "complete_bugs": complete_bugs,
        "source_files_ok": source_files_ok,
        "source_files_missing": source_files_missing,
        "defects4j_commit": get_defects4j_commit(defects4j_home),
        "generated_at_utc": datetime.now(timezone.utc).isoformat()
    }

    manifest_file = target_benchmark_dir / "manifest.json"
    with open(manifest_file, "w", encoding="utf-8") as f:
        json.dump(manifest, f, indent=2, ensure_ascii=False)

    print(f"\n[Generated Manifest & CSV]")
    print(f"  CSV file: {csv_path} ({len(csv_rows)} rows)")
    print(f"  Manifest: {manifest_file}")
    return len(projects_seen), total_bugs, total_targets


# =====================================================================
# Verification Subsystem (--verify)
# =====================================================================

def verify_dataset(target_benchmark_dir: Path, csv_path: Path) -> bool:
    """
    ตรวจสอบความถูกต้องและความสมบูรณ์ของ Dataset อย่างเข้มงวด:
      - Project count
      - Bug count
      - Target count
      - Duplicate Project/Bug/Target
      - Missing metadata.json / defects4j_info.txt / source files
      - SHA256 integrity
      - CSV ↔ Directory mismatch
    """
    print("\n" + "=" * 60)
    print("Defects4J Frozen Target Dataset Verification")
    print("=" * 60)

    if not target_benchmark_dir.exists():
        print(f"[FAIL] Directory {target_benchmark_dir} does not exist.")
        return False

    if not csv_path.exists():
        print(f"[FAIL] CSV {csv_path} does not exist.")
        return False

    # 1. ตรวจสอบ CSV
    csv_targets = set()
    csv_rows_by_target = {}
    with open(csv_path, "r", encoding="utf-8") as f:
        reader = csv.DictReader(f)
        for r in reader:
            key = (r["Project"], r["Bug_ID"], r["Target_Class"])
            if key in csv_targets:
                print(f"  [ERROR] Duplicate entry in CSV: {key}")
            csv_targets.add(key)
            csv_rows_by_target[key] = r

    # 2. ตรวจสอบโฟลเดอร์
    bug_dirs = sorted([d for d in target_benchmark_dir.iterdir() if d.is_dir() and d.name.endswith("b")])
    projects_found = set()
    total_bugs = len(bug_dirs)
    total_targets = 0
    missing_metadata = 0
    missing_info = 0
    recorded_missing_sources = 0
    unexpected_missing_files = 0
    sha256_mismatches = 0
    duplicate_targets = 0
    seen_targets = set()

    for bug_dir in bug_dirs:
        bkey = bug_dir.name
        meta_file = bug_dir / "metadata.json"
        info_file = bug_dir / "defects4j_info.txt"

        if not meta_file.exists():
            missing_metadata += 1
            print(f"  [MISSING] {bkey}/metadata.json")
            continue

        if not info_file.exists():
            missing_info += 1
            print(f"  [MISSING] {bkey}/defects4j_info.txt")

        try:
            with open(meta_file, "r", encoding="utf-8") as f:
                meta = json.load(f)
        except Exception as e:
            print(f"  [CORRUPT] {meta_file}: {e}")
            missing_metadata += 1
            continue

        proj = meta.get("project")
        bid = str(meta.get("bug_id"))
        projects_found.add(proj)

        source_files = meta.get("source_files", [])
        for sf in source_files:
            total_targets += 1
            tc = sf.get("target_class")
            rel_path = sf.get("relative_path")
            expected_sha = sf.get("sha256")
            status = sf.get("status")

            target_key = (proj, bid, tc)
            if target_key in seen_targets:
                duplicate_targets += 1
                print(f"  [DUPLICATE] Target {target_key} found multiple times!")
            seen_targets.add(target_key)

            if status == "SOURCE_NOT_FOUND":
                recorded_missing_sources += 1
                continue

            if status != "OK" or not rel_path:
                unexpected_missing_files += 1
                print(f"  [MISSING SOURCE] {bkey} -> {tc} (status={status})")
                continue

            actual_file = bug_dir / rel_path
            if not actual_file.exists():
                unexpected_missing_files += 1
                print(f"  [FILE NOT FOUND] {actual_file}")
            else:
                actual_sha = calculate_sha256(actual_file)
                if expected_sha and actual_sha != expected_sha:
                    sha256_mismatches += 1
                    print(f"  [SHA MISMATCH] {actual_file}: expected {expected_sha}, got {actual_sha}")

    # ตรวจสอบความสอดคล้องกับ CSV
    csv_mismatch = 0
    if seen_targets != csv_targets:
        diff_in_dir = seen_targets - csv_targets
        diff_in_csv = csv_targets - seen_targets
        if diff_in_dir:
            print(f"  [MISMATCH] Found in directory but missing in CSV: {len(diff_in_dir)} targets")
            csv_mismatch += len(diff_in_dir)
        if diff_in_csv:
            print(f"  [MISMATCH] Found in CSV but missing in directory: {len(diff_in_csv)} targets")
            csv_mismatch += len(diff_in_csv)

    is_valid = (
        missing_metadata == 0 and
        missing_info == 0 and
        unexpected_missing_files == 0 and
        sha256_mismatches == 0 and
        duplicate_targets == 0 and
        csv_mismatch == 0
    )

    print("-" * 60)
    print(f"Projects            : {len(projects_found)}")
    print(f"Active bugs         : {total_bugs}")
    print(f"Target classes      : {total_targets}")
    print(f"Duplicate targets   : {duplicate_targets}")
    print(f"Missing metadata    : {missing_metadata}")
    print(f"Missing info.txt    : {missing_info}")
    print(f"Missing sources     : {unexpected_missing_files}")
    print(f"Recorded missing    : {recorded_missing_sources} (New classes created in fix: Closure-169, Codec-13, Jsoup-71)")
    print(f"Invalid SHA256      : {sha256_mismatches}")
    print(f"CSV / Dir mismatch  : {csv_mismatch}")
    print(f"Dataset status      : {'VALID' if is_valid else 'INVALID'}")
    print("=" * 60)

    return is_valid


# =====================================================================
# AI Runner Helper Interface
# =====================================================================

def load_benchmark_targets(csv_path: Optional[Path] = None) -> List[Dict[str, str]]:
    """Helper สำหรับ AI runner: โหลดรายการ benchmark targets จาก CSV"""
    path = csv_path or DEFAULT_CSV_PATH
    if not path.exists():
        raise FileNotFoundError(f"Target CSV not found at {path}")
    with open(path, "r", encoding="utf-8") as f:
        return list(csv.DictReader(f))


def get_target_source_path(bug_key: str, target_class: str, base_dir: Optional[Path] = None) -> Path:
    """Helper สำหรับ AI runner: คืนค่า Path ของ source code ของ target class"""
    dir_path = base_dir or DEFAULT_TARGET_BENCHMARK_DIR
    meta_path = dir_path / bug_key / "metadata.json"
    if not meta_path.exists():
        raise FileNotFoundError(f"metadata.json not found for {bug_key}")
    with open(meta_path, "r", encoding="utf-8") as f:
        meta = json.load(f)
    for sf in meta.get("source_files", []):
        if sf.get("target_class") == target_class:
            rel = sf.get("relative_path")
            if rel:
                return dir_path / bug_key / rel
    raise FileNotFoundError(f"Target class {target_class} not found in {bug_key}")


def read_target_source(bug_key: str, target_class: str, base_dir: Optional[Path] = None) -> str:
    """Helper สำหรับ AI runner: อ่าน source code ของ target class โดยตรง"""
    src_file = get_target_source_path(bug_key, target_class, base_dir)
    with open(src_file, "r", encoding="utf-8") as f:
        return f.read()


# =====================================================================
# Main Execution Entry Point
# =====================================================================

def main():
    parser = argparse.ArgumentParser(
        description="Defects4J Frozen Benchmark Target Dataset Builder & Verifier"
    )
    parser.add_argument("--project", type=str, help="ระบุ Project ที่ต้องการสกัด (เช่น Lang, Chart)")
    parser.add_argument("--bug", type=str, help="ระบุ Bug ID (เช่น 1, 2) ใช้ร่วมกับ --project")
    parser.add_argument("--sample-17", action="store_true", help="สกัดเฉพาะ Bug แรกที่เป็นตัวแทนของทั้ง 17 projects")
    parser.add_argument("--all", action="store_true", help="สกัดทุก Active Bugs ของทั้ง 17 projects")
    parser.add_argument("--resume", action="store_true", help="ข้าม Bug ที่สกัดเสร็จสมบูรณ์แล้ว")
    parser.add_argument("--verify", action="store_true", help="ตรวจสอบความสมบูรณ์และ Integrity ของ Dataset")

    parser.add_argument("--defects4j-home", type=Path, default=DEFAULT_DEFECTS4J_HOME,
                        help="Path ของ Defects4J framework (default: /opt/defects4j)")
    parser.add_argument("--output-dir", type=Path, default=DEFAULT_TARGET_BENCHMARK_DIR,
                        help="Path สำหรับเก็บ target_benchmark (default: dataset/target_benchmark)")
    parser.add_argument("--csv-file", type=Path, default=DEFAULT_CSV_PATH,
                        help="Path สำหรับบันทึก benchmark_targets.csv")
    parser.add_argument("--temp-dir", type=Path, default=DEFAULT_TEMP_DIR,
                        help="Path ชั่วคราวสำหรับ checkout (default: /tmp/project_sqa_target_extract)")

    args = parser.parse_args()

    # ตรวจสอบโหมด verify
    if args.verify:
        is_ok = verify_dataset(args.output_dir, args.csv_file)
        sys.exit(0 if is_ok else 1)

    # ตรวจสอบ Defects4J framework
    if not (args.defects4j_home / "framework" / "projects").exists():
        print(f"[ERROR] ไม่พบ Defects4J projects metadata ที่ {args.defects4j_home / 'framework' / 'projects'}")
        print("        ต้องรันสคริปต์นี้ใน Docker container หรือสภาพแวดล้อมที่มี Defects4J ติดตั้งอยู่")
        sys.exit(1)

    args.output_dir.mkdir(parents=True, exist_ok=True)
    args.temp_dir.mkdir(parents=True, exist_ok=True)

    # กำหนดแผนการรัน
    tasks: List[Tuple[str, str]] = []

    if args.project and args.bug:
        tasks.append((args.project, args.bug))

    elif args.project:
        print(f"กำลังค้นหา Active bugs ของ project: {args.project}")
        bugs = get_active_bugs(args.project)
        print(f"  พบ {len(bugs)} bugs")
        for b in bugs:
            tasks.append((args.project, b))

    elif args.sample_17:
        print("กำลังรวบรวมตัวแทน 1 bug แรกจากแต่ละ Project ใน 17 projects...")
        for p in SUPPORTED_PROJECTS:
            bugs = get_active_bugs(p)
            if bugs:
                rep_bug = bugs[0]
                print(f"  [Project: {p}] ตัวแทน: Bug {rep_bug}")
                tasks.append((p, rep_bug))
            else:
                print(f"  [WARN] ไม่พบ active bugs สำหรับ project {p}")

    elif args.all:
        print("กำลังรวบรวม Active bugs ทั้งหมดจาก 17 projects...")
        for p in SUPPORTED_PROJECTS:
            bugs = get_active_bugs(p)
            print(f"  [Project: {p}] พบ {len(bugs)} bugs")
            for b in bugs:
                tasks.append((p, b))

    else:
        parser.print_help()
        sys.exit(1)

    print(f"\n==================================================")
    print(f"เป้าหมายการสกัด: {len(tasks)} tasks")
    print(f"Output directory : {args.output_dir}")
    print(f"CSV file         : {args.csv_file}")
    print(f"Resume enabled   : {args.resume}")
    print(f"==================================================")

    # ดำเนินการสกัด
    for idx, (proj, bid) in enumerate(tasks, start=1):
        print(f"\n[{idx}/{len(tasks)}] -----------------------------")
        extract_bug_target(
            project=proj,
            bug_id=bid,
            defects4j_home=args.defects4j_home,
            output_dir=args.output_dir,
            temp_base_dir=args.temp_dir,
            resume=args.resume
        )

    # สร้าง manifest.json และ benchmark_targets.csv สรุป
    num_proj, num_bugs, num_targets = rebuild_catalog_and_manifest(
        target_benchmark_dir=args.output_dir,
        csv_path=args.csv_file,
        defects4j_home=args.defects4j_home
    )

    print("\n" + "=" * 60)
    print(f"เสร็จสิ้นการสกัด Dataset!")
    print(f"  Projects      : {num_proj}")
    print(f"  Active Bugs   : {num_bugs}")
    print(f"  Target Classes: {num_targets}")
    print("=" * 60)


if __name__ == "__main__":
    main()
