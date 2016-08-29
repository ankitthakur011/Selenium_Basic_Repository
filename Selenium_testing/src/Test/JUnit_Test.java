package Test;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JUnit_Test {
  private WebDriver driver;
  private String baseUrl;
  

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://newtours.demoaut.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/mercurywelcome.php");
    driver.findElement(By.name("userName")).clear();
    driver.findElement(By.name("userName")).sendKeys("tutorial");
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("tutorial");
    driver.findElement(By.name("login")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//input[@name='tripType'])[2]")).click();
    new Select(driver.findElement(By.name("passCount"))).selectByIndex(1);
    new Select(driver.findElement(By.name("fromPort"))).selectByVisibleText("London");
    new Select(driver.findElement(By.name("fromMonth"))).selectByVisibleText("February");
    new Select(driver.findElement(By.name("fromDay"))).selectByVisibleText("4");
    new Select(driver.findElement(By.name("toPort"))).selectByVisibleText("New York");
    new Select(driver.findElement(By.name("toMonth"))).selectByVisibleText("February");
    new Select(driver.findElement(By.name("toDay"))).selectByVisibleText("19");
    driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
    new Select(driver.findElement(By.name("airline"))).selectByVisibleText("Blue Skies Airlines");
    driver.findElement(By.name("findFlights")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    
  }

  }

