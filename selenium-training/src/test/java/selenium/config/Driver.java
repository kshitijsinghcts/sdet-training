package selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;
import java.util.Optional;

public class Driver {
    private Driver() {}

    public static void initDriver(Optional<String> browserType) {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriver driver = null;
            if (browserType.isPresent() && browserType.get().equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else {
                driver = new ChromeDriver();
            }
            DriverManager.setDriver(driver);
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.closeDriver();
        }
    }
}
