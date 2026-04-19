package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDownHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[3]")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='QA Engineer']")).click();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		//number of options
		
		System.out.println("Number of options:"+options.size());
		
		//print all options
		
//		for(int i=0;i<options.size();i++)
//		{
//			System.out.println(options.get(i).getText());
//		}
		
		for(WebElement op:options)
		{
			System.out.println("Options are:"+op.getText());
		}
		
		
		
		
	}

}
