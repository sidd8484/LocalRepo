package seleniumTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent(); // go back to main page
		
		//frame2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("frame2");
		
		driver.switchTo().defaultContent();
		
		//frame3
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		driver.switchTo().frame(0);
		
		WebElement radioBtn = driver.findElement(By.xpath("//div[@id='i9'] //div[@class='rseUEf nQOrEb']"));
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].click();", radioBtn);
	}

}
