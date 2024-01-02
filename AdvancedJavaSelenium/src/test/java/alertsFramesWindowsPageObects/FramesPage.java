package alertsFramesWindowsPageObects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public FramesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Frames']")
	WebElement framesLink;

	// Click link for frames in the left side
	public void framesLinkClick() {
		framesLink.click();
	}

	// Description text
	@FindBy(xpath = "//div[contains(text(),'Sample Iframe page There are 2 Iframes in this pag')]")
	WebElement framesDescriptionText;

	public String getFramesDescriptionText() {
		return framesDescriptionText.getText();
	}

	// Frame 1 existing
	@FindBy(xpath = "//*[@id='frame1']")
	WebElement frame1;

	public boolean frame1Existing() {
		return frame1.isDisplayed();
	}

	// Move to frame1
	public void moveToFrame1() {
		driver.switchTo().frame(frame1);
	}

	@FindBy(xpath = "//h1[@id='sampleHeading']")
	WebElement frame1Text;

	// Get frame text
	public String getFrame1Text() {
		return frame1Text.getText();
	}

	// Switch back to main window
	public void moveToMainWindow() {
		driver.switchTo().defaultContent();
	}

	// Frame 2 existing
	@FindBy(xpath = "//*[@id='frame2']")
	WebElement frame2;

	public boolean frame2Existing() {
		return frame2.isDisplayed();
	}

	// Move to frame2
	public void moveToFrame2() {
		driver.switchTo().frame(frame2);
	}

	@FindBy(xpath = "//h1[@id='sampleHeading']")
	WebElement frame2Text;

	// Get frame2 text
	public String getFrame2Text() {
		return frame2Text.getText();
	}

	// Scroll vertically and horizontally in frame 2
	public void scrollToTheBottom() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
		// Actions act=new Actions(driver);
		// act.scrollByAmount(5000,0);
	}
}
