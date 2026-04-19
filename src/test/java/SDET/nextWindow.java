package SDET;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nextWindow {

	public static void main(String[] args) throws InterruptedException {
 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		Thread.sleep(500);
		WebElement regLink = driver.findElement(By.xpath("//a[text()='Register']"));
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		Thread.sleep(500);
		
		Set<String> AllIds = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(AllIds);
		
		driver.switchTo().window(al.get(1));
		
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("adhyrrrrrrrrrr");
		Thread.sleep(800);
		
		driver.switchTo().window(al.get(0));
		
		
		Thread.sleep(800);
		driver.quit();
	}

}
