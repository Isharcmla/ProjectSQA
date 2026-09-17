#!/usr/bin/env python3
"""
extract_catalog.py
=========================================================
ดึง Metadata ของทุกบั๊กใน Defects4J (Project, Bug ID, Target Class,
Path ของไฟล์ metadata ต้นทาง) โดยไม่ต้อง checkout โปรเจกต์จริง
เพราะข้อมูลนี้ถูกเก็บไว้ในตัว framework เองอยู่แล้วที่:
  framework/projects/<Project>/modified_classes/<BugID>.src

ผลลัพธ์ที่ได้ (เบามาก ไม่มีซอร์สโค้ดจริง เหมาะ commit เข้า git ได้
แต่ตามที่ตกลงกัน จะเก็บไว้แค่ในเครื่อง/Docker volume ไม่ commit):
  target_benchmark/
    ├── catalog_all.json              # รวมทุก project ไว้ที่เดียว
    ├── Lang/catalog.json             # แยกตาม project
    ├── Math/catalog.json
    └── ...

วิธีใช้ (รันข้างใน Docker container ที่มี defects4j ติดตั้งแล้ว):
  python3 extract_catalog.py
=========================================================
"""

import json
import subprocess
from pathlib import Path

# Path ของ defects4j framework (ต้องตรงกับที่ Dockerfile clone ไว้ที่ /opt/defects4j)
DEFECTS4J_HOME = Path("/opt/defects4j")
FRAMEWORK_PROJECTS_DIR = DEFECTS4J_HOME / "framework" / "projects"

# ตำแหน่งเก็บผลลัพธ์ -> เก็บนอก git repo (ตามที่ตกลง เก็บแค่ในเครื่อง/Docker volume)
OUTPUT_DIR = Path.home() / "kex-testing" / "target_benchmark"

ALL_PROJECTS = [
    "Chart", "Cli", "Closure", "Codec", "Collections", "Compress", "Csv",
    "Gson", "JacksonCore", "JacksonDatabind", "JacksonXml", "Jsoup",
    "JxPath", "Lang", "Math", "Mockito", "Time"
]


def get_bug_ids(project):
    """ดึงรายชื่อ bug id ทั้งหมดของ project ผ่าน defects4j cli"""
    result = subprocess.run(
        ["defects4j", "bids", "-p", project],
        capture_output=True, text=True
    )
    if result.returncode != 0:
        print(f"  [WARN] เรียก defects4j bids -p {project} ไม่สำเร็จ: {result.stderr.strip()}")
        return []
    return [b for b in result.stdout.strip().split("\n") if b]


def read_modified_classes(project, bug_id):
    """อ่านรายชื่อ target class จากไฟล์ metadata โดยตรง ไม่ต้อง checkout"""
    meta_file = FRAMEWORK_PROJECTS_DIR / project / "modified_classes" / f"{bug_id}.src"
    if not meta_file.exists():
        return [], None
    with open(meta_file, "r", encoding="utf-8") as f:
        classes = [line.strip() for line in f if line.strip()]
    return classes, str(meta_file)


def extract_project(project):
    """ดึง metadata ของทุกบั๊กใน 1 project คืนค่าเป็น list ของ dict"""
    print(f"[Project: {project}] กำลังดึงรายชื่อ bug...")
    bug_ids = get_bug_ids(project)
    print(f"  พบ {len(bug_ids)} bugs")

    entries = []
    for bid in bug_ids:
        target_classes, meta_path = read_modified_classes(project, bid)
        entries.append({
            "project": project,
            "bug_id": bid,
            "target_classes": target_classes,
            "num_target_classes": len(target_classes),
            "metadata_source": meta_path,
            # สถานะที่ยังไม่ได้ทำ -> เอาไว้ให้ run_benchmark.py มาอัปเดตทีหลัง
            "checked_out": False,
            "kex_status": None,
            "evosuite_status": None,
        })
    return entries


def main():
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    if not FRAMEWORK_PROJECTS_DIR.exists():
        print(f"[ERROR] ไม่พบ {FRAMEWORK_PROJECTS_DIR}")
        print("        ต้องรันสคริปต์นี้ข้างใน Docker container ที่ build defects4j ไว้แล้ว")
        return

    all_entries = []

    for project in ALL_PROJECTS:
        entries = extract_project(project)
        all_entries.extend(entries)

        # เก็บแยกตาม Project ตามที่ตกลงกัน
        project_dir = OUTPUT_DIR / project
        project_dir.mkdir(exist_ok=True)
        with open(project_dir / "catalog.json", "w", encoding="utf-8") as f:
            json.dump(entries, f, indent=2, ensure_ascii=False)
        print(f"  บันทึกแล้วที่ {project_dir / 'catalog.json'}\n")

    # เก็บรวมทุก project ไว้ไฟล์เดียวด้วย เผื่อ query ข้าม project สะดวก
    with open(OUTPUT_DIR / "catalog_all.json", "w", encoding="utf-8") as f:
        json.dump(all_entries, f, indent=2, ensure_ascii=False)

    # สรุปตัวเลขรวม
    total_bugs = len(all_entries)
    total_classes = sum(e["num_target_classes"] for e in all_entries)
    print("=========================================")
    print(f"เสร็จสิ้น: รวม {total_bugs} bugs จาก {len(ALL_PROJECTS)} projects")
    print(f"รวม target class ทั้งหมด {total_classes} รายการ")
    print(f"ไฟล์รวมอยู่ที่: {OUTPUT_DIR / 'catalog_all.json'}")
    print("=========================================")


if __name__ == "__main__":
    main()
