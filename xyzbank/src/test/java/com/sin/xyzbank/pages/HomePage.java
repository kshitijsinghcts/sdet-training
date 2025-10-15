package com.sin.xyzbank.pages;

import com.sin.xyzbank.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private final WebDriverWait wait;

    private static final By CUSTOMER_LOGIN_BTN = By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button");
    private static final By MANAGER_LOGIN_BTN = By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button");

    public HomePage() {
        wait = DriverManager.getWait();
    }

    public void clickCustomerLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CUSTOMER_LOGIN_BTN)).click();
    }

    public void clickManagerLogin() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(MANAGER_LOGIN_BTN)).click();
    }
}
