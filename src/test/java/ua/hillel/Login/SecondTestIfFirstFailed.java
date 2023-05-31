package ua.hillel.Login;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestIfFirstFailed {

        @Test(dependsOnGroups = "Login")
        public void dependentTest() {
            Assert.assertTrue(true, "Залежний тест не виконався через помилку в тесті TestLogin");
        }
    }

