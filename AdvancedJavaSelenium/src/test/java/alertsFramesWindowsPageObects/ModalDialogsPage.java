package alertsFramesWindowsPageObects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public ModalDialogsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='Modal Dialogs']")
	WebElement ModalDialogsLink;
	
	public void modalDialogsLinkClick() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(141, 805);");
		js.executeScript("arguments[0].click()",ModalDialogsLink);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(ModalDialogsLink));
		//ModalDialogsLink.click();
	}

	@FindBy(xpath = "//*[@id='showSmallModal']")
	WebElement smallModal;

	public void smallModalClick() {
		smallModal.click();
	}
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/button")
	WebElement smallModelDialogClose;
	public void smallModelDialogCloseClcik() {
		smallModelDialogClose.click();
	}
	
	@FindBy(xpath = "//*[@id='showLargeModal']")
	WebElement largeModal;
	
	public void largeModalClick() {
		largeModal.click();
	}
	
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/button")
	WebElement largeModalDialogClose;
	
	public void largeModelDialogCloseClcik() {
		largeModalDialogClose.click();
	}

}
