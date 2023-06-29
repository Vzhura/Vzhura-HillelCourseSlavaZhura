package HW16;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dynamicLoadingElementTest2 {

    @Test
    public void dynamicLoadingElementTest2() {
        DynamicLoadingPage dynamicLoadingPage = open("https://the-internet.herokuapp.com/dynamic_loading", DynamicLoadingPage.class);
        Configuration.timeout = 7500;
        dynamicLoadingPage.clickExample2();
        dynamicLoadingPage.clickStartButton();
        dynamicLoadingPage.waitForFinish();
        String text = dynamicLoadingPage.getLoadedText();

//        assertThat(text).isEqualTo("Hello World!");
    }

    public static class DynamicLoadingPage {
        private SelenideElement example2Link = $("#content a[href='/dynamic_loading/2']");
        private SelenideElement startButton = $("#start button");
        private SelenideElement loadingIndicator = $("#loading");
        private SelenideElement loadedText = $("#finish h4");

        public void clickExample2() {
            example2Link.click();
        }

        public void clickStartButton() {
            startButton.click();
        }

        public void waitForFinish() {
            loadingIndicator.should(Condition.disappear);
        }

        public String getLoadedText() {
            return loadedText.getText();
        }

    }
}
