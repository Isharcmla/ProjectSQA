# Project – AI-Assisted Testing vs. Automatic Test Case Generation Algorithms: A Benchmark and Test Coverage Evaluation

**รายวิชา:** CP353201 Software Quality Assurance (ปีการศึกษา 1/2569)
**อาจารย์ประจำวิชา:** ผศ.ดร.ชิตสุธา สุ่มเล็ก | **หลักสูตร:** วิทยาการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น
**หัวข้อโครงการ:** การประเมินประสิทธิภาพเชิงเปรียบเทียบระหว่างขั้นตอนวิธีสร้างกรณีทดสอบอัตโนมัติ (DynaMOSA & Reanimator) และเครื่องมือ Generative AI (Gemini & Claude) บนชุดข้อมูลมาตรฐาน Defects4J

---

## 👥 รายชื่อสมาชิกและบทบาทหน้าที่ (Team Roles & Responsibilities)

ปัจจุบันโครงการมีสมาชิก **3 คน** โดยปรับหน้าที่หลังจากนายจิรภัทร สีสารออกจากกลุ่ม ดังนี้:

| ลำดับ | รหัสนักศึกษา | ชื่อ - สกุล | บทบาทในโครงการ | หน้าที่หลัก & สิ่งที่ต้องส่งมอบ (Deliverables) |
|---|---|---|---|---|
| 1 | 673380415-5 | นายพัชรพล กองแก้ว | **Member 1: Reanimator/Kex Lead & Infrastructure / Data / Repository Manager** | • รับผิดชอบ **Reanimator ผ่าน Kex** และการทดสอบ Symbolic Execution<br>• จัดเตรียมและดูแล **Defects4J** รวมถึงการสกัด Metadata, Target Classes และ Ground Truth ของบั๊ก<br>• ดูแล **Docker Environment / Workspace** ให้สมาชิกใช้สภาพแวดล้อมและโครงสร้างงานร่วมกัน<br>• ดูแล **GitHub Repository**, โครงสร้างไฟล์, benchmark protocol และการรวมผลจากสมาชิก<br>• พัฒนา/ดูแล **Universal Runner (`run_benchmark.py`)** และระบบ Resume สำหรับ benchmark อัตโนมัติ<br>• **Output:** `Reanimator-Kex/TestCode/`, configuration/result ที่เกี่ยวข้อง และ infrastructure/benchmark scripts |
| 2 | 673380430-9 | นายอนันต์เอกก์ ใหญ่พงศกร | **Member 2: DynaMOSA / Search-Based Testing Lead** | • รับผิดชอบ **DynaMOSA ผ่าน EvoSuite**<br>• ตั้งค่าและรัน EvoSuite/DynaMOSA กับ Target Modified Classes ตาม benchmark protocol<br>• ตรวจสอบ generated JUnit tests และเก็บผล Line/Branch Coverage, Fault Detection และ Generation Time<br>• **Output:** `DynaMOSA-EvoSuite/TestCode/` และผลการทดลองที่เกี่ยวข้อง |
| 3 | 673380425-2 | นายวงศธร ธน.ยอด | **Member 3: AI Prompt Engineer (Gemini & Claude)** | • ออกแบบและดูแล Prompt Template สำหรับ **Gemini และ Claude** ภายใต้ข้อมูลและข้อจำกัดเดียวกัน<br>• สร้าง JUnit 4 tests สำหรับ Target Modified Classes และจัดการ feedback loop เมื่อ compile/test ไม่ผ่าน<br>• เก็บผล generation time, token usage, compile/test status และผล benchmark ของ AI ทั้งสองโมเดล<br>• **Output:** `Gemini/TestCode/`, `Claude/TestCode/` และผลการทดลองที่เกี่ยวข้อง |

---

