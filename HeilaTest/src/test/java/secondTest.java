import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class secondTest {
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
    public void second() {
        driver.get("http://students-aid.org:9222/platforms/nuis/register.html");
        driver.manage().window().setSize(new Dimension(810, 458));
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("firstname")).sendKeys("1211");
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).sendKeys("12121");
        driver.findElement(By.id("personalId")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.cssSelector("html")).click();
        driver.findElement(By.id("firstname")).sendKeys("AD");
        driver.findElement(By.cssSelector(".form-tab:nth-child(1) > .row:nth-child(2)")).click();
        driver.findElement(By.id("lastname")).sendKeys("AD");
        driver.findElement(By.cssSelector(".button-big")).click();
    }
}



