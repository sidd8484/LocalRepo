package seleniumTopics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHandlingWithoutUsingSwitch {

	public static void main(String[] args) throws InterruptedException {

		
		//Handling alert without using switch().alert()
		// by using explicit wait
		
        WebDriver driver = new ChromeDriver();
        
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		
		Thread.sleep(5000);
		
		Alert myAlert = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myAlert.getText());
		
		myAlert.accept();
		
		
		
		
	}

}
