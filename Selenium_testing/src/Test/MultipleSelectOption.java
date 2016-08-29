package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectOption {

	public static void main(String[] args) {
			
		WebDriver driver = new FirefoxDriver();
		String url = "http://semantic-ui.com/modules/dropdown.html";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		Select se = new Select (driver.findElement(By.xpath("html/body/div[4]/div[1]/div[2]/div[2]/div[1]/div[8]/div[1]/div[1]")));
		se.selectByIndex(0);		
		se.selectByValue("Meteor");
		se.selectByVisibleText("NodeJS");
		
		List <WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
			System.out.println("You have selected::"+ webElement.getText());
		}

		
		if (se.isMultiple())
				{
			System.out.println("This is a multiple select dropdown");
			}
		else
			System.out.println("Not a multiple select dropdown");
	}

}
