package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void openGoogle() throws Exception {

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.google.com");

        Thread.sleep(5000);

        System.out.println("Google Title = " + driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Google"));

        driver.quit();
    }
}