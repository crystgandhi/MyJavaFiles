package advancedJavaSeleniumfiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demoQaTests.DemoQaBaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser extends DemoQaBaseClass{
		
	@Test
	public void openBrowser () {
		
		System.out.println("Browser opened");
	}

}
