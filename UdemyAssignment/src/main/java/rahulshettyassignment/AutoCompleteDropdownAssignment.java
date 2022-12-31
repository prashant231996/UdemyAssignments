package rahulshettyassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdownAssignment {
	
	public  static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (8)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 driver.findElement(By.id("autocomplete")).sendKeys("ind");
		 Thread.sleep(3000);
		 List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/div"));
		 for(WebElement option:options)
		 {
			 if(option.getText().equalsIgnoreCase("INDIA"))
			 {
				 System.out.println("Option Clicked:"+option.getText());
				 option.click();
				 break;
			 }
		 }
		 
	}

}
