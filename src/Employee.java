public abstract class Employee {
    private static int age;
    private String name;
    private int deptNo;

    public Employee(String name, int age, int deptNo) {
        this.name = name;
        this.age = age;
        this.deptNo=deptNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", deptNo=" + deptNo +
                '}';
    }


    //method to calculate Birth Year
    public int calcBirthYear() {
        return 2021 - age;
    }

    //a method to calculate the earnings of the employee
    public double calcEarnings(){
        return 1000;
    }

}