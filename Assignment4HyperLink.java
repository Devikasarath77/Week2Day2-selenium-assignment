package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4HyperLink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Go to Home Page')])[1]")).click();
		
		driver.get("http://leafground.com/pages/Link.html");


		
		String getAttribute = driver.findElement(By.xpath("(//a[text()='Find where am supposed to go without clicking me?'])")).getAttribute("href");
		System.out.println("where am supposed to go :"+getAttribute);
		
		WebElement broken = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
		broken.click();
		if (driver.getTitle().contains("HTTP Status 404 – Not Found")) {
			System.out.println("Link  found");
			
		}else {
			System.out.println("page not found");
		}
		Thread.sleep(2000);

		
		driver.navigate().back();
		
		
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		
		
		driver.navigate().back();
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links in the page is "+links.size());
		
		

	}

}
