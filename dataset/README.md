# Dataset

`dataset/` เก็บข้อมูล benchmark / metadata ที่เตรียมจาก **Defects4J v3.0.1** เพื่อเป็นข้อมูลอ้างอิงของการทดลอง

```text
dataset/
├── README.md
├── benchmark_targets.csv         # Frozen target catalog — 1 แถวต่อ 1 target class (1,073 แถว)
├── defects4j/
│   └── Lang_metadata.csv         # Metadata ของ Lang 61 active bugs (ไม่มี header row)
└── target_benchmark/             # ⚠️ ไม่ถูก commit (อยู่ใน .gitignore) — สร้างด้วย build_target_benchmark.py
```

ข้อมูลในโฟลเดอร์นี้ **ไม่ใช่** generated tests และ **ไม่ใช่** ผล coverage/evaluation

การทดลองหลักอ้างอิง Project, Bug ID และ **Target Modified Classes (`classes.modified`)** ของ Defects4J — ใช้ **854 active bugs จาก 17 projects** (Lang ใช้ 61 active bugs; Lang 2, 18, 25, 48 เป็น deprecated และไม่รวม)

---

## `benchmark_targets.csv`

Frozen target catalog สร้างโดย [`scripts/build_target_benchmark.py`](../scripts/README.md) — 1 แถวต่อ 1 target class

| คอลัมน์ | ความหมาย |
|---|---|
| `Project` | ชื่อโปรเจกต์ใน Defects4J (เช่น `Lang`) |
| `Bug_ID` | หมายเลข bug |
| `Bug_Key` | `<Project>_<Bug_ID>b` (เช่น `Lang_1b`) |
| `Version` | `<Bug_ID>b` (buggy version) |
| `Target_Class` | fully-qualified class name ใน `classes.modified` |
| `Target_Index` | ลำดับของ target ภายใน bug (เริ่มที่ 1) |
| `Targets_In_Bug` | จำนวน target classes ทั้งหมดของ bug นั้น |
| `Source_Relative_Path` | path ของ source snapshot (ใต้ `target_benchmark/`) |
| `Source_Status` | `OK` หรือ `SOURCE_NOT_FOUND` |
| `Source_SHA256` | SHA-256 ของไฟล์ source snapshot |
| `Metadata_Path` | path ของ `metadata.json` ของ bug |
| `Defects4J_Info_Path` | path ของผล `defects4j info` ของ bug |

### สถิติของ catalog

| รายการ | จำนวน |
|---|---:|
| Projects | 17 |
| Active bugs | **854** |
| Target entries (แถวใน CSV) | **1,073** |
| `Source_Status = OK` | 1,070 |
| `Source_Status = SOURCE_NOT_FOUND` | 3 |
| Non-Java resource targets (`.txt`) | 3 |
| **Java runnable targets** | **1,067** |

**`SOURCE_NOT_FOUND` (3 รายการ)** — คลาสถูกสร้างขึ้นใหม่ใน commit ที่แก้บั๊ก จึงไม่มีใน buggy version: `Closure-169` (`EquivalenceMethod`), `Codec-13` (`CharSequenceUtils`), `Jsoup-71` (`PseudoTextElement`)
**Non-Java resources (3 รายการ)** — `Codec-14` มี target เป็นไฟล์ resource `.txt` (`ash_lang`, `gen_lang`, `sep_lang`)
นอกจากนี้ `Gson-14, 16, 18` มี target `com.google.gson.internal.$Gson$Types` ซึ่งเป็นชื่อคลาสที่มีเครื่องหมาย `$`

bug ส่วนใหญ่มี target เดียว (727 จาก 854 bugs); ที่มีหลาย target มี 2–7 targets และมี 1 bug ที่มี 16 targets

### จำนวน bugs และ targets แยกตามโปรเจกต์

| Project | Bugs | Targets | Project | Bugs | Targets |
|---|---:|---:|---|---:|---:|
| Chart | 26 | 28 | JacksonXml | 6 | 6 |
| Cli | 39 | 51 | Jsoup | 93 | 126 |
| Closure | 174 | 226 | JxPath | 22 | 35 |
| Codec | 18 | 28 | Lang | 61 | 61 |
| Collections | 28 | 28 | Math | 106 | 119 |
| Compress | 47 | 58 | Mockito | 38 | 46 |
| Csv | 16 | 17 | Time | 26 | 31 |
| Gson | 18 | 21 | | | |
| JacksonCore | 26 | 35 | **รวม** | **854** | **1,073** |
| JacksonDatabind | 110 | 157 | | | |

---

## `defects4j/Lang_metadata.csv`

Metadata ของ Lang 61 active bugs ที่ export จาก Defects4J CLI (`defects4j query -p Lang -q ...`) — **ไม่มี header row** (61 แถว, 8 คอลัมน์) ตามลำดับ:

| # | คอลัมน์ (Defects4J query field) | ตัวอย่าง |
|---|---|---|
| 1 | `bug.id` | `1` |
| 2 | `project.id` | `Lang` |
| 3 | `revision.id.buggy` | commit hash ของ buggy version |
| 4 | `revision.id.fixed` | commit hash ของ fixed version |
| 5 | `report.id` | `LANG-747` |
| 6 | `classes.modified` | `org.apache.commons.lang3.math.NumberUtils` |
| 7 | `tests.trigger` | `org.apache.commons.lang3.math.NumberUtilsTest::TestLang747` |
| 8 | `tests.trigger.cause` | ข้อความ failure ของ trigger test |

ไฟล์นี้เป็น shared metadata ของ Lang ตามที่กำหนดใน [`BENCHMARK_PROTOCOL_v2.md`](../BENCHMARK_PROTOCOL_v2.md) — รายการ target ของการทดลองเต็ม 17 projects อยู่ใน `benchmark_targets.csv`

---

## `target_benchmark/` (ไม่ถูก commit)

Frozen snapshot ของ source ใน buggy version ของทุก target:

```text
dataset/target_benchmark/<Project>_<BugID>b/
├── metadata.json
├── defects4j_info.txt
└── source/<package/path>/<Class>.java
```

ถูกใส่ไว้ใน `.gitignore` จึงไม่มีใน repository — **ต้องสร้างเองก่อนรัน AI generation** (`ai_benchmark_runner.py`) ภายใน Docker container:

```bash
python3 scripts/build_target_benchmark.py --project Lang --bug 1   # ทดสอบ 1 bug
python3 scripts/build_target_benchmark.py --all --resume           # ทุก active bug (รันต่อได้)
python3 scripts/build_target_benchmark.py --verify                 # ตรวจความสมบูรณ์ของ dataset
python3 scripts/dataset_audit.py                                   # audit 854 bugs / 1,073 entries / selection rules
```

`build_target_benchmark.py` checkout buggy version ไปยังโฟลเดอร์ชั่วคราว (`/tmp/project_sqa_target_extract/`) แล้วคัดลอกเฉพาะ source ของ target class ก่อนลบทิ้ง
ใช้ `Source_SHA256` ใน `benchmark_targets.csv` ตรวจว่า snapshot ที่สร้างใหม่ตรงกับที่ใช้ในการทดลอง
