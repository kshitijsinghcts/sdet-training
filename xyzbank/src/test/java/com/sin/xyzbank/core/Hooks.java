package com.sin.xyzbank.core;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    @Before
    public void setup() {
        WebDriver driver = Driver.initDriver();
        int waitTime = Integer.parseInt(ConfigReader.getProperty("wait.time.seconds"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
        DriverManager.setWait(wait);

        driver.get(ConfigReader.getProperty("url"));
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        Driver.unload();
    }
}
