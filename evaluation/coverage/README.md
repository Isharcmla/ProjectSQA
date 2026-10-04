# Coverage Evaluation

เก็บผล coverage ของ generated tests จาก **ทั้ง 4 เทคนิค** วัดด้วย Defects4J

```text
evaluation/coverage/
├── README.md
├── evosuite/   # DynaMOSA / EvoSuite
├── kex/        # Reanimator / KEX
├── gemini/     # Gemini
└── claude/     # Claude
```

รูปแบบ path:

```text
evaluation/coverage/<tool>/<Project>/<BugID>/
```

Coverage เป็นขั้นตอนแยกจาก generation และจาก fault-detection evaluation (`evaluation/<tool>/`) — test suite ที่มี failing tests แต่ Defects4J ยังรายงาน coverage ได้ จะยังนับ coverage เป็น `success` เพราะ coverage และ fault detection เป็นคนละมิติ

---

## วิธีวัด

1. จัด generated Java sources ตาม package structure แล้วรวมเป็นไฟล์ `.tar.bz2`
2. เรียก `defects4j coverage -s <test-suite-archive>` บน **buggy version** (`<id>b`) ของ bug นั้น
3. สกัด Lines total/covered, Line coverage, Conditions total/covered และ Condition coverage จาก output
4. timeout **600 วินาทีต่อ bug** (ปรับด้วย `--timeout`)

Coverage ที่รายงานคือ **Line Coverage** และ **Condition Coverage** ตามที่ Defects4J รายงานบน target class

---

## ไฟล์ที่อาจพบในแต่ละ case

| ไฟล์ | เนื้อหา | พบเมื่อ |
|---|---|---|
| `summary.json` | สรุป metric แบบ machine-readable | ทุก case |
| `coverage_output.txt` | raw output ของ `defects4j coverage` | coverage สำเร็จ |
| `failing_tests.txt` | รายละเอียด failing tests ที่พบระหว่างวัด coverage | มี failing tests |
| `error.txt` | error ของ case ที่ coverage ไม่สำเร็จ (เช่น compile ล้มเหลวที่ `compile.gen.tests`) | `coverage_failed` / `timeout` |

### Fields ใน `summary.json`

| Field | ความหมาย |
|---|---|
| `project`, `bug_id`, `tool` | ระบุ case |
| `status` | สถานะ coverage (ดูตารางด้านล่าง) |
| `prepared_files` | จำนวนไฟล์ Java ที่เตรียมเข้า test suite |
| `lines_total`, `lines_covered`, `line_coverage` | จำนวนบรรทัดทั้งหมด / ที่ถูกครอบคลุม / ร้อยละ |
| `conditions_total`, `conditions_covered`, `condition_coverage` | จำนวน condition ทั้งหมด / ที่ถูกครอบคลุม / ร้อยละ |
| `has_failing_tests`, `failing_test_count` | มี failing tests หรือไม่ / จำนวน |

KEX summary บาง case มี `raw_failing_test_count` และ `helper_failure_count` เพิ่ม เพื่อแยก **helper failures** ออกจาก **candidate test failures** (เช่น raw 11 − helper 2 → `failing_test_count` 9)

ตัวอย่าง (`gemini/Chart/10`):

```json
{
  "project": "Chart", "bug_id": "10", "tool": "gemini", "status": "success",
  "prepared_files": 1, "lines_total": 3, "lines_covered": 3,
  "conditions_total": 0, "conditions_covered": 0,
  "line_coverage": 100.0, "condition_coverage": 0.0,
  "has_failing_tests": false, "failing_test_count": 0,
  "raw_failing_test_count": 0, "helper_failure_count": 0
}
```

> `condition_coverage = 0.0` เมื่อ `conditions_total = 0` **ไม่ได้หมายถึง coverage 0%** — ในการรวมผล Mean Condition Coverage จะนับเฉพาะ case ที่ `conditions_total > 0`

---

## Status

| `status` | ความหมาย |
|---|---|
| `success` | coverage pipeline สำเร็จ และ extract metric ได้ |
| `coverage_failed` | coverage evaluation ไม่สำเร็จ (compile / dependency / environment ฯลฯ) |
| `timeout` | วัด coverage เกินเวลาที่กำหนด |

