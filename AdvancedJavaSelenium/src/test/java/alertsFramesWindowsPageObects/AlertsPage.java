package alertsFramesWindowsPageObects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public AlertsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-1']")
	WebElement alertsLink;
	
	public void alertsLinkClick() {
		alertsLink.click();
	}
	@FindBy(xpath = "//span[normalize-space()='Click Button to see alert']")
	WebElement clickBtnToSeeAlertText;

	public String clickBtnToSeeAlertText() {
		return clickBtnToSeeAlertText.getText();
	}

	@FindBy(xpath = "//button[@id='alertButton']")
	WebElement alertBtn;

	public void alertBtnClick() {
		alertBtn.click();
	}

	@FindBy(xpath = "//span[normalize-space()='On button click, alert will appear after 5 seconds']")
	WebElement alertWillAppearMessage;

	public String alertWillAppearMessage() {
		return alertWillAppearMessage.getText();
	}

	@FindBy(xpath = "//button[@id='timerAlertButton']")
	WebElement timeAlertBtn;

	public void timeAlertBtnClick() {
		timeAlertBtn.click();
	}

	@FindBy(xpath = "//span[normalize-space()='On button click, confirm box will appear']")
	WebElement confirmationText;

	public String confirmationText() {
		return confirmationText.getText();
	}

	@FindBy(xpath = "//button[@id='confirmButton']")
	WebElement confirmationBtn;

	public void confirmationBtnClick() {
		confirmationBtn.click();
	}

	@FindBy(xpath = "//span[normalize-space()='On button click, prompt box will appear']")
	WebElement promptMessage;

	public String promptMessage() {
		return promptMessage.getText();
	}

	@FindBy(xpath = "//button[@id='promtButton']")
	WebElement promptBtn;

	public void promptBtnClick() {
		promptBtn.click();
	}
	@FindBy(id="confirmResult")
	WebElement confirmationResult;
	public String getConfirmationResult() {
		return confirmationResult.getText();
	}
	@FindBy(css="#promptResult")
	WebElement promptResult;
	public String getPromptResult() {
		return promptResult.getText();
	}

}
