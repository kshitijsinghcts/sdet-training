package selenium.cases;

import selenium.config.DriverManager;
import selenium.pages.LoginPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class PageObjectTest {

    @BeforeMethod
    public void setup() {
        DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        boolean isDashboardDisplayed = loginPage.clickSubmit().isDashboardDisplayed();
        assert isDashboardDisplayed;
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.closeDriver();
    }
}