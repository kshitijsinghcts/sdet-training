package com.sin.xyzbank.pages;

import com.sin.xyzbank.core.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage {
    private final WebDriverWait wait;

    private static final By TRANSACTION_BTN = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > button:nth-child(1)");
    private static final By DEPOSIT_BTN = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > button:nth-child(2)");
    private static final By WITHDRAW_BTN = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > button:nth-child(3)");
    private static final By ACCOUNT_NUMBER = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(1)");
    private static final By BALANCE = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)");
    private static final By CURRENCY = By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(3)");

    public AccountPage() {
        wait = DriverManager.getWait();
    }

    public void clickTransaction() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TRANSACTION_BTN)).click();
    }

    public void clickDeposit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(DEPOSIT_BTN)).click();
    }

    public void clickWithdraw() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(WITHDRAW_BTN)).click();
    }

    public String getAccountNumber() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(ACCOUNT_NUMBER)).getText();
    }

    public String getBalance() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(BALANCE)).getText();
    }

    public String getCurrency() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(CURRENCY)).getText();
    }
}
