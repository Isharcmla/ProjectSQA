# =========================================================
# Dockerfile: Environment รวมสำหรับ ProjectSQA
#
# ใช้สำหรับ:
#   1. Defects4J
#   2. DynaMOSA ผ่าน EvoSuite
#   3. Reanimator ผ่าน Kex 0.0.11
#   4. Benchmark / Python scripts
#   5. เตรียม environment สำหรับ Gemini / Claude
#
# Java:
#   - Java 11 = default สำหรับ Defects4J
#   - Java 8  = ติดตั้งไว้สำหรับ compatibility
#   - Java 17 = ติดตั้งไว้สำหรับ compatibility
#
# Kex:
#   - ใช้ Kex 0.0.11 จาก GitHub Release
#   - ไม่ build Kex จาก source ด้วย Maven
#   - หลีกเลี่ยง dependency repository ที่มีปัญหา
# =========================================================

FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive

# =========================================================
# 1. Basic tools + Java 8/11/17
# =========================================================

RUN apt-get update && apt-get install -y \
    git \
    curl \
    wget \
    unzip \
    zip \
    ca-certificates \
    build-essential \
    bc \
    cpanminus \
    perl \
    python3 \
    python3-pip \
    maven \
    ant \
    tzdata \
    openjdk-8-jdk \
    openjdk-11-jdk \
    openjdk-17-jdk \
    && rm -rf /var/lib/apt/lists/*

# =========================================================
# 2. Default Java = Java 11
#    Defects4J ที่ติดตั้งอยู่ใน environment นี้ต้องการ Java 11
# =========================================================

ENV JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
ENV PATH="${JAVA_HOME}/bin:${PATH}"

# =========================================================
# 3. Timezone
# =========================================================

ENV TZ=America/Los_Angeles

RUN ln -snf /usr/share/zoneinfo/${TZ} /etc/localtime \
    && echo ${TZ} > /etc/timezone

# =========================================================
# 4. Workspace
# =========================================================

WORKDIR /workspace

# =========================================================
# 5. Defects4J
# =========================================================

RUN git clone https://github.com/rjust/defects4j.git /opt/defects4j

WORKDIR /opt/defects4j

# ติดตั้ง Perl dependencies ของ Defects4J
RUN cpanm --installdeps . --notest

# Initialize Defects4J
RUN ./init.sh

# =========================================================
# EvoSuite / DynaMOSA benchmark configuration
#
# gen_tests.pl เรียก evosuite.sh ซึ่งอ่าน evosuite.config
# กำหนด DYNAMOSA แบบ explicit เพื่อให้ benchmark reproducible
# =========================================================

RUN grep -q '^-Dalgorithm=DYNAMOSA$' \
    /opt/defects4j/framework/lib/test_generation/bin/evosuite.config \
    || echo '-Dalgorithm=DYNAMOSA' >> \
    /opt/defects4j/framework/lib/test_generation/bin/evosuite.config

# ตรวจสอบ dependency ที่ gen_tests.pl / evosuite.sh ต้องใช้
RUN command -v bc \
    && echo "300/2/1" | bc | grep -qx "150"

# ตรวจสอบว่า DynaMOSA ถูกตั้งค่าไว้จริง
RUN grep -qx -- '-Dalgorithm=DYNAMOSA' \
    /opt/defects4j/framework/lib/test_generation/bin/evosuite.config

# Defects4J requires Subversion (svn)
RUN apt-get update \
    && apt-get install -y subversion \
    && rm -rf /var/lib/apt/lists/*
RUN svn --version --quiet

# Defects4J command
ENV DEFECTS4J_HOME=/opt/defects4j
ENV PATH="${DEFECTS4J_HOME}/framework/bin:${PATH}"

# =========================================================
# 6. ตรวจสอบ Defects4J
# =========================================================

RUN java -version

RUN defects4j info -p Chart

# =========================================================
# 7. ตรวจสอบ test-generation tools ที่ Defects4J เตรียมไว้
#    init.sh จะจัดเตรียมเครื่องมือที่ framework ต้องใช้
# =========================================================

RUN ls -la \
    /opt/defects4j/framework/lib/test_generation/generation/ \
    || echo "WARNING: ตรวจสอบ path ของ test-generation tools"

# =========================================================
# 8. ติดตั้ง Kex 0.0.11 จาก GitHub Release
#
# IMPORTANT:
# ไม่ใช้:
#   git clone Kex source + mvn clean package
#
# เพราะ source build ของ Kex อ้าง repository
# maven.apal-research.com ซึ่ง environment ปัจจุบัน resolve ไม่ได้
#
# Release ZIP มี compiled target/ มาให้แล้ว
# =========================================================

WORKDIR /opt

RUN curl -fL \
    https://github.com/vorpal-research/kex/releases/download/0.0.11/kex-0.0.11.zip \
    -o /tmp/kex-0.0.11.zip \
    && mkdir -p /opt/kex \
    && unzip -q /tmp/kex-0.0.11.zip -d /opt/kex \
    && rm -f /tmp/kex-0.0.11.zip

ENV KEX_HOME=/opt/kex
ENV PATH="${KEX_HOME}:${PATH}"

# =========================================================
# 9. ตรวจสอบ Kex release
# =========================================================

RUN test -f /opt/kex/kex.py

RUN test -f \
    /opt/kex/kex-annotation-processor/target/kex-annotation-processor-0.0.11.jar

RUN test -f \
    /opt/kex/kex-runner/target/kex-runner-0.0.11-jar-with-dependencies.jar

RUN test -f \
    /opt/kex/runtime-deps/lib/kex-intrinsics-0.1.2.jar

# ตรวจสอบ Python script ของ Kex
RUN python3 --version

# =========================================================
# 10. Python dependencies
#
# ใช้สำหรับ:
#   - benchmark runner
#   - result parser
#   - API scripts
# =========================================================

RUN pip3 install --no-cache-dir \
    requests \
    pandas

# =========================================================
# 11. Final workspace
# =========================================================

WORKDIR /workspace

CMD ["/bin/bash"]