package utils;

import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import java.io.File;

public class ScreenshotUtil {

    public static String capture(String name) {

        String path = System.getProperty("user.dir") + "/screenshots/" + name + ".png";

        try {
            WebDriver driver = DriverFactory.getDriver();
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            File dest = new File(path);
            dest.getParentFile().mkdirs();

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return path;
    }
}