package hillel.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class IteratorEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("");
        list.add("two");
        list.add("");
        list.add("three");

//    for (int i=0; i<list.size();i++) {
//      if (list.get(i).isBlank()) {
//        list.remove(i);
//      }
//    }

//    list.removeIf(s -> s.isBlank());

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.isBlank()) {
                iterator.remove();
            }
        }

        System.out.println(list);
        System.out.println(iterator.next());
    }
}
