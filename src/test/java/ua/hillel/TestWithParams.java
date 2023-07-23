package ua.hillel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ua.hillel.Listeners.CustomExtentReportListener;


    public class TestWithParams {

        @Test
        @Parameters({"param1", "param2"})
        public void printParameters(String param1, String param2) {
            System.out.println("Перший параметр: " + param1);
            System.out.println("Другий параметр: " + param2);
        }
    }


