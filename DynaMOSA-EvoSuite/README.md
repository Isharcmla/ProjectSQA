# DynaMOSA – EvoSuite

ส่วนของ automatic test generation ด้วย DynaMOSA ผ่าน EvoSuite

```text
DynaMOSA-EvoSuite/
├── Code/
├── Configuration/
├── Generation_Audit/
├── Result_Round1/
├── Result_Round2/
└── TestCode/
```

- `Code/` — พื้นที่ code ของสาย EvoSuite
- `Configuration/` — configuration ของการทดลอง
- `Generation_Audit/` — ข้อมูล audit ของ generated tests เช่น `testcode_sha256.txt`
- `Result_Round1/` — ผลการทดลองรอบก่อนหน้า
- `Result_Round2/` — generation results รอบหลัก แยกตาม Project/Bug
- `TestCode/` — generated Java/JUnit tests

รัน generation:

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
```

รัน coverage:

```bash
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

ผล coverage อยู่ใน `evaluation/coverage/evosuite/`
