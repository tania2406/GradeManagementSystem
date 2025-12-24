//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class GradeManagementSystem {
    private static String[] studentNames;
    private static List<StudentGrade> students = new ArrayList<>();
    private static final int MAX_STUDENTS = 100;
    private static final int SUBJECT_COUNT = 5;
    private static int studentCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeArrays();
        boolean running = true;

        while (running) {
            System.out.println("\n=== GRADE MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Averages");
            System.out.println("5. Generate Report");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = InputValidator.getValidInt(scanner, 1, 6);

            switch (choice) {
                case 1:
                    addStudentMarks();
                    break;
                case 2:
                    ReportGenerator.viewAllStudents(students);
                    break;
                case 3:
                    ReportGenerator.searchStudent(students, scanner);
                    break;
                case 4:
                    ReportGenerator.calculateAverages(students);
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you for using Grade Management System!");
                    break;
            }
        }
        scanner.close();
    }

    private static void initializeArrays() {
        studentNames = new String[MAX_STUDENTS];
    }

    private static void addStudentMarks() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Maximum student limit reached!");
            return;
        }

        System.out.println("\n=== ADD STUDENT MARKS ===");
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        studentNames[studentCount] = name;

        StudentGrade student = new StudentGrade(name);
        String[] subjects = {"Mathematics", "Science", "English", "History", "Computer"};

        System.out.println("\nEnter marks for 5 subjects (out of 100):");
        for (int i = 0; i < SUBJECT_COUNT; i++) {
            System.out.print(subjects[i] + ": ");
            double mark = InputValidator.getValidMark(scanner);
            student.setMark(i, mark);
        }

        students.add(student);
        studentCount++;
        System.out.println("✅ Student marks added successfully!");
    }

    private static void generateReport() {
        if (studentCount == 0) {
            System.out.println("No students found!");
            return;
        }

        double classTotalAvg = 0;
        double highestAvg = 0;
        double lowestAvg = 101;

        for (int i = 0; i < studentCount; i++) {
            double avg = GradeCalculator.calculateAverage(students.get(i).getMarks());
            classTotalAvg += avg;
            if (avg > highestAvg) highestAvg = avg;
            if (avg < lowestAvg) lowestAvg = avg;
        }
        classTotalAvg /= studentCount;

        System.out.printf("📊 Class Report: %d students | Avg: %.2f | Top: %.2f | Bottom: %.2f\n",
                studentCount, classTotalAvg, highestAvg, lowestAvg);
    }


    public static class InputValidator {
        public static int getValidInt(Scanner scanner, int min, int max) {
            int value;
            while (true) {
                try {
                    value = Integer.parseInt(scanner.nextLine());
                    if (value >= min && value <= max) {
                        return value;
                    } else {
                        System.out.printf("Please enter a number between %d and %d: ", min, max);
                    }
                } catch (Exception e) {
                    System.out.print("Invalid input! Please enter a number: ");
                }
            }
        }

        public static double getValidMark(Scanner scanner) {
            double mark;
            while (true) {
                try {
                    mark = Double.parseDouble(scanner.nextLine());
                    if (mark >= 0 && mark <= 100) {
                        return mark;
                    } else {
                        System.out.print("Marks must be between 0 and 100. Please re-enter: ");
                    }
                } catch (Exception e) {
                    System.out.print("Invalid input! Please enter a number: ");
                    scanner.nextLine();
                }
            }
        }
    }

}
