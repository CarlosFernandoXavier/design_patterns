package builder;

public class StudentBuilder {
    private Student student;

    public StudentBuilder() {
        this.student = new Student();
    }

    public StudentBuilder build() {
        return this;
    }

    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder setAge(Integer age) {
        student.setAge(age);
        return this;
    }

    public Student builder() {
        return this.student;
    }
}
