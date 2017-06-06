package entity;

public class Student {
    private String studentName;
    private String studentSurname;
    private int studentAge;
    private int studentGroup;

    public Student(String studentName, String studentSurname, int studentAge, int studentGroup) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentAge = studentAge;
        this.studentGroup = studentGroup;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public int getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(int studentGroup) {
        this.studentGroup = studentGroup;
    }
}
