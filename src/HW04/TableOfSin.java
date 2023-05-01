package HW04;
public class TableOfSin {
        public static void main(String[] args) {
            // Кількість градусів в одному кутовому кроці
            int step = 10;

            // Обчислення та друк таблиці значень sin(x) для кожного кроку
            for (int x = 0; x <= 360; x += step) {
                double radians = Math.toRadians(x);
                double sinValue = Math.sin(radians);
                System.out.printf("sin(%d) = %.4f\n", x, sinValue);
            }
        }
    }


