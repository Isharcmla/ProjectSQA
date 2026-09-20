#!/usr/bin/env python3
"""
ai_generate.py
=========================================================
สคริปต์สำหรับ Member 3: ดึง source code จาก Defects4J checkout
แล้วแทนค่าตัวแปรใน Prompt Template ส่งไปยัง KKU IntelSphere API
(รองรับทั้ง Gemini และ Claude ผ่าน endpoint เดียวกัน)

อ้างอิง: https://gen.ai.kku.ac.th/docs/api

ใช้ก่อน: ต้องตั้งค่า Environment Variable
  export KKU_API_KEY="your-key"
  (ขอ key ได้ที่ https://gen.ai.kku.ac.th -> ตั้งค่า -> API Platform)

ตัวอย่างการใช้:
  python3 ai_generate.py --project Lang --bug 1 --class org.apache.commons.lang3.StringUtils --model gemini
  python3 ai_generate.py --project Lang --bug 1 --class org.apache.commons.lang3.StringUtils --model claude
=========================================================
"""

import argparse
import json
import os
import requests
import subprocess
import re
import time
from pathlib import Path
from datetime import datetime

REPO_DIR = Path(__file__).resolve().parent
# รองรับกรณีไฟล์อยู่ใน scripts/ หรืออยู่ที่ root ของ repo
if REPO_DIR.name == "scripts":
    REPO_DIR = REPO_DIR.parent

BASE_DIR = Path.home() / "kex-testing"
AI_RESULT_DIR = REPO_DIR

KKU_API_BASE = "https://gen.ai.kku.ac.th/api/v1"
KKU_API_KEY = os.environ.get("KKU_API_KEY")




# ---------- Prompt Templates (คัดลอกจากรายงานรอบ 1) ----------

GEMINI_TEMPLATE = """คุณคือ Java testing expert คุณต้องเขียน JUnit 4 test suite สำหรับคลาสที่ให้มา
โดยมีเป้าหมายเพื่อให้ได้ code coverage (line/branch) สูงที่สุดเท่าที่เป็นไปได้

ข้อมูล Class ภายใต้การทดสอบ
Package: {package_name}
Class name: {class_name}
Full source code:
```java
{source_code}
```
Dependencies ที่เกี่ยวข้อง: {related_classes}

ข้อกำหนดของ Test Suite
1. เขียนเป็น JUnit 4 เท่านั้น (import org.junit.Test, org.junit.Assert)
2. ครอบคลุม public method ทุกตัวของคลาสนี้อย่างน้อย 1 test case
3. ต้องมี test case ทั้งกรณี normal input, edge case (เช่น null, 0, ค่าติดลบ, string ว่าง, array ว่าง),
   และกรณีที่ควร throw exception (ถ้ามี)
4. ห้ามใช้ mocking framework ใด ๆ ให้ทดสอบผ่าน public API จริงเท่านั้น
5. แต่ละ test method ต้องมีชื่อสื่อความหมาย (เช่น testMethodName_condition_expectedResult)
6. ห้ามเขียนคำอธิบายยาว ๆ ให้ตอบกลับเป็นโค้ด Java ที่คอมไพล์ได้จริงเท่านั้น ไม่ต้องมี markdown fence หรือคำอธิบายอื่น

ส่งออกเฉพาะโค้ด Java ของไฟล์ test class ชื่อ {class_name}Test.java เท่านั้น
"""

