package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    private By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
    private By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
    private By result = By.id("result");

    public void clickAlert() {
        click(jsAlert);
    }

    public void clickConfirm() {
        click(jsConfirm);
    }

    public void clickPrompt() {
        click(jsPrompt);
    }

    public String getResult() {
        return getText(result);
    }
}