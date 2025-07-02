package Operation;

public class Op2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if(a++ > 0 || b++ < 0){     // OR 연산의 경우 앞선 조건이 참일경우 이후 조건은 검사하지않음
            System.out.println("OK");
        }
        else{
            System.out.println("Fail");
        }
        System.out.printf("    %d, %d", a, b);
    }
}
