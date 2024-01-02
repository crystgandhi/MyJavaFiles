package demoQaElementsPageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UploadDownloadPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public UploadDownloadPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='downloadButton']")
	WebElement downloadLinkBtn;

	public void clickDownLoadLinkBtn() {
		downloadLinkBtn.click();
	}

	@FindBy(xpath = "//label[@for='uploadFile']")
	WebElement selectFileText;
	

	public String getSelectFileText() {
		return selectFileText.getText();
	}

	@FindBy(xpath = "//input[@id='uploadFile']")
	WebElement uploadFileBtn;

	public void clickUpLoadLinkBtn() {
		uploadFileBtn.sendKeys("C://Users//Nikil//Desktop//Files//configurator-custom.jpg");
		
	}

}
