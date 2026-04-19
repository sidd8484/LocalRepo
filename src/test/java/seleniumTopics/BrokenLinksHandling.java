package seleniumTopics;


import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.net.HttpURLConnection;



public class BrokenLinksHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();
		
		//capture all links
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());
		
		int noOfBrokenLinks=0;
		
		for(WebElement linkElement:links)
		{
			String hrefValue = linkElement.getAttribute("href");
			
			if(hrefValue==null || hrefValue.isEmpty())
			{
				System.out.println("href attribute value is null or empty. So not possible to check");
				continue;
			}
			
			//hit url to server
			
		
			
			try
			{
				URL linkURL = new URL(hrefValue); //Converting href value from string to URL format
				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection(); //
				conn.connect(); //connect to server and send request to server
				
				if(conn.getResponseCode()>=400)
				{
					System.out.println(hrefValue+"=======> Broken links");
					noOfBrokenLinks++;
				}
				else
				{
					System.out.println(hrefValue+"=====> Not a broken links");
				}
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println("Number of broken links: "+ noOfBrokenLinks);
	}

}
