package selenium.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.config.DriverManager;

public class DashboardPage {

    private final WebDriverWait wait;
    private static final By DASHBOARD_LABEL = By.xpath("//h6[text()='Dashboard']");

    public DashboardPage() {
        WebDriver driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public boolean isDashboardDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(DASHBOARD_LABEL)).isDisplayed();
    }
}
