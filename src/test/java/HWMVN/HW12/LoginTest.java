package HWMVN.HW12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
    @Test
    public void TestLogin() {
        // Вказуємо шлях до драйвера Chrome
        WebDriverManager.chromedriver().setup();

        // Ініціалізуємо драйвер
        WebDriver driver = new ChromeDriver();

        // Відкриваємо сторінку
        driver.get("https://the-internet.herokuapp.com/login");

        // Тест на некоректний логін
        testInvalidLogin(driver);

        // Закриваємо вікно браузера
        driver.quit();
    }
    public void testInvalidLogin(WebDriver driver) {
        // Вводимо некоректні дані
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        usernameInput.sendKeys("incorrect_username");
        passwordInput.sendKeys("incorrect_password");
        loginButton.click();

        // Перевіряємо повідомлення про некоректний логін/пароль
        WebElement errorMessage = driver.findElement(By.cssSelector(".flash.error"));
        String messageText = errorMessage.getText();

        if (messageText.contains("Your username is invalid!")) {
            System.out.println("Test Passed: Invalid login message displayed.");
        } else {
            System.out.println("Test Failed: Invalid login message not displayed.");
        }
    }
}
