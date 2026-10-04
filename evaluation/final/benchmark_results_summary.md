# Final Benchmark Results: Comparison of Four Test Generation Techniques

## 1. ภาพรวมการทดลอง

การทดลองนี้เปรียบเทียบเทคนิคการสร้าง Test Case จำนวน 4 เทคนิค ได้แก่ EvoSuite ที่ใช้อัลกอริทึม DynaMOSA, KEX/Reanimator, Gemini และ Claude โดยใช้ Defects4J เป็นชุดข้อมูลมาตรฐาน และกำหนดจักรวาลของการทดลองทั้งหมดจำนวน **854 bugs**

การประเมินผลพิจารณาหลายมิติ ได้แก่ ความสำเร็จในการนำ Test Case ไป Evaluation, ความสามารถในการตรวจพบข้อบกพร่อง, จำนวน Candidate Tests และ Bug-Revealing Tests ตลอดจน Test Coverage โดย Coverage ที่รายงานประกอบด้วย Line Coverage และ Condition Coverage ตามผลที่ Defects4J รายงาน

สำหรับค่า Coverage เฉลี่ย จะคำนวณเฉพาะกรณีที่ Defects4J สามารถวัด Coverage ได้สำเร็จ โดยกรณีที่ Coverage Failed หรือ Timeout จะไม่ถูกกำหนดให้มีค่า Coverage เป็น 0%

## 2. ผลการประเมินภาพรวมบน 854 Bugs

| Technique | Eval Available | Eval Success | Eval Success / 854 | Bugs Detected | Overall FDR | Coverage Success / 854 |
|---|---:|---:|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 833 | 825 | 96.604% | 2 | 0.234% | 93.443% |
| KEX (Reanimator) | 684 | 684 | 80.094% | 6 | 0.703% | 59.368% |
| Gemini | 843 | 485 | 56.792% | 56 | 6.557% | 55.152% |
| Claude | 523 | 322 | 37.705% | 19 | 2.225% | 37.588% |

จากผลการประเมินพบว่า **EvoSuite มี Evaluation Success Rate สูงที่สุด** โดยประเมินสำเร็จ 825 จาก 854 bugs คิดเป็น 96.604% รองลงมาคือ KEX ที่ 684 bugs หรือ 80.094%, Gemini ที่ 485 bugs หรือ 56.792% และ Claude ที่ 322 bugs หรือ 37.705%

เมื่อพิจารณาความสามารถในการตรวจพบข้อบกพร่องบน benchmark ทั้ง 854 bugs พบว่า **Gemini ตรวจพบข้อบกพร่องได้มากที่สุดจำนวน 56 bugs** คิดเป็น Overall Fault Detection Rate 6.557% รองลงมาคือ Claude 19 bugs (2.225%), KEX 6 bugs (0.703%) และ EvoSuite 2 bugs (0.234%)

อย่างไรก็ตาม Fault Detection Rate ควรพิจารณาร่วมกับ Evaluation Success เนื่องจากแต่ละเทคนิคมีจำนวน Test Case ที่สามารถนำไป Compile และ Evaluation ได้สำเร็จแตกต่างกัน

## 3. Fault Detection Rate เฉพาะกรณีที่ Evaluation สำเร็จ

| Technique | Evaluation Success | Bugs Detected | FDR among Successful Evaluation |
|---|---:|---:|---:|
| EvoSuite (DynaMOSA) | 825 | 2 | 0.242% |
| KEX (Reanimator) | 684 | 6 | 0.877% |
| Gemini | 485 | 56 | 11.546% |
| Claude | 322 | 19 | 5.901% |

เมื่อพิจารณาเฉพาะกรณีที่ Evaluation สำเร็จ Gemini มี Fault Detection Rate เท่ากับ **11.546%** สูงที่สุดในทั้ง 4 เทคนิค รองลงมาคือ Claude 5.901%, KEX 0.877% และ EvoSuite 0.242%

ผลนี้แสดงให้เห็นว่าแม้ Generative AI จะมีความล้มเหลวในการ Compile/Evaluation มากกว่า EvoSuite และ KEX แต่ในกลุ่ม Test Case ที่สามารถนำไป Evaluation ได้สำเร็จ Gemini และ Claude มีโอกาสตรวจพบข้อบกพร่องสูงกว่า

## 4. จำนวน Candidate Tests และ Bug-Revealing Tests

