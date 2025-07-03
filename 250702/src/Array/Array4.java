package Array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random rand = new Random();

        int i = 0;
        while (i < arr.length) {
            int num = rand.nextInt(10) + 1;
//            if(!Arrays.asList(arr).contains(num)){
//                arr[i] = num;
//                ++i;
//            }
            if(!Arrays.stream(arr).anyMatch(value -> value == num)){
                arr[i]=num;
                ++i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Min : " + Arrays.stream(arr).min().orElseThrow());
        System.out.println("Max : " + Arrays.stream(arr).max().orElseThrow());
    }
}