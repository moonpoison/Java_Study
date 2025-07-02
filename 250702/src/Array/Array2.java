package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        String [] strs = new String[3];
        // 3번 문자를 입력 받아 배열을 출력하시오
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;++i){
            strs[i] = sc.next();
        }
        System.out.println(Arrays.toString(strs));
        sc.close();
    }
}
