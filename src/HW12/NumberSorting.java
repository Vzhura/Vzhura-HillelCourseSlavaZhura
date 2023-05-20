package HW12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSorting {
    public static void main(String[] args) {
        List<Integer> numbers = generateRandomNumbers();
        List<Integer> divisibleBy2 = new ArrayList<>();
        List<Integer> divisibleBy3 = new ArrayList<>();
        List<Integer> otherNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                divisibleBy2.add(number);
            }
            if (number % 3 == 0) {
                divisibleBy3.add(number);
            }
            if (number % 2 != 0 && number % 3 != 0) {
                otherNumbers.add(number);
            }
        }

        System.out.println("Numbers divisible by 2: " + divisibleBy2);
        System.out.println("Numbers divisible by 3: " + divisibleBy3);
        System.out.println("Other numbers: " + otherNumbers);
    }

    public static List<Integer> generateRandomNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int number = random.nextInt(100);
            numbers.add(number);
        }

        return numbers;
    }
}

