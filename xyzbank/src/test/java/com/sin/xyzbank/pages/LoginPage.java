package com.sin.xyzbank.pages;

import com.sin.xyzbank.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final WebDriverWait wait;

    private static final By USER_SELECT = By.id("userSelect");
    private static final By LOGIN_BTN = By.cssSelector("body > div > div > div.ng-scope > div > form > button");

    public LoginPage() {
        wait = DriverManager.getWait();
    }

    public void selectUser(String userName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(USER_SELECT)).sendKeys(userName);
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_BTN)).click();
    }
}