**`coverage_failed` และ `timeout` ไม่ควรถูกแทนเป็น coverage 0%** เพราะความล้มเหลวอาจเกิดก่อนวัด coverage ได้ — ในผลสรุปจะไม่นำไปเฉลี่ย

ในผลสรุป ([`../final/coverage_status_counts.csv`](../final/coverage_status_counts.csv)) จะมีสถานะ **`missing`** เพิ่ม คือ bug ที่ไม่มีผล coverage เลย (เช่น generation ไม่สำเร็จจึงไม่มี test ให้วัด)

### จำนวน case แยกตามสถานะ (denominator = 854 bugs)

| เทคนิค | `success` | `coverage_failed` | `timeout` | `missing` | Success / 854 |
|---|---:|---:|---:|---:|---:|
| evosuite | 798 | 35 | 0 | 21 | 93.443% |
| kex | 507 | 177 | 0 | 170 | 59.368% |
| gemini | 471 | 371 | 1 | 11 | 55.152% |
| claude | 321 | 202 | 0 | 331 | 37.588% |

Gemini `timeout` 1 case คือ **Math-84** — rerun ด้วย timeout 600 วินาทีแล้วยัง timeout จึงเก็บเป็นผลตาม protocol

### ค่า Coverage (เฉพาะ case ที่ `success`)

| เทคนิค | Mean Line | Median Line | Weighted Line | Mean Condition | Median Condition | Weighted Condition |
|---|---:|---:|---:|---:|---:|---:|
| evosuite | 67.358% | 80.25% | 57.977% | 62.862% | 75.0% | 52.446% |
| kex | 42.011% | 42.8% | 34.151% | 30.501% | 25.4% | 24.564% |
| gemini | 85.799% | 97.1% | 81.081% | 80.545% | 92.3% | 72.676% |
| claude | 79.626% | 94.6% | 64.836% | 71.613% | 85.05% | 53.417% |

### Common Coverage Set (177 bugs ที่ทั้ง 4 เทคนิควัดสำเร็จ)

| เทคนิค | Mean Line | Weighted Line | Mean Condition | Weighted Condition |
|---|---:|---:|---:|---:|
| evosuite | 80.272% | 80.265% | 77.216% | 76.044% |
| kex | 52.126% | 44.981% | 38.959% | 34.426% |
| gemini | 91.073% | 86.009% | 86.648% | 78.364% |
| claude | 87.854% | 86.473% | 80.814% | 75.878% |

ผลรายโปรเจกต์ดูที่ [`../final/project_summary.csv`](../final/project_summary.csv)

---

## รันเดี่ยว

```bash
python3 scripts/evaluate_coverage.py --project Lang --bug 1 --tool kex --timeout 600
python3 scripts/evaluate_coverage.py --project Lang --bug 1 --tool evosuite --timeout 600
python3 scripts/evaluate_coverage.py --project Lang --bug 1 --tool gemini --timeout 600
python3 scripts/evaluate_coverage.py --project Lang --bug 1 --tool claude --timeout 600
```

## รัน batch

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
python3 scripts/run_coverage_benchmark.py --tool gemini --timeout 600
python3 scripts/run_coverage_benchmark.py --tool claude --timeout 600
```

`run_coverage_benchmark.py` เลือก case ดังนี้:

- **evosuite / kex:** อ่าน `*_result.json` ใน `<DynaMOSA-EvoSuite|Reanimator-Kex>/Result_Round2` เฉพาะที่ `status == "success"`
- **gemini / claude:** อ่าน generated tests จาก `Gemini/TestCode` และ `Claude/TestCode`

ใช้ `--limit N` สำหรับทดลองบาง pending cases และ `--rerun` เมื่อต้องการรัน case ที่มี `summary.json` อยู่แล้วใหม่

---

## หมายเหตุสำคัญ

- **KEX Lang-1 และ Math-1** มี summary เพิ่มเป็น **diagnostic run** — มีไฟล์ในโฟลเดอร์ (KEX มี 686 โฟลเดอร์ แทนที่จะเป็น 684) แต่ **ไม่รวม**ในตัวเลขสรุปหลัก (507 success) ส่วนข้อมูลยังเก็บไว้ใน `master_results.csv` (`diagnostic_excluded = True`)
- ผลของ evosuite มี `summary.json` 833 โฟลเดอร์ (เท่ากับจำนวน bug ที่ generation สำเร็จ) ส่วน bug ที่เหลือเป็น `missing`
