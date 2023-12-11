package seleniumAdvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserExample {
	@Test
	public void headlessBrowser() {
		 // Create ChromeOptions to enable headless mode
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);

        // Initialize the ChromeDriver with headless option
        WebDriver driver = new ChromeDriver(options);

        // Navigate to the Google homepage
        driver.get("https://www.google.com");

        // Find the search input element and enter a query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver Headless Testing");

        // Submit the search
        searchBox.submit();

        // Wait for a while to see the results 
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the page title
        System.out.println("Page Title: " + driver.getTitle());
	}
}
