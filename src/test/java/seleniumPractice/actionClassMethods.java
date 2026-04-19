package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassMethods {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement LoginBtn = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(LoginBtn).perform();
		
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//a[@title='Gift Cards']")).click();
		
		Thread.sleep(500);
		driver.quit();
		
	}

}
