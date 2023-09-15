package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assertions {

	/*	
	//Hard Assert
 //It is immediately  throws the AssertException when the test case is failed.
//it contains few methods
//AssertEqual
//AssertNotEqual
//AssertTure
//AssertFalse
	@Test
	public void testMethod()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");

		//Intentionally  we incorrrecting this test case for hard assert
		System.out.println("Verifying title...");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle  = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		Assert.assertTrue(icon.isDisplayed());

		System.out.println("Verifying presence of wikipedia-searchBtn");
		WebElement btn = driver.findElement(By.className("wikipedia-search-button"));
		Assert.assertTrue(icon.isDisplayed());

		driver.close();
	}
	 */


	//Soft Assert
	//it is doesn't throw an exception  when the assertion fails, collects them and carries out with the next validation.
	//>> to use testng soft assertion, you have to use testng SoftAssert class.
	@Test
	public void testMethod2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		SoftAssert softVerify = new SoftAssert();



		driver.get("https://testautomationpractice.blogspot.com/");
		//Intentionally  we incorrrecting this test case for hard assert
		System.out.println("Verifying title...");
		String expectedTitle = "Automation Testing Practice1";
		String actualTitle  = driver.getTitle();
		softVerify.assertEquals(expectedTitle, actualTitle);

		System.out.println("Verifying presence of wikipedia-icon");
		WebElement icon = driver.findElement(By.className("wikipedia-icon"));
		softVerify.assertTrue(icon.isDisplayed());

		System.out.println("Verifying presence of wikipedia-searchBtn");
		WebElement btn = driver.findElement(By.className("wikipedia-search-button"));
		softVerify.assertTrue(icon.isDisplayed());

		driver.close();

		//report all failure messages
		softVerify.assertAll();

	}

}
