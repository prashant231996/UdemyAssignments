package com.htc.browserautomation.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SaleniumStoreDropDown {

	
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
		
	

		@Test
		public void testPrimaryLocationDropDown_UpdatetonewLocation_ShouldShowTheChangedValueAsSelected()  {
			String filename="demo1";
		    //WebDriver chromeDriver=new ChromeDriver();
			//chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			chromeDriver.get("http://demo-store.seleniumacademy.com/sale.html");
			/*WebElement searchbox=chromeDriver.findElement(By.xpath("//input[@id=\"search\"]"));
			searchbox.sendKeys("sort by label");
			//WebElement searchbox=chromeDriver.findElement(By.xpath("//input[@value=\"sort by label\"]"));
			searchbox.submit();*/
			WebElement label=chromeDriver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > div.toolbar > div.sorter > div > select"));
			Select sel=new Select(label);
			WebElement option=sel.getFirstSelectedOption();
			String optionText=option.getText().trim();
			//System.out.println(optionText);
			Assert.assertEquals(optionText,"Position");
			//WebElement firstele=sel.getFirstSelectedOption();
			//sel.selectByVisibleText("Name");
			
			//Get All Options
			List<WebElement>optionList=sel.getOptions();
			List<String>options=new ArrayList();
			List<String>sortOptions=new ArrayList();
			for(WebElement ele:optionList)
			{
				options.add(ele.getText());
			}
		//	options.remove("Select");
			System.out.println("Options before sorting:");
			System.out.println(options);
			Collections.sort(options);
			
			for(String ele:options)
			{
				sortOptions.add(ele);
			}
			System.out.println("Options after sorting");
			System.out.println(sortOptions);
			if(options==sortOptions)
			{
				System.out.println("Optins are sorted");
			}
			else
			{
				System.out.println("Options are not sorted");
			}
			sel.selectByVisibleText("Name");
			//Assert.assertEquals(sel.getFirstSelectedOption().getText().trim(), "Name");
			/* sel=new Select(label);
			WebElement first=sel.getFirstSelectedOption();
			String text=first.getText();
			System.out.println(text);*/
			//Assert.assertEquals(firstele,"Relevance");
			//WebElement element=chromeDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[1]/div[4]/div[1]/div[1]/div/select"));
			//Select sel=new Select(element);
			//sel.selectByIndex(1);
			//WebElement msg=chromeDriver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/div[2]/div/div[2]/div[1]/div[4]/div[1]/div[1]/div/select/option[1]"));
			//assertEquals(msg.getText(),"Relevance");
		}
}