> **📖 สำหรับสมาชิกทุกคนในทีม:** ดูขั้นตอนการทำงานแบบละเอียดรายบุคคล คำสั่งที่ต้องใช้ และตำแหน่งส่งมอบไฟล์ได้ที่ [TEAM_WORKFLOW_GUIDE.md](./TEAM_WORKFLOW_GUIDE.md)
>
> **📐 Benchmark Protocol:** ใช้ [BENCHMARK_PROTOCOL_v2.md](./BENCHMARK_PROTOCOL_v2.md) เป็นข้อกำหนดกลางของการทดลอง เพื่อให้ทั้ง 4 เทคนิคใช้ target, environment และเกณฑ์ประเมินเดียวกัน

---

## 🎯 ขอบเขตการทดลองและการวัดผล (Scope & Benchmark Methodology)

### 1. ขอบเขตระดับโปรเจกต์ (Project-Level Scope)

- **ชุดข้อมูลทดสอบ:** Java projects ใน Defects4J Dataset ทั้ง **17 Projects** ได้แก่ `Chart`, `Cli`, `Closure`, `Codec`, `Collections`, `Compress`, `Csv`, `Gson`, `JacksonCore`, `JacksonDatabind`, `JacksonXml`, `Jsoup`, `JxPath`, `Lang`, `Math`, `Mockito`, `Time`
- **Validation ปัจจุบัน:** ก่อนรัน benchmark เต็ม ให้ตรวจ pipeline แบบ End-to-End กับ `Lang 1b` ก่อน และสำหรับชุด Lang ให้ใช้เฉพาะ **61 active bugs**; `Lang 2, 18, 25, 48` เป็น deprecated และไม่รวมในการทดลอง
- **คลาสเป้าหมาย (Target Classes Under Test):** โฟกัสการสร้างชุดทดสอบที่ **Target Modified Classes (`classes.modified`)** ซึ่งเป็นคลาสที่มีข้อบกพร่องจริงตามที่ระบุใน Defects4J Ground Truth
- **โหมดการประเมินผล:**
  1. **Sample Benchmark Mode (`--sample-17`):** คัดเลือกบั๊กตัวแทนโปรเจกต์ละ 1 บั๊ก (17 Projects × 4 Techniques = 68 Experiment Units) — ใช้ทดสอบ pipeline ก่อน
  2. **Exhaustive Benchmark Mode (`--all-bugs`):** รันวนลูปทดสอบทุก Active Bug ใน Defects4J พร้อมระบบ State Persistence (`progress.json`) กดหยุด/รันต่อ (`--resume`) ได้ตลอดเวลา

### 2. ดัชนีชี้วัดประสิทธิภาพ (Evaluation Metrics)

1. **Line Coverage** — เปอร์เซ็นต์ความครอบคลุมบรรทัดคำสั่งบน Target Class
2. **Branch Coverage** — เปอร์เซ็นต์ความครอบคลุมกิ่งเงื่อนไขบน Target Class
3. **Fault Detection Rate (FDR)** — ชุดทดสอบ Fail บนเวอร์ชัน Buggy (`b`) ตรงกับข้อบกพร่องจริง และ Pass บนเวอร์ชัน Fixed (`f`)
4. **Efficiency** — เวลาที่ใช้สร้างชุดทดสอบ, จำนวน test case ที่สร้างขึ้น, (สำหรับ AI) จำนวน token ที่ใช้

---

## 📜 กฎเหล็กสำหรับชุดทดสอบ (Universal Test Suite Standards)

เพื่อให้ไฟล์เทสจากทุกสายงานคอมไพล์และประเมินผลบน Defects4J ได้โดยไม่ผิดพลาด สมาชิกทุกคนต้องปฏิบัติตาม 4 ข้อนี้:

