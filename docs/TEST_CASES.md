# Grade Management System – Test Cases

## 1. Functional Test Cases

### TC-FUNC-01 – Add student with valid data
- **Precondition**: Application running, 0–99 students stored.
- **Steps**:
  1. Select option `1` (Add Student Marks).
  2. Enter name: `Rajesh Kumar`.
  3. Enter marks: `85`, `90`, `78`, `88`, `92`.
- **Expected Result**:
  - Message: `Student marks added successfully!`.
  - Student list size increases by 1.
  - Stored marks match the input exactly.

---

### TC-FUNC-02 – View all students when data exists
- **Precondition**: At least 1 student added.
- **Steps**:
  1. Select option `2` (View All Students).
- **Expected Result**:
  - Table header row is printed: `Student Name`, `Math`, `Science`, `English`, `History`, `Computer`, `Average`.
  - One row per student with marks and average to 2 decimal places.

---

### TC-FUNC-03 – Search existing student by full name
- **Precondition**: Student `Priya Singh` exists with known marks.
- **Steps**:
  1. Select option `3` (Search Student).
  2. Enter `Priya Singh`.
- **Expected Result**:
  - Line displayed: `✅ Priya Singh: Avg=<correct>, Grade=<correct>`.

---

### TC-FUNC-04 – Search existing student by partial name
- **Precondition**: Student `Priya Singh` exists.
- **Steps**:
  1. Select option `3`.
  2. Enter `priya`.
- **Expected Result**:
  - Same result as full-name search.
  - Search is case-insensitive and supports partial matches.

---

### TC-FUNC-05 – Search non‑existent student
- **Precondition**: Some students exist; none contain `xyz` in the name.
- **Steps**:
  1. Select option `3`.
  2. Enter `xyz`.
- **Expected Result**:
  - Message: `Student not found!`.
  - No exception or crash.

---

### TC-FUNC-06 – Calculate averages and grades
- **Precondition**: Multiple students with known marks exist.
- **Steps**:
  1. Select option `4` (Calculate Averages).
- **Expected Result**:
  - For each student, correct average printed.
  - Grade mapping:
    - `>= 90` → `A+`
    - `>= 80` → `A`
    - `>= 70` → `B`
    - `>= 60` → `C`
    - `>= 50` → `D`
    - `< 50` → `F`.

---

### TC-FUNC-07 – Generate class report
- **Precondition**: At least 3 students with known averages.
- **Steps**:
  1. Select option `5` (Generate Report).
- **Expected Result**:
  - Output format: `Class Report: X students | Avg: Y | Top: Z | Bottom: W`.
  - `X` equals total students.
  - `Y` equals overall class average (mean of all student averages).
  - `Z` equals highest average.
  - `W` equals lowest average.

---

## 2. Validation & Error‑Handling Test Cases

### TC-VAL-01 – Invalid menu choice (non‑numeric)
- **Precondition**: Main menu displayed.
- **Steps**:
  1. At `Enter your choice:`, type `abc` and press Enter.
- **Expected Result**:
  - Message: `Invalid input! Please enter a number:`.
  - User is re‑prompted until entering an integer between 1 and 6.

---

### TC-VAL-02 – Invalid menu choice (out of range)
- **Precondition**: Main menu displayed.
- **Steps**:
  1. Enter `10` at menu prompt.
- **Expected Result**:
  - Message: `Please enter a number between 1 and 6:`.
  - No feature is executed; menu continues normally.

---

### TC-VAL-03 – Invalid marks: negative value
- **Precondition**: Adding student marks (Option 1).
- **Steps**:
  1. For Mathematics, enter `-5`.
- **Expected Result**:
  - Message: `Marks must be between 0 and 100. Please re-enter:`.
  - The mark `-5` is rejected, and a new input is requested.

---

### TC-VAL-04 – Invalid marks: greater than 100
- **Precondition**: Adding student marks (Option 1).
- **Steps**:
  1. For Science, enter `150`.
- **Expected Result**:
  - Same range error message.
  - Mark is not accepted until a value between 0 and 100 is entered.

---

### TC-VAL-05 – Invalid marks: non‑numeric input
- **Precondition**: Adding student marks (Option 1).
- **Steps**:
  1. For English, enter `abc`.
- **Expected Result**:
  - Message: `Invalid input! Please enter a number:`.
  - Scanner clears invalid input and re-prompts for a valid number.

---

### TC-VAL-06 – View students when none exist
- **Precondition**: No students added yet.
- **Steps**:
  1. Select option `2` (View All Students).
- **Expected Result**:
  - Message: `No students found!`.
  - No table is printed.

---

### TC-VAL-07 – Generate report when none exist
- **Precondition**: No students added.
- **Steps**:
  1. Select option `5` (Generate Report).
- **Expected Result**:
  - Message: `No students found!`.
  - No division by zero or crash.

---

