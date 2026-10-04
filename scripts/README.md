# Scripts

scripts ทั้งหมดของ pipeline: **เตรียม dataset → สร้าง test (4 เทคนิค) → evaluate → วัด coverage → รวมผล → สร้างกราฟ**

สคริปต์ส่วนใหญ่ออกแบบให้รัน **ภายใน Docker container** (repository อยู่ที่ `/workspace`, ดู [`docker/README.md`](../docker/README.md))

```text
scripts/
├── build_target_benchmark.py     # สร้าง Frozen Target Dataset
├── dataset_audit.py              # ตรวจสอบ dataset
├── extract_catalog.py            # สกัด catalog แบบเบา (ไม่ checkout)
├── run_benchmark.py              # generation: EvoSuite/DynaMOSA และ KEX/Reanimator
├── ai_generate.py                # generation: Gemini/Claude (รายคลาส)
├── ai_benchmark_runner.py        # generation: Gemini/Claude (ทั้ง benchmark)
├── key_manager.py                # API key rotation (ใช้โดย ai_benchmark_runner.py)
├── evaluate_tests.py             # evaluation 1 case: buggy/fixed + classification
├── batch_evaluate.py             # evaluation เป็น batch
├── evaluate_coverage.py          # coverage 1 case
├── run_coverage_benchmark.py     # coverage เป็น batch
├── aggregate_results.py          # รวมผล 4 เทคนิค → evaluation/final/
├── aggregate_ai_tokens.py        # รวมผล token ของ AI → evaluation/final/
├── generate_final_charts.py      # กราฟ 01–04
└── generate_ai_token_charts.py   # กราฟ 05–08
```

## ลำดับการรันทั้ง pipeline

| ขั้น | คำสั่ง | ผลลัพธ์ |
|---|---|---|
| 0. เตรียม dataset | `build_target_benchmark.py --all --resume` → `--verify` → `dataset_audit.py` | `dataset/benchmark_targets.csv`, `dataset/target_benchmark/` |
| 1a. Generate (algorithm) | `run_benchmark.py --all-bugs --tool evosuite --resume` และ `--tool kex` | `DynaMOSA-EvoSuite/`, `Reanimator-Kex/` |
| 1b. Generate (AI) | `ai_benchmark_runner.py --model all` | `Gemini/`, `Claude/` |
| 2. Evaluate | `batch_evaluate.py --tool <evosuite\|kex\|gemini\|claude>` | `evaluation/<tool>/` |
| 3. Coverage | `run_coverage_benchmark.py --tool <...> --timeout 600` | `evaluation/coverage/<tool>/` |
| 4. Aggregate | `aggregate_results.py`, `aggregate_ai_tokens.py` | `evaluation/final/*.csv` |
| 5. Charts | `generate_final_charts.py`, `generate_ai_token_charts.py` | `evaluation/final/charts/` |

---

## Test generation

### `run_benchmark.py`

Universal Benchmark Runner สำหรับ **KEX/Reanimator** และ **EvoSuite/DynaMOSA**

