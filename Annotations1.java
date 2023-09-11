package TestNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {

	//it is piece of code that provide additional information about the method
	
	@BeforeClass  // now first of all this method would be execute
	public void beforeClass()
	{
		System.out.println("Before Class....\n");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class....\n");
	}
	
	
	@BeforeMethod  //before of all each method it will run
	public void beforeMethod()
	{
		System.out.println("BeforeMethod....");
	}
	
	@AfterMethod   // after of each method it will run 
	public void afterMethod()
	{
		System.out.println("AfterMethod...\n");
	}
	@Test
	public void test1()
	{
		System.out.println("This is test1....");
	}
	@Test
	public void test2()
	{
		System.out.println("This is test2....");
	}
	
	

}
