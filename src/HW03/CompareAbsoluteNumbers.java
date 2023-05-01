package HW03;

public class CompareAbsoluteNumbers {
    public static void main(String[] args) {

        int num1 = 7;
        int num2 = -9;
        //визначили числа
        int abs1 = Math.abs(num1);
        int abs2 = Math.abs(num2);
        //визначили абсолютні значення чисел
        if (abs1 > abs2) {
            System.out.println("Абсолютне значення числа " + num1 + " більше за абсолютне значення числа " + num2);
        } else if (abs2 > abs1) {
            System.out.println("Абсолютне значення числа " + num2 + " більше за абсолютне значення числа " + num1);
        } else {
            System.out.println("Абсолютні значення чисел " + num1 + " та " + num2 + " однакові");
            //порівняли абсолютні значення + додав рівність
        }
    }
}


