package Control;

public class Control2 {
    public static void main(String[] args) {
        // 1~10까지의 합과 평균을 for문을 이용하여 구하시오
        int Sum=0;
        double Avg=0;
        int cnt=0;
        for(int i=1;i<=10;++i){
            Sum+=i;
            cnt++;
        }
        Avg = (double) Sum /cnt;
        System.out.printf("Sum = %d, Avg = %.2f\n", Sum, Avg);
    }
}
