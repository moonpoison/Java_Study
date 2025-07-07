package Bank;

public class NotEnoughBalanceException extends Throwable {
    public NotEnoughBalanceException(){}
    public NotEnoughBalanceException(String message){
        super(message);
    }
}
