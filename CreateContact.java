package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(5000);
	driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("contact1");
		driver.findElement(By.id("lastNameField")).sendKeys("lastname");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("fristname");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("localname");
		driver.findElement(By.name("departmentName")).sendKeys("testing dept");
	driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("testing automation");
	driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("testing@gmail.com");
		WebElement elementDropdown = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select dd = new Select(elementDropdown);
		dd.selectByVisibleText("New York");
		WebElement elementCreateLeadButton = driver.findElement(By.name("submitButton"));
		elementCreateLeadButton.click();
		driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a[contains(text(),Edit)])[1]")).click();
		
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("important notes ");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		System.out.println("The Title of the Resulting page is:" +driver.getTitle());


	driver.close();
		
	}

}
