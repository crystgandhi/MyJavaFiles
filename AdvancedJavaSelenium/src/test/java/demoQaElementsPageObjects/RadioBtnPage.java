package demoQaElementsPageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioBtnPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public RadioBtnPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='yesRadio']")
	WebElement radioBtnYes;
	@FindBy(xpath = "//p[@class='mt-3']")
	WebElement yesSelectedMsg;
     // RadioBtn For Yes
	public void clickradioBtnYes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Wait until the radio button is clickable
        wait.until(ExpectedConditions.visibilityOfAllElements(radioBtnYes));
		radioBtnYes.click();
		}
	
	public String getYesRadioBtnMsg() {
		return yesSelectedMsg.getText();
	}

	@FindBy(xpath = "//*[@id='impressiveRadio']")
	WebElement radioBtnImpressive;
	@FindBy(xpath = "//p[@class='mt-3']")
	WebElement impresiveSelectedMsg;
	 // RadioBtn For impressive
	public String clickradioBtnImpressive() {
		radioBtnImpressive.click();
		return impresiveSelectedMsg.getText();

	}

}
