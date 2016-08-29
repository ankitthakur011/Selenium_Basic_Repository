package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTC {

	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
				
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://www.calculator.net//");
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		System.out.println("WebPage Title:"+a);
		
		driver.findElement(By.xpath(".//*[@id='menu']/div[1]/a")).click();		
		driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[1]/div[1]/a")).click();
		
		driver.findElement(By.name("chouseprice")).clear();
		driver.findElement(By.name("chouseprice")).sendKeys("1000");
		
		driver.findElement(By.xpath(".//*[@id='cdownpayment']")).clear();
		driver.findElement(By.xpath(".//*[@id='cdownpayment']")).sendKeys("10");
		
		driver.findElement(By.xpath(".//*[@id='content']/table[1]/tbody/tr/td[1]/table/tbody/tr[12]/td[1]/input[2]")).click();
				
		//String el = driver.findElement(By.xpath(".//*[@id='content']/h1")).getText(); // Pie Chart not working
		//System.out.println("Output:"+el);
	
		//driver.findElement(By.partialLinkText("Get Your Rate")).click();
		
	}

}
