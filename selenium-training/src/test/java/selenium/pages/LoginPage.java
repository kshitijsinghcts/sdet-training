package selenium.pages;

import org.openqa.selenium.By;
import selenium.config.DriverManager;

public class LoginPage {
    
    private static final By USERNAME = By.name("username");
    private static final By PASSWORD = By.name("password");
    private static final By SUBMIT_BTN = By.cssSelector("button[type='submit']");

    public void setUsername(String name) {
        DriverManager.getDriver().findElement(USERNAME).sendKeys(name);
    }

    public void setPassword(String pass) {
        DriverManager.getDriver().findElement(PASSWORD).sendKeys(pass);
    }

    public DashboardPage clickSubmit() {
        DriverManager.getDriver().findElement(SUBMIT_BTN).click();
        return new DashboardPage();
    }
}
