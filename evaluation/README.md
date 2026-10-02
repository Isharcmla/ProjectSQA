# Evaluation

`evaluation/` เก็บผลจากการประเมิน generated tests หลังขั้นตอน generation

```text
Generated TestCode
        ↓
     Evaluation
        ↓
Execution / Fault Detection / Coverage
```

ผล generation และ evaluation เป็นคนละขั้นตอน จึงไม่ควรตีความสถานะของทั้งสองส่วนเป็นสิ่งเดียวกัน

Coverage ถูกแยกไว้ที่:

```text
evaluation/coverage/
├── evosuite/
└── kex/
```

ดูรายละเอียดที่ `coverage/README.md`

scripts ที่เกี่ยวข้องคือ `scripts/evaluate_tests.py`, `scripts/evaluate_coverage.py` และ `scripts/run_coverage_benchmark.py`
