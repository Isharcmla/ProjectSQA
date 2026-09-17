# Project Handover & Context Document (v2)

> **วัตถุประสงค์ของเอกสารนี้:** เป็น Master Context สำหรับส่งต่อให้ AI หรือสมาชิกใหม่เข้าใจภาพรวมโปรเจกต์ทั้งหมด และทำงานต่อได้ทันทีโดยไม่หลุดทิศทางจากที่วางแผนไว้เดิม
> **อัปเดตล่าสุด:** กันยายน 2569 — สถานะ: Infrastructure (Docker + Scripts) เตรียมพร้อมครบทั้ง 4 สายแล้ว **แต่ยังไม่เคย build/รันจริงแม้แต่ครั้งเดียว**

---

## 1. Project Overview

**ชื่อโปรเจกต์:** Project – AI-Assisted Testing vs. Automatic Test Case Generation Algorithms: A Benchmark and Test Coverage Evaluation

**บริบท:** งานกลุ่ม (4 คน) รายวิชา **CP353201 Software Quality Assurance** ภาคเรียน 1/2569 สาขาวิทยาการคอมพิวเตอร์ วิทยาลัยการคอมพิวเตอร์ มหาวิทยาลัยขอนแก่น อาจารย์ประจำวิชา: ผศ.ดร.ชิตสุธา สุ่มเล็ก

**สิ่งที่โปรเจกต์นี้ทำ:** เปรียบเทียบประสิทธิภาพการสร้างชุดทดสอบ (Test Suite) และกรณีทดสอบ (Test Case) แบบอัตโนมัติระดับ **Unit Testing** บนภาษา Java ระหว่าง 2 แนวทาง:

1. **Automated Test Case Generation Algorithm** (อัลกอริทึม — ไม่ใช่ AI Chatbot)
2. **Generative AI / AI-Assisting Tools** (ใช้ LLM ช่วยเขียนเทส)

ทดสอบกับ Java projects ที่มีบั๊กจริงใน **Defects4J dataset** (17 projects) แล้ววัดผลเชิงประสิทธิภาพเพื่อสรุปข้อดี-ข้อจำกัดของแต่ละแนวทาง

---

## 2. Objectives & Goals

1. นำ Automatic Test Case Generation Algorithm มาสร้างชุดทดสอบ/กรณีทดสอบแบบอัตโนมัติได้จริง
2. ใช้ AI-Assisting Tools/Generative AI มาสร้างชุดทดสอบแบบอัตโนมัติได้จริง
3. ตรวจสอบความถูกต้องและวัดความครอบคลุมของชุดทดสอบได้
4. วัดประสิทธิภาพทั้งสองแนวทางเพื่อสรุปว่าเครื่องมือใดเหมาะกับบริบทใด

**เป้าหมายเชิงปฏิบัติของกลุ่ม:** รันทั้ง 4 เครื่องมือกับ Java projects **ทั้งหมดใน Defects4J** (ตามที่อาจารย์สั่งเพิ่มเติม ไม่ใช่แค่สุ่มบางตัว) ผ่านระบบอัตโนมัติที่ **resume ได้** เพราะปริมาณงานมีหลักร้อยบั๊ก

---

## 3. Methodology & Tech Stack

### 3.1 Algorithm ที่เลือกใช้ (ยืนยันแล้วว่าไม่ซ้ำกลุ่มอื่น — ดูหัวข้อ 7.1)

| ด้าน | Algorithm 1 | Algorithm 2 |
|---|---|---|
| **ชื่อ Algorithm** | **DynaMOSA** (Dynamic Many-Objective Sorting Algorithm) | **Reanimator** (Backward-search Symbolic Test Generation Algorithm) |
| **Tool ที่ใช้ implement** | EvoSuite | Kex |
| **แนวทาง** | Search-based (Genetic Algorithm, Many-Objective Optimization) | Symbolic Execution + Backward-search |
| **เปเปอร์ต้นฉบับ** | Panichella, Kifetew & Tonella (2018), IEEE TSE | Abdullin, Akhin, Belyaev (SBST 2021/2022); Abdullin & Itsykson (2022) |
| **Repository** | https://www.evosuite.org | https://github.com/vorpal-research/kex |
| **วิธีติดตั้ง** | **ไม่ต้องติดตั้งแยก** — `defects4j init.sh` ดาวน์โหลด EvoSuite jar ให้อัตโนมัติ | Build เองด้วย **Maven** (`mvn clean package -Psolver -Dsolver=z3`) |
| **วิธีรัน** | `defects4j test -w <dir> -tool evosuite` (สำเร็จรูป) | `python3 kex.py --classpath <arg> --target <arg> --output <arg> --mode concolic` |

