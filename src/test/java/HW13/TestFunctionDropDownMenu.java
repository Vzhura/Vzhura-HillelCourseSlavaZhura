package HW13;

import io.github.bonigarcia.wdm.WebDriverManager;;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class TestFunctionDropDownMenu {

    @Test

    public void TestDropDownMenu() {

        //Шлях до драйвера Chrome
        WebDriverManager.chromedriver().setup();

        //Ініціалізація драйвера
        WebDriver driver = new ChromeDriver();

        //Відкриття сторінки
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html");

        //Знаходження елемента dropdown-меню
        WebElement dropdownMenu = driver.findElement(By.className("dropdown"));

        //Розкриття dropdown-меню
        Actions actions = new Actions(driver);
        actions.moveToElement(dropdownMenu).perform();

        //Клік на пункт "Secondary Action"
        WebElement secondaryAction = driver.findElement(By.xpath("//a[text()='Dropdown']"));
        actions.click(secondaryAction).perform();

        //Перевірка тексту "Secondary Page"
        String pageTitle = driver.getTitle();
        if (pageTitle.equals("Secondary Page")) {
            System.out.println("Тест пройдено. Відображається сторінка з текстом 'Secondary Page'.");
        } else {
            System.out.println("Тест не пройдено. Сторінка не відображається або містить неправильний текст.");
        }

        driver.quit();
            }
        }

