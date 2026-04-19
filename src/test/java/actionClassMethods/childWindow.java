package actionClassMethods;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class childWindow {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/multiple-wind");
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Set<String> AllIds = driver.getWindowHandles();
		System.out.println(AllIds);
		
		ArrayList<String> AL = new ArrayList<String>(AllIds);
		String ChildWindowID = AL.get(1);
		System.out.println(ChildWindowID);
		
		driver.switchTo().window(ChildWindowID);
		
	}

}
