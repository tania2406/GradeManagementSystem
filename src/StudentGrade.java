
public class StudentGrade {

    private String name;
    private double[] marks = new double[5];  // Fixed 5 subjects
    private static final String[] SUBJECTS = {"Math", "Science", "English", "History", "Computer"};

    public StudentGrade(String name) {
        this.name = name;
    }

    public void setMark(int index, double mark) {
        if (index >= 0 && index < 5) {
            marks[index] = mark;
        }
    }

    public String getName() { return name; }
    public double[] getMarks() { return marks; }
    public double getMark(int index) { return marks[index]; }
    public String getSubjectName(int index) { return SUBJECTS[index]; }
}
