package alertsFramesWindowsPageObects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserWindowsPage {
	
	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public BrowserWindowsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Browser Windows']")
	WebElement browserWindowsLink;
	public void browserWindowsLinkClick() {
		browserWindowsLink.click();
	}
	@FindBy(xpath = "//button[@id='tabButton']")
	WebElement newTabButton;
	public void newTabButtonClick() {
		newTabButton.click();
	}
	
	@FindBy(tagName="h1")
	WebElement newTabText;
	
	public String getNewTabText() {
		return newTabText.getText();
	}
	
	
	@FindBy(xpath = "//button[@id='windowButton']")
	WebElement newWindowButton;
	public void newWindowButtonClick() {
		newWindowButton.click();
	}
	@FindBy(xpath = "//button[@id='messageWindowButton']")
	WebElement messageWindowButton;
	
	public void messageWindowButtonkClick() {
		messageWindowButton.click();
	}



	


	


	

	

}
