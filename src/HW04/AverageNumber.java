package HW04;

import java.util.Random;

public class AverageNumber {
    public static void main(String[] args) {
        int[] arr = new int[20];
        Random rand = new Random();

        // заповнюємо масив випадковими числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100); // генеруємо число від 0 до 99
        }

        // замінюємо парні числа на 0
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // перевіряємо, чи число парне
                arr[i] = 0; // замінюємо парне число на 0
            }
        }

        // виводимо масив на екран
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


