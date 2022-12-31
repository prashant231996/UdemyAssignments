package rahulshettyassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ExersiseQuestion {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (8)\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		 driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		 driver.manage().window().maximize();
		 WebElement optionCheckBox=driver.findElement(By.xpath("//div[@id='checkbox-example']/descendant::input[@id='checkBoxOption2']/parent::label"));
		 optionCheckBox.click();
		 String optionName=optionCheckBox.getText().trim();
		 System.out.println("Otion Name:"+optionName);
		 Select dropDown= new Select(driver.findElement(By.id("dropdown-class-example")));
		 dropDown.selectByVisibleText(optionName);
		 driver.findElement(By.id("name")).sendKeys(optionName);
		 driver.findElement(By.id("alertbtn")).click();
		 String alertMsg=driver.switchTo().alert().getText();
		 System.out.println("Alret Msg="+ alertMsg);
		 String msg[]=alertMsg.split(",");
		 String actualMsg[]=msg[0].split(" ");
		 String msgInError=actualMsg[1].trim();
		 System.out.println("Msg in error"+msgInError);
		 Assert.assertEquals(msgInError, optionName);
		 
	}

}
