package demoQaPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQaHomePage {
	
	// WebDriver instance to interact with the browser
	public WebDriver driver;
	// Constructor to initialize the WebDriver and PageFactory
	public DemoQaHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 // WebElement representing the ToolsQA logo
	@FindBy(xpath="//img[@src='/images/Toolsqa.jpg']")
	WebElement toolsQA;
	// Method to get the attribute value of the ToolsQA logo 
	//(in this case, the 'src' attribute)
	public String getPageTitle() {
		return toolsQA.getAttribute("src");
	}
	// WebElement representing the Selenium Online Training image
	@FindBy(xpath="//img[@alt='Selenium Online Training']")
	WebElement seleniumOnlineTraining;
	// Method to check if the Selenium Online Training image is displayed
	public boolean seleniumOnlineTrainingImage() {
		return seleniumOnlineTraining.isDisplayed();
	}
	 // WebElement representing the 'Elements' section
	@FindBy(xpath="(//h5)[1]")
	WebElement elements;
	// Method to get the text of the 'Elements' section
	public String elementsText() {
		return elements.getText();
	}
	// Method to click the 'Elements' link
	public void elementsLinkClick() {
		 elements.click();
	}
	// Similar methods for other sections like 'Forms', 
		//'Alerts Frames Windows', 'Widgets', etc.

	@FindBy(xpath="(//h5)[2]")
	WebElement forms;
	public String formsText() {
		return forms.getText();
	}
	@FindBy(xpath="(//h5)[3]")
	WebElement alertsFramesWindows;
	public String alertsFramesWindowsText() {
		return alertsFramesWindows.getText();
	}
	@FindBy(xpath="(//h5)[4]")
	WebElement wigets;
	public String wigetsText() {
		return wigets.getText();
	}
	@FindBy(xpath="(//h5)[5]")
	WebElement interactions;
	public String interactionsText() {
		return interactions.getText();
	}
	@FindBy(xpath="(//h5)[6]")
	WebElement bookStoreAppilcations;
	public String bookStoreAppilcationsText() {
		return bookStoreAppilcations.getText();
	}
}
