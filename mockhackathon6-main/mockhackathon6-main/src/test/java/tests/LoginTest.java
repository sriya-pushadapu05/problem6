package tests;

import org.testng.annotations.*;
import org.testng.Assert;
import pages.LoginPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        loginPage = new LoginPage(driver);
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String user, String pass) {
        loginPage.login(user, pass);
        Assert.assertTrue(loginPage.getMessage().contains("secure") 
            || loginPage.getMessage().contains("invalid"));
    }

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!"},
                {"wrong", "wrong"}
        };
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}