1. **Framework Hygiene:** ใช้ `import org.junit.Test;` และ `import static org.junit.Assert.*;` เท่านั้น — ห้ามใช้ JUnit 5 หรือ Mocking Framework ภายนอก
2. **Package Declaration:** บรรทัดแรกของไฟล์เทสต้องประกาศ `package` ให้ตรงกับ target class เช่น `package org.apache.commons.lang3.math;`
3. **Execution Guard:** ทุก `@Test` ต้องกำหนด timeout เสมอ เช่น `@Test(timeout = 4000)` เพื่อกัน infinite loop
4. **Deterministic Behavior:** ห้ามใช้ `System.currentTimeMillis()` หรือค่าสุ่มที่ไม่ fix seed

---

## 📂 โครงสร้าง Repository (Directory Structure)

โครงสร้างหลักของ repository ปัจจุบันแบ่งตามเครื่องมือสร้าง Test Case, evaluation pipeline และ infrastructure ดังนี้:

```text
ProjectSQA/
├── README.md
├── BENCHMARK_PROTOCOL_v2.md
├── TEAM_WORKFLOW_GUIDE.md
├── Project_Handover_Context.md
├── dataset/
│   ├── README.md
│   └── defects4j/
├── DynaMOSA-EvoSuite/
│   ├── README.md
│   ├── Code/
│   ├── Configuration/
│   ├── Generation_Audit/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── TestCode/
├── Reanimator-Kex/
│   ├── README.md
│   ├── Code/
│   ├── Configuration/
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── TestCode/
├── Gemini/
│   ├── README.md
│   ├── Prompt/
│   ├── Result/
│   └── TestCode/
├── Claude/
│   ├── README.md
│   ├── Prompt/
│   ├── Result/
│   └── TestCode/
├── evaluation/
│   ├── README.md
│   └── coverage/
│       ├── README.md
│       ├── evosuite/
│       └── kex/
├── scripts/
│   ├── README.md
│   ├── ai_generate.py
│   ├── evaluate_coverage.py
│   ├── evaluate_tests.py
│   ├── extract_catalog.py
│   ├── run_benchmark.py
│   └── run_coverage_benchmark.py
└── docker/
    ├── README.md
    ├── Dockerfile
    └── docker-compose.yml
```

รายละเอียดของแต่ละส่วนถูกแยกไว้ใน `README.md` ภายในโฟลเดอร์นั้น เพื่อให้ README หลักใช้เป็นภาพรวมของโครงการ

---

## 🛠️ ขั้นตอนการรันเพื่อทำซ้ำผลลัพธ์ (Steps to Reproduce)

### 1. เปิดใช้งาน Docker Environment

```bash
git clone https://github.com/Isharcmla/ProjectSQA.git
cd ProjectSQA

docker compose -f docker/docker-compose.yml up -d --build sqa_kex
docker compose -f docker/docker-compose.yml exec sqa_kex bash
```

ภายใน container repository อยู่ที่:

```text
/workspace
```

จึงสามารถเริ่มจาก:

```bash
cd /workspace
```

รายละเอียดเพิ่มเติมดูที่ [`docker/README.md`](./docker/README.md)

### 2. Test Generation Benchmark

#### Reanimator / KEX

รันบั๊กเดียว:

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
```

รัน Sample Benchmark:

```bash
python3 scripts/run_benchmark.py --sample-17 --tool kex
```

รันทุก active bug พร้อม Resume:

```bash
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume
```

#### DynaMOSA / EvoSuite

รันบั๊กเดียว:

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
```

สามารถใช้ benchmark mode เดียวกับ KEX ตาม interface ที่ `run_benchmark.py` รองรับ

รายละเอียดเพิ่มเติมดูที่ [`scripts/README.md`](./scripts/README.md)

### 3. Coverage Evaluation

Coverage evaluation เป็นขั้นตอนแยกจาก test generation

รัน case เดี่ยว:

```bash
python3 scripts/evaluate_coverage.py \
  --project Lang \
  --bug 1 \
  --tool kex \
  --timeout 600
```

หรือ EvoSuite:

