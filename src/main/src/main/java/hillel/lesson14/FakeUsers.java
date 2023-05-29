package hillel.lesson14;

import com.github.javafaker.Faker;

public class FakeUsers {
    public static void main(String[] args) {
        Faker faker = new Faker();
        for (int i=0; i<10; i++) {
            String user = faker.name().firstName() + " " + faker.name().lastName();
            System.out.println(user);
        }
    }
}
