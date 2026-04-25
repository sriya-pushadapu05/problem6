package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class DynamicPage extends BasePage {

    public DynamicPage(WebDriver driver) {
        super(driver);
    }

    private By startBtn = By.xpath("//button[text()='Start']");
    private By finishText = By.id("finish");

    public void startLoading() {
        click(startBtn);
    }

    public String getTextAfterLoad() {
        return getText(finishText);
    }
}