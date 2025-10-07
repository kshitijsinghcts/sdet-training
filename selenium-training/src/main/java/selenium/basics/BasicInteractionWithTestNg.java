package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BasicInteractionWithTestNg {

    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        // start session
        driver = new ChromeDriver();
        // open page
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        // establish waiting strategy
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void testBasicInteraction() {
        // get information
        driver.getTitle();
        // find elements
        WebElement fullName = driver.findElement(By.id("fullname"));
        WebElement email = driver.findElement(By.cssSelector("#email"));
        WebElement address = driver.findElement(By.id("address"));
        WebElement password = driver.findElement(By.cssSelector("#password"));
        WebElement submit = driver.findElement(By.cssSelector("input[type='submit']"));
        // take action on element
        fullName.sendKeys("John Doe");
        email.sendKeys("john.doe@company.com");
        address.sendKeys("123 Main Street, City, Country");
        password.sendKeys("password123");
        submit.click();
        // request element information - not here
    }

    @AfterTest
    public void afterTest() {
        // close session
        driver.quit();
    }
}
