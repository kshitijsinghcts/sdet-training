package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class BasicInteraction {
    public static void main(String[] args) {
        // start session
        WebDriver driver = new ChromeDriver();
        // open page
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        // get information
        driver.getTitle();
        // establish waiting stratergy
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // find an element
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
        // close session
        driver.quit();
    }
}
