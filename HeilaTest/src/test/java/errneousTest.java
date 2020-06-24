import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class errneousTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\newChrome\\Chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void erroneousTest() {

        driver.get("http://students-aid.org:9222/platforms/nuis/register.html");
        driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.id("firstname")).sendKeys("Dana");
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).sendKeys("Dana");
        driver.findElement(By.id("personalId")).click();
        driver.findElement(By.id("personalId")).sendKeys("395668428");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("0526546177");
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("0002-01-01");
        driver.findElement(By.cssSelector(".male")).click();
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("0020-01-01");
        driver.findElement(By.id("dateOfBirth")).sendKeys("0202-01-01");
        driver.findElement(By.id("dateOfBirth")).sendKeys("2020-01-01");
        driver.findElement(By.cssSelector(".hide-edit .checklabel")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("0001-01-01");
        driver.findElement(By.id("dateOfBirth")).sendKeys("0019-01-01");
        driver.findElement(By.id("dateOfBirth")).sendKeys("0199-01-01");
        driver.findElement(By.id("dateOfBirth")).sendKeys("1999-01-01");
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("isStudentNo")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("hasCarNo")).click();
        driver.findElement(By.cssSelector("body")).click();
        driver.findElement(By.name("days")).click();
        driver.findElement(By.cssSelector(".row:nth-child(5) > .col-4:nth-child(2) input")).click();
        driver.findElement(By.cssSelector(".row:nth-child(9) > .col-4:nth-child(2) input")).click();
        driver.findElement(By.name("langs")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("ui-id-12")).click();
        driver.findElement(By.id("residence")).sendKeys("ל");
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.name("role")).click();

        driver.findElement(By.cssSelector(".button-big")).click();

        driver.findElement(By.cssSelector(".row:nth-child(2) .text-left")).click();

        driver.findElement(By.id("email")).click();

        driver.findElement(By.id("email")).sendKeys("adiworkr@gmail.com");

        driver.findElement(By.id("password")).sendKeys("123456");

        driver.findElement(By.id("password")).click();

        driver.findElement(By.cssSelector("body")).click();

        driver.findElement(By.id("password")).sendKeys("123654");

        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }

        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }
        // 49 | click | id=email |
        driver.findElement(By.id("email")).click();

        driver.findElement(By.id("email")).click();

        {
            WebElement element = driver.findElement(By.cssSelector("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).clickAndHold().perform();
        }
        {
            WebElement element = driver.findElement(By.cssSelector("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }

        {
            WebElement element = driver.findElement(By.cssSelector("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).release().perform();
        }

        driver.findElement(By.cssSelector("body")).click();

        driver.findElement(By.id("email")).sendKeys("r@gmail.com");

        driver.findElement(By.id("register-button")).click();
    }
}

