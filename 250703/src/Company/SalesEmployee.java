package Company;

public class SalesEmployee extends Employee {
    //member variable
    //empno, name, salary
    private String loc;
    private double bonus;

    public SalesEmployee() {

    }
    public SalesEmployee(String name, double salary, String loc, double bonus) {
        super(salary, name);
        this.loc = loc;
        this.bonus = bonus;
    }
    public SalesEmployee(String name, String empNo, double salary, String loc, double bonus) {
        super(name, empNo, salary);
        this.loc = loc;
        this.bonus = bonus;
    }

    public String getLoc() {
        return loc;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return "SalesEmployee{" +
                "empNo='" + getEmpNo() + '\'' +
                ", name=" + getName() + '\'' +
                ", salary=" + getSalary() + '\'' +
                ", loc=" + loc + '\'' +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double getAnualSalary() {
        return super.getAnualSalary()+bonus;
    }
}
