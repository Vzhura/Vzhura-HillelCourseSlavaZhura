package ua.hillel.Login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLogin {

        @DataProvider(name = "loginData")
        public Object[][] loginData() {
            return new Object[][] {
                    {"user1", "password1", "admin"},
                    {"user2", "password2", "user"},
                    {"user3", "password3", "guest"}
            };
        }

        @Test(dataProvider = "loginData", groups = "login")
        public void TestLogin(String username, String password, String role) {
            System.out.println("TestLogin : username=" + username + ", password=" + password + ", role=" + role);
        }
    }

