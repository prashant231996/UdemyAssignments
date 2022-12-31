package com.htc.browserautomation.main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageLoad {

	 WebDriver driver=null;
	  
	  @BeforeMethod(alwaysRun=true)
		public void setUp() throws Exception {
			System.out.println("Setting up for test");
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		    // WebDriver driver=new ChromeDriver();
	         //driver.get("https://eportal.htcindia.com/_index.php");
		}

		@AfterMethod(alwaysRun=true)
		public void tearDown() throws Exception {
			System.out.println("Cleaning up object");
			driver=null;
		}
	 
	
	 @Test
	  public void testportal_ValidId_TotalPageLoad() throws FileNotFoundException, IOException
	  {
		  Properties con=new Properties();
			con.load(new FileReader("F:\\selenium\\eportalautomation\\src\\user.properties"));
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
		     WebDriver driver=new ChromeDriver();
	        driver.get("https://eportal.htcindia.com/_index.php");
	        WebElement homebutton=driver.findElement(By.cssSelector("i[class=\"fa fa-home fa-1x\"]"));
	        homebutton.click();
	       WebDriverWait wait = new WebDriverWait(driver, 10);  // you can reuse this one
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        WebElement elem = driver.findElement(By.cssSelector("div[class=\"rows mt2 mb5 col-md-5 col-xs-12 col-sm-6 center-position\""));
	        wait.until(ExpectedConditions.visibilityOf(elem));
	      // WebElement elerningbutton=driver.findElement(By.xpath("//*[@id=\"frmSelSource\"]/div[1]/button/h1"));
	       //elerningbutton.submit();
}
}
