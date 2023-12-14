package utilsDemoQa;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzerLuma implements IRetryAnalyzer{
		// Set the maximum number of retries here
		 private int maxRetryCount = 2; 
		 private int currentRetryCount = 0;

		    @Override
		    public boolean retry(ITestResult result) {
		    	// Retry the test
		        if (currentRetryCount < maxRetryCount) {
		            currentRetryCount++;
		            return true; 
		        }
		     // Do not retry the test
		        return false; 
		    }

}
