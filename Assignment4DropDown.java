package week2.day2;



import java.util.List;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/Dropdown.html");
		
		 driver.manage().window().maximize();
		 
		 // output is selenium 
		 WebElement getByIndex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
			Select index =new Select(getByIndex);
			index.selectByIndex(1);
			WebElement selectOption = index.getFirstSelectedOption();
			System.out.println("step1:");
			System.out.println(selectOption.getText());
//			System.out.println(index.getOptions()); 
			// printing the options in the dropdown 
			List<WebElement> options= index.getOptions();
			for(int i=0;i<options.size();i++) {
				
				System.out.println(options.get(i).getText());
			}
			
			
//		step 2 with index   output is appium 
		
		
		
		WebElement getByText1 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select Text1 =new Select(getByText1);
		Text1.selectByVisibleText("Appium");
		WebElement selectOption2 = Text1.getFirstSelectedOption();
		System.out.println("step2");
			System.out.println(selectOption2.getText());
			
			
			// step 3 by value output is uft/qtp
		
		WebElement getByvalue = driver.findElement(By.xpath("//select[@name='dropdown3']"));
		Select Value =new Select(getByvalue);
		Value.selectByValue("3");
		WebElement selectOption3 = Value.getFirstSelectedOption();
		System.out.println("step3");
		System.out.println(selectOption3.getText());

		
		// step4  get the options n dropdown print all the options 
		List<WebElement> findElements = driver.findElements(By.xpath("//select[@class='dropdown']"));
		int size = findElements.size();
		for (int i = 0; i < size; i++) {
			String options1 = findElements.get(i).getText();
			System.out.println("step4");
			System.out.println(options1);

			//step 5  sendkey is used again selenium is output  plz check with mentor 
		 WebElement SendData = 	driver.findElement(By.xpath("//div[@class='example'][5]/select"));
			SendData.sendKeys("Selenium");
//			String selectOption5 =SendData.getText();
			System.out.println("step5");
			System.out.println(""+SendData.getText());
		
		
//		System.out.println( driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("Selenium"));
			
			//Step6 
			
		WebElement selectDrop=	driver.findElement(By.xpath("(//option[contains(text(),'Appium')])[6]"));
		selectDrop.click();
		System.out.println(""+selectDrop.getText());


		}
		}
	
	}
	
	
	
	


