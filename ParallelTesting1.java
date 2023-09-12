package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ParallelTesting1 {
	
//in XML files
//	<suite name="Suite" parallel="methods" thread-count="2">
	//we can execute 2 or more classes at one time 
//	<suite name="Suite" parallel="classes" thread-count="2">
//	we can execute multiple tests suite 
//	<suite name="Suite" parallel="tests" thread-count="2">
	
	@Test
	public void verifyTitle()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//verify title
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	
	}
	@Test
	public void verifyLogo()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//verify title
//		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		//verify logo through assert class
		Assert.assertTrue(logo.isDisplayed());
		
		System.out.println();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
	}
	
	

}
