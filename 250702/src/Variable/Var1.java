package Variable;

// 원시타입 (Primitive Type)
public class Var1 {
    public static void main(String[] args) {
        // 정수는 int
        int inNum = 2100000000; // 32bit 4byte
        double doubleNum = 21000000000D; // 64bit 8byte

        byte b1 = 1;
        byte b2 = 127;
        byte b3 = (byte) (b1 + b2);
        System.out.println(b3);

        //실수는 double
        float f1 = 1000000000.0F;
        float f2 = 1000000000.0F;
        float f3 = (f1 + f2);
        double d1 = f3;
        System.out.println(f3);

        int num1 = 1500000000;
        int num2 = 1500000000;
        int result = num1 + num2;
        System.out.println(result);
    }
}
