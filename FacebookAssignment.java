package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//a[contains(text(),'Create New Account')]
	driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FBuser");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("UserLas");
	driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("261603");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
	
	
	WebElement elementDropdown = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select dd = new Select(elementDropdown);
	dd.selectByVisibleText("2");
	
	
	WebElement elementDropdownMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select MM = new Select(elementDropdownMonth);
	MM.selectByValue("3");
	
	
	WebElement elementDropdownYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select yy = new Select(elementDropdownYear);
	yy.selectByValue("1994");
	
	
	driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
	
	
	}
	

}
