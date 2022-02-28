package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();

		// step 7
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		// step 8 -- pending

		// step 9 Enter Email
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("devikask7@gmail.com");

		// step10 find button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();

		// step11 get the firstleading text
//
//		 String getFirstleadingText = driver.findElement(By.xpath("\"(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]\"")).getText();
// System.out.println(" Capture name of First Resulting lead" +getFirstleadingText);

		// step12 -- click on the first leading
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).click();
//		 getFirstleadingText.click();
		// step13 Click Duplicate Lead

//		 driver.findElement(By.xpath(" //a[contains(text(),'Duplicate Lead')]")).click();

		// step14 Verify the title as 'Duplicate Lead'

		// step15 Click Create Lead

//		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// step16 Confirm the duplicated lead name is same as captured name

		// step 17 Close the browser (Do not log out)
		// driver.close();

	}

}
