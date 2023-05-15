package hillel.lesson11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class SetEx {
    public static  void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("one");
        set.add("one");
        set.add("two");
        set.add("six");
        set.add("three");
        set.add("four");
        set.add("five");

        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }
    }
}
