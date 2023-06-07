package HWMVN.HW12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

    public class LoginTest2 {
        @Test
        public void TestLogin2() {
            // Вказуємо шлях до драйвера Chrome
            WebDriverManager.chromedriver().setup();

            // Ініціалізуємо драйвер
            WebDriver driver = new ChromeDriver();

            // Відкриваємо сторінку
            driver.get("https://the-internet.herokuapp.com/login");

            // Тест на коректний логін
        testValidLogin(driver);

            // Закриваємо вікно браузера
            driver.quit();
        }
    public void testValidLogin(WebDriver driver) {
        // Вводимо коректні дані
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameInput.sendKeys("tomsmith");
        passwordInput.sendKeys("SuperSecretPassword!");
        loginButton.click();

        // Перевіряємо повідомлення про успішний вхід
        WebElement successMessage = driver.findElement(By.cssSelector(".flash.success"));
        String messageText = successMessage.getText();

        if (messageText.contains("You logged into a secure area!")) {
            System.out.println("Test Passed: Successful login message displayed.");
        } else {
            System.out.println("Test Failed: Successful login message not displayed.");
            }
        }
    }