CLAUDE_TEMPLATE = """คุณคือ Java testing expert ที่เชี่ยวชาญด้าน unit testing และ JUnit framework
งานของคุณคือเขียน JUnit 4 test suite ให้กับคลาสที่อยู่ใน tag <source_code> ด้านล่าง
เป้าหมายหลักคือให้ได้ line coverage และ branch coverage สูงที่สุดเท่าที่เป็นไปได้

<class_info>
Package: {package_name}
Class name: {class_name}
</class_info>

<source_code>
{source_code}
</source_code>

<dependencies>
{related_classes}
</dependencies>

<requirements>
1. เขียนเป็น JUnit 4 เท่านั้น (import org.junit.Test, org.junit.Assert, org.junit.Before ถ้าจำเป็น)
2. ครอบคลุม public method ทุกตัวอย่างน้อย 1 test case ต่อ method
3. ต้องมี test case ครบทั้ง 3 กลุ่ม: (ก) normal/typical input (ข) edge case เช่น null, 0, ค่าติดลบ, string ว่าง,
   boundary value (ค) กรณีที่ควร throw exception พร้อมใช้ @Test(expected=...) หรือ try-catch ตรวจสอบ
4. ห้ามใช้ mocking framework ใด ๆ ทดสอบผ่าน public API ของคลาสจริงเท่านั้น
5. ตั้งชื่อ test method ให้สื่อความหมายตามรูปแบบ testMethodName_condition_expectedResult
6. ห้าม import class ที่ไม่มีอยู่จริงหรือเดา API ที่ไม่ได้ให้มา ถ้าจำเป็นต้องใช้ dependency ที่ไม่มีข้อมูลเพียงพอ
   ให้ระบุไว้เป็น comment ในโค้ดแทนการเดา
</requirements>

<output_format>
ตอบกลับเฉพาะโค้ด Java ที่คอมไพล์ได้จริงเท่านั้น ห้ามมีคำอธิบายก่อน/หลังโค้ด ห้ามใช้ markdown code fence
ชื่อไฟล์/คลาสคือ {class_name}Test.java
</output_format>
"""


# ---------- KKU IntelSphere API helpers ----------

def check_api_key():
    if not KKU_API_KEY:
        raise EnvironmentError(
            "ไม่พบ KKU_API_KEY — รัน: export KKU_API_KEY='your-key' ก่อน "
            "(ขอ key ได้ที่ https://gen.ai.kku.ac.th -> ตั้งค่า -> API Platform)"
        )


def get_model_list():
    """ดึงรายชื่อโมเดลทั้งหมดที่ใช้ได้ผ่าน POST /chat/models-list"""
    check_api_key()
    resp = requests.post(
        f"{KKU_API_BASE}/chat/models-list",
        headers={"Authorization": f"Bearer {KKU_API_KEY}"},
        timeout=30,
    )
    resp.raise_for_status()
    return resp.json()   # เช่น [{"id": 1, "name": "claude-sonnet-4"}, {"id": 3, "name": "gemini-2.5-pro"}, ...]


# ---------- ค่า Default Model ของกลุ่ม (ยืนยันแล้วจากรายชื่อโมเดลจริงบน KKU IntelSphere) ----------
DEFAULT_MODEL_NAME = {
    "gemini": "gemini-3.7-flash",   # เลือกโดยกลุ่ม: รุ่นรองล่าสุด สมดุลระหว่างความสามารถกับ quota
    "claude": "claude-sonnet-5",    # มีตัวเดียวในระบบ ไม่ต้องเลือก
}


def find_model_id(exact_name):
    """หา model id จากชื่อที่ตรงเป๊ะ (exact match) กันปัญหาเลือกผิดรุ่นเวลามีหลายเวอร์ชัน
    เช่น ระบบมีทั้ง gemini-3.7-flash / gemini-3.8-flash / gemini-3.5-flash-lite พร้อมกัน
    """
    models = get_model_list()
    matches = [m for m in models if m["name"].lower() == exact_name.lower()]
    if not matches:
        available = ", ".join(m["name"] for m in models)
        raise ValueError(f"ไม่พบโมเดลชื่อ '{exact_name}' พอดี — โมเดลที่มีอยู่: {available}")
    return matches[0]["id"], matches[0]["name"]


