package demoQaElementsPageTests;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQaBaseClass {

	String browserName = "chrome";
	String url = "https://demoqa.com/";

	public WebDriver driver;

	@BeforeTest
	public void setUP() {
		ChromeOptions options=new ChromeOptions();
		HashMap<String, Object> chromeprefs=new HashMap<String, Object>();
		chromeprefs.put("profile.default_content_settings.popups",0);
		//String downloadFilepath="./Files";
		chromeprefs.put("download.default_directory","./Files");
		options.setExperimentalOption("prefs", chromeprefs);
				
		// Setting up ChromeDriver if the browser is Chrome
		if (browserName.equalsIgnoreCase("chrome")) {
			// Download and setup ChromeDriver
			WebDriverManager.chromedriver().setup();
			// Initialize ChromeDriver instance
			driver = new ChromeDriver(options);
		}
		// Setting up EdgeDriver if the browser is Edge

		if (browserName.equalsIgnoreCase("edge")) {
			// Download and setup EdgeDriver
			WebDriverManager.edgedriver().setup();
			// Initialize EdgeDriver instance
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);// Open the specified URL
	}

	@AfterTest
	public void tearDown() {
		// Close the browser
		driver.quit();
	}

}
