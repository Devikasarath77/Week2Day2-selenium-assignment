package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadCLassroom {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("Demosalesmanager");

		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

		// a
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		// driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//div[@class='x-form-element']/input[@name='firstName'])[3]")).sendKeys("test");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		System.out.println("The Title of the Resulting page is:" + driver.getTitle());
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		WebElement updateCompany= driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompany.sendKeys("Google");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String getCompanyText = driver.findElement(By.xpath("(//span[@id='viewLead_companyName_sp'])")).getText();
		System.out.println(" Confirm the changed name appears:" +getCompanyText);
		
		
		if(getCompanyText.contains("Google")) {
			System.out.println(" case is PASSED");
		}else
		{
			System.out.println(" case is FAILED");
		}
		
		driver.close();

		

	}

}
