# =========================================================
# Dockerfile: Environment รวมสำหรับทั้งกลุ่ม
# ใช้ได้กับทั้ง 4 สาย: DynaMOSA(EvoSuite), Reanimator(Kex), Gemini, Claude
#
# หมายเหตุสำคัญ:
# - EvoSuite ไม่ต้องติดตั้งแยก เพราะ defects4j init.sh ดาวน์โหลดให้อัตโนมัติ
#   (รวมถึง Randoop และ Major mutation tool ด้วย)
# - Kex รองรับ JDK 8/11/17 และ build ด้วย Maven (ไม่ใช่ Gradle)
# - Java 8 ตัวเดียวใช้ได้ทั้งคู่ ไม่ต้อง Multi-JDK
# =========================================================
FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive

# ---------- ติดตั้งพื้นฐาน ----------
RUN apt-get update && apt-get install -y \
    git \
    curl \
    wget \
    unzip \
    build-essential \
    cpanminus \
    perl \
    python3 \
    python3-pip \
    maven \
    ant \
    openjdk-8-jdk \
    && rm -rf /var/lib/apt/lists/*

ENV JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"

WORKDIR /workspace

# ---------- ติดตั้ง Defects4J ----------
# ขั้นตอนนี้จะดาวน์โหลด EvoSuite + Randoop + Major มาให้ครบอัตโนมัติ
# ผ่าน framework/lib/ ของ Defects4J เอง (ใช้เวลานานสุดในขั้นตอนทั้งหมด)
RUN git clone https://github.com/rjust/defects4j.git /opt/defects4j
WORKDIR /opt/defects4j
RUN cpanm --installdeps . --notest
RUN ./init.sh
ENV PATH="/opt/defects4j/framework/bin:${PATH}"

# ---------- ยืนยันว่า EvoSuite jar ถูกดาวน์โหลดมาจริง ----------
RUN ls -la /opt/defects4j/framework/lib/test_generation/generation/ || \
    echo "WARNING: ตรวจสอบ path ของ EvoSuite jar อีกครั้งหลัง build เสร็จ"

# ---------- ติดตั้ง Kex (Maven build ตาม README จริง) ----------
WORKDIR /opt
RUN git clone https://github.com/vorpal-research/kex.git /opt/kex
WORKDIR /opt/kex
RUN mvn clean package -Psolver -Dsolver=z3 -DskipTests

ENV KEX_HOME=/opt/kex
ENV PATH="${KEX_HOME}:${PATH}"

# ---------- ติดตั้ง Python dependencies (ใช้ทั้ง Kex script และ KKU IntelSphere API script) ----------
RUN pip3 install --no-cache-dir requests pandas

WORKDIR /workspace
CMD ["/bin/bash"]