def call_kku_api(model_id, prompt, max_tokens=4096, temperature=0.2):
    """เรียก POST /chat/completions (OpenAI-compatible).

    คืนค่า text/quota/usage/finish_reason เพื่อให้ Result JSON เก็บหลักฐาน
    ของ generation ได้ครบ และตรวจกรณี output ถูกตัดเพราะ token limit ได้
    """
    check_api_key()
    resp = requests.post(
        f"{KKU_API_BASE}/chat/completions",
        headers={
            "Content-Type": "application/json",
            "Authorization": f"Bearer {KKU_API_KEY}",
        },
        json={
            "model": model_id,
            "messages": [{"role": "user", "content": prompt}],
            "temperature": temperature,
            "max_tokens": max_tokens,
        },
        timeout=120,
    )
    resp.raise_for_status()
    data = resp.json()

    choice = data["choices"][0]
    text = choice["message"]["content"]
    finish_reason = choice.get("finish_reason")
    quota = data.get("model_quota", {})
    usage = data.get("usage", {})
    return text, quota, usage, finish_reason


# ---------- Source code extraction ----------

def get_work_dir(project, bug_id):
    work_dir = BASE_DIR / "checkouts" / f"{project}_{bug_id}_buggy"
    if not work_dir.exists():
        raise FileNotFoundError(
            f"ยังไม่ได้ checkout {project}-{bug_id}: {work_dir}\n"
            f"ให้รัน run_benchmark.py สำหรับ bug นี้ก่อน"
        )
    return work_dir


def get_modified_classes(project, bug_id):
    """อ่าน classes.modified จาก Defects4J เพื่อใช้ target เดียวกับ Kex/EvoSuite"""
    work_dir = get_work_dir(project, bug_id)
    result = subprocess.run(
        ["defects4j", "export", "-p", "classes.modified", "-w", str(work_dir)],
        capture_output=True, text=True, timeout=60,
    )
    if result.returncode != 0:
        raise RuntimeError(
            "อ่าน classes.modified ไม่สำเร็จ:\n" + (result.stderr or result.stdout)
        )
    classes = [line.strip() for line in result.stdout.splitlines() if line.strip()]
    if not classes:
        raise RuntimeError(f"ไม่พบ classes.modified สำหรับ {project}-{bug_id}")
    return classes


def get_source_code(project, bug_id, class_name):
    """ดึง source ตาม fully-qualified class name โดยตรวจ package path เพื่อลดโอกาสหยิบไฟล์ผิด"""
    work_dir = get_work_dir(project, bug_id)
    relative = Path(*class_name.split(".")).with_suffix(".java")

    matches = [p for p in work_dir.rglob(relative.name) if str(p).replace("\\", "/").endswith(str(relative).replace("\\", "/"))]
    if not matches:
        raise FileNotFoundError(f"ไม่พบ source ของ {class_name} ใน {work_dir}")
    if len(matches) > 1:
        raise RuntimeError(f"พบ source มากกว่า 1 ไฟล์สำหรับ {class_name}: {matches}")
    return matches[0].read_text(encoding="utf-8", errors="ignore")


def clean_java_response(text):
    """ตัด markdown fence ที่โมเดลอาจส่งมาแม้ prompt จะสั่งไม่ให้ส่ง"""
    text = text.strip()
    m = re.match(r"^```(?:java)?\s*(.*?)\s*```$", text, flags=re.DOTALL | re.IGNORECASE)
    return (m.group(1) if m else text).strip() + "\n"

def build_prompt(model, package_name, class_name, source_code, related_classes="(ไม่มีข้อมูลเพิ่มเติม)"):
    template = GEMINI_TEMPLATE if model == "gemini" else CLAUDE_TEMPLATE
    return template.format(
        package_name=package_name,
        class_name=class_name,
        source_code=source_code,
        related_classes=related_classes,
    )


