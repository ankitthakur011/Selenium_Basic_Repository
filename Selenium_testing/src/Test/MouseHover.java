package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://www.hdfcbank.com//";
		driver.navigate().to(url);
		
		driver.findElement(By.xpath("html/body/div[1]/div[4]/div[3]/div[1]/img")).click();

		driver.manage().window().maximize();							// Maximizing window
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // Implicitly waiting
		
		Actions act = new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/ul/li[5]/div[1]/a/img"));
		act.moveToElement(mouseOver).perform();
		
		Thread.sleep(500);
		
		WebElement MouseOver = driver.findElement(By.xpath("html/body/div[1]/div[3]/div[2]/div[2]/ul/li[5]/div[2]/div[2]/div/ul/li[3]/span/a"));
		Thread.sleep(300);
		act.moveToElement(MouseOver).click().build().perform();
		
		Snaps.capture(driver,"sample");

	}

}
