package widgetsPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProgressPage {
	// WebDriver instance to interact with the browser
		public WebDriver driver;

		// Constructor to initialize the WebDriver and PageFactory
		public ProgressPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Progress Bar
		@FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-4']")
		WebElement progressBarLink;
		public void progressBarLinkClick() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(250, 890);");
			progressBarLink.click();
		}
		//get Progress bar text
		@FindBy(xpath="//div[@class='mb-3']")
		WebElement progressBarText;
		
		public String getProgressBarText() {
			return progressBarText.getText();
		}
		// check progress bar existing
		@FindBy(xpath="//*[@id='progressBar']")
		WebElement progressBar;
		
		public boolean progressBarExisting() {
			return progressBar.isDisplayed();
		}
		
		//Click start/stop button
		@FindBy(xpath="//*[@id='startStopButton']")
		WebElement startStopButton;
		public void startStopButtonClick() {
			startStopButton.click();
		}
		
		//Get Progress Bar value
		@FindBy(xpath="//*[@id='progressBar']/div")
		WebElement progressBarValue;
		public String getProgressBarValue() {
			return progressBarValue.getAttribute("aria-valuenow");
		}

}
