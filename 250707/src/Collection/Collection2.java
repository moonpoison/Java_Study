package Collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Collection2 {
    public static void main(String[] args) {
        //Set
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("b");

        for(String s:set){
            System.out.println(s);
        }

        //Set을 이용하여 (1~10)까지의 6개의 숫자를 Set에 입력하고 출력하시오
        Set<Integer> set1 = new HashSet<>();

        Random rand = new Random();
        int cnt=0;
        while(set1.size() < 6){
            set1.add(rand.nextInt(10)+1);
            cnt++;
        }
        for(int i:set1){
            System.out.println(i);
        }
        System.out.println(cnt);
    }
}