| Technique | Candidate Tests | Bug-Revealing Tests |
|---|---:|---:|
| EvoSuite (DynaMOSA) | 46,457 | 2 |
| KEX (Reanimator) | 65,099 | 22 |
| Gemini | 29,285 | 82 |
| Claude | 26,390 | 45 |

KEX สร้าง Candidate Tests มากที่สุดจำนวน 65,099 tests รองลงมาคือ EvoSuite 46,457 tests, Gemini 29,285 tests และ Claude 26,390 tests

อย่างไรก็ตาม จำนวน Candidate Tests ที่มากกว่าไม่ได้หมายความว่าจะตรวจพบข้อบกพร่องได้มากกว่าเสมอไป โดย Gemini มี Candidate Tests น้อยกว่า KEX และ EvoSuite แต่มี Bug-Revealing Tests มากที่สุดจำนวน 82 tests และตรวจพบข้อบกพร่องได้มากที่สุดจำนวน 56 bugs

## 5. ผลการวัด Test Coverage

| Technique | Coverage Success | Success / 854 | Mean Line | Median Line | Mean Condition | Median Condition |
|---|---:|---:|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 798 | 93.443% | 67.358% | 80.25% | 62.862% | 75.0% |
| KEX (Reanimator) | 507 | 59.368% | 42.011% | 42.8% | 30.501% | 25.4% |
| Gemini | 471 | 55.152% | 85.799% | 97.1% | 80.545% | 92.3% |
| Claude | 321 | 37.588% | 79.626% | 94.6% | 71.613% | 85.05% |

เมื่อพิจารณาเฉพาะกรณีที่วัด Coverage สำเร็จ Gemini มี Mean Line Coverage สูงที่สุดที่ **85.799%** และ Mean Condition Coverage สูงที่สุดที่ **80.545%** รองลงมาคือ Claude ที่ 79.626% และ 71.613%

EvoSuite มี Mean Line Coverage 67.358% และ Mean Condition Coverage 62.862% ส่วน KEX มีค่าเฉลี่ยต่ำที่สุดคือ 42.011% และ 30.501%

อย่างไรก็ตาม Coverage เฉลี่ยต้องพิจารณาควบคู่กับ Coverage Success Rate เนื่องจาก EvoSuite สามารถวัด Coverage สำเร็จได้ถึง **798/854 bugs (93.443%)** ขณะที่ Gemini สำเร็จ 471/854 (55.152%), KEX 507/854 (59.368%) และ Claude 321/854 (37.588%)

ดังนั้นค่า Coverage สูงในกรณีที่สำเร็จไม่ได้หมายความว่าเทคนิคดังกล่าวสามารถให้ผล Coverage ได้ครอบคลุม benchmark ทั้งหมดมากที่สุด

## 6. การเปรียบเทียบบน Common Evaluation Set

เพื่อให้การเปรียบเทียบ Fault Detection มีความยุติธรรมมากขึ้น จึงพิจารณาเฉพาะ bugs ที่ทั้ง 4 เทคนิคสามารถ Evaluation ได้สำเร็จเหมือนกันทั้งหมด ซึ่งมีจำนวน **200 bugs**

| Technique | Common Cases | Bugs Detected | Common FDR | Bug-Revealing Tests |
|---|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 200 | 1 | 0.5% | 1 |
| KEX (Reanimator) | 200 | 2 | 1.0% | 12 |
| Gemini | 200 | 21 | 10.5% | 33 |
| Claude | 200 | 15 | 7.5% | 39 |

บน Common Evaluation Set จำนวน 200 bugs **Gemini ตรวจพบข้อบกพร่องได้มากที่สุดจำนวน 21 bugs หรือ 10.5%** รองลงมาคือ Claude จำนวน 15 bugs (7.5%), KEX 2 bugs (1.0%) และ EvoSuite 1 bug (0.5%)

ผลบน Common Evaluation Set สอดคล้องกับผลภาพรวม 854 bugs โดย Gemini ยังคงมี Fault Detection Rate สูงที่สุดเมื่อควบคุมให้ทั้ง 4 เทคนิคถูกประเมินบนชุด bugs เดียวกัน

## 7. การเปรียบเทียบบน Common Coverage Set