### 3.2 AI-Assisting Tools ที่เลือกใช้

- **Gemini** — Prompt แบบ Markdown/Plain structure
- **Claude** — Prompt แบบ XML Tags (`<source_code>`, `<requirements>`, `<output_format>`)

ทั้งสองมี Generic Template + Guideline ปรับแต่งเฉพาะกรณี (dependency ซับซ้อน, compile error, coverage ต่ำ) เขียนไว้ครบแล้วในรายงานรอบ 1 และย้ายมาเป็น Python template string ใน `ai_generate.py` แล้ว

### 3.3 Dataset

**Defects4J** — ฐานข้อมูลบั๊กจริงของ Java projects (Just, Jalali & Ernst, 2014, ISSTA) ครอบคลุม 17 projects: `Chart, Cli, Closure, Codec, Collections, Compress, Csv, Gson, JacksonCore, JacksonDatabind, JacksonXml, Jsoup, JxPath, Lang, Math, Mockito, Time`
Source: https://github.com/rjust/defects4j

### 3.4 Metrics ที่วัด

1. Line Coverage
2. Branch Coverage
3. Fault Detection Rate (test ต้อง Fail บนเวอร์ชัน buggy `b` และ Pass บนเวอร์ชัน fixed `f`)
4. Code coverage ratio
5. อนุญาตให้ทำซ้ำหลายรอบหาค่าเฉลี่ย และปรับ Configuration ต่างกันได้ (เช่น Search Budget)

### 3.5 Infrastructure (เปลี่ยนแปลงสำคัญจากรอบก่อน — รวมเป็นชุดเดียวให้ทั้งทีมแล้ว)

- **Docker Desktop** (Windows/Mac) — รัน container เดียวกันทุกคนในกลุ่ม กันปัญหา environment ไม่ตรงกัน
- **Dockerfile ตัวเดียว รองรับทั้ง 4 สาย**: Ubuntu 22.04 + Java 8 + Maven + Perl/cpanm + Defects4J (พร้อม EvoSuite/Randoop/Major ที่ init.sh โหลดให้อัตโนมัติ) + Kex (build จาก source) + Python libs (`google-generativeai`, `anthropic`)
- **Java 8 ตัวเดียว** ใช้ได้ทั้ง Defects4J และ Kex (Kex รองรับ JDK 8/11/17 — ไม่ต้อง Multi-JDK ตามที่เข้าใจผิดตอนแรก)
- **GitHub Repo** — โครงสร้างโฟลเดอร์วางแล้วครบ (ดูหัวข้อ 5)
- **Python scripts 2 ตัวหลัก**:
  - `run_benchmark.py` — รองรับ `--tool kex` หรือ `--tool evosuite`, โหมด `--project/--bug` (เดี่ยว), `--sample-17` (ตัวแทน), `--all-bugs` (ทั้งหมด), และ `--resume` (มี `progress.json` กันรันซ้ำ)
  - `ai_generate.py` — ดึง source code จริงจาก Defects4J checkout มาแทนค่าใน Prompt Template แล้วยิง Gemini/Claude API อัตโนมัติ บันทึก prompt+response+test code ครบ

---

## 4. Execution & Step-by-Step Process (ภาพรวมตั้งแต่ต้นจนจบ)

