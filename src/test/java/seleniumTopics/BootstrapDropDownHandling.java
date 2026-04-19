package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDownHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		
		Thread.sleep(5000);
		
		//1. select single options
		
		driver.findElement(By.xpath("//div[@class='dropdown open']//a[@role='menuitem' and normalize-space()='CSS']")).click();
		
		//2. capture all options
		
		List<WebElement>options = driver.findElements(By.xpath("//div[@class='dropdown open']//li"));
		
		System.out.println("All options are:"+options.size());
		
		
	}

}
