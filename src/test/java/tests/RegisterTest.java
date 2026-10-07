package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

    LoginPage loginPage;
    RegisterPage registerPage;

    @Test
    public void register_test() throws InterruptedException {
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        loginPage.clickRegister();

        registerPage.registerUser("test_fname", "test_lname",
                "test_address",
                "test_city",
                "test_state",
                "675678",
                "8978564534",
                "223"
                , "test_user841961",
                "test_user",
                "test_user"
        );

        waitForSeconds(5);
        Assert.assertTrue(registerPage.isSuccessMessageVisible());
        Assert.assertEquals(registerPage.getSuccessfulRegisterTitle(), "Welcome test_user841961");
    }

}
