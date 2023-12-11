package seleniumAdvanced;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTestNG {
	//assertEquals - Compares two values for equality
	@Test
	public void testAssertEquals() {
	    int expected = 5;
	    int actual = 2 + 3;
	    Assert.assertEquals(actual, expected, "Values are not equal");
	}
	//assertTrue/assertFalse - Asserts that a condition is true/false
	@Test
	public void testAssertTrue() {
	    boolean condition = true;
	    Assert.assertTrue(condition, "Condition is not true");
	}
	// assertNotNull/assertNull - Asserts that an object is not null/null.
	@Test
	public void testAssertNotNull() {
	    Object object = new Object();
	    Assert.assertNotNull(object, "Object is null");
	}
    // assertNotEquals - Asserts that two values are not equal.
	@Test
	public void testAssertNotEquals() {
	    int unexpected = 10;
	    int actual = 2 + 3;
	    Assert.assertNotEquals(actual, unexpected, "Values are equal");
	} 
}
