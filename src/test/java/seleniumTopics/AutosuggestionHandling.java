 package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionHandling {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(3000);
		
		List<WebElement> lists = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		
		System.out.println("Lists:"+lists.size());
		
		for(int i=0;i<lists.size();i++)
		{
			if(lists.get(i).getText().equals("selenium"))
			{
				lists.get(i).click();
				break;
			}
		}
		
		
	}

}
