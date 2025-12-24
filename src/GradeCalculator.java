import java.util.List;

public class GradeCalculator {
    private static final int SUBJECT_COUNT = 5;

    public static double calculateAverage(double[] marks) {
        double sum = 0;
        for (int i = 0; i < SUBJECT_COUNT; i++) {
            sum += marks[i];
        }
        return sum / SUBJECT_COUNT;
    }

    public static String getGrade(double average) {
        if (average >= 90) return "A+";
        else if (average >= 80) return "A";
        else if (average >= 70) return "B";
        else if (average >= 60) return "C";
        else if (average >= 50) return "D";
        else return "F";
    }

    public static double calculateStudentAverage(List<StudentGrade> students, int studentIndex) {
        return calculateAverage(students.get(studentIndex).getMarks());
    }
}
