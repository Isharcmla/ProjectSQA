# Final Benchmark Results: Comparison of Four Test Generation Techniques

## 1. ภาพรวมการทดลอง

การทดลองนี้เปรียบเทียบเทคนิคการสร้าง Test Case จำนวน 4 เทคนิค ได้แก่ EvoSuite ที่ใช้อัลกอริทึม DynaMOSA, KEX/Reanimator, Gemini และ Claude โดยใช้ Defects4J เป็นชุดข้อมูลมาตรฐาน และกำหนดจักรวาลของการทดลองทั้งหมดจำนวน **854 bugs**

การประเมินผลพิจารณาทั้งความสำเร็จในการนำ Test Case ไปประเมิน ความสามารถในการตรวจพบข้อบกพร่อง จำนวน Test Case ที่สร้างขึ้น และ Test Coverage โดย Coverage ที่รายงานประกอบด้วย Line Coverage และ Condition Coverage ตามผลที่ Defects4J รายงาน

## 2. ผลการประเมินภาพรวมบน 854 Bugs

| Technique | Eval Success | Eval Success / 854 | Bugs Detected | Overall FDR | Coverage Success / 854 |
|---|---:|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 825 | 96.604% | 2 | 0.234% | 93.443% |
| KEX (Reanimator) | 684 | 80.094% | 6 | 0.703% | 59.368% |
| Gemini | 323 | 37.822% | 29 | 3.396% | 36.534% |
| Claude | 322 | 37.705% | 19 | 2.225% | 37.588% |

จากผลการประเมินพบว่า **EvoSuite มีความสำเร็จในการ Evaluation สูงที่สุด** โดยประเมินสำเร็จ 825 จาก 854 bugs คิดเป็น 96.604% รองลงมาคือ KEX ซึ่งประเมินสำเร็จ 684 bugs หรือ 80.094% ขณะที่ Gemini และ Claude มีอัตราความสำเร็จในการ Evaluation ใกล้เคียงกัน ที่ 37.822% และ 37.705% ตามลำดับ

เมื่อพิจารณาความสามารถในการตรวจพบข้อบกพร่องบน benchmark ทั้ง 854 bugs พบว่า **Gemini ตรวจพบข้อบกพร่อง ได้มากที่สุดจำนวน 29 bugs** คิดเป็น Overall Fault Detection Rate 3.396% รองลงมาคือ Claude จำนวน 19 bugs (2.225%), KEX จำนวน 6 bugs (0.703%) และ EvoSuite จำนวน 2 bugs (0.234%)

อย่างไรก็ตาม การตีความ Fault Detection Rate ควรพิจารณา ร่วมกับ Evaluation Success เนื่องจากแต่ละเทคนิคมีจำนวน Test Case ที่สามารถนำไปประเมินได้สำเร็จแตกต่างกัน

## 3. Fault Detection Rate เฉพาะกรณีที่ Evaluation สำเร็จ

| Technique | Evaluation Success | Bugs Detected | FDR among Successful Evaluation |
|---|---:|---:|---:|
| EvoSuite (DynaMOSA) | 825 | 2 | 0.242% |
| KEX (Reanimator) | 684 | 6 | 0.877% |
| Gemini | 323 | 29 | 8.978% |
| Claude | 322 | 19 | 5.901% |

เมื่อคำนวณเฉพาะกรณีที่ Evaluation สำเร็จ Gemini มี Fault Detection Rate เท่ากับ 8.978% สูงกว่า Claude ซึ่งได้ 5.901% ส่วน KEX และ EvoSuite ได้ 0.877% และ 0.242% ตามลำดับ

## 4. จำนวน Test Case ที่สร้างและ Bug-Revealing Tests

| Technique | Candidate Tests | Bug-Revealing Tests |
|---|---:|---:|
| EvoSuite (DynaMOSA) | 46457 | 2 |
| KEX (Reanimator) | 65099 | 22 |
| Gemini | 18328 | 44 |
| Claude | 26390 | 45 |

KEX สร้าง Candidate Tests มากที่สุดจำนวน 65,099 tests รองลงมาคือ EvoSuite 46,457 tests, Claude 26,390 tests และ Gemini 18,328 tests อย่างไรก็ตาม จำนวน Test Case ที่มากกว่าไม่ได้หมายความว่าจะตรวจพบข้อบกพร่องได้มากกว่าเสมอไป เนื่องจาก Gemini ซึ่งสร้าง Candidate Tests น้อยกว่า KEX และ EvoSuite สามารถตรวจพบ bugs ในภาพรวมได้มากที่สุด

## 5. ผลการวัด Test Coverage

Coverage เฉลี่ยในส่วนนี้คำนวณเฉพาะกรณีที่ Defects4J สามารถวัด Coverage ได้สำเร็จ โดยไม่นำกรณีที่ Coverage Failed มากำหนดเป็น 0%

| Technique | Coverage Success | Mean Line | Median Line | Mean Condition | Median Condition |
|---|---:|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 798/854 | 67.358% | 80.25% | 62.862% | 75.0% |
| KEX (Reanimator) | 507/854 | 42.011% | 42.8% | 30.501% | 25.4% |
| Gemini | 312/854 | 92.695% | 97.9% | 87.43% | 93.2% |
| Claude | 321/854 | 79.626% | 94.6% | 71.613% | 85.05% |

ในกรณีที่วัด Coverage สำเร็จ Gemini มีค่าเฉลี่ย Line Coverage สูงที่สุดที่ 92.695% และ Condition Coverage สูงที่สุดที่ 87.430% รองลงมาคือ Claude ซึ่งมี Mean Line Coverage 79.626% และ Mean Condition Coverage 71.613%

