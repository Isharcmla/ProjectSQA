# AI Comparison Summary: Gemini vs Claude

## 1. ชุดข้อมูลที่ใช้เปรียบเทียบ

การเปรียบเทียบ Gemini และ Claude ใช้ข้อมูล Token ที่ครอบคลุม benchmark เดียวกันครบ **854/854 bugs สำหรับทั้งสองโมเดล** ดังนั้นการเปรียบเทียบในส่วนนี้สามารถใช้ชุด bugs เดียวกันทั้งหมดได้โดยไม่ต้องลดขนาด Common Set

จำนวน API calls ที่บันทึกได้คือ 1,070 calls สำหรับ Gemini และ 1,087 calls สำหรับ Claude

## 2. การใช้ Token

| Metric | Gemini | Claude |
|---|---:|---:|
| Bugs with Token Data | 854/854 | 854/854 |
| Unique API Calls | 1,070 | 1,087 |
| Prompt Tokens | 8,355,510 | 12,676,098 |
| Completion Tokens | 4,870,455 | 13,278,358 |
| Total Tokens | 14,918,091 | 25,954,456 |
| Average Tokens / Bug | 17,468.49 | 30,391.63 |
| Median Tokens / Bug | 12,745.00 | 23,691.00 |

Gemini ใช้ Total Tokens จำนวน 14,918,091 tokens ต่ำกว่า Claude ที่ใช้ 25,954,456 tokens

เมื่อพิจารณาต่อ bug Gemini ใช้เฉลี่ย 17,468.49 tokens และมีค่ามัธยฐาน 12,745 tokens ขณะที่ Claude ใช้เฉลี่ย 30,391.63 tokens และมีค่ามัธยฐาน 23,691 tokens

ค่า `total_tokens` ในการวิเคราะห์นี้ใช้ค่าที่บันทึกจากข้อมูล usage ของผู้ให้บริการโดยตรง ไม่ได้สมมติว่า `total_tokens = prompt_tokens + completion_tokens` เนื่องจากข้อมูล usage ของแต่ละ provider อาจมีองค์ประกอบอื่นร่วมด้วย

## 3. ความสำเร็จของ API Generation

| Metric | Gemini | Claude |
|---|---:|---:|
| API Calls | 1,070 | 1,087 |
| Successful Calls | 1,050 | 600 |
| Failed/Truncated Calls | 20 | 487 |
| API Generation Success Rate | 98.131% | 55.198% |

Gemini มี API Generation Success Rate **98.131%** สูงกว่า Claude ที่ **55.198%** อย่างชัดเจนภายใต้ configuration และ benchmark ของการทดลองนี้

## 4. ความสำเร็จในการสร้าง TestCode

| Metric | Gemini | Claude |
|---|---:|---:|
| TestCode Available | 843/854 | 523/854 |
| TestCode Availability Rate | 98.712% | 61.241% |

Gemini สามารถสร้าง TestCode ที่นำไปใช้ในขั้นตอนต่อไปได้ 843 จาก 854 bugs หรือ 98.712% ขณะที่ Claude ได้ 523 bugs หรือ 61.241%

## 5. ความสำเร็จในการ Evaluation

| Metric | Gemini | Claude |
|---|---:|---:|
| Evaluation Success | 485/854 | 322/854 |
| Evaluation Success Rate | 56.792% | 37.705% |

แม้ Gemini จะสร้าง TestCode ได้ในสัดส่วนสูงมาก แต่มีเพียง 485 bugs ที่ผ่าน Evaluation สำเร็จ เนื่องจากยังมีกรณี Compile Failure จำนวนมาก

อย่างไรก็ตาม Gemini ยังคงมี Evaluation Success Rate สูงกว่า Claude โดยได้ 56.792% เทียบกับ 37.705%

## 6. ความสามารถในการตรวจพบบั๊ก

| Metric | Gemini | Claude |
|---|---:|---:|
| Bugs Detected | 56/854 | 19/854 |
| Fault Detection Rate | 6.557% | 2.225% |

Gemini ตรวจพบข้อบกพร่องได้ **56 bugs** ขณะที่ Claude ตรวจพบ 19 bugs

