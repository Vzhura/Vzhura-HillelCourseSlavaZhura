package ua.hillel;


import org.testng.annotations.Test;

public class FirstTest {
    @Test(groups = {"regression","smoke","P1"},
    enabled = false,
    dependsOnMethods = {"innerTest", "tests.SecondTest.secondTest"},
    priority = 10)
    public void firstTest() {
System.out.println("I`m your first test");
        System.out.println("Running test on " + System.getProperty("url"));
    }
    @Test(priority = 20)
    public void newFuncTest(){
        System.out.println("NewFuncTest");
    }
    @Test(priority = 21)
    public void InnerTest1() {

    }
    @Test(priority = 30)
    public void InnerTest() {

    }
    @Test(priority = 40)
    public void test3() {

    }
}