def generate_one(project, bug_id, class_name, model, model_name_override, related,
                 max_tokens=4096, temperature=0.2):
    """Generate test สำหรับ target class เดียวและบันทึก metadata ตาม benchmark schema กลาง.

    หมายเหตุ: compile_result = not_run ที่ stage นี้เสมอ เพราะการ compile/buggy-fixed
    evaluation เป็นหน้าที่ของ evaluate_tests.py ไม่ใช่ generator.
    """
    package_name = ".".join(class_name.split(".")[:-1])
    simple_class_name = class_name.split(".")[-1]
    model_folder = "Gemini" if model == "gemini" else "Claude"

    base = AI_RESULT_DIR / model_folder
    prompt_dir = base / "Prompt" / project / str(bug_id)
    result_dir = base / "Result" / project / str(bug_id)
    test_dir = base / "TestCode" / project / str(bug_id)
    for d in (prompt_dir, result_dir, test_dir):
        d.mkdir(parents=True, exist_ok=True)

    print(f"[1/5] ดึง source: {project}-{bug_id} / {class_name}")
    source_code = get_source_code(project, bug_id, class_name)

    print(f"[2/5] สร้าง Prompt สำหรับ {model}")
    prompt = build_prompt(model, package_name, simple_class_name, source_code, related)
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    prompt_file = prompt_dir / f"{simple_class_name}_{timestamp}.txt"
    prompt_file.write_text(prompt, encoding="utf-8")

    print("[3/5] ค้นหา model id")
    search_name = model_name_override or DEFAULT_MODEL_NAME[model]
    model_id, actual_model_name = find_model_id(search_name)
    print(f"      ใช้โมเดล: {actual_model_name} (id={model_id})")

    print("[4/5] เรียก KKU IntelSphere API")
    api_started = time.perf_counter()
    try:
        result_text, quota, usage, finish_reason = call_kku_api(
            model_id, prompt, max_tokens=max_tokens, temperature=temperature
        )
        elapsed_sec = round(time.perf_counter() - api_started, 2)
    except Exception:
        # ให้ caller เป็นผู้บันทึก aggregate failure; ไม่มี test file ถูกสร้าง
        raise

    result_text = clean_java_response(result_text)

    # ถ้า API ระบุชัดว่าหยุดเพราะ token limit อย่านับเป็น generation success
    truncated = str(finish_reason).lower() in {"length", "max_tokens", "max_token"}
    generation_status = "failed" if truncated else "success"
    status = generation_status

    print("[5/5] บันทึกผลลัพธ์")
    test_file = test_dir / f"{simple_class_name}Test.java"
    num_test_files_generated = 0
    if generation_status == "success":
        test_file.write_text(result_text, encoding="utf-8")
        num_test_files_generated = 1
    else:
        # เก็บ response ที่ถูกตัดเป็นหลักฐาน แต่ไม่วางใน TestCode เพื่อไม่ให้ evaluator
        # เข้าใจผิดว่าเป็น generated test ที่สมบูรณ์
        truncated_file = result_dir / f"{simple_class_name}_{timestamp}_truncated.java.txt"
        truncated_file.write_text(result_text, encoding="utf-8")

    result_log = result_dir / f"{simple_class_name}_{timestamp}.json"
    result_payload = {
        "project": project,
        "bug_id": str(bug_id),
        "tool": model,
        "class": class_name,
        "target_classes": [class_name],
        "status": status,
        "generation_status": generation_status,
        "compile_result": "not_run",
        "elapsed_sec": elapsed_sec,
        "num_test_files_generated": num_test_files_generated,
        "model_requested": model,
        "model_id": model_id,
        "model_name": actual_model_name,
        "max_tokens": max_tokens,
        "temperature": temperature,
        "finish_reason": finish_reason,
        "prompt_file": str(prompt_file.relative_to(REPO_DIR)),
        "test_file": (
            str(test_file.relative_to(REPO_DIR))
            if num_test_files_generated else None
        ),
        "usage": usage,
        "model_quota": quota,
        "timestamp": timestamp,
    }
    result_log.write_text(
        json.dumps(result_payload, indent=2, ensure_ascii=False) + "\n",
        encoding="utf-8",
    )

    if generation_status == "success":
        print(f"      Test: {test_file}")
    else:
        print(f"      [FAILED] output ถูกตัด (finish_reason={finish_reason})")
    if quota:
        print(f"      Token: {quota.get('daily_remaining_tokens', '?')}/{quota.get('daily_quota_tokens', '?')}")

    return result_payload


