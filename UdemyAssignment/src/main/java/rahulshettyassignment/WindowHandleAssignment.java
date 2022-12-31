package rahulshettyassignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().window().maximize();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement ele=driver.findElement(By.xpath("//a[text()='Multiple Windows']"));
		 js.executeScript("arguments[0].scrollIntoView();", ele);
		 ele.click();
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		 Set<String>windowId=driver.getWindowHandles();
		 Iterator<String>it=windowId.iterator();
		 String parentId = it.next();
		 String childId= it.next();
		 driver.switchTo().window(childId);
		 String childTitle=driver.getTitle();
		 System.out.println("Child Page Title="+childTitle);
		 driver.switchTo().window(parentId);
		 String parentTitle=driver.getTitle();
		 System.out.println("Parent Page Title= "+parentTitle);
   
	}

}
