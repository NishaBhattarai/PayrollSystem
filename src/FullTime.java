public class FullTime extends Employee{
    private double salary;
    private double bonus;

    public FullTime(String name, int age, int deptNo, double salary, double bonus) {
        super(name, age, deptNo);
        this.salary=salary;
        this.bonus=bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "FullTime{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }

    //a method to calculate earning of the employee
    public double calcEarnings(){
        return salary + bonus;
    }

}
