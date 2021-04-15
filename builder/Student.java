package builder;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String grade;

    Student(StudentBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.grade = builder.grade;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "Student: " + this.firstName + ", " + this.lastName + ", " + this.id + ", " + this.grade;
    }
}
