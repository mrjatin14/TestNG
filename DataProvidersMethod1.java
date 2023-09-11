package TestNGDemo;

import org.testng.annotations.DataProvider;

public class DataProvidersMethod1 {

//	similar to TestNG Parameters, DP means pass data to test methods in testng. 
	//we can easily inject multiple values into the same test case. it comes inbult in testng & it is popularly used in data driven framework.

	//ex.
	//	1. India Qutub Minar
	//	2. Agra Taj Mahal
	//	3.Hydrabad Charminar

	@DataProvider(name="serachDataSet")
	public Object[][] searchData()
	{
		Object [][] searchKeyWord = new Object[3][2];
		searchKeyWord[0][0] = "India";
		searchKeyWord[0][1]= "Qutub Minar";
		
		searchKeyWord[1][0]="Agra";
		searchKeyWord[1][1]="Taj mahal";
		
		searchKeyWord[2][0]="Hydrabad";
		searchKeyWord[2][1]="Charminar";
		
		return searchKeyWord;
		
	}
}
