package hillel.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
//    Map<String, Integer> map = new HashMap<>();
//    Map<User, String> userMap = new HashMap<>();
//
//    map.put("one", 1);
//    map.put("one", 2);
//    map.put("three", 3);
//    map.put("four", 4);
//
//    System.out.println(map.size());
//
//    System.out.println(map.getOrDefault("five", 0));
//    System.out.println(map.get("one"));
//
//    for (Integer i : map.values()) {
//      System.out.println(i);
//    }
//
//    for (String key : map.keySet()) {
//      map.get(key);
//    }
//
//    for (Map.Entry<String, Integer> entry : map.entrySet()) {
//      entry.getKey();
//      entry.getValue();
//    }


        User user = new User();
        user.setName("Jon Snow");
        user.setAge(10);
        System.out.println("1st value " + user.hashCode());

        Map<User, String> userMap = new HashMap<>();
        userMap.put(user, "the wall");

        user.setId(1);
        user.setAge(20);
        System.out.println("2nd value " + user.hashCode());

        System.out.println(userMap.get(user));
        System.out.println(userMap);
    }
}
