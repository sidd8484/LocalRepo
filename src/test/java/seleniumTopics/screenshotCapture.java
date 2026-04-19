package seleniumTopics;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotCapture {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		File target = new File(System.getProperty("user.dir")+"\\screenshot\\fullpage.png");
		
		sourceFile.renameTo(target);
		
		
		
	}

}
