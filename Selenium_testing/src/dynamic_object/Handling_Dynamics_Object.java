package dynamic_object;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handling_Dynamics_Object {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		  WebDriver driver = new InternetExplorerDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.navigate().to("http://www.flipkart.com//");
	      driver.manage().window().maximize();
	      
	      WebDriverWait wait = new WebDriverWait(driver,30);
	      WebElement we = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Offers on Mobiles']")));
	      System.out.println("Value of the element is :"+we);
	      //driver.findElement(By.xpath(".//*[@id='container']/div/div/div[1]/div[3]/div[1]/div[1]/div[1]/a[3]/img")).click();

	}

}
