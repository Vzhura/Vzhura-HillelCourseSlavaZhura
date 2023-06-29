package HW16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDownloadTest {

    @Test
    public void uploadModifiedFileTest() {
        Configuration.browser = "chrome";

        DownloadPage downloadPage = new DownloadPage();
        downloadPage.open();
        String downloadedFilePath = downloadPage.downloadFile();

        ModifyFile(downloadedFilePath);

        UploadPage uploadPage = new UploadPage();
        uploadPage.open();
        uploadPage.uploadFile(downloadedFilePath);

        String uploadedFileName = uploadPage.getUploadedFileName();
        Assert.assertFalse(uploadedFileName.contains("modified"), "File upload failed");
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
    public void open() {
        Selenide.open("https://the-internet.herokuapp.com/download");
    }

    public String downloadFile() {
        String fileUrl = Selenide.$("a[href*='some-file.txt']").getAttribute("href");
        Selenide.open(fileUrl);
        return getDownloadedFilePath();
    }

    private String getDownloadedFilePath() {
        String downloadsFolder = Configuration.downloadsFolder;
        return downloadsFolder + "/some-file.txt";
    }
}

class UploadPage {
    public void open() {
        Selenide.open("https://the-internet.herokuapp.com/upload");
    }

    public void uploadFile(String filePath) {
        Selenide.$("input[type='file']").uploadFile(new File(filePath));
        Selenide.$("input[type='submit']").click();
    }

    public String getUploadedFileName() {
        return Selenide.$("#uploaded-files").waitUntil(Condition.visible, 5000).getText();

    }
}

