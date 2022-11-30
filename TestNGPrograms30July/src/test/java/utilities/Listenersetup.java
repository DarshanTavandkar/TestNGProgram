package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenersetup implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case execution started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case execution passed");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case execution failed");	
		System.out.println("Take screenshot");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case execution skipped");
	}	
	
}
