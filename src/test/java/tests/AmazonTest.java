package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest {

    @Test
    public void openAmazon() {

        driver.get("https://www.amazon.in");

        String title = driver.getTitle();
        System.out.println("Amazon Title = " + title);

        Assert.assertTrue(title.contains("Amazon"));
    }
}