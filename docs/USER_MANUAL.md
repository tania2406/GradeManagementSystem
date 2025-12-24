# Grade Management System - User Manual

## Table of Contents
1. Introduction
2. Getting Started
3. Main Menu Overview
4. Feature Guide
5. Input Guidelines
6. Example Scenarios
7. FAQ & Troubleshooting

---

## 1. Introduction

The **Grade Management System** is a Java console application designed to help educators and administrators efficiently manage student grades. It allows you to:
- Add and store student marks for multiple subjects
- Calculate averages and assign grades (A+, A, B, C, D, F)
- Search for specific students
- Generate class-level performance reports
- View formatted performance tables

The system supports up to **100 students** and **5 subjects** per student, with real-time calculations and validation.

**Target Users**: Teachers, academic administrators, school staff, BCA students learning Java fundamentals

**Compatibility**: Windows, macOS, Linux (requires Java 8+)

---

## 2. Getting Started

### Starting the Application

1. Open your terminal/command prompt
2. Navigate to the `GradeManagementSystem` directory:
   ```
   cd path/to/GradeManagementSystem
   ```
3. Run the program:
   ```
   java GradeManagementSystem
   ```

You will see the welcome screen:
```
=== GRADE MANAGEMENT SYSTEM ===
1. Add Student Marks
2. View All Students
3. Search Student
4. Calculate Averages
5. Generate Report
6. Exit
Enter your choice: 
```

### Exiting the Application

At any time, select **Option 6 (Exit)** from the main menu. The program will display:
```
Thank you for using Grade Management System!
```

---

## 3. Main Menu Overview

| Option | Feature | Purpose |
|--------|---------|---------|
| **1** | Add Student Marks | Register a new student and input their subject marks |
| **2** | View All Students | Display formatted table of all students with averages |
| **3** | Search Student | Find a specific student by partial or full name |
| **4** | Calculate Averages | Show each student's average and letter grade |
| **5** | Generate Report | Display class-level statistics (avg, top, bottom) |
| **6** | Exit | Close the application |

---

## 4. Feature Guide

### Feature 1: Add Student Marks

**When to Use**: When registering a new student or adding marks for the first time

**Steps**:
1. Select **Option 1** from the menu
2. Enter the student's full name when prompted:
   ```
   Enter Student Name: [type name and press Enter]
   ```
3. Enter marks for each of the 5 subjects (0–100 range):
   ```
   Enter marks for 5 subjects (out of 100):
   Mathematics: [type mark and press Enter]
   Science: [type mark and press Enter]
   English: [type mark and press Enter]
   History: [type mark and press Enter]
   Computer: [type mark and press Enter]
   ```
4. Confirmation message appears:
   ```
   ✅ Student marks added successfully!
   ```

**Constraints**:
- Maximum 100 students allowed
- Each mark must be between 0 and 100
- Non-numeric input will trigger re-entry prompt
- Student name is required (cannot be blank)

**Example**:
```
Enter Student Name: Rajesh Kumar
Enter marks for 5 subjects (out of 100):
Mathematics: 85
Science: 90
English: 78
History: 88
Computer: 92
✅ Student marks added successfully!
```

---

### Feature 2: View All Students

**When to Use**: To see a complete table of all registered students with their marks and averages

**Steps**:
1. Select **Option 2** from the menu
2. A formatted table displays automatically:

```
Student Name         Math         Science      English      History      Computer     Average
----------------------------------------------------------------------------------------------------
Rajesh Kumar         85.00        90.00        78.00        88.00        92.00        86.60
Priya Singh          92.00        88.00        95.00        85.00        90.00        90.00
Amit Patel           70.00        75.00        68.00        72.00        80.00        73.00
```

**Features**:
- All marks displayed to 2 decimal places
- Average column shows per-student average
- Students listed in order of addition
- If no students exist, message displays: `No students found!`

---

### Feature 3: Search Student

**When to Use**: To quickly find a specific student's record by name

**Steps**:
1. Select **Option 3** from the menu
2. Enter the student's name (partial or full):
   ```
   Enter student name to search: [type name and press Enter]
   ```
3. Results display instantly:
   ```
   ✅ Rajesh Kumar: Avg=86.60, Grade=B
   ```

**Search Rules**:
- Search is **case-insensitive** (searching "rajesh" finds "Rajesh Kumar")
- Partial name matching works (searching "raj" finds "Rajesh")
- If not found, message displays: `Student not found!`

**Example Searches**:
```
Search: "kumar"        → Finds "Rajesh Kumar"
Search: "PRIYA"        → Finds "Priya Singh"
Search: "amit"         → Finds "Amit Patel"
Search: "xyz"          → Not found!
```

---

### Feature 4: Calculate Averages

**When to Use**: To view all students' averages and corresponding grades

**Steps**:
1. Select **Option 4** from the menu
2. A list displays with each student's average and grade:

```
=== STUDENT AVERAGES ===
Rajesh Kumar        : Average = 86.60, Grade = B
Priya Singh         : Average = 90.00, Grade = A
Amit Patel          : Average = 73.00, Grade = B
```

**Grading Scale**:
- **A+**: 90 or above
- **A**: 80–89.99
- **B**: 70–79.99
- **C**: 60–69.99
- **D**: 50–59.99
- **F**: Below 50

---

### Feature 5: Generate Report

**When to Use**: To get a summary of overall class performance

**Steps**:
1. Select **Option 5** from the menu
2. Class-level statistics display:

