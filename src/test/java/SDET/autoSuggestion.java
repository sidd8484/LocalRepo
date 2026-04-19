package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestion {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		
		List<WebElement> searchEle = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='pcTkSc']"));
		
		System.out.println(searchEle.size());
		
		for(int i=0;i<searchEle.size();i++)
		{
			System.out.println(searchEle.get(i).getText());
			
			if(searchEle.get(i).getText().equals("selenium webdriver"))
			{
				searchEle.get(i).click();
				break;
			}
			
		}
	}

}
