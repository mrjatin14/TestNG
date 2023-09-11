package TestNGDemo;

import org.testng.annotations.Test;

public class LoanDepartmentEnable_DisableTC {
	
	
//	there are 2 way to enable/desable testcase 
//	1) @Test lvl we give parameter pass  like enable=true or false
//	2) in XML file will in method we will include/ exclude
//	3) Regular expression we can enable/desable
//<class name="TestNGDemo.LoanDepartment">
//    <methods>
//		  <include name ="Mobile.*"></include>
//	  </methods>
//    </class>

	@Test(enabled=false)
	public void MobileLoginPersonalLoan()
	{
		System.out.println("Mobile Login Personal Loan");
	}
	@Test
	public void WebLoginPersonalLoan()
	{
		System.out.println("Web Login Personal Loan");
	}

	@Test
	public void APILoginPersonalLoan()
	{
		System.out.println("API Login Personal Loan");
	}
	
	@Test
	public void MobileLoginAutoMobileLoan()
	{
		System.out.println("Mobile Login AutoMobile Loan");
	}
	
	@Test
	public void WebLoginAutoMobileLoan()
	{
		System.out.println("Web Login AutoMobile Loan");
	}
	
	@Test
	public void APILoginAutoMobileLoan()
	{
		System.out.println("API Login AutoMobile Loan");
	}
	
	
}
