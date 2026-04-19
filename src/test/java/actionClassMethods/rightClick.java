package actionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClick {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement cartBtn = driver.findElement(By.xpath("//a[text()='Cart']"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(cartBtn).contextClick().build().perform();
		act.moveToElement(cartBtn).click().build().perform();
		
		Thread.sleep(500);
		driver.quit();
	}

}
