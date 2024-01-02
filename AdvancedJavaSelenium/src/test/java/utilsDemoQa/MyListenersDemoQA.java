package utilsDemoQa;
import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListenersDemoQA implements ITestListener{

	ExtentReports getResults=ExtentReportsDemoQA.getExtentReports();
	ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		String testname=result.getName();
		extentTest = getResults.createTest(testname);
		System.out.println(testname+"Started");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS, "Test got Passed");
		}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, "Test got Failed");
		extentTest.fail(result.getThrowable());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testname=result.getName();
		System.out.println(testname+"Skipped");
	}

	
	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		getResults.flush();
	}

}
