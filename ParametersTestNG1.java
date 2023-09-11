package TestNGDemo;

import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import com.beust.jcommander.*;

public class ParametersTestNG1 {
	
//Parameters->	it is the arguments that we pass to the test methods 
//	there are 2 ways to pass para. to test methods
//TestNG Parameters (with XML file)
//TestNG DataProviders
//in the XML file we will parameter name & value before test tag & after test tag
	
	@Test
	@Parameters({"i","j"})

	public void add(int a, int b)
	{
		System.out.println("add :" +  (a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a, int b)
	{
		System.out.println("sub :" +  (a-b));
	}
	@Test
	@Parameters({"i","j"})
	public void multiply(int a, int b)
	{
		System.out.println("multiply :"+  (a*b));
	}

}
