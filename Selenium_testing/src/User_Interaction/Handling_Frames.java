package User_Interaction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handling_Frames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );
		
		WebDriver el1 = driver.switchTo().frame(0);
		System.out.println("Navigated to frame with id " + el1);
		Thread.sleep(1000);
		

	}

}
