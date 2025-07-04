package Company;

public class SecretaryEmployee extends Employee {
    private String boss;

    public SecretaryEmployee(){

    }
    public SecretaryEmployee(String name, double salary, String boss) {
        super(salary, name);
        this.boss = boss;
    }
    public SecretaryEmployee(String empNo, String name, double salary, String boss) {
        super(empNo, name, salary);
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return "SecretaryEmployee{" +
                super.toString() +
                "boss='" + boss + '\'' +
                '}';
    }
}
