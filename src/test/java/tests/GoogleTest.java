package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    @Test
    public void openGoogle() {

        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println("Google Title = " + title);

        Assert.assertTrue(title.toLowerCase().contains("google"));
    }
}