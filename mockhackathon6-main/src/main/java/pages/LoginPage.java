package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By username = By.id("username");
    private By password = By.id("password");
    private By loginBtn = By.cssSelector("button[type='submit']");
    private By flashMsg = By.id("flash");
    private By logoutBtn = By.cssSelector(".icon-signout");

    public void login(String user, String pass) {
        sendKeys(username, user);
        sendKeys(password, pass);
        click(loginBtn);
    }

    public String getMessage() {
        return getText(flashMsg);
    }

    public void logout() {
        click(logoutBtn);
    }
}