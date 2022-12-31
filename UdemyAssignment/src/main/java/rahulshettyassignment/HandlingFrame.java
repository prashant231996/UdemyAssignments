package rahulshettyassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\chromeDrivers\\chromedriver_win32 (8)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://the-internet.herokuapp.com/");
		 driver.manage().window().maximize();
		 WebElement frameEle=driver.findElement(By.xpath("//a[text()='Nested Frames']"));
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView()", frameEle);
		 frameEle.click();
		// WebElement frameElement=driver.findElement(By.name("frame-middle"));
		// driver.switchTo().frame(0);
		 driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		 System.out.println(driver.findElement(By.id("content")).getText());

	}

}
