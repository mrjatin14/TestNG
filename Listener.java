package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

//this is one way down below 
//@Listeners(TestNGDemo.ListenerClass.class)
//2nd way if we have to associate multiple classes through XML
//after suit tag > listener tag > "class name"
public class Listener {
	
	@Test
	public void login()
	{
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).submit();

	//verify title
	Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test
	public void testFail()
	{
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}
	
	
	//for the skip any test cases
	@Test
	public void testSkip()
	{
		System.out.println("Skipped test case");
		throw new SkipException("skip execption throw......");
	}
	

}
