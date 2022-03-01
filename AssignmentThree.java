package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://acme-test.uipath.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
//		driver.findElement(By.id("remember")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		Thread.sleep(4000);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
