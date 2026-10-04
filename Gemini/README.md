# Gemini

ส่วนของ Generative AI test generation ด้วย **Gemini** — ให้โมเดลเขียน JUnit 4 test suite สำหรับ Target Modified Class ของแต่ละ bug แล้วนำไป compile / evaluate / วัด coverage ภายใต้ benchmark protocol เดียวกับเครื่องมืออื่น

```text
Gemini/
├── Prompt/     # prompt ที่ส่งไปจริง: <Project>/<BugID>/<Class>_<timestamp>.txt
├── Result/     # raw result / usage / metadata: <Project>/<BugID>/<Class>_<timestamp>.json
└── TestCode/   # generated tests: <Project>/<BugID>/<Class>Test.java
```

การแยก `Prompt` / `Result` / `TestCode` ทำให้ย้อนตรวจที่มาของ test ตัวหนึ่งได้ครบสาย: prompt → raw API result (token, finish reason, เวลา) → test code

---

## Configuration ที่ใช้

| รายการ | ค่า |
|---|---|
| Model | `gemini-3.7-flash` |
| ช่องทางเรียก | KKU IntelSphere API (`POST /chat/completions`, OpenAI-compatible) พร้อม API key rotation |
| `temperature` | 0.2 |
| `max_tokens` | 16,384 |
| HTTP request timeout | 300 วินาที |
| Delay ระหว่าง call | 1.5 วินาที |
| Prompt style | Markdown / plain structure (generic baseline template เดียวสำหรับทุก target) |
| Target | `classes.modified` ของแต่ละ bug (อ่าน source จาก Frozen Dataset ที่ `dataset/target_benchmark/`) |
| Output ที่ต้องการ | โค้ด Java ของ `<ClassName>Test.java` เท่านั้น ไม่มี markdown fence |

### Prompt Template (สรุป)

ตัวแปรที่แทนค่า: `{package_name}`, `{class_name}`, `{source_code}`, `{related_classes}`

ข้อกำหนดใน prompt:

1. JUnit 4 เท่านั้น (`org.junit.Test`, `org.junit.Assert`)
2. ครอบคลุม public method ทุกตัวอย่างน้อย 1 test case
3. มีทั้ง normal input, edge case (null, 0, ค่าติดลบ, string/array ว่าง) และกรณีที่ควร throw exception
4. ห้ามใช้ mocking framework — ทดสอบผ่าน public API จริง
5. ชื่อ test method สื่อความหมาย (`testMethodName_condition_expectedResult`)
6. ตอบเป็นโค้ด Java ที่คอมไพล์ได้จริงเท่านั้น

Prompt ฉบับเต็มอยู่ใน `scripts/ai_generate.py` (`GEMINI_TEMPLATE`) และภาคผนวก ก ของรายงาน PDF
ใช้ **generic baseline เดียวกันกับทุก bug** — ไม่มีการปรับ prompt เฉพาะ bug

---

## รูปแบบไฟล์

### `Result/<Project>/<BugID>/<Class>_<timestamp>.json`

| Field | ความหมาย |
|---|---|
| `project`, `bug_id`, `class`, `target_classes` | bug และ class ที่เป็นเป้าหมาย |
| `status` / `generation_status` | `success` หรือ `failed` (ผล **generation เท่านั้น** ไม่ใช่ผล compile/evaluation) |
| `finish_reason` | `stop` = จบปกติ, `length` = ถูกตัดเพราะถึง `max_tokens` (นับเป็น `failed`) |
| `compile_result` | `not_run` ในขั้น generation — compile ทำในขั้น evaluation |
| `elapsed_sec` | เวลาที่ใช้ต่อ API call |
| `model_requested`, `model_id`, `model_name` | โมเดลที่ใช้ |
| `max_tokens`, `temperature` | พารามิเตอร์ |
| `usage.prompt_tokens / completion_tokens / total_tokens` | token ที่ผู้ให้บริการรายงาน |
| `model_quota` | quota รายวันของ key ที่ใช้ |
| `prompt_file`, `test_file` | path ของ prompt และ test code |
| `timestamp` | `YYYYMMDD_HHMMSS` |

หมายเหตุ:
- อาจมี **หลายไฟล์ต่อ class** (timestamp ต่างกัน) เมื่อมี retry หรือรันซ้ำ — จึงมี prompt/result มากกว่าจำนวน bug
- `usage.total_tokens` ใช้ค่าที่ผู้ให้บริการรายงานโดยตรง ไม่ได้สมมติว่าเท่ากับ prompt + completion

---

## ผลการทดลอง (854 bugs)

### Generation

| Metric | ค่า |
|---|---:|
| API calls (unique) | 1,070 |
| API success | 1,050 |
| API failed / truncated (`finish_reason=length`) | 20 |
| **API Generation Success Rate** | **98.131%** |
| Bugs ที่มี TestCode ใช้งานได้ | 843 / 854 (98.712%) |
| เวลาเฉลี่ย / API call (success) | 37.46 วินาที (median 34.42) |

### Token

| Metric | ค่า |
|---|---:|
| Prompt tokens | 8,355,510 |
| Completion tokens | 4,870,455 |
| **Total tokens** | **14,918,091** |
| Avg / Median tokens ต่อ bug | 17,468.49 / 12,745 |
| Tokens ต่อ TestCode bug | 17,696.43 |
| Tokens ต่อ Evaluation Success | 30,758.95 |
| Tokens ต่อ Detected Bug | 266,394.48 |
| **Detected Bugs ต่อ 1M tokens** | **3.7538** |

