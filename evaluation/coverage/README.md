# Coverage Evaluation

เก็บผล coverage ของ generated tests:

```text
evaluation/coverage/
├── evosuite/
└── kex/
```

รูปแบบ path:

```text
evaluation/coverage/<tool>/<Project>/<BugID>/
```

ไฟล์ที่อาจพบ:

- `summary.json` — สรุป metric แบบ machine-readable
- `coverage_output.txt` — raw coverage output
- `failing_tests.txt` — รายละเอียด failing tests
- `error.txt` — error ของ case ที่ coverage ไม่สำเร็จ

field สำคัญใน `summary.json` ได้แก่ `status`, `prepared_files`, `lines_total`, `lines_covered`, `line_coverage`, `conditions_total`, `conditions_covered`, `condition_coverage`, `has_failing_tests` และ `failing_test_count`

KEX summary บาง case มี `raw_failing_test_count` และ `helper_failure_count` เพิ่ม เพื่อแยก helper failures ออกจาก candidate test failures

## Status

- `success` — coverage pipeline สำเร็จ
- `coverage_failed` — coverage evaluation ไม่สำเร็จ

`coverage_failed` ไม่ควรถูกแทนเป็น coverage 0 โดยอัตโนมัติ เพราะอาจเกิดจาก compile/dependency/environment ก่อนวัด coverage ได้

## รันเดี่ยว

```bash
python3 scripts/evaluate_coverage.py --project Lang --bug 1 --tool kex --timeout 600
```

## รัน batch

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

`run_coverage_benchmark.py` เลือกเฉพาะ `*_result.json` ใน `Result_Round2` ที่มี `status == "success"`

ใช้ `--limit N` สำหรับทดลองบาง pending cases และ `--rerun` เมื่อต้องการรัน case ที่มี summary อยู่แล้วใหม่
