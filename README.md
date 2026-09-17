# Project – AI-Assisted Testing vs. Automatic Test Case Generation Algorithms: A Benchmark and Test Coverage Evaluation

**รายวิชา:** CP353201 Software Quality Assurance (ปีการศึกษา 1/2569)
**อาจารย์ประจำวิชา:** ผศ.ดร.ชิตสุธา สุ่มเล็ก | **หลักสูตร:** วิทยาการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น
**หัวข้อโครงการ:** การประเมินประสิทธิภาพเชิงเปรียบเทียบระหว่างขั้นตอนวิธีสร้างกรณีทดสอบอัตโนมัติ (DynaMOSA & Reanimator) และเครื่องมือ Generative AI (Gemini & Claude) บนชุดข้อมูลมาตรฐาน Defects4J

---

## 👥 รายชื่อสมาชิกและบทบาทหน้าที่ (Team Roles & Responsibilities)

| ลำดับ | รหัสนักศึกษา | ชื่อ - สกุล | บทบาทในโครงการ | หน้าที่หลัก & สิ่งที่ต้องส่งมอบ (Deliverables) |
|---|---|---|---|---|
| 1 | 673380415-5 | นายพัชรพล กองแก้ว | **Member 1: Algorithm Lead 1** (DynaMOSA / Search-Based Testing) | • ติดตั้งและ config EvoSuite ให้รันผ่าน Defects4J interface โดยตรง<br>• รัน DynaMOSA (default algorithm ของ EvoSuite ≥1.2.0) กับทุก target class<br>• บันทึกค่า Line/Branch/Mutation coverage และ generation time<br>• **Output:** วางไฟล์ไว้ที่ `DynaMOSA-EvoSuite/TestCode/` |
| 2 | 673380425-2 | นายวงศธร ธน.ยอด | **Member 2: Algorithm Lead 2** (Reanimator / Symbolic Execution) | • ติดตั้งและ build Kex ผ่าน Gradle<br>• รัน symbolic execution เพื่อหา target input แล้วส่งต่อให้ Reanimator แปลงเป็น JUnit<br>• บันทึกกรณีที่ Reanimator แปลง input ไม่สำเร็จ (state explosion, unsupported feature)<br>• **Output:** วางไฟล์ไว้ที่ `Reanimator-Kex/TestCode/` |
| 3 | 673380430-9 | นายอนันต์เอกก์ ใหญ่พงศกร | **Member 3: AI Prompt Engineer** (Gemini & Claude) | • ออกแบบ Prompt Template (Generic + Guideline เฉพาะกรณี) ตามพฤติกรรมเฉพาะของแต่ละโมเดล<br>• ยิง prompt กับทุก target class ผ่าน API/UI และเก็บ response<br>• จัดการ feedback loop (compile error, coverage ต่ำ)<br>• **Output:** วางไฟล์ที่ `Gemini/TestCode/` และ `Claude/TestCode/` |
| 4 | 673380574-5 | นายจิรภัทร สีสาร | **Member 4: Infrastructure & Data Lead** (Defects4J & Repository Manager) | • จัดเตรียม Docker Environment (Multi-JDK, EvoSuite, Kex, Python)<br>• สกัด Target Classes และ Ground Truth บั๊กจาก Defects4J<br>• พัฒนา Universal Runner (`run_benchmark.py`) พร้อมระบบ Resume<br>• ประเมินผล Coverage, Fault Detection Rate และรวบรวมเล่มรายงาน |

---

> **📖 สำหรับสมาชิกทุกคนในทีม:** ดูขั้นตอนการทำงานแบบละเอียดรายบุคคล คำสั่งที่ต้องใช้ และตำแหน่งส่งมอบไฟล์ได้ที่ [TEAM_WORKFLOW_GUIDE.md](./TEAM_WORKFLOW_GUIDE.md)

---

## 🎯 ขอบเขตการทดลองและการวัดผล (Scope & Benchmark Methodology)

### 1. ขอบเขตระดับโปรเจกต์ (Project-Level Scope)