```
Phase 0: วางแผน & เลือก Algorithm/AI Tool (ไม่ซ้ำกลุ่มอื่น)                    ✅ เสร็จแล้ว
Phase 1: เขียนรายงานรอบ 1 (Algorithm study + Prompt design)                    ✅ เสร็จแล้ว (ส่งแล้ว 22 ส.ค. 2569)
Phase 2: เตรียม Infrastructure
   ├─ 2.1 สร้าง GitHub repo + โครงสร้างโฟลเดอร์ครบ                            ✅ เสร็จแล้ว (draft พร้อมใช้)
   ├─ 2.2 เขียน Dockerfile รวมทั้ง 4 สาย (EvoSuite/Kex/AI deps)                ✅ เสร็จแล้ว (draft พร้อมใช้)
   ├─ 2.3 เขียน run_benchmark.py (รองรับ --tool kex/evosuite + resume)        ✅ เสร็จแล้ว (draft พร้อมใช้)
   ├─ 2.4 เขียน ai_generate.py (Gemini/Claude prompt automation)              ✅ เสร็จแล้ว (draft พร้อมใช้)
   ├─ 2.5 ติดตั้ง Docker Desktop ที่เครื่องสมาชิกทุกคน                        ⬜ ยังไม่เริ่ม
   ├─ 2.6 Build image จริงครั้งแรก (docker-compose up -d --build)             ⬜ ยังไม่เริ่ม — ยังไม่เคย build เลย
   ├─ 2.7 ทดสอบว่า defects4j + EvoSuite jar + Kex ใช้งานได้จริงใน container   ⬜ ยังไม่เริ่ม
   └─ 2.8 Push ไฟล์ทั้งหมดขึ้น GitHub ครั้งแรก                                ⬜ ยังไม่เริ่ม
Phase 3: เตรียม Target Classes จาก Defects4J (checkout+compile อัตโนมัติ)      ⬜ ยังไม่เริ่ม
Phase 4: รันเครื่องมือสร้างเทสจริง (คู่ขนาน 4 สาย ผ่าน scripts ที่เตรียมไว้)   ⬜ ยังไม่เริ่ม
Phase 5: วัดผล Coverage / Fault Detection Rate ผ่าน defects4j coverage         ⬜ ยังไม่เริ่ม
Phase 6: วิเคราะห์ผล + เขียนรายงานฉบับสมบูรณ์                                 ⬜ ยังไม่เริ่ม
Phase 7: เตรียม Presentation & Demo                                          ⬜ ยังไม่เริ่ม
Phase 8: ส่งงานรอบ 2 ผ่าน GitHub + Google Classroom                          ⬜ ยังไม่เริ่ม (Deadline: วันสุดท้ายของการเรียนการสอน)
```

---

## 5. Current Progress (Completed)

✅ **สิ่งที่เสร็จสมบูรณ์แล้ว:**

1. **เลือก Algorithm ครบและยืนยันไม่ซ้ำกับกลุ่มอื่น** — DynaMOSA (EvoSuite) + Reanimator (Kex) อาจารย์ยืนยันเกณฑ์ "ห้ามซ้ำ" คือดูที่**ชื่อ Algorithm เฉพาะเจาะจง ไม่ใช่ชื่อ Tool หรือตระกูลเทคนิคภาพรวม**
2. **รายงานรอบ 1 เสร็จสมบูรณ์และส่งแล้ว** (22 สิงหาคม 2569) — มีคำอธิบายกลไก DynaMOSA และ Reanimator แบบละเอียด, ตารางเปรียบเทียบ, Prompt Template ครบสำหรับ Gemini/Claude, เอกสารอ้างอิง APA ครบ
3. **แบ่งบทบาทสมาชิก 4 คนชัดเจน** ตาม Workflow Plan B (ทุกคนแตะทุกเครื่องมือในแต่ละ Phase)
4. **Infrastructure ทั้งชุดเตรียมพร้อมเป็น Draft แล้ว (ยังไม่ทดสอบจริง):**
   - โครงสร้างโฟลเดอร์ GitHub Repo ครบ (`DynaMOSA-EvoSuite/`, `Reanimator-Kex/`, `Gemini/`, `Claude/` พร้อม subfolder `Code, Configuration, Result_Round1, Result_Round2, TestCode` ตามที่อาจารย์กำหนด)
   - `README.md` หลักของ repo พร้อมตารางบทบาท, scope, metrics
   - `Dockerfile` รวม (Java 8 + Maven + Defects4J + EvoSuite auto-download + Kex build + Python AI libs)
   - `docker-compose.yml`
   - `run_benchmark.py` — รองรับทั้ง EvoSuite (`--tool evosuite`) และ Kex (`--tool kex`), มี progress tracking/resume
   - `ai_generate.py` — ระบบยิง prompt อัตโนมัติสำหรับ Gemini และ Claude พร้อมบันทึกหลักฐานครบ (prompt file, response, metadata json)