def main():
    parser = argparse.ArgumentParser(
        description="AI JUnit generation for Defects4J via KKU IntelSphere"
    )
    parser.add_argument("--project", required=True, help="เช่น Lang")
    parser.add_argument("--bug", required=True, help="เช่น 1")
    parser.add_argument(
        "--class", dest="class_name", default=None,
        help="target class; ถ้าไม่ระบุจะใช้ Defects4J classes.modified อัตโนมัติ",
    )
    parser.add_argument("--model", required=True, choices=["gemini", "claude"])
    parser.add_argument("--model-name", default=None, help="override default model name")
    parser.add_argument("--related", default="(ไม่มีข้อมูลเพิ่มเติม)")
    parser.add_argument(
        "--max-tokens", type=int, default=4096,
        help="output token limit ของ AI (default: 4096; ต้อง freeze ค่าเดียวกันในการทดลองจริง)",
    )
    parser.add_argument(
        "--temperature", type=float, default=0.2,
        help="sampling temperature (default: 0.2; ต้อง freeze ค่าเดียวกันในการทดลองจริง)",
    )
    args = parser.parse_args()

    targets = [args.class_name] if args.class_name else get_modified_classes(args.project, args.bug)
    print(f"TARGETS ({len(targets)}):")
    for target in targets:
        print(f"  - {target}")

    run_started = time.perf_counter()
    class_results = []
    failures = []

    for i, target in enumerate(targets, 1):
        print("\n" + "=" * 70)
        print(f"AI GENERATE {i}/{len(targets)}: {target}")
        print("=" * 70)
        try:
            result = generate_one(
                args.project, args.bug, target, args.model,
                args.model_name, args.related,
                max_tokens=args.max_tokens,
                temperature=args.temperature,
            )
            class_results.append(result)
            if result["generation_status"] != "success":
                failures.append((target, f"finish_reason={result.get('finish_reason')}"))
        except Exception as exc:
            failures.append((target, str(exc)))
            print(f"[FAILED] {target}: {exc}")

    total_elapsed_sec = round(time.perf_counter() - run_started, 2)
    successful_results = [
        r for r in class_results if r.get("generation_status") == "success"
    ]
    generated_count = sum(
        int(r.get("num_test_files_generated", 0)) for r in successful_results
    )

    generation_status = (
        "success" if len(successful_results) == len(targets) and targets else "failed"
    )

    model_folder = "Gemini" if args.model == "gemini" else "Claude"
    aggregate_dir = AI_RESULT_DIR / model_folder / "Result" / args.project / str(args.bug)
    aggregate_dir.mkdir(parents=True, exist_ok=True)
    aggregate_file = aggregate_dir / f"{args.project}_{args.bug}_result.json"

    # Aggregate schema ให้รูปแบบหลักสอดคล้องกับ Kex/EvoSuite benchmark result.
    aggregate_payload = {
        "project": args.project,
        "bug_id": str(args.bug),
        "tool": args.model,
        "status": generation_status,
        "generation_status": generation_status,
        "compile_result": "not_run",
        "elapsed_sec": total_elapsed_sec,
        "num_test_files_generated": generated_count,
        "target_classes": targets,
        "model_name": (
            successful_results[0].get("model_name") if successful_results else
            (args.model_name or DEFAULT_MODEL_NAME[args.model])
        ),
        "max_tokens": args.max_tokens,
        "temperature": args.temperature,
        "class_results": class_results,
        "failures": [
            {"class": target, "error": error}
            for target, error in failures
        ],
        "timestamp": datetime.now().isoformat(timespec="seconds"),
    }
    aggregate_file.write_text(
        json.dumps(aggregate_payload, indent=2, ensure_ascii=False) + "\n",
        encoding="utf-8",
    )

    print("\n" + "=" * 70)
    print(f"Generated: {generated_count}/{len(targets)} test files")
    print(f"Status: {generation_status}")
    print(f"Elapsed: {total_elapsed_sec}s")
    print(f"Result: {aggregate_file}")
    if failures:
        for target, error in failures:
            print(f"FAILED: {target}: {error}")
        return 2

    print(f"Output: {AI_RESULT_DIR / model_folder}")
    print("Next: evaluate generated tests with the shared buggy/fixed evaluator.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
