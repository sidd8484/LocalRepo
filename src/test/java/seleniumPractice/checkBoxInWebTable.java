package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxInWebTable {

	public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
		
		
		
	    driver.get("https://qavbox.github.io/demo/webtable/");
	    driver.manage().window().maximize();
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//th[text()='ManualTesting']/preceding-sibling::th/input[@type='checkbox']")).click();
	    Thread.sleep(500);
	    driver.quit();
	}

}
