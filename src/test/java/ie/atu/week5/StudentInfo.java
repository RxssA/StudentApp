package ie.atu.week5;

public class StudentInfo {
    private double name;
    private double email;
    private double course;

    public StudentInfo() {
        this.name = 0;
        this.email = 0;
        this.course = 0;
    }

    public StudentInfo(double name, double email, double course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public double getName() {
        return name;
    }

    public void setName(double name) {
        this.name = name;
    }

    public double getEmail() {
        return email;
    }

    public void setEmail(double email) {
        this.email = email;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}
