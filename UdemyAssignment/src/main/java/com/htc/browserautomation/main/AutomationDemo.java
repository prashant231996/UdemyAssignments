package com.htc.browserautomation.main;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver","F:\\Driver\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 System.out.println("Title="+driver.getTitle());
		 
			// driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@name=\"txtUsername\"]")).sendKeys("Admin");
			 driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
			 driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
			 
		//driver.get("https://eportal.htcindia.com");
		/*WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("11111");
		
   List<WebElement> forminputs=driver.findElements(By.className("form-control"));
		
		forminputs.get(0).sendKeys("test");
		forminputs.get(1).sendKeys("WrongPassword");*/
		
	}

}
