package HW04;
    import java.util.Random;

    public class AverageArrayGenerator {
        public static void main(String[] args) {
            // Створюємо об'єкт класу Random для генерації випадкових чисел
            Random random = new Random();

            // Створюємо масив з 20 випадкових чисел
            int[] numbers = new int[20];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = random.nextInt(100);
            }

            // Обчислюємо суму всіх елементів масиву
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // Обчислюємо середнє арифметичне
            double average = (double) sum / numbers.length;

            // Виводимо результат
            System.out.println("Масив: ");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println("\nСереднє арифметичне: " + average);
        }
    }

