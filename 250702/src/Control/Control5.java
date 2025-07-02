package Control;

public class Control5 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // while 사용
        int LIMIT = 10;
        int Sum = 0;
        double Avg = 0;
        int num=2, cnt=0;
        while(num <= LIMIT){
            Sum+=num;
            num+=2;
            cnt++;
        }
        Avg = (double) Sum / cnt;
        System.out.printf("Sum = %d, Avg = %.2f\n", Sum, Avg);
    }
}
