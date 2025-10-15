package com.sin.xyzbank.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    private static final ThreadLocal<WebDriver> dr = new ThreadLocal<>();
    private static final ThreadLocal<WebDriverWait> wait = new ThreadLocal<>();


    private DriverManager() {
        // method to prevent instance creation
    }

    public static WebDriver getDriver() {
        return dr.get();
    }

    public static void setDriver(WebDriver driver) {
        dr.set(driver);
    }

    public static WebDriverWait getWait() {
        return wait.get();
    }

    public static void setWait(WebDriverWait webDriverWait) {
        wait.set(webDriverWait);
    }

    public static void unload() {
        WebDriver driver = dr.get();
        if (driver != null) {
            driver.quit();
            dr.remove();
            wait.remove();
        }
    }

}
