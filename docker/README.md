# Docker Environment

```text
docker/
├── Dockerfile
└── docker-compose.yml
```

Docker Compose ปัจจุบันกำหนด:

```text
service:        sqa_kex
container:      sqa_kex_container
working_dir:    /workspace
repo mount:     ../:/workspace
KEX data:       kex_home_data:/root/kex-testing
```

## Build และ Start

จาก root repository:

```bash
docker compose -f docker/docker-compose.yml up -d --build sqa_kex
```

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

ตัวอย่าง:

```bash
python3 scripts/run_benchmark.py --project Lang --bug 1 --tool kex
python3 scripts/run_coverage_benchmark.py --tool kex --timeout 600
```

repository ถูก mount เข้า `/workspace` ดังนั้นผลที่ scripts เขียนภายใต้ repository จะปรากฏบน host ด้วย
