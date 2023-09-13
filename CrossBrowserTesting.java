package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting{

	//	it is process to perform tests on multiple browsers
	//	in XML file After test tag
	//	<parameter name="browser" value="MSEDGE"></parameter>
	//if we have to execute  then suite tag in
	//	<suite name="Suite"  parallel="tests">
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "msedge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
//		case "firefox" :
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
		default :
			driver = null;
			break;
				
		}


	}
	@Test
	public void verifyTitle()
	{

		driver.get("https://www.google.co.in/");
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		//		for verify
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println(actualTitle);

	}

	@AfterMethod
	public void quiteBrowser()
	{
		driver.quit();

	}


}
