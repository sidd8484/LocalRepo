package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardEventsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement pointMe = driver.findElement(By.xpath("//button[normalize-space()='Point Me']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(pointMe).build().perform();
		
		Thread.sleep(5000);
		
		WebElement doubleClick = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		act.doubleClick(doubleClick).perform();
		
		Thread.sleep(5000);
		
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		if(field1.getText().equals(field2))
		{
			System.out.println("Successfully copied text");
		}
		else
		{
			System.out.println("Not cpoied text");
		}
		
		
	}

}
