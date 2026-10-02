#!/usr/bin/env python3
"""
ai_benchmark_runner.py
=========================================================
ProjectSQA - AI Full-Benchmark Runner
รัน Automated Test Generation สำหรับ Defects4J 1,073 targets
โดยใช้ Frozen Dataset (ไม่ต้อง checkout ใน Docker ใหม่)
เชื่อมต่อกับ KKU IntelSphere API พร้อมระบบ Key Rotation และการสลับโมเดลอัตโนมัติ

คุณสมบัติหลัก:
1. อ่าน Target จาก Frozen Dataset (dataset/benchmark_targets.csv)
2. กรองและข้าม target ที่ไม่มี source code อัตโนมัติ (3 targets ที่ระบุใน catalog)
3. รันแบบลำดับ: Gemini ให้ครบทุก target ก่อน แล้วจึงตามด้วย Claude
4. สลับ API Key อัตโนมัติ (Key Rotation) เมื่อ Key ปัจจุบันหมด Quota ประจำวัน
5. หาก Gemini หมด Quota ทุก Key จะสลับไปรัน Claude ต่อทันที
6. บันทึกความคืบหน้า (Progress) และสถานะ Key เพื่อให้รันต่อข้ามวันได้ (Resume)
7. มีโหมด Dry-run สำหรับตรวจสอบ Dataset และการตั้งค่าโดยไม่ต้องยิง API จริง
=========================================================
"""

import argparse
import json
import os
import signal
import sys
import time
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Set, Tuple, Any

if hasattr(sys.stdout, "reconfigure"):
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
        sys.stderr.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass


REPO_DIR = Path(__file__).resolve().parent
if REPO_DIR.name == "scripts":
    REPO_DIR = REPO_DIR.parent

# เพิ่ม scripts directory ลง sys.path เพื่อให้ import ได้ทั้ง direct execution และ module execution
if str(REPO_DIR / "scripts") not in sys.path:
    sys.path.insert(0, str(REPO_DIR / "scripts"))

from key_manager import KeyManager, mask_key
from build_target_benchmark import (
    load_benchmark_targets,
    read_target_source,
    DEFAULT_CSV_PATH,
    DEFAULT_TARGET_BENCHMARK_DIR,
)
import ai_generate

PROGRESS_FILE = REPO_DIR / "logs" / "ai_runner_progress.json"


