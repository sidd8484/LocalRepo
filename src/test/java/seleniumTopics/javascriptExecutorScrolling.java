package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutorScrolling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//scroll down page by pixel number
		
		//js.executeScript("window.scrollBy(0,1500)", "");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll the page till element is visible
		
		//WebElement ele = driver.findElement(By.xpath("//h2[normalize-space()='Community poll']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", ele);
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//scroll page till end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		
	}

}
