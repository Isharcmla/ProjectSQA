# Docker Environment

Environment กลางสำหรับทั้งโครงการ — ใช้ image เดียวรองรับ Defects4J, DynaMOSA/EvoSuite, Reanimator/KEX, evaluation/coverage scripts และ AI generation scripts

```text
docker/
├── Dockerfile
├── docker-compose.yml
└── README.md
```

---

## สิ่งที่อยู่ใน image (`Dockerfile`)

| ส่วน | รายละเอียด |
|---|---|
| Base | `ubuntu:22.04` |
| Java | OpenJDK **8, 11, 17** ติดตั้งครบ — **default = Java 11** (`JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64`) ตามที่ Defects4J / Benchmark Protocol กำหนด |
| Build tools | Maven, Ant, build-essential, Perl + cpanminus, Subversion, `bc` |
| Timezone | `America/Los_Angeles` (Defects4J ใช้ timezone นี้ตอนรัน test) |
| Defects4J | clone จาก `https://github.com/rjust/defects4j.git` ไปที่ `/opt/defects4j` แล้วรัน `init.sh` (ดาวน์โหลด EvoSuite / Randoop / Major ให้อัตโนมัติ) |
| EvoSuite / DynaMOSA | ไม่ต้องติดตั้งแยก — Dockerfile เพิ่ม `-Dalgorithm=DYNAMOSA` ใน `evosuite.config` เพื่อให้ benchmark ใช้ DynaMOSA จริงและทำซ้ำได้ |
| KEX | **0.0.11** จาก GitHub release zip ไปที่ `/opt/kex` (ไม่ build จาก source เพราะ Maven repository ที่ source build อ้างถึงใน environment นี้ resolve ไม่ได้) |
| Python | Python 3 + `requests`, `pandas` |
| Workspace | `/workspace` |

ตัวแปรสำคัญ: `DEFECTS4J_HOME=/opt/defects4j`, `KEX_HOME=/opt/kex`, `TZ=America/Los_Angeles`

> **หมายเหตุเรื่อง reproducibility:**
> - Dockerfile ใช้ `git clone` Defects4J โดยไม่ pin tag/commit — เวอร์ชันที่ได้คือ HEAD ของ branch default ณ เวลา build ขณะที่ Benchmark Protocol ระบุ **v3.0.1** (ตรวจเวอร์ชันได้จาก `defects4j info` / `git -C /opt/defects4j describe --tags`)
> - scripts สร้างกราฟ (`generate_final_charts.py`, `generate_ai_token_charts.py`) ใช้ `matplotlib` ซึ่ง **ไม่ได้ติดตั้งใน image** — ติดตั้งเพิ่มด้วย `pip3 install matplotlib` ก่อนรัน
> - การเรียก Gemini/Claude ใช้ KKU IntelSphere API ผ่าน `requests` — ไม่ต้องใช้ SDK ของ Google/Anthropic

---

## Docker Compose (`docker-compose.yml`)

```text
service:        sqa_kex
container:      sqa_kex_container
build context:  docker/  (Dockerfile)
working_dir:    /workspace
repo mount:     ../:/workspace          (repository ทั้งหมดบน host → /workspace)
named volume:   kex_home_data:/root/kex-testing
```

| Mount | วัตถุประสงค์ |
|---|---|
| `../:/workspace` | ผลที่ scripts เขียนใต้ repository (`Result_Round2/`, `TestCode/`, `evaluation/`, `logs/` ฯลฯ) จะปรากฏบน host ด้วย |
| `kex_home_data:/root/kex-testing` | พื้นที่ทำงานของ benchmark runner: `checkouts/` (Defects4J checkout), `results/`, `logs/`, `progress.json` — เก็บใน Docker volume ไม่ปนกับ repository และคงอยู่แม้ลบ container |

---

## Build และ Start

จาก root ของ repository:

```bash
docker compose -f docker/docker-compose.yml up -d --build sqa_kex
```

การ build ครั้งแรกใช้เวลานาน (ดาวน์โหลด Defects4J dependencies, EvoSuite/Randoop/Major, KEX)

เข้า container:

```bash
docker compose -f docker/docker-compose.yml exec sqa_kex bash
```

หรือ:

```bash
docker exec -it sqa_kex_container bash
```

จากนั้น:

```bash
cd /workspace
```

หยุด / ลบ container:

```bash
docker compose -f docker/docker-compose.yml stop sqa_kex
docker compose -f docker/docker-compose.yml down        # ลบ container (volume kex_home_data ยังอยู่)
docker compose -f docker/docker-compose.yml down -v     # ลบ volume ด้วย (checkout/progress ใน /root/kex-testing จะหาย)
```

---

## ตรวจสอบหลัง build

```bash
java -version                       # ควรเป็น 11
echo $TZ                            # America/Los_Angeles
defects4j info -p Lang              # Defects4J ใช้งานได้
python3 /opt/kex/kex.py --help      # KEX ใช้งานได้
grep DYNAMOSA /opt/defects4j/framework/lib/test_generation/bin/evosuite.config
```

---

## ตัวอย่างการใช้งานใน container

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool evosuite
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
```

ดูรายการ scripts ทั้งหมดที่ [`scripts/README.md`](../scripts/README.md)

### API keys สำหรับ AI generation

สร้าง `.env` ที่ root ของ repository (ไฟล์ถูก mount เข้า `/workspace/.env` และถูก `.gitignore` ไว้ — **ห้าม commit**):

```bash
cp .env.example .env     # แล้วใส่ KKU_API_KEY_1 ... (หรือ export KKU_API_KEY)
```

### เปลี่ยนเวอร์ชัน Java ชั่วคราว

```bash
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64   # หรือ java-8-openjdk-amd64 (ชื่อ path ขึ้นกับสถาปัตยกรรม CPU)
export PATH="$JAVA_HOME/bin:$PATH"
```

การทดลองหลักทั้งหมดใช้ **Java 11**
