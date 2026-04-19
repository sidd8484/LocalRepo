package seleniumPractice;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;

public class BrokenLinksHandling {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("number of links:"+links.size());
		
		int noOfBrokenLinks = 0; 
		for(WebElement LinkElement:links)
		{
			String hrefValue = LinkElement.getAttribute("href");
			
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("Not possible to check");
				continue;
			}
			
			try
			{
			
			URL linkURL = new URL(hrefValue);
			HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400)
			{
				System.out.println(hrefValue+"======> Broken link");
				noOfBrokenLinks++;
			}
			else
			{
				System.out.println(hrefValue+"======> Not broken link");
			}
			
			}
			
			catch(Exception e)
			{
				
			}
			
			
		}
		System.out.println("Number of broken links:"+noOfBrokenLinks); 
		
		
		
		
		
	}

}
