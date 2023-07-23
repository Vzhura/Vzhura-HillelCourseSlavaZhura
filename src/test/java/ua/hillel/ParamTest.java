package ua.hillel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ua.hillel.Listeners.CustomExtentReportListener;



    public class ParamTest {
        @Test
        @Parameters({"url", "browserName"})
        public void runTest(String url, String browser) {
            System.out.println("Running tests on " + browser + " on " + url);
        }
    }

