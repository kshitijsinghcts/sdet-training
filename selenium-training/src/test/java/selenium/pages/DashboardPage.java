package selenium.pages;

import org.openqa.selenium.By;

import selenium.config.DriverManager;

public class DashboardPage {

    private static final By DASHBOARD_LABEL = By.xpath("//h6[text()='Dashboard']");

    public boolean isDashboardDisplayed() {
        return DriverManager.getDriver().findElement(DASHBOARD_LABEL).isDisplayed();
    }
}
