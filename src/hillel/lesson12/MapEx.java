package hillel.lesson12;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("one",1);
        map.put("one",2);
        map.put("three",3);
        map.put("four",4);

        System.out.println(map.size());
        System.out.println(map.get.OrDefault("five",0));
        System.out.println(map.get("one"));
    }
}
