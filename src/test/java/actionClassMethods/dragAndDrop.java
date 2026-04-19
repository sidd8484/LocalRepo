package actionClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement dest = driver.findElement(By.xpath("//ol[@id='bank']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
	}

}
