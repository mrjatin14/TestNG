package TestNGDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass  implements ITestListener{


	public void onStart(iTestContext result)
	{
		System.out.println("On Start method invoked.....");
	}

	public void onFinish(iTestContext Result)

	{
		System.out.println("On Finished method invoked.....");
	}

	public void onTestFailure(ITestResult Result)

	{
		System.out.println("Name of text method failed :" +Result.getName() );
		
	}
	
	public void onTestSkipped(ITestResult Result)

	{
		System.out.println("Name of text method skipped :" +Result.getName() );
		
	}
	
	public void onTestStart(ITestResult Result)

	{
		System.out.println("Name of text method started :" +Result.getName() );
		
	}

	
	public void Success(ITestResult Result)

	{
		System.out.println("Name of text method successfull executed :" +Result.getName() );
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult Result)
	{
		
	}





}
