# Evaluation

`evaluation/` เก็บผลจากการประเมิน generated tests **หลัง** ขั้นตอน generation — ทั้งการรัน tests บน buggy/fixed (Fault Detection), การวัด coverage และผลสรุปรวมของทั้งโครงการ

```text
Generated TestCode
        ↓
     Evaluation  (compile → run บน buggy/fixed → classify)
        ↓
Execution / Fault Detection / Coverage
        ↓
   Aggregation  →  evaluation/final/
```

ผล **generation**, **evaluation** และ **coverage** เป็นคนละขั้นตอน — สถานะของแต่ละขั้นไม่ควรตีความเป็นสิ่งเดียวกัน

```text
evaluation/
├── README.md
├── evosuite/<Project>/<BugID>/     # ผล evaluation ของ DynaMOSA/EvoSuite
├── kex/<Project>/<BugID>/          # ผล evaluation ของ Reanimator/KEX
├── gemini/<Project>/<BugID>/       # ผล evaluation ของ Gemini
├── claude/<Project>/<BugID>/       # ผล evaluation ของ Claude
├── coverage/                       # ผล coverage รายบั๊กของทั้ง 4 เทคนิค (ดู coverage/README.md)
└── final/                          # ผลสรุปรวม: CSV, รายงาน .md, กราฟ
```

---

## 1. ผล Evaluation รายบั๊ก — `evaluation/<tool>/<Project>/<BugID>/`

สร้างโดย [`scripts/evaluate_tests.py`](../scripts/README.md) (รันเป็น batch ด้วย `batch_evaluate.py`)

| ไฟล์ | เนื้อหา | พบเมื่อ |
|---|---|---|
| `summary.json` | สรุปผลของ bug นั้น | ทุก case |
| `tests.csv` | ผลรายตัวของ candidate test บน buggy/fixed | evaluation สำเร็จ |
| `compile_error.txt` | error จากการ compile generated tests | `evaluation_status = compile_failed` |

### ขั้นตอนของ evaluator

1. checkout และ compile ทั้ง buggy (`<id>b`) และ fixed (`<id>f`) version
2. เตรียม generated sources ตามรูปแบบของแต่ละเครื่องมือ (EvoSuite ใช้ runtime jar; KEX ตัด helper classes ที่ไม่ใช่ candidate tests ออก)
3. compile generated tests กับ classpath ของ buggy version — ถ้าไม่ผ่านบันทึก `compile_failed`
4. รัน candidate test **ทีละ test method** (JUnit 4 `SingleMethodRunner`; KEX ใช้ test class ที่รันได้) บนทั้ง buggy และ fixed โดยมี **timeout 15 วินาทีต่อ test ต่อ version**
5. จำแนกผลด้วยตารางด้านล่าง

### การจำแนก candidate test (`classification`)

| Buggy | Fixed | `classification` | ความหมาย |
|---|---|---|---|
| FAIL | PASS | `bug_revealing` | เปิดเผย fault ที่ถูกแก้ไข |
| PASS | PASS | `valid_non_revealing` | ใช้งานได้ แต่ไม่เปิดเผย fault |
| FAIL | FAIL | `invalid_or_unstable` | fail ทั้งสอง version |
| PASS | FAIL | `fixed_regression_or_unstable` | พฤติกรรมไม่ตรงรูปแบบ real-fault detection |
| TIMEOUT / อื่น ๆ | – | `timeout_or_other` | จำแนกไม่ได้ในกรณีหลัก |

**Bug หนึ่งนับเป็น Detected Bug** เมื่อมี `bug_revealing` อย่างน้อย 1 test — จำนวน Bug-Revealing Tests จึงอาจมากกว่าจำนวน distinct bugs ที่ตรวจพบ

### `summary.json`

```json
{
  "project": "Chart",
  "bug_id": "10",
  "tool": "gemini",
  "generated_files": 1,
  "candidate_tests": 6,
  "classification_counts": {"valid_non_revealing": 4, "fixed_regression_or_unstable": 2},
  "bug_revealing_tests": 0,
  "bug_detected": false,
  "generation_status": "unknown",
  "evaluation_status": "success"
}
```

| Field | ความหมาย |
|---|---|
| `generated_files` / `candidate_tests` | จำนวนไฟล์ที่เตรียมได้ / จำนวน test ที่ถูกรัน |
| `classification_counts` | จำนวน test ต่อ classification |
| `bug_revealing_tests`, `bug_detected` | จำนวน test ที่ตรวจพบ fault / bug ถูกนับว่า detected หรือไม่ |
| `generation_status` | สถานะ generation (`success`, `unknown` สำหรับ tool ที่ไม่ได้บันทึกในขั้น evaluation) |
| `evaluation_status` | `success` หรือ `compile_failed` (bug ที่ไม่มี TestCode ไม่มีโฟลเดอร์ ผลสรุปนับเป็น `missing`) |

### `tests.csv`

คอลัมน์: `test, fqcn, method, buggy, fixed, classification` (ค่า `buggy`/`fixed` = `PASS` / `FAIL` / `TIMEOUT`)

### จำนวน case ที่มีผล evaluation

| เครื่องมือ | โฟลเดอร์ bug ที่มีผล | Success | Compile failed | Missing (จาก 854) |
|---|---:|---:|---:|---:|
| evosuite | 833 | 825 | 8 | 21 |
| kex | 684 | 684 | 0 | 170 |
| gemini | 843 | 485 | 358 | 11 |
| claude | 523 | 322 | 201 | 331 |

`missing` = ไม่มีผล evaluation ของ bug นั้น (เช่น generation ไม่สำเร็จจึงไม่มีไฟล์ให้ประเมิน) — **ไม่ใช่** coverage หรือ fault detection = 0