```bash
python3 scripts/evaluate_coverage.py \
  --project Lang \
  --bug 1 \
  --tool evosuite \
  --timeout 600
```

รัน coverage benchmark แบบ batch:

```bash
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
python3 scripts/run_coverage_benchmark.py --tool evosuite --timeout 600
```

`run_coverage_benchmark.py` ใช้ generation cases ที่มี `status == "success"` จากผลใน `Result_Round2`

ผล coverage ถูกจัดเก็บใน:

```text
evaluation/coverage/kex/<Project>/<BugID>/
evaluation/coverage/evosuite/<Project>/<BugID>/
```

ไฟล์ผลที่อาจพบประกอบด้วย:

```text
summary.json
coverage_output.txt
failing_tests.txt
error.txt
```

`summary.json` ใช้เก็บข้อมูลสรุป เช่น line/condition coverage, จำนวน failing tests และสถานะของ coverage evaluation

> **สำคัญ:** `coverage_failed` ไม่ควรถูกตีความเป็น Coverage = 0 โดยอัตโนมัติ เพราะความล้มเหลวอาจเกิดจาก compile error, dependency หรือ environment ก่อนที่จะวัด coverage สำเร็จ

รายละเอียดเพิ่มเติมดู [`evaluation/coverage/README.md`](./evaluation/coverage/README.md)

### 4. Generated Tests และผลลัพธ์ของแต่ละเทคนิค

- [`DynaMOSA-EvoSuite/README.md`](./DynaMOSA-EvoSuite/README.md) — DynaMOSA / EvoSuite
- [`Reanimator-Kex/README.md`](./Reanimator-Kex/README.md) — Reanimator / KEX
- [`Gemini/README.md`](./Gemini/README.md) — Gemini
- [`Claude/README.md`](./Claude/README.md) — Claude
- [`evaluation/README.md`](./evaluation/README.md) — Evaluation pipeline

Generation และ Evaluation เป็นคนละขั้นตอน ดังนั้นสถานะ generation เช่น `success`, `failed` หรือ `timeout` ควรแยกจากสถานะของ test/coverage evaluation

---

## 📊 ตารางสรุปผลการเปรียบเทียบประสิทธิภาพ (Benchmark Results)

*ตารางสรุปผลการทดลองเปรียบเทียบบนชุดข้อมูลตัวแทน 17 โปรเจกต์ใน Defects4J:*

| เครื่องมือ / เทคนิค | Line Coverage (%) | Branch Coverage (%) | Fault Detection Rate | เวลาเฉลี่ยต่อคลาส | จุดเด่น | ข้อจำกัด |
|---|---|---|---|---|---|---|
| **DynaMOSA (EvoSuite)** | - | - | - | - | Many-objective search, ครอบคลุมหลาย target พร้อมกัน | Search อาจไม่ converge ในเวลาจำกัด, test smell |
| **Reanimator (Kex)** | - | - | - | - | Symbolic execution แม่นยำ หา edge case เชิงตรรกะ | State explosion, ไม่รองรับ abstract/inner class |
| **Gemini** | - | - | - | - | ตอบเร็ว วิเคราะห์ control flow ได้ดี | Assertion อาจ flaky ในตรรกะซับซ้อน |
| **Claude** | - | - | - | - | ปฏิบัติตาม constraint ที่ระบุใน XML tag ได้แม่นยำ | ขึ้นกับความชัดเจนของ dependency ที่ให้มา |

---

## 📅 กำหนดการนำส่งงาน (Deliverables Schedule)

1. **รายงานรอบที่ 1 (5%):** ส่งภายในวันที่ 22 สิงหาคม 2569 ทาง Google Classroom
2. **รายงานฉบับสมบูรณ์ & GitHub (10%):** ส่งภายในวันสุดท้ายของการเรียนการสอน
3. **Live Presentation & Demonstration:** นำเสนอผลการทดลองและสาธิตการทำงานจริงในวันสุดท้ายของการเรียนการสอน
