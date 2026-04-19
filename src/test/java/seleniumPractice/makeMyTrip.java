package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class makeMyTrip {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		
		Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Delhi");
		
		List<WebElement> Lists = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		
		System.out.println("List:"+Lists.size());
		
		
	}

}
