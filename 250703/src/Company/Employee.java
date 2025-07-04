package Company;

import java.util.UUID;

public class Employee {
    private String name;
    private String empNo;
    private double salary;
    public Employee () {

    }
    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
        this.empNo = UUID.randomUUID().toString();
    }
    public Employee (String name, String empNo, double salary) {
        this.name = name;
        this.empNo = empNo;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getEmpNo() {
        return empNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empNo='" + empNo + '\'' +
                ", salary=" + salary +
                '}';
    }
    public double getAnualSalary() {
        return salary*12;
    }
    public double getAnualSalary(double taxRate) {
        return salary*12 - salary*12*taxRate;
    }
}
