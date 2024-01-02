package demoQaElementsPageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage {
	
	// WebDriver instance to interact with the browser
		public WebDriver driver;

		// Constructor to initialize the WebDriver and PageFactory
		public DynamicPropertiesPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		@FindBy(xpath="//button[@id='enableAfter']")
        WebElement enableAfter5seconds;
		public boolean enableAfter5Seconds() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        // Wait until the element is clickable
	        wait.until(ExpectedConditions.elementToBeClickable(enableAfter5seconds));
			return enableAfter5seconds.isEnabled();
		}
		@FindBy(xpath="//button[@id='colorChange']")
		WebElement colorchange;
		public boolean colorChange() {
			return colorchange.isDisplayed();
		}
		@FindBy(xpath="//button[@id='visibleAfter']")
		WebElement visibleAfter5Seconds;
		public boolean visibleAfter5Seconds() {
			return visibleAfter5Seconds.isDisplayed();
		}
	
}
