package com.htc.browserautomation.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestIeDriver {
	public static void main(String args[])
	{
	 System.setProperty("webdriver.ie.driver", "F:\\Driver\\IEDriverServer_Win32_3.141.0\\IEDriverServer.exe");  
     
     // Instantiate a IEDriver class.       
   WebDriver driver=new InternetExplorerDriver();  
    
     // Launch Website  
 // driver.navigate().to("http://www.google.com/");  
    driver.get("http://www.google.com/");
    
     //Maximize the browser  
    driver.manage().window().maximize();  
      
     // Click on the search text box and send value  
 // driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
        
     // Click on the search button  
  //driver.findElement(By.name("btnK")).click();
    
  //Deleting all the cookies
    driver.manage().deleteAllCookies();

  //launching the specified URL
    driver.get("https://www.google.com/");
    
    //Specifiying pageLoadTimeout and Implicit wait
    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    //launching the specified URL
  //  driver.get("https://www.google.com/");

    //Locating the elements using name locator for the text box
    driver.findElement(By.name("q")).sendKeys("BrowserStack");

    //name locator for google search button
    WebElement searchIcon = driver.findElement(By.name("btnK"));
    searchIcon.click();

}
}