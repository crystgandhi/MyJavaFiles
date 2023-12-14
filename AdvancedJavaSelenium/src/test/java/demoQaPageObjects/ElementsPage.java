package demoQaPageObjects;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public ElementsPage(WebDriver driver) {
		// Assign the WebDriver instance passed as a parameter to the local variable
		this.driver = driver;
		// Initialize elements using PageFactory
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='item-0']/span[text()='Text Box']")
	WebElement textBox;

	// method to click textBox
	public void textBoxClick() {
		textBox.click();
	}

	// WebElements representing form fields and elements
	@FindBy(id = "userName")
	WebElement fullName;

	@FindBy(id = "userEmail")
	WebElement userEmail;

	@FindBy(xpath = "//*[@placeholder='Current Address']")
	WebElement currentAddress;

	@FindBy(css = "#permanentAddress")
	WebElement permanentAddress;

	@FindBy(css = "button[id='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//div[@class='border col-md-12 col-sm-12']")
	WebElement verifyUserInformation;

	// Method to enter user information, perform actions, and return verification
	// text
	public String enterUserInformation() {
		// Enter full name
		fullName.sendKeys("JohnSMith");
		// Generate a random email using Apache Commons Lang
		userEmail.sendKeys(RandomStringUtils.randomAlphanumeric(5) + "@gmail.com");
		// Use JavaScriptExecutor to set values for current and permanent addresses
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].value='1132, chruch Dr, Morrisville, NC, 27560';", currentAddress);
		js.executeScript("arguments[0].value='1133, chruch Dr, Marriotsville, NC, 27560';", permanentAddress);
		// Click on the submit button using JavaScriptExecutor
		js.executeScript("arguments[0].click();", submitBtn);
		// Wait for the verification element to be visible before retrieving text
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(verifyUserInformation));
		// Return the text of the verification element
		return verifyUserInformation.getText();
	}

	// check box link
	@FindBy(xpath = "//ul[@class='menu-list']/li[2]")
	WebElement checkBoxLink;

	public void checkBoxLinkClick() {
		checkBoxLink.click();
	}

	// radioBtn link
	@FindBy(xpath = "//ul[@class='menu-list']/li[3]")
	WebElement radioBtnLink;

	public void radioBtnLinkClick() {
		radioBtnLink.click();
	}

	// WebTables Links
	@FindBy(xpath = "//ul[@class='menu-list']/li[4]")
	WebElement webTableLink;

	public void webTableLinkClick() {
		webTableLink.click();
	}

	// Buttons Links
	@FindBy(xpath = "//ul[@class='menu-list']/li[5]")
	WebElement buttonsLink;

	public void buttonsLinkClick() {
		buttonsLink.click();
	}

	// Links Page
	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-5']")
	WebElement elements_Link;

	public void elements_LinkClick() {
		elements_Link.click();
	}

	// Broken Links page

	@FindBy(xpath = "//ul[@class='menu-list']/li[7]")
	WebElement brokenLink;

	public void brokenLinkClick() {
		brokenLink.click();
	}
	// Upload and Download
	@FindBy(xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/span[1]")
	WebElement uploadAndDownloadLink;

	public void uploadAndDownloadLinkClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(171, 821)");
		uploadAndDownloadLink.click();
	}
}
