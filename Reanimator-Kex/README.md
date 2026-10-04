# Reanimator – KEX

ส่วนของ automatic test generation ด้วย **Reanimator** ผ่าน **KEX**

> Reanimator เป็นอัลกอริทึมแบบ backward search ที่อยู่ภายใน KEX (ไม่ใช่ tool แยก) ใช้แปลง symbolic input / object state จาก symbolic execution ให้เป็นลำดับการเรียก public API และ test code ที่รันได้ (Abdullin et al., 2021)

```text
Reanimator-Kex/
├── Code/               # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Configuration/      # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Result_Round1/      # สงวนไว้ (ปัจจุบันมีเฉพาะ .gitkeep)
├── Result_Round2/      # ผล generation หลัก: <Project>/<Project>_<Bug>_result.json + summary.csv
└── TestCode/           # Generated tests: <Project>/*.java (รวม helper classes)
```

| โฟลเดอร์ | เนื้อหา |
|---|---|
| `Code/`, `Configuration/` | ยังไม่มีไฟล์ — การตั้งค่าจริงอยู่ที่ [`docker/Dockerfile`](../docker/README.md) และ [`scripts/run_benchmark.py`](../scripts/README.md) |
| `Result_Round1/` | ยังไม่มีข้อมูล (สงวนไว้สำหรับผลรอบก่อนหน้า) |
| `Result_Round2/` | ผล generation รอบหลักของ **ทั้ง 854 bugs** และ `summary.csv` |
| `TestCode/` | generated tests แยกตาม Project (ขนาดใหญ่ ≈ 1.1 แสนไฟล์) |

---

## Configuration ที่ใช้

| รายการ | ค่า |
|---|---|
| KEX version | **0.0.11** (ติดตั้งจาก GitHub release zip ที่ `/opt/kex` — ไม่ build จาก source) |
| Mode | `concolic` |
| Classpath | compiled classes ของ buggy version + `cp.compile` ที่ export จาก Defects4J |
| Timeout | **300 วินาที / target class** |
| Target | `classes.modified` ของแต่ละ bug (output แยกตาม target class เพื่อไม่ให้ไฟล์ทับกัน) |
| Java / Timezone | OpenJDK 11 / `America/Los_Angeles` |

คำสั่งที่ runner เรียก:

```bash
python3 /opt/kex/kex.py --classpath <PROJECT_CLASSES>:<CP_COMPILE> \
                        --target <TARGET_CLASS> --mode concolic --output <OUTPUT_DIR>
```

สถานะ generation มี 3 ค่า: `success`, `failed`, `timeout`

---

## รูปแบบไฟล์

### `TestCode/<Project>/`

```text
<Project>_<BugID>_<ClassName>_<method>_<hash>.java     # candidate test (ต่อ method/พาธที่ KEX สร้าง)
<Project>_<BugID>_EqualityUtils.java                   # helper class
<Project>_<BugID>_ReflectionUtils.java                 # helper class
```

- helper classes (`EqualityUtils`, `ReflectionUtils`) ถูกสร้างคู่กับ tests แต่ **ไม่ใช่ candidate tests** — evaluator ตัดออกเมื่อนับผล
- จำนวนไฟล์มีมาก เพราะ KEX สร้างไฟล์ต่อ method/พาธ (เช่น `Fraction.reduce` มีมากกว่า 1,000 ไฟล์ในโปรเจกต์ Lang)

### `Result_Round2/<Project>/<Project>_<BugID>_result.json` และ `summary.csv`

หนึ่งแถวใน `summary.csv` ต่อหนึ่ง bug (854 แถว) คอลัมน์: `project, bug_id, status, num_test_files_generated, elapsed_sec, timestamp`

`num_test_files_generated` นับ **ทุกไฟล์ Java** ที่ KEX สร้าง รวม helper classes (รวมทั้งหมด ≈ 111,468) จึงมากกว่าจำนวน candidate tests ที่ evaluator นับ (65,099)

---

## ผลการทดลอง (854 bugs)

### Generation

| Metric | ค่า |
|---|---:|
| Bugs ทั้งหมด | 854 |
| Generation `success` | 684 |
| Generation `timeout` | 108 |
| Generation `failed` | 62 |
| เวลาเฉลี่ย / bug (เฉพาะ success) | 144.09 วินาที |
| เวลามัธยฐาน / bug | 145.94 วินาที |
| เวลาเฉลี่ย / bug (ทุกสถานะ) | 175.35 วินาที |

### Evaluation, Coverage และ Fault Detection

