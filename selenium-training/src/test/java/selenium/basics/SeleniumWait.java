package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SeleniumWait {
    
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void moduleTest() {
        String title = driver.getTitle();
        System.out.println("On page:" + title);
        // this is the button that will reveal the box
        WebElement addBoxBtnElement = driver.findElement(By.id("adder"));
        addBoxBtnElement.click();
        // now we wait for the box for 5 secs checking every 500 ms
        WebElement boxElement = new WebDriverWait(driver, Duration.ofSeconds(5))
                .pollingEvery(Duration.ofMillis(500))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("box0")));
        // get color of box to show
        System.out.println(boxElement.getCssValue("background-color"));
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }

}