สำหรับ Coverage มี bugs ที่ทั้ง 4 เทคนิคสามารถวัด Coverage สำเร็จพร้อมกันจำนวน **177 bugs**

| Technique | Mean Line | Weighted Line | Mean Condition | Weighted Condition |
|---|---:|---:|---:|---:|
| EvoSuite (DynaMOSA) | 80.272% | 80.265% | 77.216% | 76.044% |
| KEX (Reanimator) | 52.126% | 44.981% | 38.959% | 34.426% |
| Gemini | 91.073% | 86.009% | 86.648% | 78.364% |
| Claude | 87.854% | 86.473% | 80.814% | 75.878% |

เมื่อเปรียบเทียบบน 177 bugs เดียวกัน Gemini มี Mean Line Coverage สูงที่สุดที่ **91.073%** และ Mean Condition Coverage สูงที่สุดที่ **86.648%**

Claude มี Mean Line Coverage 87.854% และ Mean Condition Coverage 80.814% ขณะที่ EvoSuite ได้ 80.272% และ 77.216% และ KEX ได้ 52.126% และ 38.959%

เมื่อพิจารณา Weighted Line Coverage พบว่า Claude ได้ 86.473% สูงกว่า Gemini เล็กน้อยที่ 86.009% ขณะที่ Weighted Condition Coverage ของ Gemini สูงที่สุดที่ 78.364%

ผลดังกล่าวแสดงให้เห็นว่าการใช้ Mean Coverage เพียงค่าเดียวอาจไม่สะท้อนลักษณะของข้อมูลทั้งหมด จึงควรพิจารณาทั้ง Mean, Median และ Weighted Coverage ประกอบกัน

## 8. ความสำเร็จและความล้มเหลวของแต่ละเทคนิค

จาก benchmark ทั้ง 854 bugs มีผล Evaluation ดังนี้

- EvoSuite: success 825, compile failed 8 และ missing 21
- KEX: success 684 และ missing 170
- Gemini: success 485, compile failed 358 และ missing 11
- Claude: success 322, compile failed 201 และ missing 331

สำหรับ Coverage:

- EvoSuite: success 798, coverage failed 35 และ missing 21
- KEX: success 507, coverage failed 177 และ missing 170
- Gemini: success 471, coverage failed 371, timeout 1 และ missing 11
- Claude: success 321, coverage failed 202 และ missing 331

คำว่า missing ในผลรวมหมายถึงไม่มี Evaluation/Coverage result สำหรับ bug นั้นภายใต้ขั้นตอนดังกล่าว ไม่ได้ถูกนำไปตีความว่าเป็น Coverage 0%

## 9. สรุปผลการทดลอง

ผลการทดลองแสดงให้เห็นว่า **ไม่มีเทคนิคใดดีที่สุดในทุกมิติ**

EvoSuite มี Evaluation Success Rate และ Coverage Success Rate สูงที่สุด แสดงถึงความเสถียรในการสร้างและนำ Test Case ไปใช้งานบน Defects4J

KEX มี Evaluation Success Rate สูงเป็นอันดับสองและสร้าง Candidate Tests ได้มากที่สุด แต่มีค่าเฉลี่ย Line/Condition Coverage และ Fault Detection Rate ต่ำกว่าเทคนิค Generative AI

Gemini มี Evaluation และ Coverage Success Rate ต่ำกว่า EvoSuite และ KEX แต่ให้ผลดีที่สุดในด้าน Fault Detection โดยตรวจพบ 56 จาก 854 bugs และยังมี Mean Line/Condition Coverage สูงที่สุดในกลุ่มที่ Coverage สำเร็จ รวมทั้งยังได้ผลดีที่สุดด้าน Fault Detection บน Common Evaluation Set

Claude มีความสำเร็จในการสร้างและ Evaluation ต่ำกว่า Gemini แต่ยังมี Fault Detection Rate และ Coverage ในกลุ่มที่สำเร็จสูงกว่าเทคนิค Automatic Test Generation บางเทคนิคในหลายตัวชี้วัด

ดังนั้นการประเมิน Test Generation Technique ควรพิจารณาหลายมิติร่วมกัน ได้แก่ ความสามารถในการสร้าง Test Case, Compilation/Evaluation Success, Test Coverage, Fault Detection และความครอบคลุมของ benchmark แทนการพิจารณาเพียง Coverage หรือ Fault Detection Metric ใด Metric หนึ่ง
