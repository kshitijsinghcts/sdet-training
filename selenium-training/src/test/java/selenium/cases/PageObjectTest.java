package selenium.cases;

import java.util.Optional;
import selenium.config.Driver;
import selenium.pages.LoginPage;
import selenium.config.DriverManager;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PageObjectTest {

    @BeforeMethod
    public void setup() {
        Driver.initDriver(Optional.empty());
        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        boolean isDashboardDisplayed = loginPage.clickSubmit().isDashboardDisplayed();
        Assert.assertTrue(isDashboardDisplayed);
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}