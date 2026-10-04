# Claude

ส่วนของ Generative AI test generation ด้วย **Claude** — ให้โมเดลเขียน JUnit 4 test suite สำหรับ Target Modified Class ของแต่ละ bug แล้วนำไป compile / evaluate / วัด coverage ภายใต้ benchmark protocol เดียวกับเครื่องมืออื่น

```text
Claude/
├── Prompt/     # prompt ที่ส่งไปจริง: <Project>/<BugID>/<Class>_<timestamp>.txt
├── Result/     # raw result / usage / metadata: <Project>/<BugID>/<Class>_<timestamp>.json
└── TestCode/   # generated tests: <Project>/<BugID>/<Class>Test.java
```

ตัวอย่าง:

```text
Claude/Prompt/Lang/1/NumberUtils_20260919_112201.txt
Claude/Result/Lang/1/NumberUtils_20260919_112201.json
Claude/TestCode/Lang/1/NumberUtilsTest.java
```

การแยก `Prompt` / `Result` / `TestCode` ทำให้ย้อนตรวจความสัมพันธ์ระหว่าง prompt, raw API result และ test code ของ Project/Bug เดียวกันได้

---

## Configuration ที่ใช้

| รายการ | ค่า |
|---|---|
| Model | `claude-sonnet-5` |
| ช่องทางเรียก | KKU IntelSphere API (`POST /chat/completions`, OpenAI-compatible) พร้อม API key rotation |
| `temperature` | 0.2 |
| `max_tokens` | 16,384 (call ทดลองช่วงแรก 11 ครั้งใช้ 4,096) |
| HTTP request timeout | 300 วินาที |
| Delay ระหว่าง call | 1.5 วินาที |
| Prompt style | XML tags: `<class_info>`, `<source_code>`, `<dependencies>`, `<requirements>`, `<output_format>` |
| Target | `classes.modified` ของแต่ละ bug (อ่าน source จาก Frozen Dataset ที่ `dataset/target_benchmark/`) |

### Prompt Template (สรุป)

ตัวแปรที่แทนค่า: `{package_name}`, `{class_name}`, `{source_code}`, `{related_classes}`

ข้อกำหนดใน `<requirements>`:

1. JUnit 4 เท่านั้น (`org.junit.Test`, `org.junit.Assert`, `org.junit.Before` ถ้าจำเป็น)
2. ครอบคลุม public method ทุกตัวอย่างน้อย 1 test case ต่อ method
3. มี normal / edge case (null, 0, ค่าติดลบ, string ว่าง, boundary) / exception case
4. ห้ามใช้ mocking framework — ทดสอบผ่าน public API จริง
5. ชื่อ test method รูปแบบ `testMethodName_condition_expectedResult`
6. ห้าม import class ที่ไม่มีจริงหรือเดา API — ถ้าข้อมูล dependency ไม่พอให้ระบุเป็น comment

`<output_format>`: ตอบเฉพาะโค้ด Java ที่คอมไพล์ได้ ไม่มีคำอธิบายหรือ markdown fence

Prompt ฉบับเต็มอยู่ใน `scripts/ai_generate.py` (`CLAUDE_TEMPLATE`) และภาคผนวก ก ของรายงาน PDF
ใช้ **generic baseline เดียวกันกับทุก bug** — ไม่มีการปรับ prompt เฉพาะ bug

---

## รูปแบบไฟล์

### `Result/<Project>/<BugID>/<Class>_<timestamp>.json`

