public class FixedBasedPartTime extends PartTime{
    private double fixedAmount;

    public FixedBasedPartTime(String name, int age, int deptNo, double rate, int hoursWorked,
                              double fixedAmount) {
        super(name, age, deptNo, rate, hoursWorked);
        this.fixedAmount=fixedAmount;
    }

    public double getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(double fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    @Override
    public String toString() {
        return "FixedBasedPartTime{" +
                "fixedAmount=" + fixedAmount +
                '}';
    }

    //a method to calculate the earnings of the employee
    public double calcEarnings() {
        return (super.getRate() * super.getHoursWorked()) + fixedAmount;
    }
}

