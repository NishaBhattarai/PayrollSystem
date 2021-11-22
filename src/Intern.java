public class Intern extends Employee {
    private String schoolName;
    private int duration;

    public Intern(String name, int age, int deptNo, String schoolName, int duration) {
        super(name, age, deptNo);
        this.schoolName=schoolName;
        this.duration=duration;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "schoolName='" + schoolName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