- **ชุดข้อมูลทดสอบ:** Java projects ใน Defects4J Dataset ทั้ง **17 Projects** ได้แก่ `Chart`, `Cli`, `Closure`, `Codec`, `Collections`, `Compress`, `Csv`, `Gson`, `JacksonCore`, `JacksonDatabind`, `JacksonXml`, `Jsoup`, `JxPath`, `Lang`, `Math`, `Mockito`, `Time`
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

```
ProjectSQA/
├── README.md                          # เอกสารหลักแนะนำโปรเจกต์และข้อกำหนด
├── TEAM_WORKFLOW_GUIDE.md             # คู่มือขั้นตอนการทำงานรายบุคคล
├── Report_Round1_Draft.md             # รายงานการส่งมอบรอบที่ 1
├── progress.json                      # สถานะการรันระดับ Project-Bug-Technique (Resume State)
├── results/                           # ผลลัพธ์การทดลอง
│   ├── benchmark_results.csv          # ตารางสรุปผลรวมทั้งหมด
│   └── <Project>/<Bug_ID>/            # ผลลัพธ์ละเอียดรายบั๊ก (.json)
├── scripts/                           # สคริปต์ระบบอัตโนมัติ
│   ├── d4j_meta.py                    # ดึง Metadata จาก Defects4J CLI
│   ├── run_benchmark.py               # Universal Benchmark Runner (Sample & All-Bugs)
│   └── ai_generate.py                 # สคริปต์ยิง Gemini/Claude API
├── target_benchmark/                  # Ground Truth ของ target classes
│   ├── catalog_17_projects.json       # สารบัญ Machine-Readable ให้ทั้ง 4 สาย
│   └── <Project>_<BugID>b/            # โฟลเดอร์ของแต่ละบั๊ก
├── docker/                            # สภาพแวดล้อมมาตรฐานสำหรับรัน Defects4J
│   ├── Dockerfile                     # Multi-JDK (8 & 17) + EvoSuite + Kex + Python
│   ├── docker-compose.yml
│   └── README_DOCKER.md
├── DynaMOSA-EvoSuite/                 # Algorithm 1: DynaMOSA (ผ่าน EvoSuite)
│   ├── Code/
│   ├── Configuration/                 # Search Budget config
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── TestCode/                      # ไฟล์ JUnit 4 (*_ESTest.java)
├── Reanimator-Kex/                    # Algorithm 2: Reanimator (ผ่าน Kex)
│   ├── Code/
│   ├── Configuration/                 # SMT solver config
│   ├── Result_Round1/
│   ├── Result_Round2/
│   └── TestCode/                      # ไฟล์ JUnit 4 (*_ReanimatorTest.java)
├── Gemini/                            # AI Tool 1: Gemini
│   ├── Prompt/
│   ├── Result/                        # Token usage & generation time
│   └── TestCode/                      # ไฟล์ JUnit 4 (*_GeminiTest.java)
└── Claude/                            # AI Tool 2: Claude
    ├── Prompt/
    ├── Result/
    └── TestCode/                      # ไฟล์ JUnit 4 (*_ClaudeTest.java)
```

---

## 🛠️ ขั้นตอนการรันเพื่อทำซ้ำผลลัพธ์ (Steps to Reproduce)

### 1. เปิดใช้งาน Docker Environment (Multi-JDK & Dependencies Ready)

```bash
git clone https://github.com/<your-username>/ProjectSQA.git
cd ProjectSQA

docker-compose -f docker/docker-compose.yml up -d --build
docker exec -it sqa_container bash
```

### 2. การสั่งรัน Benchmark ผ่าน Universal Runner

```bash
# ทดสอบเดี่ยวเฉพาะบั๊กเป้าหมาย (เช่น Lang Bug 1)
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex

# รันประเมินผลกลุ่มตัวแทน 17 Projects
python3 scripts/run_benchmark.py --sample-17 --tool kex

# รันโหมด Exhaustive (ทุกบั๊กใน Defects4J) พร้อม resume อัตโนมัติ
python3 scripts/run_benchmark.py --all-bugs --tool kex --resume
```

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
