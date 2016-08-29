package User_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.ie.driver", "D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		  WebDriver driver = new InternetExplorerDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	      driver.navigate().to("https://in.yahoo.com//");
	      driver.manage().window().maximize();
	      
	      
	      WebElement From = driver.findElement(By.id("yui_3_12_0_1_1464339740615_712"));
	      WebElement To = driver.findElement(By.xpath("html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[3]"));
	      
	      Actions builder = new Actions(driver);
	      Action dragAndDrop = builder.clickAndHold(From).moveToElement(To).release(To).build();
	      
	      dragAndDrop.perform();
	      driver.close();

		

	}

}