class BenchmarkRunner:
    """ควบคุมการรัน AI Benchmark ทั้งหมด"""

    def __init__(
        self,
        model_mode: str = "all",          # "all", "gemini", หรือ "claude"
        project_filter: Optional[str] = None,
        bug_filter: Optional[str] = None,
        sample_17: bool = False,
        limit: Optional[int] = None,
        dry_run: bool = False,
        force: bool = False,
        delay_sec: float = 1.5,
        max_tokens: int = 16384,
        temperature: float = 0.2,
    ):
        self.model_mode = model_mode.lower()
        self.project_filter = project_filter
        self.bug_filter = str(bug_filter) if bug_filter else None
        self.sample_17 = sample_17
        self.limit = limit
        self.dry_run = dry_run
        self.force = force
        self.delay_sec = delay_sec
        self.max_tokens = max_tokens
        self.temperature = temperature


        self.key_manager = KeyManager()
        self.progress_file = PROGRESS_FILE
        self.progress_data = self.load_progress()
        self.interrupted = False

        # ติดตั้ง signal handler สำหรับ Graceful Shutdown เมื่อกด Ctrl+C
        signal.signal(signal.SIGINT, self._handle_interrupt)
        signal.signal(signal.SIGTERM, self._handle_interrupt)

    def _handle_interrupt(self, signum, frame):
        print("\n\n[Runner] ได้รับสัญญาณขัดจังหวะ (SIGINT/Ctrl+C) กำลังบันทึกสถานะ...")
        self.interrupted = True

    def load_progress(self) -> Dict[str, Any]:
        """โหลดข้อมูลความคืบหน้าเดิมจาก JSON"""
        if self.progress_file.exists():
            try:
                with open(self.progress_file, "r", encoding="utf-8") as f:
                    return json.load(f)
            except Exception as e:
                print(f"[Runner] คำเตือน: ไม่สามารถอ่าน progress file: {e}")

        return {
            "created_at": datetime.now().isoformat(),
            "updated_at": datetime.now().isoformat(),
            "completed": {
                "gemini": [],
                "claude": [],
            },
            "truncated": {
                "gemini": [],
                "claude": [],
            },
            "failed": {
                "gemini": {},
                "claude": {},
            },
        }

    def save_progress(self):
        """บันทึกข้อมูลความคืบหน้าลง JSON"""
        try:
            self.progress_file.parent.mkdir(parents=True, exist_ok=True)
            self.progress_data["updated_at"] = datetime.now().isoformat()
            with open(self.progress_file, "w", encoding="utf-8") as f:
                json.dump(self.progress_data, f, indent=2, ensure_ascii=False)
        except Exception as e:
            print(f"[Runner] คำเตือน: ไม่สามารถบันทึก progress file: {e}")

    def target_key(self, bug_key: str, target_class: str) -> str:
        return f"{bug_key}:{target_class}"

    def is_target_already_completed(self, model: str, project: str, bug_id: str, target_class: str) -> Tuple[bool, str]:
        """ตรวจสอบว่า target นี้เคย generate สำเร็จ หรือเคยติด Token limit (Truncated) แล้วหรือไม่"""
        if self.force:
            return False, ""

        tkey = self.target_key(f"{project}_{bug_id}b", target_class)

        # 1. ตรวจสอบใน completed list
        if tkey in self.progress_data.get("completed", {}).get(model, []):
            return True, "ทำเสร็จแล้ว (Success)"

        # 2. ตรวจสอบไฟล์ TestCode ในดิสก์โดยตรง
        simple_name = target_class.split(".")[-1]
        model_folder = "Gemini" if model == "gemini" else "Claude"
        test_file = REPO_DIR / model_folder / "TestCode" / project / str(bug_id) / f"{simple_name}Test.java"
        if test_file.exists() and test_file.stat().st_size > 0:
            if tkey not in self.progress_data.setdefault("completed", {}).setdefault(model, []):
                self.progress_data["completed"][model].append(tkey)
            return True, "ทำเสร็จแล้ว (พบไฟล์ TestCode บนดิสก์)"

        # 3. ตรวจสอบใน truncated list (เป้าหมายที่ LLM ทำเกิน max_tokens จนโดนตัดจบ)
        if tkey in self.progress_data.setdefault("truncated", {}).setdefault(model, []):
            return True, "เคยตัดจบ (Truncated: length) ข้ามเพื่อประหยัดโควตา"

        # 4. ตรวจสอบจากประวัติ failed เดิม ถ้าเคยบันทึกว่า Truncated ให้ย้ายเข้า truncated list
        fail_reason = self.progress_data.get("failed", {}).get(model, {}).get(tkey, "")
        if "Truncated" in fail_reason or "length" in fail_reason.lower():
            if tkey not in self.progress_data["truncated"][model]:
                self.progress_data["truncated"][model].append(tkey)
            return True, f"เคยตัดจบ ({fail_reason}) ข้ามเพื่อประหยัดโควตา"

        # 5. ตรวจสอบไฟล์ Result JSON บนดิสก์ว่าเคยรันแล้วติด finish_reason = length หรือไม่
        result_dir = REPO_DIR / model_folder / "Result" / project / str(bug_id)
        if result_dir.exists():
            for jf in result_dir.glob(f"{simple_name}_*.json"):
                try:
                    with open(jf, "r", encoding="utf-8") as f:
                        d = json.load(f)
                    fr = str(d.get("finish_reason", "")).lower()
                    gs = str(d.get("generation_status", "")).lower()
                    if fr in ["length", "max_tokens", "max_token"] or gs == "failed":
                        if tkey not in self.progress_data["truncated"][model]:
                            self.progress_data["truncated"][model].append(tkey)
                        return True, f"พบไฟล์ Result เดิมตัดจบ (finish_reason={fr}) ข้ามเพื่อประหยัดโควตา"
                except Exception:
                    pass

        return False, ""

    def load_and_filter_targets(self) -> List[Dict[str, str]]:
        """
        โหลดรายการ target จาก Frozen Dataset (benchmark_targets.csv) 
        และใช้ Explicit Target Selection Rules:
          1. Dataset Entries        : 1,073
          2. SOURCE_NOT_FOUND       : 3 (Closure-169, Codec-13, Jsoup-71)
          3. Non-Java resources     : 3 (Codec-14: ash_lang.txt, gen_lang.txt, sep_lang.txt)
          4. Java runnable targets  : 1,067 (รวม $Gson$Types 3 bugs ซึ่งเป็น valid Java source)
        """
        all_targets = load_benchmark_targets(DEFAULT_CSV_PATH)
        filtered: List[Dict[str, str]] = []
        skipped_not_found = 0
        skipped_non_java = 0

        # ถ้าเปิดโหมด --sample-17: คัดกรองเฉพาะ 1 bug ต่อ 1 project (เลือก Bug 1 ที่มีครบทุก 17 projects)
        if self.sample_17:
            all_targets = [
                r for r in all_targets
                if str(r.get("Bug_ID")) == "1"
            ]

        for row in all_targets:
            # กฎข้อ 1: กรอง SOURCE_NOT_FOUND ออก (คลาสที่ถูกสร้างใหม่ใน Fix ไม่มีใน Buggy source)
            if row.get("Source_Status") != "OK":
                skipped_not_found += 1
                continue

            # กฎข้อ 2: กรอง Non-Java resource files ออก (เช่น .txt ใน Codec-14)
            target_class = row.get("Target_Class", "")
            source_rel = row.get("Source_Relative_Path", "")
            if target_class.endswith(".txt") or not source_rel.endswith(".java"):
                skipped_non_java += 1
                continue

            # กฎข้อ 3: กรองตาม Project (ถ้ามีการระบุ)
            if self.project_filter and row.get("Project", "").lower() != self.project_filter.lower():
                continue

            # กฎข้อ 4: กรองตาม Bug ID (ถ้ามีการระบุ)
            if self.bug_filter and str(row.get("Bug_ID", "")) != self.bug_filter:
                continue

            filtered.append(row)

        if not self.project_filter and not self.sample_17:
            print(f"[Runner] Selection Rules:")
            print(f"  - ข้าม SOURCE_NOT_FOUND: {skipped_not_found} target(s)")
            print(f"  - ข้าม Non-Java resources (.txt): {skipped_non_java} target(s)")
            print(f"  - คัดเลือก Java runnable targets: {len(filtered)} target(s)")

        if self.limit and self.limit > 0:
            filtered = filtered[:self.limit]

        return filtered


    def run_target_single_model(
        self,
        row: Dict[str, str],
        model: str,
        index: int,
        total: int,
    ) -> bool:
        """รัน generation สำหรับ 1 target กับ 1 model พร้อมระบบ Key Rotation และ Retry"""
        project = row["Project"]
        bug_id = row["Bug_ID"]
        bug_key = row["Bug_Key"]
        target_class = row["Target_Class"]
        tkey = self.target_key(bug_key, target_class)

        prefix = f"[{model.upper()} {index}/{total}] {bug_key} / {target_class}"

        # ตรวจสอบว่าเคย generate แล้ว หรือเคยติด Token limit (Truncated) หรือไม่
        is_done, reason = self.is_target_already_completed(model, project, bug_id, target_class)
        if is_done:
            print(f"{prefix} -> [SKIP] {reason}")
            return True

        # อ่าน source code จาก Frozen Dataset
        try:
            source_code = read_target_source(bug_key, target_class, DEFAULT_TARGET_BENCHMARK_DIR)
        except Exception as e:
            err_msg = f"ไม่สามารถอ่าน source code จาก dataset: {e}"
            print(f"{prefix} -> [ERROR] {err_msg}")
            self.progress_data["failed"][model][tkey] = err_msg
            self.save_progress()
            return False

        # โหมด Dry-run
        if self.dry_run:
            print(f"{prefix} -> [DRY-RUN] อ่าน source สำเร็จ ({len(source_code):,} chars, {len(source_code.splitlines())} lines)")
            return True

        # วนลูปยิง API พร้อม Key Rotation
        max_attempts = max(3, self.key_manager.total_keys)
        attempt = 0

        while attempt < max_attempts:
            if self.interrupted:
                return False

            attempt += 1
            key_info = self.key_manager.get_current_key_info(model)
            if not key_info:
                print(f"\n[Runner] [QUOTA EXHAUSTED] ทุก API Key หมด Quota สำหรับ {model.upper()} แล้วในวันนี้!")
                return False

            api_key = key_info.api_key
            key_id = key_info.key_id
            masked = mask_key(api_key)

            rem_str = f"{key_info.tokens_remaining[model]:,}" if key_info.tokens_remaining[model] is not None else "?"
            print(f"{prefix} [{key_id}: {masked} | Rem: {rem_str}]", end="", flush=True)

            try:
                result = ai_generate.generate_from_frozen(
                    project=project,
                    bug_id=bug_id,
                    class_name=target_class,
                    source_code=source_code,
                    model=model,
                    max_tokens=self.max_tokens,
                    temperature=self.temperature,
                    api_key=api_key,
                    verbose=False,
                )

                gen_status = result.get("generation_status", "unknown")
                elapsed = result.get("elapsed_sec", 0)
                usage = result.get("usage", {})
                tokens_used = usage.get("total_tokens", 0)
                quota = result.get("model_quota", {})

                # บันทึก usage ลง KeyManager
                self.key_manager.record_usage(api_key, model, tokens_used, quota_info=quota)

                if gen_status == "success":
                    print(f" -> SUCCESS ({elapsed}s, tokens: {tokens_used:,})")
                    if tkey not in self.progress_data["completed"][model]:
                        self.progress_data["completed"][model].append(tkey)
                    if tkey in self.progress_data["failed"][model]:
                        del self.progress_data["failed"][model][tkey]
                    if tkey in self.progress_data.get("truncated", {}).get(model, []):
                        self.progress_data["truncated"][model].remove(tkey)
                    self.save_progress()
                    return True
                else:
                    reason = result.get("finish_reason", "unknown")
                    print(f" -> TRUNCATED (finish_reason={reason})")
                    self.progress_data["failed"][model][tkey] = f"Truncated: {reason}"
                    if tkey not in self.progress_data.setdefault("truncated", {}).setdefault(model, []):
                        self.progress_data["truncated"][model].append(tkey)
                    self.save_progress()
                    return True  # ถือว่ารอบนี้เสร็จสิ้น (บันทึก truncated file แล้ว ไม่ต้องยิงซ้ำอีก)

            except Exception as e:
                err_str = str(e)
                print(f" -> API_ERROR: {err_str[:100]}")

                # ตรวจสอบข้อความ error ว่าเกี่ยวกับ Quota / Token / Rate Limit / Auth Error หรือไม่
                quota_keywords = ["quota", "limit", "429", "401", "insufficient", "token", "exceeded", "unauthorized"]
                is_quota_err = any(k in err_str.lower() for k in quota_keywords)

                if is_quota_err:
                    self.key_manager.mark_exhausted(api_key, model, reason=err_str)
                    # วนกลับไปใช้ key ถัดไปทันที
                    continue
                else:
                    # กรณีเป็น error เครือข่ายชั่วคราว ให้รอสักครู่แล้ว retry
                    print(f"   [Retry {attempt}/{max_attempts}] รันซ้ำใน 5 วินาที...")
                    time.sleep(5)


        # หากลองครบทุกคีย์แล้วยังไม่สำเร็จ
        self.progress_data["failed"][model][tkey] = "Max attempts exceeded or all keys failed"
        self.save_progress()
        return False

    def run_model_pipeline(self, model: str, targets: List[Dict[str, str]]) -> bool:
        """รัน generation ของโมเดลหนึ่งสำหรับ targets ทั้งหมด"""
        total = len(targets)
        print("\n" + "=" * 75)
        print(f" เริ่มกระบวนการรันโมเดล: {model.upper()} (ทั้งหมด {total:,} targets)")
        print("=" * 75)

        completed_count = 0
        skipped_count = 0
        exhausted = False

        for i, row in enumerate(targets, start=1):
            if self.interrupted:
                print(f"\n[Runner] หยุดการทำงานชั่วคราวตามคำสั่ง (บันทึกสถานะเรียบร้อย)")
                return False

            # ตรวจสอบล่วงหน้าว่าทุก key หมดแล้วหรือไม่
            if not self.dry_run and self.key_manager.is_all_exhausted(model):
                print(f"\n[Runner] [QUOTA EXHAUSTED] ทุก Key หมด Quota สำหรับ {model.upper()} แล้ว")
                exhausted = True
                break

            tkey = self.target_key(row["Bug_Key"], row["Target_Class"])
            was_completed, _ = self.is_target_already_completed(model, row["Project"], row["Bug_ID"], row["Target_Class"])

            ok = self.run_target_single_model(row, model, i, total)
            if ok:
                if was_completed:
                    skipped_count += 1
                else:
                    completed_count += 1
            else:
                # ถ้าไม่สำเร็จเพราะ quota หมด
                if not self.dry_run and self.key_manager.is_all_exhausted(model):
                    exhausted = True
                    break

            if not self.dry_run and self.delay_sec > 0 and not was_completed:
                time.sleep(self.delay_sec)

        print("\n" + "-" * 75)
        print(f" สรุปผลการรัน {model.upper()}:")
        print(f"   - สำเร็จใหม่ในรอบนี้: {completed_count:,}")
        print(f"   - ข้าม (ทำเสร็จแล้ว/Truncated): {skipped_count:,}")
        print(f"   - ยอดรวม TestCode สำเร็จ: {len(self.progress_data['completed'].get(model, [])):,} / {total:,}")
        print(f"   - ยอด Truncated (Token Limit): {len(self.progress_data.get('truncated', {}).get(model, [])):,} targets")
        if exhausted:
            print(f"   - สถานะ: โควตาหมดประจำวัน (หยุดพักเพื่อสลับโมเดลหรือรันต่อวันถัดไป)")
        print("-" * 75)

        return not exhausted

    def run(self):
        """Main orchestrator: จัดการคิว Gemini -> Claude"""
        dataset_mode = "Sample 17 Projects (1 Bug each - Bug 1)" if self.sample_17 else "Defects4J Full Frozen Dataset"
        print(f"""
===========================================================================
  ProjectSQA - AI Full-Benchmark Runner (Frozen Dataset + Key Rotation)
===========================================================================
  วันที่: {datetime.now().strftime("%Y-%m-%d %H:%M:%S")}
  ชุดข้อมูล: {dataset_mode}
  โหมดโมเดล: {self.model_mode.upper()}
  จำนวน API Keys: {self.key_manager.total_keys} keys
  ตัวกรอง Project: {self.project_filter or "ทั้งหมด (17 projects)"}
  ตัวกรอง Bug ID: {self.bug_filter or "ทั้งหมด"}
  โหมด Dry-run: {"เปิดใช้งาน (จำลอง ไม่ยิง API)" if self.dry_run else "ปิดใช้งาน (รันจริง)"}
===========================================================================
""")


        # แสดงสถานะของ API Key ปัจจุบัน
        print(self.key_manager.get_status_summary())

        # ตรวจสอบและโหลด Targets
        targets = self.load_and_filter_targets()
        print(f"\n[Runner] โหลดรายการ Targets ที่พร้อมรัน: {len(targets):,} targets")
        if not targets:
            print("[Runner] ไม่พบ Target ที่ตรงกับเงื่อนไข สิ้นสุดการทำงาน")
            return

        # กำหนดลำดับโมเดลที่จะรัน
        models_to_run: List[str] = []
        if self.model_mode == "gemini":
            models_to_run = ["gemini"]
        elif self.model_mode == "claude":
            models_to_run = ["claude"]
        else:
            # ค่า default: Gemini ให้เสร็จก่อน แล้วตามด้วย Claude
            models_to_run = ["gemini", "claude"]

        for model in models_to_run:
            if self.interrupted:
                break

            print(f"\n>>> เริ่มดำเนินการสำหรับโมเดล: {model.upper()} <<<")
            self.run_model_pipeline(model, targets)

            if self.interrupted:
                break

        print("\n" + "=" * 75)
        print(" รายงานสถานะ API Keys หลังจบการรัน:")
        print("=" * 75)
        print(self.key_manager.get_status_summary())

        # สรุปความคืบหน้ารวม
        g_done = len(self.progress_data["completed"].get("gemini", []))
        c_done = len(self.progress_data["completed"].get("claude", []))
        g_trunc = len(self.progress_data.get("truncated", {}).get("gemini", []))
        c_trunc = len(self.progress_data.get("truncated", {}).get("claude", []))
        print(f"\nความคืบหน้ารวมทั้งหมด:")
        print(f"  - Gemini: {g_done:,} สำเร็จ + {g_trunc:,} Truncated (Token Limit) / {len(targets):,} targets")
        print(f"  - Claude: {c_done:,} สำเร็จ + {c_trunc:,} Truncated (Token Limit) / {len(targets):,} targets")
        print(f"  - ไฟล์บันทึกความคืบหน้า: {self.progress_file}")
        print("=" * 75)


