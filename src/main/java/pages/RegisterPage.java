package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.WaitUtils;

public class RegisterPage {
    private WebDriver driver;
    private WaitUtils waits;

    // Locators
    private final By fname = By.id("customer.firstName");
    private final By lname = By.id("customer.lastName");
    private final By address = By.id("customer.address.street");
    private final By city = By.id("customer.address.city");
    private final By state = By.id("customer.address.state");
    private final By zipcode = By.id("customer.address.zipCode");
    private final By phone = By.id("customer.phoneNumber");
    private final By ssn = By.id("customer.ssn");
    private final By user = By.id("customer.username");
    private final By password = By.id("customer.password");
    private final By rpassword = By.id("repeatedPassword");
    private final By registerBtn = By.xpath("//input[@value=\"Register\"]");
    private final By successfulRegisterTitle = By.xpath("//*[@class='title']");
    private final By successRegisterMessage = By.xpath("//*[text()='Your account was created successfully. You are now logged in.']");


    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        this.waits = new WaitUtils(driver, 20);
    }

    public String getSuccessfulRegisterTitle() {
        WebElement ele = waits.waitForElementToBeVisible(driver.findElement(this.successfulRegisterTitle));
        return ele.getText();
    }

    public boolean isSuccessMessageVisible() {
        WebElement ele = waits.waitForElementToBeVisible(driver.findElement(this.successRegisterMessage));
        return ele.isDisplayed();
    }

    // Actions
    public void registerUser(String fname, String lname, String address, String city, String state, String zipcode, String phone,
                             String ssn, String user, String password, String rpassword) {
        WebElement ele = waits.waitForElementToBeVisible(driver.findElement(this.fname));
        ele.sendKeys(fname);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.lname));
        ele.sendKeys(lname);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.address));
        ele.sendKeys(address);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.city));
        ele.sendKeys(city);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.state));
        ele.sendKeys(state);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.zipcode));
        ele.sendKeys(zipcode);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.phone));
        ele.sendKeys(phone);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.ssn));
        ele.sendKeys(ssn);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.user));
        ele.sendKeys(user);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.password));
        ele.sendKeys(password);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.rpassword));
        ele.sendKeys(rpassword);

        ele = waits.waitForElementToBeVisible(driver.findElement(this.registerBtn));
        ele.click();


        waits.waitForElementToBeVisible(driver.findElement(successfulRegisterTitle));
        System.out.println("Page title after registration is : " + driver.findElement(this.successfulRegisterTitle).getText());
    }


}
