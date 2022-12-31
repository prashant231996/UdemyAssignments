package com.htc.browserautomation.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaleniumStore {

	
	WebDriver chromeDriver=null;

	@BeforeMethod
	public void setup() {
       System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 chromeDriver=new ChromeDriver();
		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		// chromeDriver.close();
	}
	
	public void takeScreenShot(String filename) throws IOException
	{
		 // WebDriver chromeDriver=new ChromeDriver();
		  try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	     }
		//chromeDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		File file=((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("F:\\selenium\\cromebrowserautomation\\src\\"+filename+".jpg"));
	}

	@Test
	public void testSearchBox_screenShot() throws IOException {
		//String filename="demo6";
	   // chromeDriver=new ChromeDriver();
		
		chromeDriver.get("http://demo-store.seleniumacademy.com/");
		WebElement searchbox=chromeDriver.findElement(By.cssSelector("#search"));
		//WebElement searchbox=chromeDriver.findElement(By.xpath("//input[@id=\"search\"]"));
		searchbox.sendKeys("fre");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//File file=((TakesScreenshot)chromeDriver).getScreenshotAs(OutputType.FILE);
		//chromeDriver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   //FileUtils.copyFile(file,new File("F:\\selenium\\cromebrowserautomation\\src\\"+filename+".jpg"));
		takeScreenShot("demo12");
	}
	
}
