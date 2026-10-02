# Gemini

ส่วนของ Generative AI test generation ด้วย Gemini

```text
Gemini/
├── Prompt/
├── Result/
└── TestCode/
```

- `Prompt/` — prompt/input ที่ใช้สร้าง Test Case
- `Result/` — metadata/result จาก generation
- `TestCode/` — generated Java/JUnit tests

การแยก Prompt, Result และ TestCode ทำให้สามารถตรวจสอบที่มาของ generated tests และนำไปประเมินภายใต้ Benchmark Protocol เดียวกับเครื่องมืออื่นได้
