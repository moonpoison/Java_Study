package Bank;

public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        System.out.println(acc1);
        Account acc2 = new Account(10000);
//        acc2.balance = 100000000.0;
        System.out.println(acc2);
        acc2.deposit(10000.0);
        System.out.println(acc2);

        System.out.println(acc2.getBalance());

        acc2.withdraw(30000.0);
    }
}
