package ua.hillel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ua.hillel.Listeners.CustomExtentReportListener;

@Listeners({CustomExtentReportListener.class})
public class TestWithParams {
    protected WebDriver driver;

    public static class TestWithParams1 {

        @Test
        @Parameters({"param1", "param2"})
        public void printParameters(String param1, String param2) {
            System.out.println("Перший параметр: " + param1);
            System.out.println("Другий параметр: " + param2);
        }
    }
}

