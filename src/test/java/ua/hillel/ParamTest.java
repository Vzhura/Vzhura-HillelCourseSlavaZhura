package ua.hillel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import ua.hillel.Listeners.CustomExtentReportListener;

@Listeners({CustomExtentReportListener.class})
public class ParamTest {
    protected WebDriver driver;

    public static class ParamTest1 {
        @Test
        @Parameters({"url", "browserName"})
        public void runTest(String url, String browser) {
            System.out.println("Running tests on " + browser + " on " + url);
        }
    }
}
