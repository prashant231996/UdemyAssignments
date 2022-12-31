package rahulshettyassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormFillingAssignment {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://rahulshettyacademy.com/angularpractice/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("name")).sendKeys("Prashant Shivaji More");
		 driver.findElement(By.name("email")).sendKeys("abcdefg@gmail.com");
		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		 driver.findElement(By.id("exampleCheck1")).click();
		 Select dropDown=new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		 dropDown.selectByVisibleText("Male");
		 driver.findElement(By.id("inlineRadio2")).click();
		 driver.findElement(By.name("bday")).sendKeys("11/11/1911");
		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 WebElement alertSuccess=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		 String sucMsg=alertSuccess.getText();
		 System.out.println("Final Message is "+sucMsg);
		
	}

}
