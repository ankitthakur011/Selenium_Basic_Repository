package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IRCTC_Alert {

	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.services.irctc.co.in/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("button")).click();
		
		Alert alert = driver.switchTo().alert();
		String s  = alert.getText();
		Thread.sleep(5000);
		
		alert.accept();
		
		System.out.println(s);
		
	}

}
