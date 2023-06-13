package HW13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UserNameTest {

    @Test
    public void UserName() {
        // Шлях до драйвера Chrome
        WebDriverManager.chromedriver().setup();

        // Ініціалізація драйвера
        WebDriver driver = new ChromeDriver();

        // Відкриття сторінки
        driver.get("https://the-internet.herokuapp.com/hovers");

        //Всі блоки з користувачами
        java.util.List<WebElement> userBlocks = driver.findElements(By.className("figure"));

        //Перевірка блоків з користувачами
        for (WebElement userBlock : userBlocks) {

            //Елемент з юзернеймом в поточному блоку
            WebElement usernameElement = userBlock.findElement(By.tagName("h5"));

            //Текст юзернейму
            String username = usernameElement.getText();

            //Юзернейм на екран
            System.out.println("Username: " + username);
        }

        driver.quit();
    }
}
