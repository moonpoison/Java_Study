package Array2;

import java.util.Arrays;
import java.util.Random;

public class Array3 {
    public static void main(String[] args) {
        // 5행 5열의 배열에 1~100 까지의 random 한 숫자를 입력한다. 단, 중복은 허용하지 않고 최종 배열을 출력하라.
        int[][] arr = new int[5][5];
        int[] visit = new int[5 * 5];
        Random rand = new Random();
        int i = 0, j = 0;
        while (i < 5) {
            boolean isDup=false;
            int n = rand.nextInt(25) + 1;
            point:
            for(int q=0;q<5;++q){
                for(int p=0;p<5;++p){
                    if(arr[q][p] == n){
                        isDup=true;
                        break point;
                    }
                }
            }
            if(!isDup){
                arr[i][j] = n;
                ++j;
                if (j == 5) {
                    ++i;
                    j = 0;
                }
            }
//            if (!Arrays.stream(visit, 0, i * 5 + j).anyMatch(val -> val == n)) {
//                arr[i][j] = n;
//                visit[i * 5 + j] = n;
//                ++j;
//                if (j == 5) {
//                    ++i;
//                    j = 0;
//                }
//            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

