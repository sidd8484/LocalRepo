package seleniumTopics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsOrPopupsHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1. Normal Alert with OK button
		/*driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		
		Thread.sleep(5000);
		
		Alert myAlert = driver.switchTo().alert();
		
		System.out.println(myAlert.getText());
		myAlert.accept();
		*/
		
		//2. Confirmation Alert with OK and Cancel button
		
		/*driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		
		Thread.sleep(3000);
		
		//driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		*/
		
		//3. Prompt alert
		
		driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
		
		Thread.sleep(3000);
		
		Alert myPromptAlert = driver.switchTo().alert();
		
		myPromptAlert.sendKeys("Welcome");
		
		myPromptAlert.accept();
		
		
	}

}