```
📊 Class Report: 3 students | Avg: 83.20 | Top: 90.00 | Bottom: 73.00
```

**Report Metrics**:
- **Total Students**: Count of all registered students
- **Class Average**: Overall average across all students
- **Top Performer**: Highest average in the class
- **Bottom Performer**: Lowest average in the class

**Example Interpretation**:
```
Class Report: 5 students | Avg: 78.50 | Top: 95.00 | Bottom: 62.00
↓
5 students registered, overall class performance is 78.50%, 
best student scored 95%, weakest student scored 62%.
```

---

## 5. Input Guidelines

### Valid Input Rules

#### Student Name
- ✅ Any alphabetic characters and spaces (e.g., "Rajesh Kumar", "Priya Singh")
- ✅ Special characters allowed (e.g., "O'Brien", "Mary-Jane")
- ❌ Cannot be empty
- ❌ Length recommended under 30 characters

#### Marks Input
- ✅ Numeric values (integers or decimals): 0–100
- ✅ Decimal marks: 85.5, 78.25 accepted
- ❌ Negative marks: Rejected (e.g., -5)
- ❌ Marks above 100: Rejected (e.g., 105)
- ❌ Non-numeric input: Rejected (e.g., "abc", "A+")

#### Menu Choice
- ✅ Single digit: 1, 2, 3, 4, 5, 6
- ❌ Values outside 1–6: Rejected
- ❌ Non-numeric: Rejected (e.g., "a", "menu")

### Error Handling

All invalid inputs trigger automatic re-prompts:

**Example 1: Invalid Menu Choice**
```
Enter your choice: abc
Invalid input! Please enter a number: 1
```

**Example 2: Invalid Marks**
```
Mathematics: 150
Marks must be between 0 and 100. Please re-enter: 85
```

**Example 3: Maximum Limit Reached**
```
Maximum student limit reached!
(Return to main menu if 100 students already added)
```

---

## 6. Example Scenarios

### Scenario 1: Adding Three Students and Viewing All

```
=== GRADE MANAGEMENT SYSTEM ===
...
Enter your choice: 1

=== ADD STUDENT MARKS ===
Enter Student Name: Rajesh Kumar

Enter marks for 5 subjects (out of 100):
Mathematics: 85
Science: 90
English: 78
History: 88
Computer: 92
✅ Student marks added successfully!

(Repeat for Priya Singh and Amit Patel)

Enter your choice: 2

=== ALL STUDENTS ===
Student Name         Math         Science      English      History      Computer     Average
----------------------------------------------------------------------------------------------------
Rajesh Kumar         85.00        90.00        78.00        88.00        92.00        86.60
Priya Singh          92.00        88.00        95.00        85.00        90.00        90.00
Amit Patel           70.00        75.00        68.00        72.00        80.00        73.00
```

### Scenario 2: Searching for a Student

```
Enter your choice: 3

Enter student name to search: priya
✅ Priya Singh: Avg=90.00, Grade=A
```

### Scenario 3: Generating Class Report

```
Enter your choice: 5

📊 Class Report: 3 students | Avg: 83.20 | Top: 90.00 | Bottom: 73.00
```

---

## 7. FAQ & Troubleshooting

### Q1: How do I add a new student?
**A**: Select Option 1 from the main menu, enter the student's name, and then input marks for 5 subjects (Mathematics, Science, English, History, Computer). Each mark must be between 0–100.

### Q2: Can I edit a student's marks after adding them?
**A**: The current version does not support editing. You can only add new students. To modify marks, restart the application and re-enter data, or extend the code to add an edit feature.

### Q3: What happens if I exceed 100 students?
**A**: The system will display "Maximum student limit reached!" and prevent further additions. You can modify the `MAX_STUDENTS` constant in the code to increase this limit.

### Q4: How is the average calculated?
**A**: Average = (Mark1 + Mark2 + Mark3 + Mark4 + Mark5) / 5. For example, marks 85, 90, 78, 88, 92 → Average = (85+90+78+88+92)/5 = 433/5 = 86.6

### Q5: What is the grading scale?
**A**: 
- A+ = 90–100
- A = 80–89
- B = 70–79
- C = 60–69
- D = 50–59
- F = Below 50

### Q6: Can I save data and close the program?
**A**: The current version stores data in memory only. Data is lost when the program closes. To save data permanently, use a database or file-based extension.

### Q7: What if I enter text instead of numbers for marks?
**A**: The system will display "Invalid input! Please enter a number:" and prompt you to re-enter.

### Q8: Can I search by partial name?
**A**: Yes! Searching "raj" will find "Rajesh Kumar" or any student whose name contains "raj".

### Q9: What do I do if the program doesn't start?
**A**: 
1. Ensure Java is installed: Type `java -version` in terminal
2. Ensure you're in the correct directory: `cd GradeManagementSystem`
3. Ensure all `.java` files are compiled: `javac *.java`
4. Run the program: `java GradeManagementSystem`

### Q10: Can I modify the number of subjects?
**A**: Yes, you can modify `SUBJECT_COUNT = 5` in the code and update the subjects array accordingly. Recompile with `javac *.java`.

---

## Quick Command Reference

```bash
# Compile the project
javac *.java

# Run the application
java GradeManagementSystem

# Delete compiled files (to recompile)
del *.class              # Windows
rm *.class               # macOS/Linux
```

---

**For additional support, refer to the Installation & Setup Guide or Grading System Explanation document.**
