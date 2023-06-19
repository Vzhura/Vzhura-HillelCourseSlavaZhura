package HW13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestFunctionDragAndDrop {
    @Test
    public void TestDragAndDrop() {
        //Шлях до драйвера Chrome
        WebDriverManager.chromedriver().setup();

        //Ініціалізація драйвера
        WebDriver driver = new ChromeDriver();

        //Відкриття сторінки
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");

        //Пошук початкового елементу і цільового елементу
        WebElement dragSource = driver.findElement(By.id("draggable"));
        WebElement dropTarget = driver.findElement(By.id("droppable"));

        //Створення об'єкту Actions для дій з перетягуванням
        Actions actions = new Actions(driver);

        //Перетягування елементу
        actions.dragAndDrop(dragSource, dropTarget).perform();

        //Перевірка, що текст "Dropped!" є
        String droppedText = dropTarget.getText();
        if (droppedText.equals("Dropped!")) {
            System.out.println("Елемент перетягнуто успішно");
        } else {
            System.out.println("Елемент не перетягнуто");
        }

        driver.quit();
    }
}
