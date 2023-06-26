package HW15;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDownloadTest {

    @Test
    public void uploadModifiedFileTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        DownloadPage downloadPage = new DownloadPage(driver);
        downloadPage.open();
        String downloadedFilePath = downloadPage.downloadFile();

        ModifyFile(downloadedFilePath);

        UploadPage uploadPage = new UploadPage(driver);
        uploadPage.open();
        uploadPage.uploadFile(downloadedFilePath);

        String uploadedFileName = uploadPage.getUploadedFileName();
        Assert.assertFalse(uploadedFileName.contains("modified"), "File upload failed");

        driver.quit();
    }

    private void ModifyFile(String filePath) {
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("НОВИЙ ТЕСТОВИЙ РЯДОК 1\n");
            bw.write("НОВИЙ ТЕСТОВИЙ РЯДОК 2\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DownloadPage {
    private WebDriver driver;

    public DownloadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/download");
    }

    public String downloadFile() {
        WebElement fileLink = driver.findElement(By.linkText("some-file.txt"));
        String fileUrl = fileLink.getAttribute("href");
        driver.get(fileUrl);
        return getDownloadedFilePath();
    }

    private String getDownloadedFilePath() {
        //Отримання шляху завантаженого файлу
        //Повернення шляху файлу
        return "F:\\UserTest\\some-file.txt";
    }
}

class UploadPage {
    private WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(filePath);

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }

    public String getUploadedFileName() {
        WebElement uploadedFileNameElement = driver.findElement(By.id("uploaded-files"));
        return uploadedFileNameElement.getText();
    }
}
