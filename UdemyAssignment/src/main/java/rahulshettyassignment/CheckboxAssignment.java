package rahulshettyassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {
	
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (7)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	 driver.manage().window().maximize();
	 WebElement checkBoxOne= driver.findElement(By.id("checkBoxOption1"));
	 checkBoxOne.click();
	 Assert.assertTrue(checkBoxOne.isSelected());
	 checkBoxOne.click();
	 Assert.assertFalse(checkBoxOne.isSelected());
	 
	}
}
