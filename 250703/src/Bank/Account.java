package Bank;

public class Account {
    private String accNo;
    private Double balance;
    public Account() {
        this.accNo = "11111111";
        this.balance = 0.0;
    }
    public Account(String accNo, Double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    public Account(double balance) {
        this.accNo = "22222222";
        this.balance = balance;
    }
    public void deposit(Double money) {
        this.balance += money;
        System.out.print("입금 완료: \n");
    }
    public void withdraw(Double money) {
        if(this.balance >= money){
            this.balance -= money;
            System.out.print("당행 출금: \n");
        }else{
            System.out.println("잔액 부족: ");
        }
    }
    public void withdraw(Double money, String acc) {
        this.balance -= money;
        System.out.printf("타행 출금: %s \n", acc);
    }
    @Override
    public String toString() {
        return "Account{" +
                "accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
    public Double getBalance() {
        return balance;
    }
}