เมื่อใช้ benchmark denominator เดียวกัน 854 bugs Gemini มี Overall Fault Detection Rate 6.557% เทียบกับ Claude 2.225%

## 7. ประสิทธิภาพด้าน Token

| Metric | Gemini | Claude |
|---|---:|---:|
| Tokens / TestCode Bug | 17,696.43 | 49,626.11 |
| Tokens / Evaluation Success | 30,758.95 | 80,603.90 |
| Tokens / Detected Bug | 266,394.48 | 1,366,024.00 |
| Detected Bugs / 1M Tokens | 3.7538 | 0.7321 |

Gemini ใช้ Token ต่อ Evaluation Success ต่ำกว่า Claude และใช้ Token ต่อการตรวจพบ bug หนึ่งตัวน้อยกว่ามาก

เมื่อวัดเป็น Detected Bugs per 1M Tokens Gemini ตรวจพบได้ **3.7538 bugs ต่อหนึ่งล้าน tokens** ขณะที่ Claude ตรวจพบได้ **0.7321 bugs ต่อหนึ่งล้าน tokens**

ดังนั้น Gemini มีค่า Detected Bugs per 1M Tokens สูงกว่าประมาณ 5.13 เท่าใน benchmark นี้

## 8. Coverage ของ AI

ผล Coverage จาก benchmark ทั้ง 854 bugs มีดังนี้

| Metric | Gemini | Claude |
|---|---:|---:|
| Coverage Success | 471/854 | 321/854 |
| Coverage Success Rate | 55.152% | 37.588% |
| Mean Line Coverage* | 85.799% | 79.626% |
| Mean Condition Coverage* | 80.545% | 71.613% |

\* ค่าเฉลี่ย Coverage คำนวณเฉพาะกรณีที่ Coverage สำเร็จ

Gemini มีทั้ง Coverage Success Rate, Mean Line Coverage และ Mean Condition Coverage สูงกว่า Claude ในผลการทดลองชุดนี้

## 9. ข้อควรระวังในการตีความ

ผลการเปรียบเทียบนี้สะท้อน performance ภายใต้ prompt, model configuration, timeout, Defects4J version และ evaluation protocol ที่ใช้ในการทดลองนี้เท่านั้น

จำนวน Token ที่ต่ำกว่าหรือ Fault Detection ที่สูงกว่าไม่ควรถูกตีความว่าโมเดลหนึ่งเหนือกว่าอีกโมเดลหนึ่งในทุกสถานการณ์ เนื่องจากผลลัพธ์อาจเปลี่ยนได้ตาม prompt, target class, API behavior, model version และสภาพแวดล้อมการทดลอง

นอกจากนี้ การสร้าง TestCode สำเร็จไม่ได้หมายความว่า Test Case ดังกล่าวจะ Compile หรือผ่าน Evaluation ได้สำเร็จเสมอไป จึงควรพิจารณา Generation, Evaluation, Coverage และ Fault Detection แยกเป็นคนละขั้นตอน

## 10. สรุป

บน benchmark เดียวกันจำนวน 854 bugs Gemini ใช้ Total Tokens น้อยกว่า Claude ขณะเดียวกันมี API Generation Success Rate, TestCode Availability, Evaluation Success Rate, Coverage Success Rate และ Overall Fault Detection Rate สูงกว่า

Gemini ตรวจพบข้อบกพร่อง 56 bugs และให้ค่า 3.7538 Detected Bugs per 1M Tokens ขณะที่ Claude ตรวจพบ 19 bugs และให้ค่า 0.7321 Detected Bugs per 1M Tokens

ภายใต้เงื่อนไขของการทดลองนี้ Gemini จึงมีประสิทธิภาพด้าน Token ต่อผลลัพธ์ที่ดีกว่า Claude อย่างไรก็ตาม ผลดังกล่าวควรตีความภายในขอบเขตของ benchmark และ configuration ที่ใช้ในการทดลอง ไม่ควรสรุปเป็นคุณสมบัติทั่วไปของโมเดลนอกบริบทนี้
