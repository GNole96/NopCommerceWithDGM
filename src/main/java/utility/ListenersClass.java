package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass extends BaseClass implements ITestListener  {
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test is Started " + result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
	
		try {
			Screenshot.takeScreenshot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped (ITestResult result) {
		
		System.out.println("Test is Skipped "+ result.getName());
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is Pass "+ result.getName());
	}
	

}
