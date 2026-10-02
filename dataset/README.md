# Dataset

`dataset/` ใช้เก็บข้อมูล benchmark/metadata ที่เตรียมจาก Defects4J สำหรับเป็นข้อมูลอ้างอิงของการทดลอง

```text
dataset/
└── defects4j/
```

การทดลองหลักอ้างอิง Project, Bug ID และ Target Modified Classes ของ Defects4J โดย target classes ถูกดึงจาก `classes.modified` ตาม Benchmark Protocol

ข้อมูลในส่วนนี้ไม่ใช่ generated tests และไม่ใช่ coverage results
