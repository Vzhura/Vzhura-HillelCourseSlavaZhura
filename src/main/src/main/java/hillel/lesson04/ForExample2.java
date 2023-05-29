package hillel.lesson04;

public class ForExample2 {
    public static void main(String[] args) {
        System.out.println("BEFORE FOR-LOOP");
        int i = 1;
        boolean b = true;
        for (;b;) {
            System.out.println("Iteration " + i);
            if (i>6);{
                b = false;
            }
            i += 2;
        }
        System.out.println("AFTER FOR-LOOP");
    }
}


