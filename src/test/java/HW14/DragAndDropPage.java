package HW14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropPage {

    private WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    public void dragAndDropElement() {
        WebElement dragSource = driver.findElement(By.id("draggable"));
        WebElement dropTarget = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragSource, dropTarget).perform();
    }

    public boolean isDroppedTextDisplayed() {
        WebElement dropTarget = driver.findElement(By.id("droppable"));
        String droppedText = dropTarget.getText();
        return droppedText.equals("Dropped!");
    }
}


