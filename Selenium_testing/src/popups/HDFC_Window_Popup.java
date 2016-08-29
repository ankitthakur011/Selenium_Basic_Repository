package popups;

import java.util.Iterator;
import java.util.Set;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;

public class HDFC_Window_Popup {

		public static void main(String[] args) throws InterruptedException {
		
			WebDriver driver = new FirefoxDriver();
			String url = "http://www.hdfcbank.com/";
			driver.get(url);
			driver.manage().window().maximize();
			
			//driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
			driver.findElement(By.xpath("html/body/div[1]/div[4]/div[1]/div[4]/div[1]/div[2]/div[1]/div/div[1]")).click();
			driver.findElement(By.xpath(".//*[@id='netbanking']")).click();
			driver.findElement(By.xpath(".//*[@id='loginsubmit']")).click();
						
			String homepage = driver.getWindowHandle();
			System.out.println("Homepage-"+homepage);
			
			//driver.findElement(By.id("loginsubmit")).click();
			//String popup = driver.getWindowHandle();
			//System.out.println(popup);	
			//driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).getText();
			
			Set <String> windows = driver.getWindowHandles();
			System.out.println("Window Size-"+windows.size());
			Iterator <String> it = windows.iterator();
			String currentwindow = it.next().toString();
					
				if (currentwindow.equals(homepage))
				{
					driver.switchTo().window(homepage);
					Thread.sleep(1000);
					driver.close();
				}
				
			
			}
		}


