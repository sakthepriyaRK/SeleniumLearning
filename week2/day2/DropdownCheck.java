package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownCheck {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sakthepriya");
		driver.findElement(By.id("lastNameField")).sendKeys("RK");
		
		WebElement first = driver.findElement(By.id("createContactForm_preferredCurrencyUomId"));
		//select select=new select(first);
		Select sel= new Select(first);
		//sel.SelectByVisibleText("INR - Indian Rupee");
		sel.selectByVisibleText("INR - Indian Rupee");
		
		
		
		//driver.findElement(By.name("submitButton")).click();
		
	}

}
