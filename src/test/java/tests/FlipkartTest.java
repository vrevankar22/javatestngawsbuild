package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest {

    @Test
    public void openFlipkart() {

        driver.get("https://www.flipkart.com");

        String title = driver.getTitle();
        System.out.println("Flipkart Title = " + title);

        Assert.assertTrue(title.toLowerCase().contains("flipkart"));
    }
}