package hillel.lesson11;

import java.lang.reflect.Array;
import java.util.*;
public class ListEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2, 5);
        list.add(3);
        list.set(2, 0);

        list.get(1);

        Integer[] iArr = { 1, 2, 3 };

        List<Integer> listFromArray = Arrays.asList(iArr);

        String categories = "note,phone,tablet";
        String[] catArray = categories.split(",");
        List<String> categoryList = Arrays.asList(catArray);

    }
}
