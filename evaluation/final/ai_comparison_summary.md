# AI Comparison Summary: Gemini vs Claude

## ชุดข้อมูลที่ใช้เปรียบเทียบ

การเปรียบเทียบนี้ใช้เฉพาะกรณีที่ทั้ง Gemini และ Claude มีข้อมูล Token ตรงกันจำนวน **534 bugs** เพื่อให้การเปรียบเทียบใช้ชุดข้อมูลเดียวกันและลดความลำเอียงจากจำนวนกรณีที่แตกต่างกัน

## 1) การใช้ Token

### Gemini
- Total Tokens: **9,381,396**
- Average Tokens per Bug: **17,568.16**
- Median Tokens per Bug: **11,665.00**

### Claude
- Total Tokens: **15,276,530**
- Average Tokens per Bug: **28,607.73**
- Median Tokens per Bug: **22,080.00**

Gemini ใช้ Token เฉลี่ยต่อ bug น้อยกว่า Claude ในชุดข้อมูลเดียวกันจำนวน 534 bugs

## 2) ความสำเร็จในการสร้าง TestCode

### Gemini
- TestCode available: **525/534**
- Success Rate: **98.315%**

### Claude
- TestCode available: **370/534**
- Success Rate: **69.288%**

Gemini สามารถสร้าง TestCode ได้สำเร็จในสัดส่วนที่สูงกว่า Claude

## 3) ความสำเร็จในการ Evaluation

### Gemini
- Evaluation Success: **317/534**
- Evaluation Success Rate: **59.363%**

### Claude
- Evaluation Success: **232/534**
- Evaluation Success Rate: **43.446%**

Gemini มีอัตราความสำเร็จในการนำ Test Case ไป Evaluation สูงกว่า Claude

## 4) ความสามารถในการตรวจพบบั๊ก

### Gemini
- Bugs Detected: **29/534**
- Fault Detection Rate: **5.431%**

### Claude
- Bugs Detected: **14/534**
- Fault Detection Rate: **2.622%**

ในชุดข้อมูลเดียวกัน Gemini ตรวจพบข้อบกพร่องได้มากกว่า Claude

## 5) ประสิทธิภาพด้าน Token

### Gemini
- Tokens per Evaluation Success: **29,594.31**
- Tokens per Detected Bug: **323,496.41**
- Detected Bugs per 1M Tokens: **3.0912**

### Claude
- Tokens per Evaluation Success: **65,847.11**
- Tokens per Detected Bug: **1,091,180.71**
- Detected Bugs per 1M Tokens: **0.9164**

Gemini ใช้ Token ต่อผลลัพธ์ที่สำเร็จน้อยกว่า และสามารถตรวจพบบั๊กต่อหนึ่งล้าน Token ได้มากกว่า Claude

## 6) ข้อมูล Token ภาพรวม

ข้อมูลส่วนนี้ไม่ควรนำ Total Token มาเปรียบเทียบโดยตรง เนื่องจากจำนวน bugs ที่มีข้อมูล Token ของแต่ละโมเดลไม่เท่ากัน

### Gemini
- Bugs with Token Data: **534/854**
- Prompt Tokens: **5,211,763**
- Completion Tokens: **3,113,161**
- Total Tokens: **9,381,396**

### Claude
- Bugs with Token Data: **854/854**
- Prompt Tokens: **12,676,098**
- Completion Tokens: **13,278,358**
- Total Tokens: **25,954,456**

## 7) สรุป

เมื่อควบคุมให้ Gemini และ Claude ถูกเปรียบเทียบบนชุดข้อมูลร่วมจำนวน **534 bugs** ผลการทดลองแสดงให้เห็นว่า Gemini ใช้ Token น้อยกว่า Claude ทั้งในด้านค่าเฉลี่ยและค่ามัธยฐานต่อ bug ขณะเดียวกัน Gemini มีอัตราการสร้าง TestCode สำเร็จ อัตราการ Evaluation สำเร็จ และ Fault Detection Rate สูงกว่า Claude

เมื่อพิจารณาความคุ้มค่าด้านทรัพยากร Gemini ตรวจพบข้อบกพร่องได้ **3.0912 bugs ต่อหนึ่งล้าน Token** ขณะที่ Claude ตรวจพบได้ **0.9164 bugs ต่อหนึ่งล้าน Token** ดังนั้นภายใต้เงื่อนไขและชุดข้อมูลของการทดลองนี้ Gemini มีประสิทธิภาพด้านการใช้ Token ต่อผลลัพธ์ที่ดีกว่า Claude
