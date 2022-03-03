package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Button.html");
		
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.id("home")).click();
		 
		 driver.get("http://leafground.com/pages/Button.html");
		 // webelement -> point s used 
		 Point location =  driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation();
			System.out.println("position of button (x,y) is"+location);
			
			
			String cssValue = driver.findElement(By.xpath("//button[text()='What color am I?']")).getCssValue("color");
			System.out.println("Button Color is: "+cssValue);
			
		//webelement cant be used size is converted to dimension
			
			Dimension size = driver.findElement(By.id("size")).getSize();
			System.out.println("Height and Width :"+size );
	}

}