| Field | ความหมาย |
|---|---|
| `project`, `bug_id`, `class`, `target_classes` | bug และ class ที่เป็นเป้าหมาย |
| `status` / `generation_status` | `success` หรือ `failed` (ผล **generation เท่านั้น** ไม่ใช่ผล compile/evaluation) |
| `finish_reason` | `stop` = จบปกติ, `length` = ถูกตัดเพราะถึง `max_tokens` (นับเป็น `failed` และไม่มี `test_file`) |
| `compile_result` | `not_run` ในขั้น generation — compile ทำในขั้น evaluation |
| `elapsed_sec` | เวลาที่ใช้ต่อ API call |
| `model_requested`, `model_id`, `model_name` | โมเดลที่ใช้ |
| `max_tokens`, `temperature` | พารามิเตอร์ |
| `usage.prompt_tokens / completion_tokens / total_tokens` | token ที่ผู้ให้บริการรายงาน |
| `model_quota` | quota รายวันของ key ที่ใช้ |
| `prompt_file`, `test_file` | path ของ prompt และ test code |
| `timestamp` | `YYYYMMDD_HHMMSS` |

หมายเหตุ:
- อาจมี **หลายไฟล์ต่อ class** (timestamp ต่างกัน) เมื่อมี retry หรือรันซ้ำ
- บาง bug จากการรันช่วงแรก (เช่น `Lang/1/Lang_1_result.json`) มีไฟล์สรุประดับ bug (`<Project>_<BugID>_result.json`) ที่รวม `class_results` — ไม่ใช่ทุก bug ที่มีไฟล์นี้ (พบ 18 ไฟล์)
- `usage.total_tokens` ใช้ค่าที่ผู้ให้บริการรายงานโดยตรง ไม่ได้สมมติว่าเท่ากับ prompt + completion

---

## ผลการทดลอง (854 bugs)

### Generation

| Metric | ค่า |
|---|---:|
| API calls (unique) | 1,087 |
| API success | 600 |
| API failed / truncated (`finish_reason=length`) | **487** |
| **API Generation Success Rate** | **55.198%** |
| Bugs ที่มี TestCode ใช้งานได้ | 523 / 854 (61.241%) |
| เวลาเฉลี่ย / API call (success) | 68.45 วินาที (median 67.08) |

### Token

| Metric | ค่า |
|---|---:|
| Prompt tokens | 12,676,098 |
| Completion tokens | 13,278,358 |
| **Total tokens** | **25,954,456** |
| Avg / Median tokens ต่อ bug | 30,391.63 / 23,691 |
| Tokens ต่อ TestCode bug | 49,626.11 |
| Tokens ต่อ Evaluation Success | 80,603.90 |
| Tokens ต่อ Detected Bug | 1,366,024.00 |
| **Detected Bugs ต่อ 1M tokens** | **0.7321** |

### Evaluation, Coverage และ Fault Detection

| Metric | ค่า |
|---|---:|
| Evaluation Success | 322 / 854 (37.705%) |
| Compile failed | 201 (23.536%) |
| Missing (ไม่มี TestCode) | 331 (38.759%) |
| Candidate Tests | 26,390 |
| Bug-Revealing Tests | 45 |
| **Bugs Detected** | **19 / 854 (2.225%)** |
| FDR เฉพาะ Eval Success | 5.901% |
| Coverage Success | 321 / 854 (37.588%) |
| Coverage Failed / Missing | 202 / 331 |
| Mean / Median Line Coverage | 79.626% / 94.6% |
| Mean / Median Condition Coverage | 71.613% / 85.05% |
| Weighted Line / Condition Coverage | 64.836% / 53.417% |

**Common Set (เทียบกับเทคนิคอื่น):** Common Evaluation 200 bugs → detected 15 (7.5%), Bug-Revealing Tests 39 (สูงสุดในกลุ่ม); Common Coverage 177 bugs → Mean Line 87.854%, Mean Condition 80.814%, Weighted Line 86.473% (สูงสุด)

### ผลรายโปรเจกต์ (Claude)