def print_status_only():
    """แสดงสถานะของ Key และ Progress โดยไม่เริ่มรัน"""
    km = KeyManager()
    print(km.get_status_summary())

    if PROGRESS_FILE.exists():
        try:
            with open(PROGRESS_FILE, "r", encoding="utf-8") as f:
                data = json.load(f)
            g_done = len(data.get("completed", {}).get("gemini", []))
            c_done = len(data.get("completed", {}).get("claude", []))
            g_trunc = len(data.get("truncated", {}).get("gemini", []))
            c_trunc = len(data.get("truncated", {}).get("claude", []))
            print(f"\nสถานะความคืบหน้าใน logs/ai_runner_progress.json:")
            print(f"  - Gemini: {g_done:,} สำเร็จ (TestCode พร้อม) | {g_trunc:,} Truncated (Token Limit)")
            print(f"  - Claude: {c_done:,} สำเร็จ (TestCode พร้อม) | {c_trunc:,} Truncated (Token Limit)")
            print(f"  - อัปเดตล่าสุดเมื่อ: {data.get('updated_at', '?')}")
        except Exception as e:
            print(f"ไม่สามารถอ่าน progress file: {e}")
    else:
        print("\nยังไม่มีประวัติการรันใน logs/ai_runner_progress.json")


def main():
    parser = argparse.ArgumentParser(
        description="ProjectSQA AI Full-Benchmark Runner with Key Rotation and Frozen Dataset"
    )
    parser.add_argument(
        "--model", choices=["all", "gemini", "claude"], default="all",
        help="โมเดลที่ต้องการรัน: all (Gemini ก่อน แล้ว Claude), gemini, claude (default: all)"
    )
    parser.add_argument("--project", default=None, help="กรองเฉพาะโปรเจกต์ เช่น Lang, Math, Chart")
    parser.add_argument("--bug", default=None, help="กรองเฉพาะ bug id เช่น 1")
    parser.add_argument(
        "--sample-17", action="store_true",
        help="ทดสอบรัน 17 โปรเจกต์ อย่างละ 1 บัก (เลือก Bug 1 ครบทั้ง 17 projects, รวม 23 targets)"
    )
    parser.add_argument("--limit", type=int, default=None, help="จำกัดจำนวน target สำหรับทดสอบ")
    parser.add_argument("--delay", type=float, default=1.5, help="หน่วงเวลาระหว่าง API call เป็นวินาที (default: 1.5)")
    parser.add_argument("--dry-run", action="store_true", help="จำลองการทำงานโดยไม่เรียก API จริง")
    parser.add_argument("--force", action="store_true", help="บังคับรันซ้ำแม้จะเคย generate ไปแล้ว")
    parser.add_argument("--status", action="store_true", help="แสดงสถานะของ Key และ Progress ปัจจุบัน แล้วออก")
    parser.add_argument("--max-tokens", type=int, default=16384, help="max tokens สำหรับ LLM response (default: 16384)")
    parser.add_argument("--temperature", type=float, default=0.2, help="temperature (default: 0.2)")

    args = parser.parse_args()

    if args.status:
        print_status_only()
        return

    runner = BenchmarkRunner(
        model_mode=args.model,
        project_filter=args.project,
        bug_filter=args.bug,
        sample_17=args.sample_17,
        limit=args.limit,
        dry_run=args.dry_run,
        force=args.force,
        delay_sec=args.delay,
        max_tokens=args.max_tokens,
        temperature=args.temperature,
    )
    runner.run()



if __name__ == "__main__":
    main()
