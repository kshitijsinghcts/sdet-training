package com.sin.xyzbank.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Objects;

public class Driver {

    private Driver() {
        // method to prevent instance creation
    }

    public static WebDriver initDriver() {
        String browser = ConfigReader.getProperty("browser");
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriver driver = null;
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
            }
            DriverManager.setDriver(driver);
        }
        return DriverManager.getDriver();
    }

    public static void unload() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.unload();
        }
    }
}
