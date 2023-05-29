package ua.hillel;


import org.testng.annotations.Test;

public class FirstTest {
    @Test
    public void firstTest() {
System.out.println("I`m your first test");
        System.out.println("Running test on " + System.getProperty("url"));
    }
}
