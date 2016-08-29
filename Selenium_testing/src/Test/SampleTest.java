package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTest {

	public static void main(String[] args) {
		
		WebDriver driver = new InternetExplorerDriver();
		System.setProperty("webdriver.ie.driver","D:\\Selenium\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		String url = "https://www.google.co.in/?gws_rd=ssl";
		driver.navigate().to(url);
		//String el = System.getProperty(url);
		//System.out.println("getproperty:"+el);
		//driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(url)));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).click();
		driver.findElement(By.xpath(".//*[@id='sb_ifc0']")).sendKeys("Ankit Thakur");
		
		WebElement name = driver.findElement(By.partialLinkText("Ankit"));
		System.out.println("Name:"+name);
		
		
		
	}

}
