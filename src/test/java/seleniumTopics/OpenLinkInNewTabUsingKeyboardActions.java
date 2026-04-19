package seleniumTopics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTabUsingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		
		// Ctrl+click regLink
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(ids.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Johnnnn");
		
		Thread.sleep(3000);
		
		driver.switchTo().window(ids.get(0));
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("T-Shirt");
		
		
	}

}
