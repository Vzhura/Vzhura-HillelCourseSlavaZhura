package ua.hillel.wd.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class RozetkaTest {

    private WebDriver driver;

    @Test
    public void RozetkaTest() {
    WebDriverManager.chromedriver().setup();

    WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/ua");

        driver.findElement(By.id("fat-menu")).click();

        Actions actions = new Actions(driver);

        List<WebElement> menuItems = driver.findElements(By.cssSelector(".menu-categories_item"));
        for (WebElement item : menuItems) {
            if (item.getText().equals("Товари для геймерів")) {
                actions.moveToElement(item).pause(1)
                        .moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Комплектуючі для геймерів')]/..//a[@class='menu_link' and contains(text(),'Відеокарти')]")))
                        .click()
                        .perform();
                break;
            }
        }


    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
