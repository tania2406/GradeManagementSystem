# Grade Management System - Installation & Setup Guide

## System Requirements

### Minimum Requirements
- **Operating System**: Windows 7 or later, macOS 10.12+, Linux (any distribution)
- **Java Development Kit (JDK)**: Version 8 or higher
- **RAM**: 512 MB minimum
- **Disk Space**: 100 MB
- **Terminal/Console**: Command prompt, PowerShell (Windows), Terminal (macOS/Linux)
- **Text Editor/IDE**: Any text editor or Eclipse, IntelliJ IDEA, VS Code with Java support

### Recommended Setup
- **JDK**: Version 11 or 17 (LTS)
- **IDE**: Eclipse IDE or IntelliJ IDEA Community Edition
- **RAM**: 2 GB or more
- **Git**: For version control (optional)

---

## Step 1: Install Java Development Kit (JDK)

### For Windows:
1. Visit [https://www.oracle.com/java/technologies/downloads/](https://www.oracle.com/java/technologies/downloads/)
2. Download **JDK 17 (or latest LTS)** for Windows x64
3. Run the installer `.exe` file
4. Follow the installation wizard (accept default path: `C:\Program Files\Java\jdk-17...`)
5. Click **Install** and wait for completion
6. Verify installation by opening Command Prompt and typing:
   ```
   java -version
   javac -version
   ```
   You should see version information (e.g., "java version 17.0.x")

### For macOS:
1. Open Terminal and install using Homebrew (recommended):
   ```bash
   brew install openjdk@17
   ```
2. Create a symlink:
   ```bash
   sudo ln -sfn /usr/local/opt/openjdk@17/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-17.jdk
   ```
3. Verify:
   ```bash
   java -version
   javac -version
   ```

### For Linux (Ubuntu/Debian):
1. Open Terminal and run:
   ```bash
   sudo apt update
   sudo apt install openjdk-17-jdk
   ```
2. Verify:
   ```bash
   java -version
   javac -version
   ```

---

## Step 2: Create Project Directory

### Windows (Command Prompt):
```
cd Desktop
mkdir GradeManagementSystem
cd GradeManagementSystem
```

### macOS/Linux (Terminal):
```bash
cd ~/Desktop
mkdir GradeManagementSystem
cd GradeManagementSystem
```

---

## Step 3: Create Java Source Files

Create five `.java` files in the `GradeManagementSystem` directory:

### Option A: Using Text Editor

1. Open Notepad (Windows) or TextEdit (macOS) or gedit (Linux)
2. Copy the following code and save with exact filenames:
   - `StudentGrade.java`
   - `GradeCalculator.java`
   - `ReportGenerator.java`
   - `InputValidator.java`
   - `GradeManagementSystem.java`

### Option B: Using IDE (Eclipse)

1. Open Eclipse IDE
2. File → New → Java Project
3. Project name: `GradeManagementSystem`
4. Click Finish
5. Right-click project → New → Class
6. Create each of the 5 classes with the provided code

---

## Step 4: Copy Source Code

Navigate to your project directory and create each file:

### Windows (Command Prompt):
```
notepad StudentGrade.java
```
(Paste code, save, and repeat for other files)

### macOS/Linux (Terminal):
```bash
nano StudentGrade.java
# Paste code using Ctrl+Shift+V
# Press Ctrl+X, then Y, then Enter to save
```

---

## Step 5: Compile the Project

### Command Line (All Platforms):
Navigate to your project directory and execute:

```
javac *.java
```

**Expected Output**: No error messages. All `.class` files are generated automatically.

**Troubleshooting**:
- If you get `'javac' is not recognized`, add JDK to PATH:
  - **Windows**: Set environment variable `JAVA_HOME` to your JDK installation path
  - **macOS/Linux**: Already configured if installed via Homebrew/apt

---

## Step 6: Run the Application

### Command Line (All Platforms):
```
java GradeManagementSystem
```

**Expected Output**:
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

---

## Step 7: Verify Installation

Test all features:

1. **Add Student**: Press 1, enter name and 5 marks (0–100)
2. **View All**: Press 2, see formatted table
3. **Search**: Press 3, search by name
4. **Averages**: Press 4, see all students' grades
5. **Report**: Press 5, see class summary
6. **Exit**: Press 6 to quit

---

## Using an IDE (Optional)

### Eclipse Setup:
1. File → New → Java Project → Project name: `GradeManagementSystem` → Finish
2. Create 5 classes in the `src` folder
3. Paste code into each class file
4. Right-click project → Build Project (or Ctrl+B)
5. Right-click `GradeManagementSystem.java` → Run As → Java Application

### IntelliJ IDEA Setup:
1. File → New → Project → Java → Next
2. Project name: `GradeManagementSystem` → Create
3. Create `.java` files in the `src` directory
4. Paste code into each file
5. Build → Build Project (Ctrl+F9)
6. Right-click `GradeManagementSystem` class → Run

---

## Project Structure

After successful setup, your directory structure should look like:

```
GradeManagementSystem/
├── StudentGrade.java
├── GradeCalculator.java
├── ReportGenerator.java
├── GradeManagementSystem.java
├── StudentGrade.class
├── GradeCalculator.class
├── ReportGenerator.class
└── GradeManagementSystem.class
```

The `.class` files are generated automatically during compilation.

---

## Troubleshooting

| Issue | Solution |
|-------|----------|
| `'javac' not found` | Add JDK to system PATH or reinstall JDK |
| `ClassNotFoundException` | Ensure all `.java` files are in the same directory; recompile with `javac *.java` |
| `InputMismatchException` | Program expects numeric input; enter numbers only when prompted |
| Maximum students reached | The system supports only 100 students by default; modify `MAX_STUDENTS` constant to increase |
| Compilation errors | Check Java file names match class names exactly (case-sensitive) |

---

## Quick Reference Commands

```bash
# Compile all Java files
javac *.java

# Run the application
java GradeManagementSystem

# View compiled files
dir *.class          # Windows
ls -la *.class       # macOS/Linux

# Clean compiled files
del *.class          # Windows
rm *.class           # macOS/Linux
```

---

## Support & Next Steps

- For Java documentation: [https://docs.oracle.com/en/java/](https://docs.oracle.com/en/java/)
- For troubleshooting: Check console error messages carefully
- For enhancement: Add file persistence, database integration, or GUI using Swing/JavaFX

Once installed and running successfully, proceed to the **User Manual** for detailed feature usage.