| Project | Bugs | มี TestCode | Eval Success | Detected | Coverage Success | Mean Line (%) | Mean Condition (%) |
|---|---:|---:|---:|---:|---:|---:|---:|
| Chart | 26 | 18 | 13 | 1 | 13 | 96.123 | 87.442 |
| Cli | 39 | 35 | 20 | 0 | 20 | 18.885 | 17.435 |
| Closure | 174 | 37 | 18 | 0 | 18 | 54.839 | 43.978 |
| Codec | 18 | 15 | 7 | 1 | 7 | 84.286 | 81.986 |
| Collections | 28 | 23 | 18 | 2 | 18 | 96.361 | 92.439 |
| Compress | 47 | 33 | 16 | 2 | 16 | 85.138 | 81.006 |
| Csv | 16 | 13 | 4 | 0 | 4 | 100.000 | 98.875 |
| Gson | 18 | 14 | 9 | 0 | 9 | 86.567 | 78.311 |
| JacksonCore | 26 | 15 | 11 | 1 | 11 | 73.764 | 63.055 |
| JacksonDatabind | 110 | 59 | 36 | 0 | 36 | 66.406 | 55.364 |
| JacksonXml | 6 | 3 | 1 | 0 | 1 | 75.600 | 67.200 |
| Jsoup | 93 | 80 | 52 | 2 | 51 | 91.445 | 82.159 |
| JxPath | 22 | 7 | 4 | 0 | 4 | 15.025 | 11.475 |
| Lang | 61 | 39 | 25 | 2 | 25 | 94.656 | 89.020 |
| Math | 106 | 82 | 53 | 6 | 53 | 89.632 | 83.060 |
| Mockito | 38 | 28 | 18 | 1 | 18 | 83.822 | 66.231 |
| Time | 26 | 22 | 17 | 1 | 17 | 85.453 | 74.818 |

ข้อมูลที่มา: [`evaluation/final/project_summary.csv`](../evaluation/final/project_summary.csv) (คอลัมน์ "มี TestCode" = `evaluation_available`), [`ai_token_summary.csv`](../evaluation/final/ai_token_summary.csv)

---

## วิธีรัน

รันภายใน Docker container (`/workspace`) และต้องมี API key ใน `.env` (ดู [`.env.example`](../.env.example))

```bash
python3 scripts/ai_benchmark_runner.py --model claude --max-tokens 16384 --temperature 0.2
python3 scripts/ai_benchmark_runner.py --status      # ดูสถานะ key / progress
python3 scripts/ai_benchmark_runner.py --dry-run     # ตรวจรายการ target โดยไม่ยิง API

# generation รายคลาส (ตัวอย่าง)
python3 scripts/ai_generate.py --project Lang --bug 1 \
    --class org.apache.commons.lang3.math.NumberUtils --model claude

# Evaluation และ Coverage
python3 scripts/batch_evaluate.py --tool claude
python3 scripts/run_coverage_benchmark.py --tool claude --timeout 600
```

- ผล evaluation: `evaluation/claude/<Project>/<BugID>/` ([`evaluation/README.md`](../evaluation/README.md))
- ผล coverage: `evaluation/coverage/claude/<Project>/<BugID>/` ([`evaluation/coverage/README.md`](../evaluation/coverage/README.md))

---

## ข้อสังเกตและข้อจำกัด

- **ปัญหาหลักคือ output ถูกตัด:** 487 จาก 1,087 calls (44.8%) จบด้วย `finish_reason=length` เพราะชน `max_tokens=16384` จึงไม่มี TestCode ถึง 331 bugs — โดยเฉพาะ Closure (มี TestCode เพียง 37 จาก 174 bugs)
- เมื่อ generation สำเร็จ คุณภาพของ tests สูง: Mean Line Coverage 79.6% และ FDR 5.9% ในกลุ่มที่ evaluate สำเร็จ
- ใช้ token รวมมากกว่า Gemini ประมาณ 1.7 เท่า (25.95M vs 14.92M) และมีประสิทธิภาพ Detected Bugs ต่อ 1M tokens ต่ำกว่า (0.7321 vs 3.7538)
- ผลขึ้นกับ model version, prompt, `max_tokens` และ API behavior รันเพียง 1 รอบ — การเพิ่ม `max_tokens` หรือใช้ continuation อาจเปลี่ยนผลอย่างมีนัยสำคัญ (ยังไม่ได้ทดลอง)
