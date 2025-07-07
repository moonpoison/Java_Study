package Bank;

public class NegativeValueException extends Throwable{
    NegativeValueException(){}
    NegativeValueException(String message){
        super(message);
    }
}
