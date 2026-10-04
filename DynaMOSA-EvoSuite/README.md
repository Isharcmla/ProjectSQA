# DynaMOSA – EvoSuite

ส่วนของ automatic test generation ด้วย **DynaMOSA** (Dynamic Many-Objective Sorting Algorithm — search-based, many-objective genetic algorithm) ผ่านเครื่องมือ **EvoSuite** ที่มากับ Defects4J

```text
DynaMOSA-EvoSuite/
├── Code/               # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Configuration/      # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Generation_Audit/   # testcode_sha256.txt
├── Result_Round1/      # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Result_Round2/      # ผล generation หลัก: <Project>/<Project>_<Bug>_result.json + summary.csv
└── TestCode/           # Generated JUnit tests: <Project>/*_ESTest.java
```

| โฟลเดอร์ | เนื้อหา |
|---|---|
| `Code/`, `Configuration/` | ยังไม่มีไฟล์ — การตั้งค่าจริงอยู่ที่ [`docker/Dockerfile`](../docker/README.md) (`evosuite.config`) และ [`scripts/run_benchmark.py`](../scripts/README.md) |
| `Generation_Audit/` | `testcode_sha256.txt` — SHA-256 ของไฟล์ใน `TestCode/` เพื่อตรวจว่า generated tests ไม่ถูกแก้ไขหลัง generation |
| `Result_Round1/` | ยังไม่มีข้อมูล (สงวนไว้สำหรับผลรอบก่อนหน้า) |
| `Result_Round2/` | ผล generation รอบหลักของ **ทั้ง 854 bugs** (`<Project>/<Project>_<BugID>_result.json`) และ `summary.csv` |
| `TestCode/` | generated tests แยกตาม Project |

---

## Configuration ที่ใช้

| รายการ | ค่า |
|---|---|
| Algorithm | `DYNAMOSA` (ตั้ง `-Dalgorithm=DYNAMOSA` ใน `evosuite.config` ของ Defects4J ตอน build image) |
| EvoSuite runtime | `evosuite-standalone-runtime-1.1.0.jar` (มากับ Defects4J) |
| Generator | Defects4J `gen_tests.pl -g evosuite -p <Project> -v <Bug>b -n 1 -o <out> -b 300 -c <target_classes_file>` |
| Search budget | **300 วินาที / bug** (ทุก target class ของ bug รวมกัน) |
| Process timeout | budget + grace period 180 วินาที (สำหรับ checkout / compile / archive) |
| Target | `classes.modified` ของแต่ละ bug บน buggy version (`<id>b`) |
| รอบการรัน | 1 รอบต่อ bug (ไม่ได้รันซ้ำหลาย seed) |
| Java / Timezone | OpenJDK 11 / `America/Los_Angeles` |

Generation จะถือว่า **success** เมื่อ tool ทำงานสำเร็จและพบ generated test files อย่างน้อย 1 ไฟล์

---

## รูปแบบไฟล์

### `TestCode/`

```text
TestCode/<Project>/<Project>_<BugID>_<ClassName>_ESTest.java
TestCode/<Project>/<Project>_<BugID>_<ClassName>_ESTest_scaffolding.java
```

- `*_ESTest.java` — test class ที่ EvoSuite สร้าง
- `*_ESTest_scaffolding.java` — scaffolding class (setup/teardown, sandbox) ที่ test class ต้องใช้ ไม่ใช่ candidate test
- ต้องใช้ EvoSuite runtime jar ตอน compile/run (evaluator จัดการให้อัตโนมัติ)

### `Result_Round2/<Project>/<Project>_<BugID>_result.json`

```json
{
  "project": "Chart",
  "bug_id": "10",
  "tool": "evosuite",
  "elapsed_sec": 28.29,
  "target_classes": ["org.jfree.chart.imagemap.StandardToolTipTagFragmentGenerator"],
  "evosuite_result": "success",
  "num_test_files_generated": 2,
  "status": "success"
}
```

| Field | ความหมาย |
|---|---|
| `status` | `success` / `failed` / `timeout` (สถานะ generation) |
| `elapsed_sec` | เวลา generation ทั้ง bug (วินาที) |
| `target_classes` | classes ที่เป็นเป้าหมาย (`classes.modified`) |
| `num_test_files_generated` | จำนวนไฟล์ Java ที่สร้าง (นับรวม scaffolding) |

### `Result_Round2/summary.csv`

หนึ่งแถวต่อหนึ่ง bug (854 แถว) คอลัมน์: `project, bug_id, status, num_test_files_generated, elapsed_sec, timestamp`

---

## ผลการทดลอง (854 bugs)

### Generation

