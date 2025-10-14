package selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {
    public static void initDriver() {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.driver.remove();
        }
    }
}
