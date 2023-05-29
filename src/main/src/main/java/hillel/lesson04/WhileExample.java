package hillel.lesson04;

public class WhileExample {
    public static void main(String[] args) {
        int attempt = 0;
        boolean cont = true;

        while (cont) {
            System.out.println("Attempt " + attempt++);
            if (attempt > 6) {
                cont = false;
            }
        }
    }
}
