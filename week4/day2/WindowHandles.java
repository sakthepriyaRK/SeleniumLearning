package week4.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) throws Exception   {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.amazon.in/s?k=Books&ref=nb_sb_noss_2");
		
		
		//2) Click on the first book link
		driver.findElement(By.xpath("//a[@class='a-link-normal a-text-normal'][1]")).click();
		//3) Print the number of window handles 
		//String handle = driver.getWindowHandle();
		System.out.println(driver.getWindowHandles());
	System.out.println(driver.getWindowHandles().size());
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> hand=new ArrayList<String>(windowHandles);
		driver.switchTo().window(hand.get(1));
		System.out.println(driver.getTitle());
		
		File soruce =driver.getScreenshotAs(OutputType.FILE);	
		File dest=new File("snapshot/snap1.png");
	FileUtils.copyFile(soruce, dest);
//		4) Switch the control to the second window
//		5) Print the title of the new window
//		6) Close all browsers
	}

}
