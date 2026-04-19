package seleniumTopics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//total number of rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		System.out.println("rows:"+rows);
		
		//total number of columns
		
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		
		System.out.println("columns:"+columns);
		
		//Print specific value in the table
		
		WebElement value = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]/td[1]"));
		
		System.out.println("value:"+value.getText());
		
		//Print all data from table
		
		 /*for(int r=2;r<=rows;r++)
		 {
			 for(int c=1;c<=columns;c++)
			 {
				 String value1 = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td["+c+"]")).getText();
				 System.out.print(value1+"\t");
				 
			 }
			 
			 System.out.println();
		 }
		 */
		 
		//Print book name whose author is Mukesh
		
		for(int r=2;r<=rows;r++)
		{
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			
			if(authorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
				System.out.println(bookName+"\t"+authorName);
			}
		}
		
		driver.quit();
		
	}

}
