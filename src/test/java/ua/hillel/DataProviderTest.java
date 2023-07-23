package ua.hillel;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


    public class DataProviderTest {
        @Test(dataProvider = "userProvider")
        public void userRoleTest(String userName, String password, String role) {
            String[] roles = {"user", "admin", "guest"};
            System.out.printf("name: %s - password: %s - role: %s%n", userName, password, role);
            System.out.println("Starting test for " + role);
            if (roles.equals("admin")) {
                throw new RuntimeException("Test is failed");
            }
            System.out.println("Test for " + role + " passed");

            Assert.assertEquals("actual", 1, "Assertion message");
            Assert.assertFalse(true, "Message");

//        SoftAssert softUserAssert = new SoftAssert();
//        softUserAssert.assertEquals(username, "John");
//        softUserAssert.assertTrue(role.isBlank());
//
//        System.out.println("Test goes on");
//        softUserAssert.assertAll();
        }

        @DataProvider(name = "userProvider")
        public Object[][] userProvider() {
            String[][] users = {
                    {"userName", "userPass", "user"},
                    {"adminName", "adminPass", "admin"},
                    {"guestName", "guestPass", "guest"},
            };
            return users;
        }
    }
