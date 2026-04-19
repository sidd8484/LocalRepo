package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {
	
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox' ]"));
		
		// 1. method using index
//		for(int i=0;i<checkBoxes.size();i++)
//		{
//			checkBoxes.get(i).click();
//		}
		
		// 2. without index select all checkboxes
		
//		for(WebElement checkbox:checkBoxes)
//		{
//			checkbox.click();
//			
//		}
		
		//3. select only last 3 check boxes
		
//		for (int i=4;i<checkBoxes.size();i++)
//		{
//			checkBoxes.get(i).click();
//		}
		
		//4. select middle checkboxes
		
//		for(int i=2;i<=4;i++)
//		{
//			checkBoxes.get(i).click();
//		}
		
		//5. select first 3 check boxes
		
//		for(int i=0; i<3; i++)
//		{
//			checkBoxes.get(i).click();
//		}
		
		//6. Uncheck selected check boxes

//		for(int i=0;i<3;i++)
//		{
//			checkBoxes.get(i).click();
//		}
//		
//		Thread.sleep(5000);
//		
//		for(int i=0;i<checkBoxes.size();i++)
//		{
//			checkBoxes.get(i).click();
//		}
		
		//7. select checkboxes based on condition
		
		for(int i=0;i<3;i++)
			{
				checkBoxes.get(i).click();
			}
		
		Thread.sleep(5000);
		
		for(int i=0;i<checkBoxes.size();i++)
		{
			if(checkBoxes.get(i).isSelected())
			{
				checkBoxes.get(i).click();
			}
		}
		
		
		
		//driver.quit(); 
		
	}

}