5. **ยืนยันข้อมูลทางเทคนิคสำคัญจาก source จริง** (แก้ไขความเข้าใจผิดที่เคยมี):
   - Kex build ด้วย **Maven** ไม่ใช่ Gradle
   - Kex รองรับ **JDK 8/11/17** ทั้งหมด ไม่ต้อง Multi-JDK
   - EvoSuite **ไม่ต้องติดตั้งแยก** เพราะรวมอยู่ใน `defects4j init.sh` แล้ว
   - Syntax คำสั่งจริงของ Kex: `python3 kex.py --classpath <arg> --target <arg> --output <arg> --mode <crash|symbolic|concolic|libchecker|defectchecker>`

---

## 6. Next Steps & Pending Tasks (เรียงลำดับ)

| ลำดับ | งาน | ผู้รับผิดชอบหลัก | สถานะ |
|---|---|---|---|
| 1 | ติดตั้ง Docker Desktop ที่เครื่องสมาชิกทุกคน | ทุกคน | ⬜ |
| 2 | สร้าง GitHub repo จริง + clone ลงเครื่อง + push โครงสร้างโฟลเดอร์และไฟล์ Infra ทั้งหมด | Member 4 (Infra Lead) นำ ทุกคนช่วย | ⬜ |
| 3 | **Build Docker image ครั้งแรกให้ผ่าน** (`docker-compose up -d --build`) — คาดว่าใช้เวลา 20-30 นาที เพราะโหลด EvoSuite+Randoop+Major+Kex build พร้อมกัน | Member 4 นำก่อน 1 คน แล้วแจกให้คนอื่น build ตาม | ⬜ **จุดเริ่มต้นที่สำคัญที่สุด ยังไม่เคยทำเลย** |
| 4 | ตรวจสอบ path ของ EvoSuite jar หลัง build (มี warning check ไว้ใน Dockerfile แล้ว แต่ยังไม่ยืนยันว่า path ถูกจริง) | Member 1 | ⬜ |
| 5 | ทดสอบ `python3 kex.py --help` ใน container ยืนยัน build สำเร็จ | Member 2 | ⬜ |
| 6 | ทดสอบ `defects4j info -p Lang` ยืนยัน Defects4J ติดตั้งสำเร็จ | Member 2/4 | ⬜ |
| 7 | รัน `run_benchmark.py --project Lang --bug 1 --tool evosuite` ทดสอบ pipeline EvoSuite เดี่ยว 1 bug | Member 1 | ⬜ |
| 8 | รัน `run_benchmark.py --project Lang --bug 1 --tool kex` ทดสอบ pipeline Kex เดี่ยว 1 bug | Member 2 | ⬜ |
| 9 | **ตรวจสอบ output format จริงของ Kex** — README ของ Kex แสดงตัวอย่าง output เป็น**โค้ด Kotlin** ไม่ใช่ JUnit Java โดยตรง ต้องหาทางแปลงหรือยืนยันว่ามี mode/converter ที่ได้ JUnit ตรงๆ | Member 2 | ⬜ **จุดเสี่ยงสำคัญที่สุด ยังไม่ได้ตรวจสอบ** |
| 10 | ตั้งค่า API Key (`GEMINI_API_KEY`, `ANTHROPIC_API_KEY`) แล้วทดสอบ `ai_generate.py` กับ class เดียว | Member 3 | ⬜ |
| 11 | ขยายการรันจาก 1 bug → ตัวแทนหลาย project (`--sample-17`) → ทุก bug ทั้งหมด (`--all-bugs`) ตามที่อาจารย์สั่ง | ทุกคน | ⬜ |
| 12 | เก็บผล Coverage/Fault Detection Rate รวมเป็นตารางกลาง | Member 4 | ⬜ |
| 13 | เขียนบทวิเคราะห์เปรียบเทียบ 4 เครื่องมือ + จุดอ่อน-จุดแข็ง | ทุกคน (แบ่งคนละ section) | ⬜ |
| 14 | Commit งานขึ้น GitHub สม่ำเสมอ ทุกคนต้องมี commit history ของตัวเอง | ทุกคน | ⬜ |
| 15 | เตรียม Presentation + Demo | ทุกคน | ⬜ |
| 16 | ส่งรายงานฉบับสมบูรณ์ + Repo ผ่าน Google Classroom | ตัวแทนกลุ่ม | ⬜ |

