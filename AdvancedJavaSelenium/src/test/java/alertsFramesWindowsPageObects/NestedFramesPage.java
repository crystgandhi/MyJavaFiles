package alertsFramesWindowsPageObects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFramesPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public NestedFramesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-3']")
	WebElement nestedFramesLink;

	public void nestedFramesLinkClick() {
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(nestedFramesLink));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",nestedFramesLink);
		//nestedFramesLink.click();
	}

	@FindBy(xpath = "//*[@id='framesWrapper']/div[1]")
	WebElement frameInformationText;

	public String getFrameInformationText() {
		return frameInformationText.getText();
	}

	@FindBy(xpath = "//*[@id='frame1Wrapper']/iframe")
	WebElement parentFrame;

	public void moveToParentFrame() {
     driver.switchTo().frame(parentFrame);
	}
	
	@FindBy(xpath="//body[text()='Parent frame']")
	WebElement parentFrameText;
	
	public String getparentFrameText() {
		return parentFrameText.getText();
	}
	
	public void moveToMainWindow() {
		driver.switchTo().defaultContent();
	}
	
	@FindBy(xpath = "/html/body/iframe")
	WebElement childFrame;

	public void moveToChildFrame() {
		driver.switchTo().frame(childFrame);
	}
	@FindBy(xpath="//p[normalize-space()='Child Iframe']")
	WebElement childFrameText;
	
	public String getChildFrameText() {
		return childFrameText.getText();
	}

}
