package Operation;

// Operation
public class Op1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = num1++ + ++num2; // 증감연산자에서 후위0연산은 동일행에서 증감이 적용이안됨
        System.out.printf("result = %d + %d = %d\n", num1, num2, result);
    }
}
