package TestNGDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@BeforeSuite  //it will run in xml sabse phle suite ke pehle
	public void beforeSuite()
	{
		System.out.println("This is BeforeSuite....");
	}
	
	@AfterSuite   //it will run in xml sab ke baad me suite ke baad
	public void afterSuite()
	{
		System.out.println("This is AfterSuite....");
	}
	
	
	@BeforeTest  // it will run in xml before class tag we have test tag there first before test will run after tht class will br run in XML
	public void beforeTest()
	{
		System.out.println("This is BeforeTest....");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("This is AfterTest....");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test3....");
	}
	
	@Test
	public void test4()
	{
		System.out.println("This is test4....");
	}
	
	/*
	
	This is BeforeSuite....
	This is BeforeTest....
	Before Class....

	BeforeMethod....
	This is test1....
	AfterMethod...

	BeforeMethod....
	This is test2....
	AfterMethod...

	After Class....

	This is test3....
	This is test4....
	This is AfterTest....
	This is AfterSuite....

*/

}
