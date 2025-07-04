package Company;

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee(1000.0, "이사원");
        SalesEmployee se = new SalesEmployee("이세일",1000.0, "Seoul", 1000.0);
        SecretaryEmployee sc = new SecretaryEmployee("이비서", 1000.0, "이보스");

        System.out.println(e);
        System.out.println(se);
        System.out.println(sc);

        System.out.println(e.getAnualSalary());
        System.out.println(se.getAnualSalary());
        System.out.println(sc.getAnualSalary());
    }
}
