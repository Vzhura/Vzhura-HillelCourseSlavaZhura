package hillel.lesson12;

import java.util.*;

public class SortEx {
    public static void main(String[] args) {
//    Set<User> users = new TreeSet<>();
//
//    User jon = new User();
//    jon.setName("Jon");
//
//    User aria = new User();
//    aria.setName("Aria");
//
//    users.add(jon);
//    users.add(aria);
//    System.out.println(users);


        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(7);

        nums.sort((Comparator<? super Integer>) new MyComparator());
        System.out.println(nums);
    }
}
