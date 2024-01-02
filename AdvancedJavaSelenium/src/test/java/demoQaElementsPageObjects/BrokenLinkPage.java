package demoQaElementsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinkPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public BrokenLinkPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Valid image text
	@FindBy(xpath = "//p[normalize-space()='Valid image']")
	WebElement validImageText;
	
	public String getValidImageText(){
		return validImageText.getText();
	}
	// Valid image
	@FindBy(xpath = "//div[@class='col-12 mt-4 col-md-6']//img[1]")
	WebElement validImage;
	
	public boolean checkValidImage(){
		return validImage.isDisplayed();
	}
	
	// Broken Image text
	@FindBy(xpath = "//p[normalize-space()='Broken image']")
	WebElement brokenImageText;
	
	public String getBrokenImageText(){
		return brokenImageText.getText();
	}

	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div[2]/div[2]/img[2]")
	WebElement brokenImage;
	
	public boolean checkBrokenImage(){
		return brokenImage.isDisplayed();
	}
	
	// valid link Text
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div[2]/div[2]/p[3]")
	WebElement validLinkText;
	
	public String getValidLinkText(){
		return validLinkText.getText();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Click Here for Valid Link')]")
	WebElement validLink;
	
	public void clickValidLink(){
		validLink.click();
	}
	
	// Broken link
	@FindBy(xpath = "//*[@id='app']/div/div/div[2]/div[2]/div[2]/p[4]")
	WebElement brokenLinkText;
	
	public String getBrokenLinkText(){
		return brokenLinkText.getText();
	}

	@FindBy(xpath = "//a[text()='Click Here for Broken Link']")
	WebElement brokenLink;
	
	public void clickBrokenLink(){
		brokenLink.click();
	}

}
