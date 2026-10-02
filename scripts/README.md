# Scripts

```text
scripts/
├── ai_generate.py
├── evaluate_coverage.py
├── evaluate_tests.py
├── extract_catalog.py
├── run_benchmark.py
└── run_coverage_benchmark.py
```

## `run_benchmark.py`

Universal Benchmark Runner สำหรับ KEX/Reanimator และ EvoSuite/DynaMOSA

รองรับ `--project X --bug N`, `--sample-17`, `--all-bugs` และ `--resume`

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
python3 scripts/run_benchmark.py --sample-17 --tool kex
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume
```

script checkout/compile Defects4J และดึง `classes.modified` เป็น target classes โดยกำหนด repository path เป็น `/workspace` สำหรับ Docker environment

## `evaluate_tests.py`

ใช้เตรียม/compile/execute generated tests ตาม tool ที่ script รองรับ

## `evaluate_coverage.py`

ประเมิน coverage ของ Project/Bug/Tool หนึ่ง case และเขียนผลลง `evaluation/coverage/<tool>/<Project>/<BugID>/`

## `run_coverage_benchmark.py`

batch runner ของ coverage สำหรับ `kex` และ `evosuite` โดยอ่าน generation results จาก `Result_Round2` และเลือก `status == "success"`

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

## `ai_generate.py`

script ของ AI generation pipeline สำหรับงานฝั่ง Gemini/Claude

## `extract_catalog.py`

script สำหรับสกัด/จัดเตรียม catalog หรือ metadata ของ benchmark
