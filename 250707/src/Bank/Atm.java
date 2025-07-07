package Bank;

public class Atm {
    public static void main(String[] args) {
        Account acc1 = new Account(10000);
        System.out.println(acc1);
        try{
            acc1.withdraw(20000.0);
        }catch (NotEnoughBalanceException e){
            System.out.println(e.getMessage());
        }
        System.out.println(acc1);
        try {
            acc1.withdraw(-100.0, "asd");
        } catch (NegativeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
