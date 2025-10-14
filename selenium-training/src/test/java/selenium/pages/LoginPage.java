package selenium.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.config.DriverManager;

public class LoginPage {
    
    private final WebDriverWait wait;
    private final WebDriver driver;
    private static final By USERNAME = By.name("username");
    private static final By PASSWORD = By.name("password");
    private static final By SUBMIT_BTN = By.cssSelector("button[type='submit']");

    public LoginPage() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setUsername(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(USERNAME)).sendKeys(name);
    }

    public void setPassword(String pass) {
        driver.findElement(PASSWORD).sendKeys(pass);
    }

    public DashboardPage clickSubmit() {
        driver.findElement(SUBMIT_BTN).click();
        return new DashboardPage();
    }
}
