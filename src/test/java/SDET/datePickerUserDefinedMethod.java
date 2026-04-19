package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePickerUserDefinedMethod {
	
	static void selectFutureDate(WebDriver driver, String date, String month, String year)
	{
		while(true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		
           List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		   for(WebElement dt:allDates)
		   {
			  if(dt.getText().equals(date))
			  {
			    dt.click();
			    break;
			  }
		  }
	}
	
	static void selectPastDate(WebDriver driver,String date, String month, String year )
	{
		while(true)
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentmonth.equals(month) && currentyear.equals(year))
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
		
           List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr/td//a"));
		
		   for(WebElement dt:allDates)
		   {
			  if(dt.getText().equals(date))
			  {
			    dt.click();
			    break;
			  }
		  }
	}
	

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		//switch to frame
	    driver.switchTo().frame(0);
		
//	    String month = "June";
//		String year = "2026";
//		String date = "5";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		//selectFutureDate(driver, "20", "May", "2026");
		selectPastDate(driver, "5","June","1996");
		

	}

}
