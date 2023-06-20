package HW14;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DragAndDropTest {

    @Test
    public void DragAnDropTestMet () {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);

        dragAndDropPage.openPage();

        dragAndDropPage.dragAndDropElement();

        if (dragAndDropPage.isDroppedTextDisplayed()) {
            System.out.println("Перетягування елементу успішне");
        } else {
            System.out.println("Перетягування елементу не вдалося");
        }

        driver.quit();
    }
}
