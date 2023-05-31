package ua.hillel;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestWithParams {

    @Test
    @Parameters({"param1", "param2"})
    public void printParameters(String param1, String param2) {
        System.out.println("Перший параметр: " + param1);
        System.out.println("Другий параметр: " + param2);
    }
}