---

## 7. Key Context & Important Constraints

### 7.1 กฎการเลือก Algorithm (ห้ามเปลี่ยนโดยไม่เช็คก่อน)

- **First-come-first-serve**: ห้ามซ้ำกับกลุ่มอื่นในห้อง — อาจารย์ยืนยันว่าเกณฑ์ "ซ้ำ" ดูที่**ชื่อ Algorithm เฉพาะเจาะจง** (เช่น DynaMOSA ≠ MOSA ≠ GA แม้มาจาก tool/ตระกูลเดียวกัน)
- **Algorithm ที่กลุ่มอื่นเลือกไปแล้ว** (ห้ามใช้ชื่อซ้ำ): GA, MOSA, WTS, MIO, JTExpert, SBST (generic), Randoop, QuickCheck, GRT, JDOOP, Tardis, Coverage-Guided Fuzzing, DSE/Concolic Testing (generic), Combinatorial Testing (IPO), Hill Climbing, Alternating Variable Method, Botsing, CATG, Simulated Annealing, PSO, Diffblue Cover, Symflower
- **กลุ่มเราเลือก**: DynaMOSA + Reanimator — ยืนยันแล้วว่าไม่ซ้ำ

### 7.2 ข้อจำกัดทางเทคนิคของ Kex/Reanimator (จากเปเปอร์ SBST 2021 — ต้องระวังตอนรันจริง)

1. **State explosion** — วิเคราะห์โปรแกรมขนาดใหญ่ไม่ไหว
2. **Symbolic input ที่แปลงเป็นโค้ดไม่ได้** — บางกรณี Reanimator สร้างผ่าน public API จริงไม่ได้ ต้อง skip
3. **ไม่รองรับ** abstract class, non-static inner class, Java reflection type
4. **ผลจริงจาก SBST 2021**: Kex วิเคราะห์ไม่สำเร็จ 4 จาก 6 โปรเจกต์ในการแข่งขัน ทำ coverage ได้เฉพาะ guava (line ~20%, branch ~14% ที่ time budget 30 วินาที)
   → เลือก target class เรียบง่ายก่อนเป็นชุดแรก เตรียมใจว่า Kex อาจรันไม่ผ่านหลาย class ใน Defects4J

### 7.3 ข้อมูลทางเทคนิคที่ยืนยันแล้ว (แก้ไขความเข้าใจผิดที่เคยมี — สำคัญมาก)

| เรื่อง | เข้าใจผิดเดิม | ความจริงที่ยืนยันแล้วจาก source | 
|---|---|---|
| Kex build tool | Gradle | **Maven** (`mvn clean package -Psolver -Dsolver=z3`) |
| Kex Java version | ต้อง Java 17 แยกจาก Defects4J (Java 8) | รองรับ **JDK 8, 11, 17 ทั้งหมด** — ใช้ Java 8 ตัวเดียวพอ |
| Kex run command | `kex.sh` | `python3 kex.py --classpath <arg> --target <arg> --output <arg> --mode <mode>` |
| EvoSuite ติดตั้ง | ต้อง config เพิ่มเอง | **ไม่ต้อง** — `defects4j init.sh` โหลดให้อัตโนมัติ |
| Kex output format | (ไม่เคยตรวจสอบ) | ⚠️ **ยังไม่ยืนยัน** — ตัวอย่างใน README เป็นโค้ด **Kotlin** ไม่ใช่ JUnit Java ตรงๆ ต้องตรวจสอบเพิ่มก่อนใช้จริง |

### 7.4 กฎเหล็กของ Test Suite ที่ทุกสายต้องทำตาม

