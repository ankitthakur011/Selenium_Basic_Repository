package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Profile {
	
		WebDriver driver;

		public void testExamples(){
		
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.startup.homepage","http://www.google.com");
		driver = new FirefoxDriver(profile);

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("100");

		}

	}

