package utilsDemoQa;

import org.testng.Assert;
import org.testng.annotations.Test;


public class RetryTests {
		
	@Test(retryAnalyzer = CustomRetryAnalyzerLuma.class)
    public void failingTest1() {
        // Example: A test that fails and will be retried up to 3 times.
        Assert.assertEquals(2 + 2, 5);
    }

    @Test(retryAnalyzer = CustomRetryAnalyzerLuma.class)
    public void failingTest2() {
        // Example: Another test that fails and will be retried up to 3 times.
        Assert.assertTrue(false);
    }

}
