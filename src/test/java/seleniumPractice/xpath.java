package seleniumPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		
		
	    driver.get("https://qavbox.github.io/demo/webtable/");
	    driver.manage().window().maximize();
	    Thread.sleep(500);
	    //driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Laptop");
	    //driver.findElement(By.xpath("//div[@aria-label='Search by image']")).click();
	    
	    //Row(tr)
	    int rowSize = driver.findElements(By.xpath("//table[@id='table02']//tr")).size();
	    System.out.println("Row size is:"+rowSize);
	    
	    //Column(th)
	    int colSize = driver.findElements(By.xpath("//table[@id='table02']//th")).size();
	    System.out.println("Column size is:"+colSize);
	    
	    String value = driver.findElement(By.xpath("//table[@id='table02']//tr[1]/td[1]")).getText();
	    System.out.println(value);
	    
	    List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table02']//tr"));
	    for(int i=1;i<=rows.size();i++)
	    {
	    	List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table02']//tr["+i+"]/td"));
	    	
	    	for(int j=1;j<=cols.size();j++)
	    	{
	    		String data = driver.findElement(By.xpath("//table[@id='table02']//tr[" + i + "]/td[" + j + "]")).getText();
	    		System.out.print(data + "  ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    Thread.sleep(500);
	    driver.quit();
	}

}
