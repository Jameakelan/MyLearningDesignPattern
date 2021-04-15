package builder;

public class StudentBuilder {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String grade;

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setGrade(String grade) {
        this.grade = grade;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
