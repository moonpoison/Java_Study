package Control;

public class Control4 {
    public static void main(String[] args) {
        // 1~10까지의 숫자중 짝수의 합과 평균을 구하시오
        // for 사용
        int Sum=0;
        double Avg=0;
        int cnt=0;
        for(int i=2;i<=10;i+=2){
            Sum+=i;
            cnt++;
        }
        Avg = (double) Sum / cnt;
        System.out.printf("Sum = %d, Avg = %.2f\n", Sum, Avg);
    }
}
