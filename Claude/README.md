# Claude

ส่วนของ Generative AI test generation ด้วย Claude

```text
Claude/
├── Prompt/
├── Result/
└── TestCode/
```

repository ปัจจุบันมีตัวอย่างโครงสร้างแบบ:

```text
Claude/Prompt/Lang/1/
Claude/Result/Lang/1/
Claude/TestCode/Lang/1/
```

- `Prompt/` — prompt/input
- `Result/` — generation metadata/result
- `TestCode/` — generated Java/JUnit tests

โครงสร้างนี้ช่วยให้ย้อนตรวจความสัมพันธ์ระหว่าง prompt, generation result และ test code ของ Project/Bug เดียวกันได้
