package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		Thread.sleep(2000);

		// step11 get the firstleading text
		
		
	 String getFirstleadingText = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]")).getText();
System.out.println(" Capture name of First Resulting lead  " +getFirstleadingText);

		// step12 -- click on the first leading
		 
		 Thread.sleep(5000);
		 
	WebElement clickFirstData = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName'])[1]/a"));
	clickFirstData.click();
	 
	 

		// step13 Click Duplicate Lead

	 driver.findElement(By.xpath(" //a[contains(text(),'Duplicate Lead')]")).click();

		// step14 Verify the title as 'Duplicate Lead'
	 
	String getPageText =  driver.findElement(By.xpath("//div[contains(text(),'Duplicate Lead')]")).getText();
	 System.out.println("title of current page :" +getPageText);
		// step15 Click Create Lead

		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		// step16 Confirm the duplicated lead name is same as captured name
		 
//		 String getCaptureName = driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).getText();
//		 System.out.println("get the firstname "+getCaptureName);
		 
		 
		 Thread.sleep(2000);
		 String elementfirstName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
//			elementfirstName.getText();
			System.out.println(" "+elementfirstName);
			
if (elementfirstName.contains("Devika"))
{ 
	System.out.println("test case passed ");
}
	else {
		System.out.println("testcase failed ");
}
		 
		// step 17 Close the browser (Do not log out)
		driver.close();

	}

}
