package Collection;

import java.util.HashMap;
import java.util.Map;

public class Collection3 {
    public static void main(String[] args) {
        //Map (Key, Value)
        Map<String, Integer> map = new HashMap();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);

        for(String key : map.keySet()){
            System.out.printf("%s : %d\n", key, map.get(key));
        }
        for(Integer value : map.values()){
            System.out.printf("%d\n", value);
        }
    }
}
