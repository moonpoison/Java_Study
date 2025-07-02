package Operation;

public class Op4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

//        // 세 수의 최댓값과 최솟값을 구하시오
//        int max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//
//        int min = a;
//        if (b < min) min = b;
//        if (c < min) min = c;
//        System.out.printf("%d %d\n", min, max);

        char Min, Max;
        Max = a > b ? (a > c ? 'a' : 'c') : (b > c ? 'b' : 'c');
        Min = a < b ? (a < c ? 'a' : 'c') : (b < c ? 'b' : 'c');

        System.out.println("최댓값: " + Max);
        System.out.println("최솟값: " + Min);
    }
}
