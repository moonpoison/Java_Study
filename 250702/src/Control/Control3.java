package Control;

public class Control3 {
    public static void main(String[] args) {
        // 1~10까지 합과 평균을 구하시오
        // while
        int LIMIT = 10;
        int Sum = 0;
        double Avg = 0;
        int cnt=1;
        while(cnt <= LIMIT){
            Sum+=cnt;
            cnt++;
        }
        Avg = (double) Sum / LIMIT;
        System.out.printf("Sum = %d, Avg = %.2f\n", Sum, Avg);
    }
}
