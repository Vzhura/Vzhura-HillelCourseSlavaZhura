package ua.hillel.wd;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatorEx {
    @Test
    public void locatorTest() {
        WebDriverManager.chromedriver();

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.id("page-footer"));
        
    }
}