### Evaluation, Coverage และ Fault Detection

| Metric | ค่า |
|---|---:|
| Evaluation Success | 485 / 854 (56.792%) |
| **Compile failed** | **358** (41.920%) |
| Missing | 11 |
| Candidate Tests | 29,285 |
| Bug-Revealing Tests | 82 |
| **Bugs Detected** | **56 / 854 (6.557%)** |
| FDR เฉพาะ Eval Success | **11.546%** |
| Coverage Success | 471 / 854 (55.152%) |
| Coverage Failed / Timeout / Missing | 371 / 1 / 11 |
| Mean / Median Line Coverage | 85.799% / 97.1% |
| Mean / Median Condition Coverage | 80.545% / 92.3% |
| Weighted Line / Condition Coverage | 81.081% / 72.676% |

**Common Set (เทียบกับเทคนิคอื่น):** Common Evaluation 200 bugs → detected 21 (10.5%) สูงสุด; Common Coverage 177 bugs → Mean Line 91.073%, Mean Condition 86.648% สูงสุด

### ผลรายโปรเจกต์ (Gemini)

| Project | Bugs | Eval Success | Detected | FDR (% ของ bugs) | Coverage Success | Mean Line (%) | Mean Condition (%) |
|---|---:|---:|---:|---:|---:|---:|---:|
| Chart | 26 | 17 | 7 | 26.923 | 17 | 97.712 | 92.963 |
| Cli | 39 | 34 | 2 | 5.128 | 34 | 17.524 | 16.774 |
| Closure | 174 | 54 | 4 | 2.299 | 45 | 75.584 | 66.064 |
| Codec | 18 | 17 | 5 | 27.778 | 17 | 95.929 | 89.294 |
| Collections | 28 | 22 | 5 | 17.857 | 22 | 95.927 | 93.232 |
| Compress | 47 | 32 | 4 | 8.511 | 32 | 89.550 | 86.575 |
| Csv | 16 | 12 | 0 | 0.000 | 12 | 99.208 | 94.800 |
| Gson | 18 | 12 | 2 | 11.111 | 12 | 87.783 | 88.373 |
| JacksonCore | 26 | 13 | 0 | 0.000 | 13 | 86.269 | 76.746 |
| JacksonDatabind | 110 | 35 | 3 | 2.727 | 35 | 93.729 | 89.309 |
| JacksonXml | 6 | 4 | 0 | 0.000 | 4 | 57.350 | 52.100 |
| Jsoup | 93 | 43 | 3 | 3.226 | 43 | 92.581 | 86.907 |
| JxPath | 22 | 9 | 0 | 0.000 | 9 | 59.889 | 55.533 |
| Lang | 61 | 50 | 7 | 11.475 | 50 | 95.218 | 91.080 |
| Math | 106 | 86 | 10 | 9.434 | 81 | 95.057 | 90.362 |
| Mockito | 38 | 27 | 1 | 2.632 | 27 | 96.215 | 86.571 |
| Time | 26 | 18 | 3 | 11.538 | 18 | 94.028 | 85.261 |

ข้อมูลที่มา: [`evaluation/final/project_summary.csv`](../evaluation/final/project_summary.csv), [`ai_token_summary.csv`](../evaluation/final/ai_token_summary.csv)

---

## วิธีรัน

รันภายใน Docker container (`/workspace`) และต้องมี API key ใน `.env` (ดู [`.env.example`](../.env.example))

```bash
# generation ทั้งหมด (Gemini ก่อน แล้วตามด้วย Claude) หรือเฉพาะ Gemini
python3 scripts/ai_benchmark_runner.py --model gemini --max-tokens 16384 --temperature 0.2
python3 scripts/ai_benchmark_runner.py --status      # ดูสถานะ key / progress
python3 scripts/ai_benchmark_runner.py --dry-run     # ตรวจรายการ target โดยไม่ยิง API

# generation รายคลาส (ตัวอย่าง)
python3 scripts/ai_generate.py --project Lang --bug 1 \
    --class org.apache.commons.lang3.StringUtils --model gemini

# Evaluation และ Coverage
python3 scripts/batch_evaluate.py --tool gemini
python3 scripts/run_coverage_benchmark.py --tool gemini --timeout 600
```

- ผล evaluation: `evaluation/gemini/<Project>/<BugID>/` ([`evaluation/README.md`](../evaluation/README.md))
- ผล coverage: `evaluation/coverage/gemini/<Project>/<BugID>/` ([`evaluation/coverage/README.md`](../evaluation/coverage/README.md))

---

## ข้อสังเกตและข้อจำกัด

- Generation สำเร็จเกือบทุก bug (98.7%) แต่ **compile ไม่ผ่าน 358 bugs (41.9%)** ทำให้ Eval Success เหลือ 56.8% — การสร้าง TestCode สำเร็จไม่ได้แปลว่า compile/evaluate ผ่าน
- เมื่อ evaluate ผ่านแล้ว Gemini ตรวจพบข้อบกพร่องได้ดีที่สุดในสี่เทคนิค (56 bugs) และ coverage สูงที่สุด
- Closure evaluate สำเร็จเพียง 54 จาก 174 bugs และ Math-84 ยัง timeout ที่ coverage 600 วินาที แม้ rerun แล้ว (เก็บเป็นผล `timeout` ตาม protocol)
- ผลขึ้นกับ model version, prompt, temperature และ API behavior รันเพียง 1 รอบ จึงอาจแปรปรวนเมื่อรันซ้ำ
