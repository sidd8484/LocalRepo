package SDET;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//Total number of rows
		int row = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("Total rows:" +row);
		
		//Total number of columns
		int columns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println(columns);
		
		//capture table value
		WebElement sub = driver.findElement(By.xpath(" //table[@name='BookTable']//tr[6]//td[3]"));
		System.out.println(sub.getText());
		
		//Read all data from table
		
		System.out.println("BookName"+" \t "+"Author"+"\t"+"Subject"+"\t"+"Price");
		for(int i=2;i<=row;i++)
		{
			for(int j=1;j<=columns;j++)
			{
				String values = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(values+"\t");
			}
			System.out.println(); 
			
		}
		
		//Print book name whose author is Mukesh
		
		for(int r=2;r<=row;r++)
		{
			String autorName = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			
			if(autorName.equals("Mukesh"))
			{
				String bookName = driver.findElement(By.xpath(" //table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName);
			}
		}
		
	

	}

}
