package widgetsPageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilsDemoQa.ExplicitWaitClass;

public class AutocompletePage {

	ExplicitWaitClass explicitWaitClass;
	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public AutocompletePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Autocomplete link click
	@FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-1']")
	WebElement autoCompleteLink;
	public void autoCompleteLinkClick() {
		autoCompleteLink.click();
	}
	@FindBy(xpath="//span[normalize-space()='Type multiple color names']")
	WebElement typeMultipleColorNameText;
	public String verifyMultipleColorText() {
		return typeMultipleColorNameText.getText();
	}
	
	@FindBy(xpath="//*[@id='autoCompleteMultipleContainer']/div/div[1]")
	WebElement multipleColorContainer;
	public void enterMultipleColors() {
		multipleColorContainer.click();
		//explicitWaitClass=new ExplicitWaitClass();
	//	explicitWaitClass.explicitWaitMethod(multipleColorContainer);
		
		multipleColorContainer.sendKeys("B");
		//Actions actions=new Actions(driver);
		//actions.sendKeys(multipleColorContainer, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
	
	@FindBy(xpath="//span[normalize-space()='Type single color name']")
	WebElement  typesingleColorNameText;
	
	public String verifySingleColorText() {
		return typesingleColorNameText.getText();
	}
	
	@FindBy(xpath="//*[@id='autoCompleteSingleContainer']/div/div[1]")
	WebElement singleColorContainer;
	public void enterSingleColors() {
		singleColorContainer.sendKeys("R");
		//Actions actions=new Actions(driver);
		//actions.sendKeys(singleColorContainer, Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}
		
}
