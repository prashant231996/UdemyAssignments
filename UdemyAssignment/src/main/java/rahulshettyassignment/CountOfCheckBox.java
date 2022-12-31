package rahulshettyassignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CountOfCheckBox {

	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (7)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 driver.manage().window().maximize();
	 List<WebElement>checkboxList=driver.findElements(By.xpath("//input[@type='checkbox']"));
	 System.out.println("No Of CheckBox Presents are "+checkboxList.size());
	 Assert.assertEquals(checkboxList.size(), "3");
	 
	}
}
