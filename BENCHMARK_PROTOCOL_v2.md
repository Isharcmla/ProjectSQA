# BENCHMARK PROTOCOL
## Project – AI-Assisted Testing vs. Automatic Test Case Generation Algorithms

**Course:** CP353201 Software Quality Assurance  
**Dataset:** Defects4J v3.0.1  
**Primary benchmark project:** Apache Commons Lang (`Lang`)  
**Team:** 3 members  
- Member 1: Reanimator / Kex
- Member 2: DynaMOSA / EvoSuite
- Member 3: Gemini + Claude

---

## 1. Purpose

Define the common rules for comparing four Java unit-test generation approaches:

1. DynaMOSA via EvoSuite
2. Reanimator via Kex
3. Gemini
4. Claude

The protocol exists so results from all three members can be merged and compared under the same benchmark conditions.

The project report defines the main comparison dimensions as Test Coverage, Fault Detection Rate, and Code Coverage Ratio.

---

## 2. Dataset

### 2.1 Defects4J

Target version:

```text
Defects4J 3.0.1
```

### 2.2 Project

```text
Lang
Apache Commons Lang
```

### 2.3 Active bugs

Use the 61 active Lang bugs:

```text
1, 3-17, 19-24, 26-47, 49-65
```

### 2.4 Deprecated bugs

Exclude:

```text
2, 18, 25, 48
```

Keep deprecated cases documented separately.

---

## 3. Reproducibility Environment

All benchmark runs should use the same baseline:

| Item | Standard |
|---|---|
| Defects4J | 3.0.1 |
| Java | 11 |
| Timezone | `America/Los_Angeles` |
| OS environment | Shared Docker environment |
| Buggy version | `<id>b` |
| Fixed version | `<id>f` |

The Defects4J README supplied for the course states that bugs were reproduced and triggering tests verified using Java 11, and that Defects4J uses `America/Los_Angeles` for test execution.

---

## 4. Metadata Source

Prefer Defects4J CLI metadata instead of manual entry.

For a bug:

```bash
defects4j info -p Lang -b <BUG_ID>
```

Version-specific metadata:

```bash
defects4j export -p classes.modified
defects4j export -p cp.compile
defects4j export -p cp.test
defects4j export -p dir.src.classes
defects4j export -p dir.bin.classes
defects4j export -p dir.src.tests
defects4j export -p dir.bin.tests
defects4j export -p tests.all
defects4j export -p tests.relevant
defects4j export -p tests.trigger
```

Project-level metadata:

```bash
defects4j query -p Lang   -q "bug.id,project.id,revision.id.buggy,revision.id.fixed,report.id,classes.modified,tests.trigger,tests.trigger.cause"
```

Shared metadata file:

```text
dataset/defects4j/Lang_metadata.csv
```

---

## 5. Bug Validation Rule

For every bug:

```text
<id>b = buggy version
<id>f = fixed version
```

The Defects4J triggering test is the reference.

Expected baseline:

```text
Buggy version  -> triggering test FAIL
Fixed version  -> triggering test PASS
```

A generated test suite counts as detecting the real defect only when the failure is attributable to the target defect, not to compilation, dependency, runtime, environment, unsupported-feature, or tool errors.

---

## 6. Experimental Tracks

### 6.1 DynaMOSA / EvoSuite

Owner:

```text
Member 2
```

Use EvoSuite for DynaMOSA.

Record:

- EvoSuite version
- DynaMOSA configuration
- search budget
- random seed policy
- generation time
- generated test count
- compile/run results
- coverage
- fault detection

### 6.2 Reanimator / Kex

Owner:

```text
Member 1
```

Important:

> Reanimator is a test-generation component inside Kex, not a standalone tool.

Conceptual workflow:

```text
Java bytecode
    ↓
Symbolic execution
    ↓
SMT solver
    ↓
Symbolic input
    ↓
Reanimator / backward search
    ↓
JUnit tests
```

Record:

- Kex version
- Java version
- SMT solver
- Kex options
- search/depth limits
- timeout
- generated test count
- compile/run results
- coverage
- fault detection
- runtime failures

### 6.3 Gemini

Owner:

```text
Member 3
```

Baseline requirements from the project report:

- JUnit 4 only
- cover public methods
- normal/typical cases
- edge cases
- exception cases where appropriate
- no mocking framework
- real public APIs
- compilable Java
- meaningful test names

Generic prompt inputs:

```text
{{PACKAGE_NAME}}
{{CLASS_NAME}}
{{SOURCE_CODE}}
{{RELATED_CLASSES_OR_INTERFACES}}
```

### 6.4 Claude

Owner:

```text
Member 3
```

Use the JUnit 4 baseline and the structured prompt format in the project report, including:

```xml
<class_info>
...
</class_info>
<source_code>
...
</source_code>
<dependencies>
...
</dependencies>
<requirements>
...
</requirements>
<output_format>
...
</output_format>
```

Record the exact Claude model/version and prompt version.

---

## 7. AI Prompt Policy

Use a generic baseline first.

Only after baseline results may Bug-specific refinement be added.

Possible refinement inputs:

```text
TARGET_METHOD
COMPILE_ERROR
COVERAGE_REPORT
UNCOVERED_LINES
```

Do not silently replace the generic baseline with different prompts for every bug.

---

## 8. Test Execution Procedure

For every tool × bug:

```text
1. Checkout buggy revision
2. Compile project
3. Obtain target class and metadata
4. Generate tests
5. Compile generated tests
6. Run generated tests
7. Measure coverage
8. Evaluate fault detection
9. Record runtime
10. Preserve logs and generated tests
```

Use the fixed version to validate whether a candidate defect-detecting failure is specific to the real fault.

Do not modify the original Defects4J source to make generated tests pass.

