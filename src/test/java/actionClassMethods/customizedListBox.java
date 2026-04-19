package actionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act = new Actions(driver);
		act.click(month).perform();
		
		for(int i=0;i<=4;i++) {
		act.sendKeys(Keys.END).perform();
		}
		
		Thread.sleep(500);
		act.sendKeys(Keys.ENTER).perform();
		
		
	}

}
