package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest {

    @Test
    public void openFlipkart() throws Exception {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.flipkart.com");

        Thread.sleep(5000);

        System.out.println("Flipkart Title = " + driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Flipkart"));

        driver.quit();
    }
}