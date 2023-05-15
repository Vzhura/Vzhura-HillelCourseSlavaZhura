package hillel.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Config {
    public String getConfigValue() {

        try {
            FileReader reader = new FileReader(new File("somefile"));
            reader.read();

            Thread.sleep(1000);
        } catch (IOException | InterruptedException e) {

        }

        return "";
    }
}
