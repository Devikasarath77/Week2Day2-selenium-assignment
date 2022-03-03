package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Edit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Edit.html");
		
		 driver.manage().window().maximize();
		 
	WebElement	mail = driver.findElement(By.id("email"));
			mail.sendKeys("Devikask7@gmail.com");
		 mail.isEnabled();
		 
		 
		 driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("test"+Keys.TAB);
Thread.sleep(2000);
	 
	 System.out.println(driver.findElement(By.xpath("(//input[@name='username'])[1]")).getAttribute("TestLeaf"));
	
	 driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
	 System.out.println(driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed());
 driver.close();
	 
	 

	 
		 
		 

			
		
	}

}