EvoSuite มี Mean Line Coverage เท่ากับ 67.358% และ Mean Condition Coverage เท่ากับ 62.862% ส่วน KEX มีค่าเฉลี่ยต่ำที่สุด คือ Line Coverage 42.011% และ Condition Coverage 30.501%

อย่างไรก็ตาม ค่า Coverage เฉลี่ยดังกล่าวไม่ควรถูกพิจารณา แยกจาก Coverage Success Rate เนื่องจาก EvoSuite สามารถวัด Coverage สำเร็จได้ 798/854 bugs หรือ 93.443% ขณะที่ Gemini วัด Coverage สำเร็จ 312/854 bugs หรือ 36.534% เท่านั้น

## 6. การเปรียบเทียบบน Common Evaluation Set

เพื่อให้การเปรียบเทียบ Fault Detection มีความยุติธรรมมากขึ้น จึงพิจารณาเฉพาะ bugs ที่ทั้ง 4 เทคนิคสามารถ Evaluation ได้สำเร็จเหมือนกันทั้งหมด ซึ่งมีจำนวน **143 bugs**

| Technique | Common Cases | Bugs Detected | Common FDR | Bug-Revealing Tests |
|---|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 143 | 1 | 0.699% | 1 |
| KEX (Reanimator) | 143 | 2 | 1.399% | 12 |
| Gemini | 143 | 8 | 5.594% | 17 |
| Claude | 143 | 11 | 7.692% | 26 |

บน Common Evaluation Set จำนวน 143 bugs **Claude ตรวจพบข้อบกพร่องได้มากที่สุดจำนวน 11 bugs หรือ 7.692%** รองลงมาคือ Gemini จำนวน 8 bugs (5.594%), KEX จำนวน 2 bugs (1.399%) และ EvoSuite จำนวน 1 bug (0.699%)

ผลนี้แตกต่างจากภาพรวม 854 bugs ซึ่ง Gemini ตรวจพบข้อบกพร่องได้มากที่สุด แสดงให้เห็นว่า ผลการจัดอันดับสามารถเปลี่ยนแปลงได้เมื่อควบคุมให้แต่ละเทคนิค ถูกเปรียบเทียบบนชุด bugs เดียวกัน

## 7. การเปรียบเทียบบน Common Coverage Set

สำหรับ Coverage มี bugs ที่ทั้ง 4 เทคนิคสามารถวัด Coverage สำเร็จพร้อมกันจำนวน **129 bugs**

| Technique | Mean Line | Weighted Line | Mean Condition | Weighted Condition |
|---|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 84.505% | 84.995% | 80.071% | 80.646% |
| KEX (Reanimator) | 51.782% | 44.472% | 35.526% | 32.528% |
| Gemini | 96.122% | 88.177% | 90.891% | 80.471% |
| Claude | 92.114% | 88.693% | 83.581% | 77.571% |

เมื่อพิจารณา Mean Coverage บน 129 bugs เดียวกัน Gemini มี Mean Line Coverage สูงที่สุดที่ 96.122% และ Mean Condition Coverage สูงที่สุดที่ 90.891% รองลงมาคือ Claude ที่ 92.114% และ 83.581% ตามลำดับ

อย่างไรก็ตาม เมื่อพิจารณา Weighted Coverage Claude มี Weighted Line Coverage 88.693% สูงกว่า Gemini เล็กน้อยที่ 88.177% ขณะที่ EvoSuite มี Weighted Condition Coverage 80.646% สูงกว่า Gemini เล็กน้อยที่ 80.471%

จึงเห็นได้ว่าการใช้ Mean Coverage เพียงค่าเดียว อาจไม่สะท้อนภาพทั้งหมด และควรพิจารณา Mean, Median และ Weighted Coverage ร่วมกัน

## 8. สรุปผลการทดลอง

ผลการทดลองแสดงให้เห็นว่าไม่มีเทคนิคใดดีที่สุดในทุกมิติ โดย EvoSuite มีทั้ง Evaluation Success Rate และ Coverage Success Rate สูงที่สุด ขณะที่ KEX สามารถสร้าง Candidate Tests ได้จำนวนมาก และมี Evaluation Success Rate รวมถึง Coverage Success Rate สูงกว่า Gemini และ Claude แต่มีค่าเฉลี่ย Line/Condition Coverage และ Fault Detection Rate ต่ำกว่าเทคนิค Generative AI

สำหรับเทคนิคที่ใช้ Generative AI พบว่า Gemini และ Claude มี Coverage สูงเมื่อสามารถสร้างและประเมิน Test Case ได้สำเร็จ แต่มีอัตรา Compile/Evaluation Failure สูงกว่า EvoSuite และ KEX อย่างชัดเจน

Gemini ให้ผลดีที่สุดด้าน Overall Fault Detection บน benchmark 854 bugs โดยตรวจพบ 29 bugs ขณะที่ Claude ให้ผลดีที่สุดบน Common Evaluation Set 143 bugs โดยตรวจพบ 11 bugs

ดังนั้น การประเมินเทคนิคการสร้าง Test Case ควรพิจารณาหลายมิติร่วมกัน ได้แก่ ความสำเร็จในการสร้าง และประเมิน Test Case, Test Coverage, Fault Detection และความสามารถในการทำงานได้ครอบคลุมชุด benchmark แทนการพิจารณาค่า Coverage หรือ Fault Detection เพียงตัวชี้วัดเดียว
