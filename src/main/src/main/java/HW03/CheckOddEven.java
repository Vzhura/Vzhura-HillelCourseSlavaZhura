package HW03;

public class CheckOddEven {
    public static void main(String[] args) {
        int num = -8;

        // Якщо число ділиться на 2, то то це парне число, якщо ні - непарне
        // Якщо залишок від ділення дорівнює нулю, то парне
        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
            System.out.println("BYE");
    }
}
