package HW03;

public class TriangleDefinition {
        public static void main(String[] args) {
            int a = 14;
            int b = 15;
            int c = 14;
            if ((a == b ) || (a == c) || (b == c)) {
                System.out.println("Трикутник рівнобедрений");
            } else {
                System.out.println("Трикутник не рівнобедрений");
            }
        }
}

