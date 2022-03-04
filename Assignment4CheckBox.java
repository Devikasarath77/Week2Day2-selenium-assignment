package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leafground.com/pages/checkbox.html");
		
		 driver.manage().window().maximize();
		 
		 System.out.println(""+driver.getCurrentUrl()); 
		 
		 driver.findElement(By.xpath("((//div[@class='example'])[1]//input)[1]")).click();
			driver.findElement(By.xpath("((//div[@class='example'])[1]//input)[3]")).click();
			
			
			boolean isChecked = driver.findElement(By.xpath("(//div[@class='example'])[2]//input")).isSelected();
			if(!isChecked) {
				System.out.println("Selenium  not Checked");
			}
			else {
				System.out.println("Selenium  Checked");
			}
			
			
			List<WebElement> deSelect = driver.findElements(By.xpath("(//div[@class='example'])[3]//input"));
			for(int i=0;i<deSelect.size();i++) {
				if(deSelect.get(i).isSelected()) {
					deSelect.get(i).click();
				}
				
				
			}
			
			
			
			List<WebElement> selectAll = driver.findElements(By.xpath("(//div[@class='example'])[4]//input"));
			for(int i=0;i<selectAll.size();i++) {
				
					selectAll.get(i).click();

	}

}
}
