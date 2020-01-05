package abstact.classes;

public class Student extends Person {

    private String major;

    Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return " a student majoring in " + major;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}
