package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
		driver.switchTo().frame(0);
		
		//Method 1 Sendkeys
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("05/06/1996");
		
		//Method 2
		String month = "June";
		String year = "1996";
		String date = "5";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//select month and year
		while(true)
		{
		String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		    if(currentmonth.equals(month) && currentyear.equals(year))
		  {
			break;
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		  }
		
		   //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		   driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
		//select the date
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(date))
			{
			dt.click();
			break;
			}
		}
		
		
		//Thread.sleep(1000);
		//driver.quit();
	}

}