---

## 2. ผล Coverage รายบั๊ก — `evaluation/coverage/`

แยกเป็นโฟลเดอร์ละเอียดที่ [`coverage/README.md`](./coverage/README.md) (`evaluation/coverage/<tool>/<Project>/<BugID>/`) — วัดด้วย `defects4j coverage -s` บน buggy version

---

## 3. ผลสรุปรวม — `evaluation/final/`

สร้างโดย `aggregate_results.py`, `aggregate_ai_tokens.py`, `generate_final_charts.py`, `generate_ai_token_charts.py`

| ไฟล์ | เนื้อหา |
|---|---|
| `master_results.csv` | **ตารางหลัก 3,416 แถว = 854 bugs × 4 เทคนิค** — ผล generation, evaluation, fault detection, coverage ของทุก case |
| `technique_summary.csv` | สรุปตามเทคนิค (Eval Success, FDR, Candidate/Bug-Revealing Tests, Coverage mean/median/weighted) |
| `project_summary.csv` | สรุปตามเทคนิค × โปรเจกต์ (17 × 4) |
| `evaluation_status_counts.csv` | จำนวน case ต่อสถานะ evaluation ต่อเทคนิค |
| `coverage_status_counts.csv` | จำนวน case ต่อสถานะ coverage ต่อเทคนิค |
| `common_evaluation_summary.csv` | เปรียบเทียบบน **Common Evaluation Set (200 bugs)** ที่ทั้ง 4 เทคนิค evaluate สำเร็จ |
| `common_coverage_summary.csv` | เปรียบเทียบบน **Common Coverage Set (177 bugs)** ที่ทั้ง 4 เทคนิควัด coverage สำเร็จ |
| `ai_token_per_bug.csv` | token usage รายบั๊กของ Gemini/Claude |
| `ai_token_summary.csv` | สรุป token และประสิทธิภาพต่อ token (denominator 854 bugs) |
| `ai_token_common_summary.csv` | สรุป token บนชุด bugs ที่ใช้เปรียบเทียบ (ปัจจุบัน = 854 ทั้งคู่) |
| `benchmark_results_summary.md` | รายงานสรุปผลเปรียบเทียบ 4 เทคนิค |
| `ai_comparison_summary.md` | รายงานเปรียบเทียบ Gemini vs Claude (รวม token) |
| `charts/01–04_*.png` | กราฟ FDR, Evaluation/Coverage Success, Common Coverage, Common FDR |
| `charts/ai_token/05–08_*.png` | กราฟ token ของ AI |

### ผลสรุประดับเทคนิค (854 bugs)

| เทคนิค | Eval Success | Compile Failed | Bugs Detected | Overall FDR | Coverage Success | Mean Line | Mean Condition |
|---|---:|---:|---:|---:|---:|---:|---:|
| DynaMOSA (EvoSuite) | 825 | 8 | 2 | 0.234% | 798 | 67.358% | 62.862% |
| Reanimator (KEX) | 684 | 0 | 6 | 0.703% | 507 | 42.011% | 30.501% |
| Gemini | 485 | 358 | 56 | 6.557% | 471 | 85.799% | 80.545% |
| Claude | 322 | 201 | 19 | 2.225% | 321 | 79.626% | 71.613% |

ตารางเปรียบเทียบที่ครบกว่านี้ (Common Set, token) ดูที่ [README หลัก](../README.md) หัวข้อ Benchmark Results — ผลรายโปรเจกต์ดู `project_summary.csv` หรือ README ของแต่ละเทคนิค

### นิยามการคำนวณ

- **Evaluation Success Rate** = Evaluation Success ÷ 854 · **Overall FDR** = Bugs Detected ÷ 854 · **Conditional FDR** = Bugs Detected ÷ Evaluation Success
- **Coverage Success Rate** = Coverage Success ÷ 854
- **Mean/Median Coverage** คำนวณเฉพาะ case ที่ coverage สำเร็จ · **Weighted Coverage** = Σ covered ÷ Σ total · **Mean Condition Coverage** เฉพาะ case ที่ `conditions_total > 0`
- **Common Set** = intersection ของ bugs ที่ทั้ง 4 เทคนิคสำเร็จ เพื่อลด selection effect จาก success rate ที่ต่างกัน
- KEX Lang-1 และ Math-1 มี coverage แบบ diagnostic — เก็บใน `master_results.csv` (`diagnostic_excluded = True`) แต่ไม่รวมในผลสรุปหลัก

### สร้างผลสรุปใหม่

```bash
python3 scripts/aggregate_results.py
python3 scripts/aggregate_ai_tokens.py
pip3 install matplotlib                      # ถ้ายังไม่ได้ติดตั้ง (ไม่มีใน Docker image)
python3 scripts/generate_final_charts.py
python3 scripts/generate_ai_token_charts.py
```

---

## Scripts ที่เกี่ยวข้อง

| Script | หน้าที่ |
|---|---|
| `scripts/evaluate_tests.py` | evaluate 1 case (compile, รันบน buggy/fixed, classify) |
| `scripts/batch_evaluate.py` | รัน `evaluate_tests.py` ทุก case ของ tool พร้อม resume |
| `scripts/evaluate_coverage.py` | วัด coverage 1 case |
| `scripts/run_coverage_benchmark.py` | รัน coverage เป็น batch |
| `scripts/aggregate_results.py`, `aggregate_ai_tokens.py` | รวมผลเป็น `evaluation/final/*.csv` |
| `scripts/generate_final_charts.py`, `generate_ai_token_charts.py` | สร้างกราฟ |

รายละเอียดดู [`scripts/README.md`](../scripts/README.md)
