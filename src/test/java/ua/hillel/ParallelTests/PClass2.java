package ua.hillel.ParallelTests;

import org.testng.annotations.Test;

public class PClass2 {
    @Test
    public void test(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}

        System.out.println("Test passed");
    }
}
