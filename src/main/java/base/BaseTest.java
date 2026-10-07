package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;

import java.io.ObjectInputFilter;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("Inside before method..");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("baseurl"));
    }

    public void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Inside after method..");
        if (driver != null) {
            driver.quit();
        }
    }
}
