package HWMVN.HW12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ua.hillel.Listeners.CustomExtentReportListener;

@Listeners({ CustomExtentReportListener.class})
public class CheckboxTest {
    protected WebDriver driver;

        @Test
        public void CheckBoxTest() {
            // Вказуємо шлях до драйвера Chrome
            WebDriverManager.chromedriver().setup();

            // Ініціалізуємо драйвер
            WebDriver driver = new ChromeDriver();

            // Відкриваємо сторінку
            driver.get("https://the-internet.herokuapp.com/checkboxes");

            // Виводимо початковий стан чекбоксів
            WebElement checkbox1 = driver.findElement(By.cssSelector("input:nth-of-type(1)"));
            WebElement checkbox2 = driver.findElement(By.cssSelector("input:nth-of-type(2)"));

            System.out.println("Checkbox 1: " + checkbox1.isSelected());
            System.out.println("Checkbox 2: " + checkbox2.isSelected());

            // Вибираємо обидва чекбокси, якщо вони не вибрані
            if (!checkbox1.isSelected()) {
                checkbox1.click();
            }

            if (!checkbox2.isSelected()) {
                checkbox2.click();
            }

            // Повторно виводимо стан чекбоксів
            System.out.println("Checkbox 1: " + checkbox1.isSelected());
            System.out.println("Checkbox 2: " + checkbox2.isSelected());

            // Закриваємо вікно браузера
            driver.quit();
        }
    }

