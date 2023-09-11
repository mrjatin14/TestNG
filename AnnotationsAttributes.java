package TestNGDemo;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class AnnotationsAttributes {
	
//Attributes--->>
//@Test(description="This  is testcase1")
//	@Test(timeOut=200)
//	@Test(priority =1)
//@Test	(dependsOnMethods = {"testCase2",.......,.....})
//	@Test(enabled=false)
//	@Test(groups="Software Company")    for similar functionality TCes grps -->in XML file will give under test>groups>run>include name"grp name"> 
	
	
	
	
	@Test(enabled=false)
	public void testCase1()
	{
		System.out.println("Mobile Login TestCase");
	}
	@Test(enabled=false)
	public void testCase2()
	{
		System.out.println("Web Login TestCase");
//		Assert.assertTrue(false);
	}
	
	@Test(enabled=false)
	public void testCase3()
	{
		System.out.println("API Login TestCase");
	}
	@Test(groups="Software Company")
	public void infosys()
	{
		System.out.println("Infosys");
	}
	@Test(groups="Software Company")
	public void wipro()
	{
		System.out.println("Wipro");
	}
	@Test(groups="AutoMobile Company")
	public void maruti()
	{
		System.out.println("MARUTI");
	}
	@Test(groups="AutoMobile Company")
	public void tata()
	{
		System.out.println("TATA");
	}

}
