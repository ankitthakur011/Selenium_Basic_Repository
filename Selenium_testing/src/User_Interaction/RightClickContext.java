package User_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickContext {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.navigate().to("http://medialize.github.io/jQuery-contextMenu/demo.html");
    driver.manage().window().maximize();
    
    By locator = By.xpath("html/body/div[1]/section/div/div/div/p/span");

    
    WebDriverWait wait = new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
    //WebElement element = driver.findElement(By.cssSelector(".context-menu-one.box"));
    WebElement element=driver.findElement(locator);

    Actions action = new Actions(driver).contextClick(element);
    action.build().perform();
    
		
	}

}
