package demoQaPageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxPage {
	
	// WebDriver instance to interact with the browser
	public WebDriver driver;
	// Constructor to initialize the WebDriver and PageFactory
	public CheckboxPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='rct-checkbox']//*[name()='svg']")
	WebElement checkBoxHome;
	public void checkBoxClick() {
		//To select check box
		checkBoxHome.click();
	}
	@FindBy(css="#result")
	WebElement result;
	
	public String getResult() {
		return result.getText();
	}

}
