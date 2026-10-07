package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class WaitUtils {
    private WebDriver driver;
    private WebDriverWait wait;

    public WaitUtils(WebDriver driver, int timeoutSeconds) {
        this.driver = driver;

        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
    }

    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public boolean waitForUrlContains(String fraction) {
        return wait.until(ExpectedConditions.urlContains(fraction));
    }
}
