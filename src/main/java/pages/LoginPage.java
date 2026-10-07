package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    private WaitUtils waits;

    // Locators
    private By usernameField = By.name("username");
    private By passwordField = By.id("password");
    private By loginButton = By.xpath("//input[@value=\"Log In\"]");
    private By registerLink = By.xpath("//a[text()='Register']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waits = new WaitUtils(driver, 20);
    }

    // Actions
    public void enterUsername(String username) {
        WebElement ele = waits.waitForElementToBeVisible(driver.findElement(usernameField));
        ele.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement ele = waits.waitForElementToBeVisible(driver.findElement(passwordField));
        ele.sendKeys(password);
    }

    public void clickLogin() {
        WebElement ele = waits.waitForElementToBeClickable(driver.findElement(loginButton));
        ele.click();
    }

    public void clickRegister() {
        WebElement ele = waits.waitForElementToBeClickable(driver.findElement(registerLink));
        ele.click();
    }
}
