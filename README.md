
# Grade Management System (Java, Console)

A simple Grade Management System built in Java that stores student marks, calculates averages, assigns letter grades (A+–F), and generates performance reports for a class of students. It uses arrays and ArrayList, a menu-driven console UI, and cleanly separated classes suitable for BCA/CS mini-projects and interview portfolios.
​

# Table of Contents

1.Features

2.Project Structure

3.Getting Started

4.How to Use

5.Grading System

6.Documentation

7.Future Enhancements

# Features

Store up to 100 students and 5 subjects per student (Mathematics, Science, English, History, Computer).
​

Add student marks with 0–100 validation and error handling for non-numeric input.
​

View all students in a formatted table with subject-wise marks and average.
​

Search student by full or partial name (case-insensitive).
​

Calculate per-student average and letter grade (A+–F).
​

Generate class report: total students, overall class average, highest and lowest averages.
​

Console-based, no external libraries; easy to compile and run on any system with Java.
​

# Project Structure
Repository layout:

text
GradeManagementSystem/

├── README.md

├── src/

│   ├── GradeManagementSystem.java      # Main program & menu

│   ├── StudentGrade.java               # Student data model

│   ├── GradeCalculator.java            # Average & grade logic

│   ├── ReportGenerator.java            # Printing tables & reports

│   └── InputValidator.java             # Input validation helpers

├── docs/

│   ├── USER_MANUAL.md

│   ├── INSTALLATION_SETUP.md

│   ├── GRADING_SYSTEM_EXPLANATION.md

│   ├── TEST_CASES.md

│   └── Screenshots/

│       ├── Main_Menu.jpeg

│       ├── Add_Marks.jpeg

│       ├── View_Student.jpeg

│       ├── Search_Student.jpeg

│       └── Class_Report.jpeg

└── examples/
    └── Sample_data.txt               # Sample student data & expected output
    
This structure follows common Java console project conventions, keeping code under src/ and documentation under docs/.
​

Getting Started

Prerequisites

Java JDK 8+ installed (java -version / javac -version).
​

Terminal / command prompt.

(Optional) IDE like Eclipse, IntelliJ IDEA, or VS Code.

Clone and build

bash

# Clone repository
git clone https://github.com/<your-username>/GradeManagementSystem.git

cd GradeManagementSystem

# Compile (from project root)
cd src

javac *.java

# Run
java GradeManagementSystem

You should see:

text
=== GRADE MANAGEMENT SYSTEM ===
1. Add Student Marks
2. View All Students
3. Search Student
4. Calculate Averages
5. Generate Report
6. Exit
Enter your choice:
For detailed setup (Windows/macOS/Linux, IDE steps), see docs/INSTALLATION_SETUP.md.

How to Use
Main menu options:

Add Student Marks

Enter student name.

Enter 5 marks (0–100).

Invalid inputs are rejected and re-prompted.

View All Students

Shows a table: Student Name | Math | Science | English | History | Computer | Average.

Search Student

Enter full or partial name (case-insensitive).

Displays matching student’s average and grade.

Calculate Averages

Lists all students with Average = xx.xx, Grade = X.

Generate Report

Prints: Class Report: X students | Avg: Y | Top: Z | Bottom: W.

Exit

Cleanly terminates the program.

Full step-by-step usage (with example console sessions and screenshots) is documented in docs/USER_MANUAL.md.

Grading System
Grades are assigned based on the average of 5 subject marks:
​

Grade	Average Range	Meaning
A+	90 – 100	Outstanding
A	80 – 89.99	Excellent
B	70 – 79.99	Good
C	60 – 69.99	Satisfactory
D	50 – 59.99	Below Average
F	0 – 49.99	Fail
Average formula:

Average
=
Math
+
Science
+
English
+
History
+
Computer
5
Average= 
5
Math+Science+English+History+Computer
 
Detailed explanation, examples, and test cases are in docs/GRADING_SYSTEM_EXPLANATION.md and docs/TEST_CASES.md.

Documentation
All formal documentation lives in the docs/ folder:

INSTALLATION_SETUP.md – full installation + project structure.

USER_MANUAL.md – end-user instructions & screenshots.

GRADING_SYSTEM_EXPLANATION.md – architecture, data structures, algorithms, grading details, and test evidence.

TEST_CASES.md – functional, validation, and boundary test cases for the system.

Sample data for demos and screenshots is in examples/sample-grades.txt.

Future Enhancements
Ideas to extend this project:

File or database persistence (save/load students between runs).
​

Edit/delete student records.

Subject-wise analytics and grade distribution reports.

GUI using Swing/JavaFX.

REST API backend with Spring Boot.

These possibilities are outlined in the “Future Enhancements” section of the technical documentation.

