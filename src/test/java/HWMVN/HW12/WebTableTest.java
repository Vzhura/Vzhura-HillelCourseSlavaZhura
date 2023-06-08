package HWMVN.HW12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class WebTableTest {
    @Test
    public void WebTable() {
        // Вказуємо шлях до драйвера Chrome
        WebDriverManager.chromedriver().setup();

        // Ініціалізуємо драйвер
        WebDriver driver = new ChromeDriver();

        // Відкриваємо сторінку
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        // Знаходимо всі кнопки
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        // Клікаємо на кожну кнопку
        for (WebElement button : buttons) {
            button.click();
        }

        // Знаходимо всі елементи у 4-му стовбці таблиці
        List<WebElement> tableCells = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr//td[4]"));

        // Виводимо значення на екран
        for (WebElement cell : tableCells) {
            System.out.println(cell.getText());
        }

        // Закриваємо вікно браузера
        driver.quit();
    }
}