| Metric | ค่า |
|---|---:|
| Bugs ทั้งหมด | 854 |
| Generation `success` | 833 |
| Generation `failed` | 19 |
| Generation `timeout` | 2 |
| เวลาเฉลี่ย / bug (เฉพาะ success) | 167.81 วินาที |
| เวลามัธยฐาน / bug | 180.08 วินาที |
| จำนวนไฟล์ test ที่สร้างรวม (ตาม `summary.csv`) | ≈ 2,060 |

### Evaluation, Coverage และ Fault Detection

| Metric | ค่า |
|---|---:|
| Evaluation Success | 825 / 854 (96.604%) |
| Compile failed | 8 |
| Missing (ไม่มี test ให้ evaluate) | 21 |
| Candidate Tests | 46,457 |
| Bug-Revealing Tests | 2 |
| **Bugs Detected** | **2 / 854 (0.234%)** — Closure 1, Time 1 |
| FDR เฉพาะ Eval Success | 0.242% |
| Coverage Success | 798 / 854 (93.443%) |
| Coverage Failed / Missing | 35 / 21 |
| Mean / Median Line Coverage | 67.358% / 80.25% |
| Mean / Median Condition Coverage | 62.862% / 75.0% |
| Weighted Line / Condition Coverage | 57.977% / 52.446% |

**Common Set (เทียบกับเทคนิคอื่น):** Common Evaluation 200 bugs → detected 1 (0.5%); Common Coverage 177 bugs → Mean Line 80.272%, Mean Condition 77.216%

### ผลรายโปรเจกต์ (EvoSuite)

| Project | Bugs | Eval Success | Detected | Coverage Success | Mean Line (%) | Mean Condition (%) |
|---|---:|---:|---:|---:|---:|---:|
| Chart | 26 | 26 | 0 | 24 | 85.742 | 82.230 |
| Cli | 39 | 39 | 0 | 39 | 13.564 | 13.303 |
| Closure | 174 | 170 | 1 | 150 | 46.085 | 37.031 |
| Codec | 18 | 18 | 0 | 18 | 89.322 | 86.778 |
| Collections | 28 | 25 | 0 | 25 | 87.824 | 90.268 |
| Compress | 47 | 47 | 0 | 47 | 67.511 | 67.298 |
| Csv | 16 | 15 | 0 | 15 | 88.687 | 84.380 |
| Gson | 18 | 14 | 0 | 14 | 66.471 | 62.179 |
| JacksonCore | 26 | 24 | 0 | 24 | 64.225 | 59.800 |
| JacksonDatabind | 110 | 104 | 0 | 102 | 66.405 | 57.825 |
| JacksonXml | 6 | 6 | 0 | 6 | 35.000 | 34.050 |
| Jsoup | 93 | 93 | 0 | 90 | 74.608 | 71.971 |
| JxPath | 22 | 22 | 0 | 22 | 80.477 | 76.786 |
| Lang | 61 | 61 | 0 | 61 | 89.936 | 88.366 |
| Math | 106 | 105 | 0 | 105 | 84.854 | 83.050 |
| Mockito | 38 | 34 | 0 | 34 | 47.524 | 36.188 |
| Time | 26 | 22 | 1 | 22 | 90.614 | 88.491 |

ข้อมูลที่มา: [`evaluation/final/project_summary.csv`](../evaluation/final/project_summary.csv) และ [`technique_summary.csv`](../evaluation/final/technique_summary.csv)

---

## วิธีรัน

รันภายใน Docker container (`/workspace`) — ดู [`docker/README.md`](../docker/README.md)

```bash
# Generation
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
python3 scripts/run_benchmark.py --all-bugs --tool evosuite --resume

# Evaluation (buggy/fixed, classification)
python3 scripts/batch_evaluate.py --tool evosuite

# Coverage
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

- ผล evaluation: `evaluation/evosuite/<Project>/<BugID>/` ([`evaluation/README.md`](../evaluation/README.md))
- ผล coverage: `evaluation/coverage/evosuite/<Project>/<BugID>/` ([`evaluation/coverage/README.md`](../evaluation/coverage/README.md))

---

## ข้อสังเกต

- EvoSuite เสถียรที่สุดในสี่เทคนิค (Eval Success 96.6%, Coverage Success 93.4%) แต่ตรวจพบข้อบกพร่องจริงน้อยมาก — tests ส่วนใหญ่เป็น `valid_non_revealing` ซึ่งสะท้อนพฤติกรรมของโค้ดเวอร์ชัน buggy
- โปรเจกต์ Cli ได้ Mean Line Coverage ต่ำ (13.6%) แม้ coverage วัดสำเร็จครบทุก bug
- ไม่ควรแก้ generated tests ด้วยมือ — ใช้ `Generation_Audit/testcode_sha256.txt` ตรวจความถูกต้องของไฟล์
