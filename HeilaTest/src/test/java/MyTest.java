import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
    }

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
    public void myTest() {
        driver.get("http://students-aid.org:9222/platforms/nuis/register.html");
        //driver.manage().window().setSize(new Dimension(1552, 840));
        driver.findElement(By.cssSelector(".navbar-title")).click();
        driver.findElement(By.cssSelector(".navbar-title")).click();
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys("Adi");
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).sendKeys("Dangoor");
        driver.findElement(By.id("personalId")).click();
        driver.findElement(By.id("personalId")).sendKeys("313295289");
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).click();
        {
            WebElement element = driver.findElement(By.id("phone"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).click();
        {
            WebElement element = driver.findElement(By.id("phone"));
            Actions builder = new Actions(driver);
            builder.doubleClick(element).perform();
        }
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys("5555555555555");
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("0005-05-05");
        driver.findElement(By.cssSelector(".female")).click();
        driver.findElement(By.cssSelector(".hide-edit .checklabel")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.cssSelector(".form-tab:nth-child(1) > .row:nth-child(3)")).click();
        driver.findElement(By.id("phone")).sendKeys("1234567891");
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.cssSelector(".form-tab:nth-child(1) > .row:nth-child(3)")).click();
        driver.findElement(By.id("phone")).sendKeys("0526546178");
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("dateOfBirth")).click();
        driver.findElement(By.id("dateOfBirth")).sendKeys("0001-05-05");
        driver.findElement(By.id("dateOfBirth")).sendKeys("0019-05-05");
        driver.findElement(By.id("dateOfBirth")).sendKeys("0199-05-05");
        driver.findElement(By.id("dateOfBirth")).sendKeys("1999-05-05");
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("isStudentNo")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("hasCarNo")).click();
        driver.findElement(By.name("role")).click();
        driver.findElement(By.cssSelector(".my-2:nth-child(2) input")).click();
        driver.findElement(By.cssSelector(".row:nth-child(4) > .col-4:nth-child(1) .my-2")).click();
        driver.findElement(By.name("days")).click();
        driver.findElement(By.name("times")).click();
        driver.findElement(By.name("langs")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("ui-id-28")).click();
        driver.findElement(By.id("residence")).sendKeys("תל");
        driver.findElement(By.id("hasCarNo")).click();
        driver.findElement(By.cssSelector(".button-big")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("adiworkr@gmail.com");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();
        driver.findElement(By.id("region-Center")).click();
        driver.findElement(By.cssSelector("#region-Jerusalem > .m-auto")).click();
        driver.findElement(By.id("region-Center")).click();
        driver.findElement(By.cssSelector("#region-Center > .m-auto")).click();
    }
}

