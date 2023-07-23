package ua.hillel.pages;

import org.openqa.selenium.By;

/**
 * @author Maxim Karpenko mkarpenko@modeln.com
 */

public class MainPage extends BasePage {


    public LoginPage openAuthPage() {
        driver.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage();
    }
}
