 import java.util.List;
import java.util.Scanner;

public class ReportGenerator {
    public static void viewAllStudents(List<StudentGrade> students) {
        System.out.println("\n=== ALL STUDENTS ===");
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.printf("%-20s %-12s %-12s %-12s %-12s %-12s %-12s\n",
                "Student Name", "Math", "Science", "English", "History", "Computer", "Average");
        System.out.println("-".repeat(100));

        for (int i = 0; i < students.size(); i++) {
            StudentGrade student = students.get(i);
            double average = GradeCalculator.calculateAverage(student.getMarks());
            System.out.printf("%-20s %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f %-12.2f\n",
                    student.getName(),
                    student.getMark(0), student.getMark(1), student.getMark(2),
                    student.getMark(3), student.getMark(4), average);
        }
    }

    public static void calculateAverages(List<StudentGrade> students) {
        System.out.println("\n=== STUDENT AVERAGES ===");
        for (int i = 0; i < students.size(); i++) {
            double average = GradeCalculator.calculateAverage(students.get(i).getMarks());
            String grade = GradeCalculator.getGrade(average);
            System.out.printf("%-20s: Average = %.2f, Grade = %s\n",
                    students.get(i).getName(), average, grade);
        }
    }

    public static void searchStudent(List<StudentGrade> students, Scanner scanner) {
        System.out.print("Enter student name to search: ");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (StudentGrade student : students) {
            if (student.getName().toLowerCase().contains(searchName)) {
                double avg = GradeCalculator.calculateAverage(student.getMarks());
                System.out.printf("✅ %s: Avg=%.2f, Grade=%s\n",
                        student.getName(), avg, GradeCalculator.getGrade(avg));
                found = true;
            }
        }
        if (!found) System.out.println("Student not found!");
    }
}

