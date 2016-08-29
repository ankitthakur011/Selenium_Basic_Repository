package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class Snaps_Main {
	
	public static void main(String[] args) throws IOException, InterruptedException {
       	
		/*System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		
		WebDriver driver = new InternetExplorerDriver();
		String url = "http://newtours.demoaut.com";*/
		
		WebDriver driver = new FirefoxDriver();
		String url = ("http://newtours.demoaut.com/");
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			
		//Thread.sleep(5000);
		Snaps.capture(driver,"HomePage");
		
		driver.findElement(By.name("userName")).clear();
	    driver.findElement(By.name("userName")).sendKeys("tutorial");
	    Snaps.capture(driver,"UserName");
	    
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("tutorial");
	    Snaps.capture(driver,"Password");
	    
	    driver.findElement(By.name("login")).click();
	    Snaps.capture(driver,"LoggedIn");
	    
	    System.out.println(driver.getTitle());
	    
	}


}
