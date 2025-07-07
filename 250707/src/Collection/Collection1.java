package Collection;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        //List, Set, Map
        List<String> list = new ArrayList();
        list.add("a");
        list.add("1");
        list.add("1");
        list.add("2");
        list.remove("1");
        for(String s : list){
            System.out.println(s);
        }

        List<Integer> list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        for(int i : list1){
            System.out.println(i);
        }
    }
}