---

## 9. Coverage

At minimum record:

```text
Line / Statement Coverage
Branch Coverage
```

Recommended fields:

```text
line_coverage_percent
branch_coverage_percent
```

Coverage definitions must remain consistent across tools.

---

## 10. Fault Detection

Recommended common definition:

```text
Detected =
    generated test suite fails on buggy version
    AND
    corresponding test passes on fixed version
    AND
    the failure is attributable to the target defect
```

Do not count these automatically as fault detection:

```text
missing dependency
invalid generated test
classpath error
class initialization error unrelated to target defect
unsupported feature
tool crash
timeout
```

---

## 11. Failure Classification

Normalize results to:

```text
SUCCESS
COMPILE_FAIL
RUNTIME_FAIL
TIMEOUT
TOOL_ERROR
UNSUPPORTED
```

Optional detailed error types:

```text
MISSING_DEPENDENCY
INVALID_TEST_CLASS
NO_RUNNABLE_METHODS
CLASS_INITIALIZATION_ERROR
KEX_REANIMATION_FAILURE
AI_COMPILE_ERROR
```

Never silently discard failed experiments.

---

## 12. Runtime

Record:

```text
generation_time
test_compile_time
test_execution_time
total_time
```

### Values not yet fixed

The following require explicit team agreement before full benchmark:

```text
generation timeout
number of repetitions
random seed policy
aggregation method
```

Do not silently adopt an external competition budget as the project's benchmark setting.

---

## 13. Results Schema

Each Bug × Tool result should contain at least:

```text
project
bug_id
method
tool
tool_version
target_class
trigger_test

generated_test_count

generation_time
test_compile_time
test_execution_time
total_time

compile_status
test_status

line_coverage_percent
branch_coverage_percent

fault_detected

timeout
error_type
error_message

result_path
log_path
```

---

## 14. Directory Structure

Recommended:

```text
ProjectSQA/
├── dataset/
│   └── defects4j/
│       └── Lang_metadata.csv
│
├── DynaMOSA-EvoSuite/
├── Reanimator-Kex/
├── Gemini/
├── Claude/
├── scripts/
└── docker/
    ├── Dockerfile
    └── docker-compose.yml
```

Local experimental artifacts such as:

```text
smoke/
```

should not be committed unless explicitly required.

---

## 15. Team Workflow

```text
                  Lang: 61 active bugs
                           │
          ┌────────────────┼────────────────┐
          ↓                ↓                ↓
     Kex/Reanimator     DynaMOSA       Gemini + Claude
       Member 1          Member 2          Member 3
          │                │                │
          └────────────────┼────────────────┘
                           ↓
                  Normalized Results
                           ↓
                      Merge / Analysis
```

Each member owns the tool-specific implementation but must use the shared protocol.

---

## 16. Milestones

### Milestone 1 — Environment
Status: **COMPLETED**

```text
Docker
Java 11
Defects4J
Lang 61 active bugs
Shared metadata
```

### Milestone 2 — One-Bug End-to-End Validation
Status: **PENDING**

Validate one Lang bug through each track.

### Milestone 3 — Freeze Configuration
Status: **PENDING**

Freeze:

```text
tool versions
model versions
prompts
timeouts
run count
seed policy
coverage method
fault-detection rule
```

### Milestone 4 — Full 61-Bug Benchmark
Status: **PENDING**

Run every active Lang bug according to the assigned track.

### Milestone 5 — Merge and Analysis
Status: **PENDING**

Produce:

```text
coverage tables
fault-detection tables
runtime tables
failure statistics
graphs
```

---

## 17. Current State

```text
Shared Docker Environment       ✅
Defects4J environment           ✅
Java 11                         ✅
Timezone                        ✅
Lang active list                ✅
Lang metadata CSV               ✅

Kex installation                ✅
Kex Chart smoke test            ✅
Kex debugging                   🔄

DynaMOSA / EvoSuite             🔄
Gemini                          🔄
Claude                          🔄

One-Bug comparison              ❌
Final configuration             ❌
Full 61-bug benchmark           ❌
Merged analysis                 ❌
Final report results            ❌
```

---

## 18. Immediate Next Step

Do **not** launch all 61 bugs yet.

First:

```text
1. Confirm the remaining common settings.
2. Select one Lang active bug for end-to-end validation.
3. Run each track using the same validation structure.
4. Verify the result schema.
5. Freeze the configuration.
6. Launch the full benchmark.
```

For the Kex track, continue from the existing Docker/Kex environment rather than rebuilding unnecessarily.

---

## 19. Important Handover Rules

The next AI should:

1. Treat this document as the current project protocol.
2. Preserve the three-person division:
   - User → Kex/Reanimator
   - Member 2 → DynaMOSA/EvoSuite
   - Member 3 → Gemini/Claude
3. Keep JUnit 4 for the AI baseline.
4. Keep the 61 active Lang bugs as the benchmark scope.
5. Exclude Lang 2, 18, 25, and 48 from the active benchmark.
6. Use Defects4J CLI metadata instead of guessing values.
7. Use Java 11 and `America/Los_Angeles`.
8. Preserve raw logs and failed cases.
9. Do not treat Kex's earlier Chart-1 `0%` as a final benchmark result.
10. Validate one bug before scaling to all 61.

---

## 20. Source Basis

This protocol is based on:

- The team's Round-1 project progress report.
- The Defects4J v3.0.1 README supplied for the course.
- The instructor-provided `active-bugs.csv` and `deprecated-bugs.csv`.

The project report defines the four methods, AI prompt requirements, Kex/Reanimator methodology, and stated project metrics. The Defects4J README defines active/deprecated bug handling, Java 11/timezone reproducibility requirements, and the CLI `query`/`export` workflow.
