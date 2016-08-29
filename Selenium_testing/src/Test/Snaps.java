package Test;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
public class Snaps {
	{ }		

	public static void capture(WebDriver driver, String S1) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs (OutputType.FILE);
		FileUtils.copyFile(src, new File ("./Snapshot/"+S1+".jpg"));
	}
		
	}
	

