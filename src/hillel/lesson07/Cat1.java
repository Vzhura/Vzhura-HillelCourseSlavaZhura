package hillel.lesson07;

public class Cat1 {
        private String color;
        private String name;
        private int age;

        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }

        public Cat1() {
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "color='" + color + '\'' +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public void sayMeow() {
            System.out.println(name + " say meow");
        }
    }
