package pages;

import base.BasePage;
import org.openqa.selenium.*;

public class CheckboxPage extends BasePage {

    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    private By checkbox1 = By.xpath("(//input[@type='checkbox'])[1]");
    private By checkbox2 = By.xpath("(//input[@type='checkbox'])[2]");

    public void toggleCheckbox1() {
        click(checkbox1);
    }

    public void toggleCheckbox2() {
        click(checkbox2);
    }
}