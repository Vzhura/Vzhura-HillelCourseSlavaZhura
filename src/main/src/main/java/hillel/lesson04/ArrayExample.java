package hillel.lesson04;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] intArray = new int[5];
//        String[] stringArray = new String[10];

//        System.out.println(intArray);
//        System.out.println(Arrays.toString(stringArray));


        String[] categories = {"cat1", "cat2", "cat3"};
//        System.out.println(Arrays.toString(categories));

        intArray[1] = 10;
        intArray[3] = 20;

        System.out.println(Arrays.toString(intArray));

        int i = intArray[1] + 5;
        System.out.println(i);
    }
}
