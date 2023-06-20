package HW14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class UserNameTestRefactor {

    @Test
    public void UserName() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        homePage.open();
        List<String> usernames = homePage.getUsernames();
        for (String username : usernames) {
            System.out.println("Username: " + username);
        }
        driver.quit();
    }
}

class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/hovers");
    }

    public List<String> getUsernames() {
        List<WebElement> userBlocks = driver.findElements(By.className("figure"));
        List<String> usernames = new ArrayList<>();
        for (WebElement userBlock : userBlocks) {
            WebElement usernameElement = userBlock.findElement(By.tagName("h5"));
            String username = usernameElement.getText();
            usernames.add(username);
        }
        return usernames;
    }
}

