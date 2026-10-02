# Reanimator – KEX

ส่วนของ test generation ด้วย Reanimator ผ่าน KEX

```text
Reanimator-Kex/
├── Code/
├── Configuration/
├── Result_Round1/
├── Result_Round2/
└── TestCode/
```

- `Code/` — พื้นที่ code ของสาย KEX
- `Configuration/` — configuration
- `Result_Round1/` — ผลรอบก่อนหน้า
- `Result_Round2/` — generation results รอบหลัก
- `TestCode/` — generated Java/JUnit tests

สถานะ generation ใน pipeline ได้แก่ `success`, `failed` และ `timeout`

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_benchmark.py --sample-17 --tool kex
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume
```

Coverage:

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
```

ผลอยู่ใน `evaluation/coverage/kex/`
