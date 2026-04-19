package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select select = new Select(dropDown);
		
		//select.selectByVisibleText("India");
		//select.selectByValue("uk");
		//select.selectByIndex(5);
		
		//capture the options from the dropdown
		
		List<WebElement>allOptions = select.getOptions();
		
		System.out.println("All options:" +allOptions.size());
		
		//print all options
		
//		for(int i=0; i<allOptions.size();i++)
//		{
//			System.out.println(allOptions.get(i).getText());
//		}
		
		for(WebElement options:allOptions)
		{
			System.out.println(options.getText());
		}
		
		
		
	}

}
