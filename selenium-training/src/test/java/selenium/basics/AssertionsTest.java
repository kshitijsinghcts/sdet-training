package selenium.basics;
import java.io.File;
// Java imports
import java.io.IOException;
import java.time.Duration;
// Selenium imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils; // Added this import
import org.openqa.selenium.TakesScreenshot;
// TestNG imports
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/* THIS IS A NOTE FOR THE ORDER OF EXECUTION 
 * BeforeTest -> BeforeClass -> (BeforeMethod -> Test -> AfterMethod)
 * -> AfterClass -> AfterTest
 * (...) is run together so it can be called n number of times for n 
 * number of test cases but together and in that order.
*/

public class AssertionsTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://globalsqa.com/angularJs-protractor/BankingProject/#/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    /* You can have hard assertion where one fail stops things or
     * soft assertion where things continue even after a fail.
     * soft assert is imported whereas hard assert is default.
     */
    @Test
    public void loginTest() {
        // for soft assertion
        SoftAssert softAssert = new SoftAssert();
        // go to customer login
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
        // select name: Harry Potter
        Select fullName = new Select(driver.findElement(By.id("userSelect")));
        fullName.selectByVisibleText("Harry Potter");
        // click login
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
        // validate account number and currency
        String accountNumber = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[1]")).getText();
        String currency = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[3]")).getText();
        // assert
        softAssert.assertEquals(accountNumber, "1005", "Account number is not correct"); // this will fail and take screenshot
        softAssert.assertEquals(currency, "Dollar", "Currency is not correct");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        // Take screenshot only if a test case fails
        if (result.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            // Make destination and copy
            File destination = new File(System.getProperty("user.dir") + "/src/test/resources/screenshots/test.png");
            FileUtils.copyFile(source, destination);
        }
        // close session
        driver.quit();
    }
}