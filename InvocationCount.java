package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationCount {
	
//	InvocationCount attribute is used to run single test case multiple time without loop
	//currently which invocation count is running if we have know then use parameter > ITestContext context
	
	@Test(invocationCount=5)
	public void testMethod1(ITestContext context)
	{
		int currentInvocation=context.getAllTestMethods()[0].getCurrentInvocationCount();
		System.out.println("Executing :" + currentInvocation);
		System.out.println("Test method1.....");
		
	}
	
	@Test(invocationCount=3)
	public void testMethod2(ITestContext context)
	{
		int currentInvocation=context.getAllTestMethods()[1].getCurrentInvocationCount();
		System.out.println("Executing :" + currentInvocation);
		System.out.println("Test method2.....");
	}
	
//	public void login()
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.id("username")).sendKeys("student");
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		driver.findElement(By.id("submit")).click();
//		
//	
//	}
	

//	public void logout()
//	{
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		driver.findElement(By.id("username")).sendKeys("student");
//		driver.findElement(By.id("password")).sendKeys("Password123");
//		driver.findElement(By.id("submit")).click();
//		
//		//logout
//		driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();
//		
//	
//	}
//	

	
}