| Flag | ความหมาย |
|---|---|
| `--project X --bug N` | รันบั๊กเดียว |
| `--sample-17` | ตัวแทนโปรเจกต์ละ 1 บั๊ก |
| `--all-bugs` | ทุก active bug ของทั้ง 17 projects |
| `--resume` | ข้ามงานที่ทำแล้ว (อ่านจาก `progress.json`; success / timeout / failed ถูกข้ามหมด) |
| `--tool {kex,evosuite}` | เครื่องมือ (default `kex`) |

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
python3 scripts/run_benchmark.py --sample-17 --tool kex
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume
```

- checkout / compile Defects4J และดึง `classes.modified` เป็น target classes
- **EvoSuite:** `gen_tests.pl -g evosuite ... -b 300` (budget 300 วินาที/bug, process timeout +180 วินาที)
- **KEX:** `kex.py --mode concolic` ต่อ target class, timeout 300 วินาที
- สถานะแต่ละ task: `success` / `failed` / `timeout`
- เขียนผลไปที่ `<DynaMOSA-EvoSuite|Reanimator-Kex>/Result_Round2/` (`<Project>/<Project>_<Bug>_result.json` และ `summary.csv`) และ copy generated tests ไป `TestCode/`
- ไฟล์ทำงานชั่วคราว (checkouts, logs, `progress.json`) อยู่ที่ `~/kex-testing` (= volume `kex_home_data` ใน Docker)
- กำหนด repository path เป็น `/workspace` สำหรับ Docker environment

### `ai_generate.py`

สร้าง test ด้วย Gemini/Claude **ทีละคลาส** ผ่าน KKU IntelSphere API (OpenAI-compatible endpoint เดียวสำหรับทั้งสองโมเดล) — แทนค่าตัวแปรใน prompt template (`{package_name}`, `{class_name}`, `{source_code}`, `{related_classes}`) แล้วบันทึก prompt, raw result (JSON) และ test code

| Flag | ความหมาย |
|---|---|
| `--project`, `--bug` | **จำเป็น** — project และ bug id |
| `--class` | fully-qualified class name (target class) — ถ้าไม่ระบุจะใช้ `classes.modified` ของ bug จาก Defects4J อัตโนมัติ |
| `--model {gemini,claude}` | **จำเป็น** |
| `--model-name` | override ชื่อโมเดล (default: `gemini-3.7-flash` / `claude-sonnet-5`) |
| `--related` | ข้อมูล dependency ที่เกี่ยวข้อง (default: "ไม่มีข้อมูลเพิ่มเติม") |
| `--max-tokens`, `--temperature` | output token limit (default 16384) / temperature (default 0.2) |

```bash
export KKU_API_KEY="<your-key>"
python3 scripts/ai_generate.py --project Lang --bug 1 --class org.apache.commons.lang3.math.NumberUtils --model gemini
python3 scripts/ai_generate.py --project Lang --bug 1 --class org.apache.commons.lang3.math.NumberUtils --model claude
```

ค่าตั้งต้น: `temperature=0.2`, `max_tokens=16384` · เก็บผลที่ `Gemini/` หรือ `Claude/` (`Prompt/`, `Result/`, `TestCode/`)

### `ai_benchmark_runner.py`

รัน AI generation ครบทั้ง **Frozen Dataset** (`dataset/benchmark_targets.csv`) — ใช้ `ai_generate.py` และ `key_manager.py`

- รันตามลำดับ: **Gemini ครบทุก target ก่อน แล้วจึงตามด้วย Claude** (หรือเลือกเฉพาะโมเดล)
- ข้าม target ที่ไม่มี source (`SOURCE_NOT_FOUND`) อัตโนมัติ
- สลับ API key อัตโนมัติเมื่อ quota ประจำวันหมด; ถ้า Gemini หมด quota ทุก key จะสลับไปรัน Claude ต่อ
- บันทึก progress ที่ `logs/ai_runner_progress.json` — รันต่อข้ามวันได้ (resume)
- **ต้องมี `dataset/target_benchmark/`** (สร้างด้วย `build_target_benchmark.py`)

| Flag | ความหมาย |
|---|---|
| `--model {all,gemini,claude}` | โมเดลที่รัน (default `all`) |
| `--project`, `--bug` | กรองเฉพาะโปรเจกต์ / bug |
| `--sample-17` | ทดสอบ 17 โปรเจกต์ อย่างละ 1 บั๊ก |
| `--limit N` | จำกัดจำนวน target (สำหรับทดสอบ) |
| `--delay S` | หน่วงเวลาระหว่าง API call (default 1.5 วินาที) |
| `--max-tokens N` | max tokens (default 16384) |
| `--temperature T` | temperature (default 0.2) |
| `--dry-run` | จำลองการทำงาน ไม่เรียก API จริง |
| `--force` | บังคับรันซ้ำแม้เคย generate แล้ว |
| `--status` | แสดงสถานะ key และ progress แล้วออก |

```bash
python3 scripts/ai_benchmark_runner.py --dry-run
python3 scripts/ai_benchmark_runner.py --status
python3 scripts/ai_benchmark_runner.py --model all --max-tokens 16384 --temperature 0.2
```

### `key_manager.py`

ระบบจัดการและสลับ KKU IntelSphere API keys (Key Rotation) — โหลด key จาก `.env` (`KKU_API_KEY_1`, `KKU_API_KEY_2`, ... หรือ `KKU_API_KEY`), ติดตามการใช้ token แยกตาม key และโมเดล, สลับ key เมื่อ quota ประจำวันหมด, ตรวจการรีเซ็ต quota ข้ามวัน และบันทึกสถานะที่ `logs/key_usage_state.json`
ไม่ได้รันโดยตรง — ถูก import โดย `ai_benchmark_runner.py` (ดู [`.env.example`](../.env.example))

---

## Dataset

### `build_target_benchmark.py`

สร้างและตรวจสอบ **Frozen Benchmark Target Dataset** — ดึง active bugs และ `classes.modified` จาก Defects4J, checkout buggy version ชั่วคราว (`/tmp/project_sqa_target_extract/`) แล้วเก็บ source snapshot ไว้ที่ `dataset/target_benchmark/<Project>_<Bug>b/` พร้อมสร้าง `dataset/benchmark_targets.csv` (1 แถวต่อ 1 target class)

| Flag | ความหมาย |
|---|---|
| `--project X --bug N` | สกัดเฉพาะ bug เดียว (pilot) |
| `--sample-17` | สกัดตัวแทนโปรเจกต์ละ 1 บั๊ก |
| `--all` | สกัดทุก active bugs ของ 17 projects |
| `--resume` | ข้าม bug ที่สกัดเสร็จแล้ว |
| `--verify` | ตรวจความสมบูรณ์และ integrity ของ dataset |
| `--defects4j-home`, `--output-dir`, `--csv-file`, `--temp-dir` | override path |

### `dataset_audit.py`

Audit Frozen Target Dataset ก่อนเริ่ม full benchmark: ครบ 17 projects / 854 active bugs, 1,073 target entries, ไม่มี duplicate `(Project, Bug_ID, Target_Class)`, สถานะ source (1,070 OK / 3 `SOURCE_NOT_FOUND`), แจกแจงตามโปรเจกต์ และยืนยัน selection rules (Java runnable targets = 1,067)

### `extract_catalog.py`

สกัด metadata ของทุกบั๊ก (Project, Bug ID, Target Class) จากไฟล์ `framework/projects/<Project>/modified_classes/<BugID>.src` ในตัว Defects4J **โดยไม่ต้อง checkout** — ได้ `target_benchmark/catalog_all.json` และ `target_benchmark/<Project>/catalog.json` (โฟลเดอร์นี้ถูก `.gitignore`)

```bash
python3 scripts/extract_catalog.py
```

---

## Evaluation และ Coverage

### `evaluate_tests.py`

evaluate generated tests ของ 1 Project/Bug/Tool: checkout + compile buggy และ fixed, compile generated tests, รันทีละ test method บนทั้งสอง version แล้วจำแนกเป็น `bug_revealing` / `valid_non_revealing` / `invalid_or_unstable` / `fixed_regression_or_unstable` / `timeout_or_other` — เขียน `summary.json`, `tests.csv`, `compile_error.txt` ไปที่ `evaluation/<tool>/<Project>/<BugID>/`

| Flag | ความหมาย |
|---|---|
| `--project`, `--bug` | Defects4J project / bug id |
| `--tool {kex,evosuite,gemini,claude}` | เครื่องมือ |
| `--timeout N` | timeout ต่อ test ต่อ version (วินาที, default 15) |

### `batch_evaluate.py`

รัน `evaluate_tests.py` ทุก case ของ tool ที่เลือก พร้อม resume และ progress logging

| Flag | ความหมาย |
|---|---|
| `--tool {gemini,claude,evosuite,kex}` | เครื่องมือ (default `gemini`) |
| `--project`, `--bug` | กรองเฉพาะโปรเจกต์ / bug |
| `--timeout N` | timeout ต่อ test (default 15) |
| `--limit N` | จำกัดจำนวน target |
| `--force` | evaluate ซ้ำแม้เคย evaluate แล้ว |
| `--dry-run` | แสดงเฉพาะรายการที่จะรัน |

```bash
python3 scripts/batch_evaluate.py --tool gemini
python3 scripts/batch_evaluate.py --tool gemini --project Lang --dry-run
```

### `evaluate_coverage.py`

วัด coverage ของ 1 Project/Bug/Tool ด้วย `defects4j coverage -s` บน buggy version แล้วเขียนผลลง `evaluation/coverage/<tool>/<Project>/<BugID>/`

| Flag | ความหมาย |
|---|---|
| `--project`, `--bug` | Defects4J project / bug id |
| `--tool {evosuite,kex,gemini,claude}` | เครื่องมือ (default `evosuite`) |
| `--timeout N` | timeout ของ `defects4j coverage` (default 600 วินาที) |

### `run_coverage_benchmark.py`

batch runner ของ coverage สำหรับทั้ง 4 เทคนิค — evosuite/kex อ่านผล generation จาก `Result_Round2` และเลือก `status == "success"`; gemini/claude อ่านจาก `TestCode/`

| Flag | ความหมาย |
|---|---|
| `--tool {evosuite,kex,gemini,claude}` | เครื่องมือ |
| `--timeout N` | timeout ส่งต่อให้ `evaluate_coverage.py` (default 600) |
| `--rerun` | รัน case ที่มี `summary.json` แล้วซ้ำ |
| `--limit N` | จำกัดจำนวน pending cases |

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

---

## Aggregation และกราฟ

สคริปต์เหล่านี้ไม่มี argument — อ่านจาก `evaluation/` และเขียนไป `evaluation/final/`

| Script | อ่าน | เขียน |
|---|---|---|
| `aggregate_results.py` | `evaluation/<tool>/`, `evaluation/coverage/`, `*/Result_Round2/` | `master_results.csv` (3,416 แถว), `technique_summary.csv`, `project_summary.csv`, `evaluation_status_counts.csv`, `coverage_status_counts.csv`, `common_evaluation_summary.csv`, `common_coverage_summary.csv` |
| `aggregate_ai_tokens.py` | `Gemini/Result`, `Claude/Result`, `*/TestCode` | `ai_token_per_bug.csv`, `ai_token_summary.csv`, `ai_token_common_summary.csv` |
| `generate_final_charts.py` | `technique_summary.csv`, `common_*_summary.csv` | `charts/01–04_*.png` |
| `generate_ai_token_charts.py` | `ai_token_common_summary.csv` | `charts/ai_token/05–08_*.png` |

- `aggregate_results.py` กัน KEX coverage ของ **Lang-1 และ Math-1** (diagnostic) ออกจากผลสรุปหลัก แต่ยังเก็บไว้ใน `master_results.csv`
- สคริปต์สร้างกราฟต้องใช้ `matplotlib` (ไม่ได้ติดตั้งใน Docker image — `pip3 install matplotlib`)
- ค่า `total_tokens` ใช้ค่าที่ผู้ให้บริการรายงานโดยตรง ไม่สมมติว่าเท่ากับ prompt + completion

---

## หมายเหตุ

- scripts ใช้ path `/workspace` (repository) และ `/root/kex-testing` (checkouts) ที่ hard-code ไว้สำหรับ Docker environment — หากรันนอก Docker ต้องแก้ค่า `REPO_DIR` / `BASE_DIR` ในสคริปต์
- ห้าม commit `.env` — ใช้ `.env.example` เป็นแม่แบบ
