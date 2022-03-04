package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("(//label[@for='home']/following::img)[1]")).click();
		
		
		driver.navigate().back();
		
		
		WebElement image = driver.findElement(By.xpath("(//label[@for='home']/following::img)[2]"));
		if(image.getAttribute("naturalWidth").equals("0")) {
			System.out.println("image is broken");
		}
		
		else {
			System.out.println("image is valid");
		}
		
		
		WebElement clickImag = driver.findElement(By.xpath("(//label[@for='home']/following::img)[3]"));
		Actions action = new Actions(driver);
		action.moveToElement(clickImag).click().build().perform();
		
		
		
		driver.close();
		

	}

}
