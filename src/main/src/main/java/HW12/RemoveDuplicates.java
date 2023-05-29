package HW12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> originalList = generateRandomList(100, 50);
        List<Integer> uniqueList = removeDuplicates(originalList);

        System.out.println("Original List:");
        System.out.println(originalList);

        System.out.println("\nUnique List:");
        System.out.println(uniqueList);

        int duplicatesCount = originalList.size() - uniqueList.size();
        System.out.println("\nNumber of removed duplicates: " + duplicatesCount);
    }

    public static List<Integer> generateRandomList(int size, int limit) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(limit + 1));
        }

        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return new ArrayList<>(uniqueSet);
    }
}

