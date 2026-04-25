package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class UploadPage extends BasePage {

    public UploadPage(WebDriver driver) {
        super(driver);
    }

    private By uploadInput = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadedText = By.id("uploaded-files");

    public void uploadFile(String path) {
        driver.findElement(uploadInput).sendKeys(path);
        click(uploadBtn);
    }

    public String getUploadedFile() {
        return getText(uploadedText);
    }
}