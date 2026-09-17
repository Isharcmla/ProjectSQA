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
from pathlib import Path
from datetime import datetime

BASE_DIR = Path.home() / "kex-testing"          # ใช้โฟลเดอร์ checkout ร่วมกับสาย Kex
AI_RESULT_DIR = Path.home() / "ai-results"

KKU_API_BASE = "https://gen.ai.kku.ac.th/api/v1"
KKU_API_KEY = os.environ.get("KKU_API_KEY")

for d in (AI_RESULT_DIR / "Gemini/Prompt", AI_RESULT_DIR / "Gemini/Result", AI_RESULT_DIR / "Gemini/TestCode",
          AI_RESULT_DIR / "Claude/Prompt", AI_RESULT_DIR / "Claude/Result", AI_RESULT_DIR / "Claude/TestCode"):
    d.mkdir(parents=True, exist_ok=True)


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
    """เรียก POST /chat/completions (OpenAI-compatible) ใช้ได้ทั้ง Gemini และ Claude
    เพราะ KKU IntelSphere รวมทุกโมเดลไว้ใน endpoint เดียว
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

    text = data["choices"][0]["message"]["content"]
    quota = data.get("model_quota", {})
    usage = data.get("usage", {})
    return text, quota, usage


# ---------- Source code extraction ----------

def get_source_code(project, bug_id, class_name):
    """ดึง source code จริงจาก Defects4J checkout (ต้อง checkout ไว้ก่อนแล้วผ่าน run_benchmark.py)"""
    work_dir = BASE_DIR / "checkouts" / f"{project}_{bug_id}_buggy"
    if not work_dir.exists():
        raise FileNotFoundError(
            f"ยังไม่ได้ checkout {project}-{bug_id} — รัน run_benchmark.py --project {project} --bug {bug_id} ก่อน"
        )

    class_path = class_name.replace(".", "/") + ".java"
    matches = list(work_dir.rglob(Path(class_path).name))
    if not matches:
        raise FileNotFoundError(f"ไม่พบไฟล์ {class_path} ใน {work_dir}")

    with open(matches[0], "r", encoding="utf-8", errors="ignore") as f:
        return f.read()


def build_prompt(model, package_name, class_name, source_code, related_classes="(ไม่มีข้อมูลเพิ่มเติม)"):
    template = GEMINI_TEMPLATE if model == "gemini" else CLAUDE_TEMPLATE
    return template.format(
        package_name=package_name,
        class_name=class_name,
        source_code=source_code,
        related_classes=related_classes,
    )


def main():
    parser = argparse.ArgumentParser(description="AI Test Generation Script (ผ่าน KKU IntelSphere API)")
    parser.add_argument("--project", required=True, help="เช่น Lang")
    parser.add_argument("--bug", required=True, help="เช่น 1")
    parser.add_argument("--class", dest="class_name", required=True,
                         help="Fully qualified class name เช่น org.apache.commons.lang3.StringUtils")
    parser.add_argument("--model", required=True, choices=["gemini", "claude"],
                         help="เลือกใช้ Gemini หรือ Claude (ทั้งคู่เรียกผ่าน endpoint เดียวกันของ KKU)")
    parser.add_argument("--model-name", default=None,
                         help="ระบุชื่อโมเดลเจาะจง (override ค่า default ของกลุ่ม) "
                              "ค่า default: gemini -> gemini-3.7-flash, claude -> claude-sonnet-5")
    parser.add_argument("--related", default="(ไม่มีข้อมูลเพิ่มเติม)", help="Dependency signature เพิ่มเติมถ้ามี")
    args = parser.parse_args()

    package_name = ".".join(args.class_name.split(".")[:-1])
    simple_class_name = args.class_name.split(".")[-1]

    print(f"[1/5] ดึง source code ของ {args.class_name} จาก {args.project}-{args.bug} ...")
    source_code = get_source_code(args.project, args.bug, args.class_name)

    print(f"[2/5] สร้าง Prompt สำหรับ {args.model} ...")
    prompt = build_prompt(args.model, package_name, simple_class_name, source_code, args.related)

    model_folder = "Gemini" if args.model == "gemini" else "Claude"
    timestamp = datetime.now().strftime("%Y%m%d_%H%M%S")
    prompt_file = AI_RESULT_DIR / model_folder / "Prompt" / f"{args.project}_{args.bug}_{simple_class_name}_{timestamp}.txt"
    with open(prompt_file, "w", encoding="utf-8") as f:
        f.write(prompt)
    print(f"      บันทึก prompt ที่ {prompt_file}")

    print(f"[3/5] ค้นหา model id จาก KKU IntelSphere API ...")
    search_name = args.model_name if args.model_name else DEFAULT_MODEL_NAME[args.model]
    model_id, model_name = find_model_id(search_name)
    print(f"      ใช้โมเดล: {model_name} (id={model_id})")

    print(f"[4/5] ยิง prompt ไปยัง KKU IntelSphere API ...")
    result_text, quota, usage = call_kku_api(model_id, prompt)

    print(f"[5/5] บันทึกผลลัพธ์ ...")
    test_file = AI_RESULT_DIR / model_folder / "TestCode" / f"{simple_class_name}Test.java"
    with open(test_file, "w", encoding="utf-8") as f:
        f.write(result_text)

    result_log = AI_RESULT_DIR / model_folder / "Result" / f"{args.project}_{args.bug}_{simple_class_name}_{timestamp}.json"
    with open(result_log, "w", encoding="utf-8") as f:
        json.dump({
            "project": args.project, "bug": args.bug, "class": args.class_name,
            "model_requested": args.model, "model_id": model_id, "model_name": model_name,
            "prompt_file": str(prompt_file), "test_file": str(test_file),
            "usage": usage, "model_quota": quota,
            "timestamp": timestamp,
        }, f, indent=2, ensure_ascii=False)

    print(f"\nเสร็จสิ้น! Test code อยู่ที่: {test_file}")
    if quota:
        print(f"Token คงเหลือวันนี้: {quota.get('daily_remaining_tokens', '?')}/{quota.get('daily_quota_tokens', '?')}")
    print(f"ขั้นตอนถัดไป: นำไฟล์นี้ไปวางใน source tree ของ Defects4J แล้วรัน defects4j compile + coverage")


if __name__ == "__main__":
    main()