1. ใช้ JUnit 4 เท่านั้น
2. ทุก `@Test` ต้องมี `timeout` กำหนดไว้ (กัน infinite loop)
3. ห้ามใช้ `System.currentTimeMillis()` หรือค่าสุ่มที่ไม่ fix seed
4. Package declaration ต้องตรงกับ target class

### 7.5 Deadline และเกณฑ์คะแนน

| รายการ | สัดส่วนคะแนน | Deadline |
|---|---|---|
| รายงานรอบ 1 | 5% | 22 สิงหาคม 2569 (ผ่านแล้ว) |
| รายงานรอบ 2 + Source code + Demo | 10% | วันสุดท้ายของการเรียนการสอนรายวิชา |
| รวมทั้งโปรเจกต์ | 15% ของเกรดวิชา | — |

**ข้อกำหนดการส่ง:** ไฟล์รายงาน .docx/.xlsx/.pdf, ระบุชื่อ-รหัสสมาชิกใน Google Classroom และ `readme.md` ของ GitHub, งานต้องทำซ้ำได้ (Reproducibility)

### 7.6 บริบทของทีม (4 คน) และ Workflow Model

| คน | บทบาท | Focus |
|---|---|---|
| Member 1 | Algorithm Lead 1 | DynaMOSA / EvoSuite |
| Member 2 | Algorithm Lead 2 | Reanimator / Kex |
| Member 3 | AI Prompt Engineer | Gemini + Claude |
| Member 4 | Infrastructure & Data Lead | Docker, Defects4J extraction, Data aggregation |

**Workflow Model**: Plan B — แบ่งงานตาม Phase ให้ทุกคนได้ลองทุกเครื่องมือ กระจาย commit history ให้ตรงกับที่อาจารย์ต้องการเห็นว่าทุกคนมีส่วนร่วมจริง (ไม่ใช่คนเดียว push แทนทั้งกลุ่ม)

### 7.7 โครงสร้าง Repository ปัจจุบัน (Draft พร้อม push)

```
ProjectSQA/
├── README.md
├── docker/
│   ├── Dockerfile              # รวมทั้ง 4 สายในไฟล์เดียว
│   └── docker-compose.yml
├── scripts/
│   ├── run_benchmark.py        # --tool kex/evosuite, --sample-17, --all-bugs, --resume
│   └── ai_generate.py          # ยิง Gemini/Claude API อัตโนมัติ
├── DynaMOSA-EvoSuite/{Code,Configuration,Result_Round1,Result_Round2,TestCode}/
├── Reanimator-Kex/{Code,Configuration,Result_Round1,Result_Round2,TestCode}/
├── Gemini/{Prompt,Result,TestCode}/
└── Claude/{Prompt,Result,TestCode}/
```

### 7.8 สิ่งที่ AI ตัวถัดไปควรระวังไม่ให้หลุดทิศทาง

- **ห้ามแนะนำเปลี่ยน Algorithm** โดยไม่เช็คตารางกลุ่มอื่นในหัวข้อ 7.1 ก่อน
- **ห้ามเข้าใจผิดว่า Kex ใช้ Gradle หรือต้องใช้ Java 17 แยก** — แก้ไขแล้วตามหัวข้อ 7.3
- ยึด syntax จริงจาก Kex README เวลาช่วย debug (`python3 kex.py ...` ไม่ใช่ `kex.sh`)
- **สิ่งที่ยังไม่เคยทดสอบจริงเลยแม้แต่ครั้งเดียวคือ**: build Docker image, รัน EvoSuite/Kex จริงกับ bug ใดๆ, ยิง AI API จริง — ทุกอย่างตอนนี้เป็นเพียง Draft/Script ที่เตรียมไว้ล่วงหน้าเท่านั้น เวลาตอบคำถามต่อจากนี้ ให้สันนิษฐานว่า **ยังไม่มีอะไรถูกรันจริงเลย** และช่วยพาไล่ debug ทีละสเต็ปตามลำดับใน Section 6
- ผู้ใช้เอกสารนี้ไม่เคยใช้ Docker มาก่อน — อธิบายคำสั่ง Docker แบบละเอียดทุกครั้งที่เกี่ยวข้อง อย่าข้ามขั้นตอนพื้นฐาน
