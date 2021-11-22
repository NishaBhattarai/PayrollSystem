public class CommissionBasedPartTime extends PartTime {
    private double commission;

    public CommissionBasedPartTime(String name, int age, int deptNo, double rate, int hoursWorked, double commission) {
        super(name, age, deptNo, rate, hoursWorked);
        this.commission = commission;
    }


    //a method to calculate the earnings of the employee
    public double calcEarnings() {
        return (super.getRate() * super.getHoursWorked()) + commission;
    }
}
