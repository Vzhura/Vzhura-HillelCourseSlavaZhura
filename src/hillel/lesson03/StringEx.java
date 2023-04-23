package hillel.lesson03;

public class StringEx {
    public static void main(String[] args) {
        String str = "string1";
        String str2 = new String ("string2");

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str.isEmpty(); //перевірка чи є якесь значення
        str = "I love java";
        boolean result = str.contains("java"); //чи міститься якесь значення
        String s = "I " + "learn " + 10 + "langs";
    }
}