| Metric | ค่า |
|---|---:|
| Evaluation Success | 684 / 854 (80.094%) — ทุก bug ที่ generation สำเร็จ evaluate ผ่าน |
| Compile failed | 0 |
| Missing (ไม่มีผล generation) | 170 |
| Candidate Tests | 65,099 |
| Bug-Revealing Tests | 22 |
| **Bugs Detected** | **6 / 854 (0.703%)** |
| FDR เฉพาะ Eval Success | 0.877% |
| Coverage Success | 507 / 854 (59.368%) |
| Coverage Failed / Missing | 177 / 170 |
| Mean / Median Line Coverage | 42.011% / 42.8% |
| Mean / Median Condition Coverage | 30.501% / 25.4% |
| Weighted Line / Condition Coverage | 34.151% / 24.564% |

การจำแนก candidate tests: `valid_non_revealing` 45,178 · `invalid_or_unstable` 19,064 · `fixed_regression_or_unstable` 835 · `bug_revealing` 22

**Common Set (เทียบกับเทคนิคอื่น):** Common Evaluation 200 bugs → detected 2 (1.0%); Common Coverage 177 bugs → Mean Line 52.126%, Mean Condition 38.959%

### ผลรายโปรเจกต์ (KEX)

| Project | Bugs | Eval Success | Detected | Coverage Success | Mean Line (%) | Mean Condition (%) |
|---|---:|---:|---:|---:|---:|---:|
| Chart | 26 | 25 | 0 | 23 | 44.822 | 31.873 |
| Cli | 39 | 31 | 0 | 27 | 12.481 | 9.704 |
| Closure | 174 | 105 | 2 | 2 | 23.100 | 11.200 |
| Codec | 18 | 16 | 0 | 15 | 82.480 | 72.320 |
| Collections | 28 | 20 | 0 | 20 | 64.125 | 64.320 |
| Compress | 47 | 44 | 0 | 41 | 51.949 | 44.732 |
| Csv | 16 | 12 | 0 | 12 | 59.225 | 48.175 |
| Gson | 18 | 18 | 0 | 11 | 36.845 | 28.190 |
| JacksonCore | 26 | 26 | 0 | 17 | 16.653 | 9.376 |
| JacksonDatabind | 110 | 99 | 0 | 84 | 15.417 | 6.996 |
| JacksonXml | 6 | 6 | 0 | 6 | 3.950 | 0.150 |
| Jsoup | 93 | 73 | 2 | 61 | 43.743 | 27.339 |
| JxPath | 22 | 21 | 0 | 11 | 30.545 | 27.155 |
| Lang | 61 | 43 | 0 | 42 | 55.057 | 42.155 |
| Math | 106 | 92 | 2 | 88 | 53.650 | 41.893 |
| Mockito | 38 | 38 | 0 | 33 | 54.145 | 19.283 |
| Time | 26 | 15 | 0 | 14 | 49.521 | 36.486 |

ข้อมูลที่มา: [`evaluation/final/project_summary.csv`](../evaluation/final/project_summary.csv)

---

## วิธีรัน

รันภายใน Docker container (`/workspace`) — ดู [`docker/README.md`](../docker/README.md)

```bash
# Generation
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_benchmark.py --sample-17 --tool kex
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume

# Evaluation (buggy/fixed, classification)
python3 scripts/batch_evaluate.py --tool kex

# Coverage
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
```

- ผล evaluation: `evaluation/kex/<Project>/<BugID>/` ([`evaluation/README.md`](../evaluation/README.md))
- ผล coverage: `evaluation/coverage/kex/<Project>/<BugID>/` ([`evaluation/coverage/README.md`](../evaluation/coverage/README.md))

---

## ข้อสังเกตและข้อจำกัด

- **Generation ไม่ครอบคลุมทุก bug:** timeout 108 และ failed 62 bugs ทำให้ไม่มีผลถึง 170 bugs (19.9%)
- **Coverage ต่ำสุดในสี่เทคนิค** (Mean Line 42.0%) และวัดสำเร็จเพียง 59.4% — โดยเฉพาะ **Closure ที่ coverage สำเร็จเพียง 2 จาก 174 bugs**
- tests จำนวนมากเป็น `invalid_or_unstable` (19,064 จาก 65,099) คือ fail ทั้งบน buggy และ fixed
- **Coverage ของ Lang-1 และ Math-1** ถูกรันเป็น diagnostic เท่านั้น เก็บไว้ใน `master_results.csv` แต่ **ไม่รวม**ในตัวเลข coverage หลัก
- ข้อจำกัดเชิงเทคนิคของ KEX/Reanimator ที่เอกสารต้นฉบับกล่าวถึง: state explosion, บาง symbolic input แปลงเป็นโค้ดผ่าน public API ไม่ได้, ไม่รองรับ abstract class / non-static inner class
