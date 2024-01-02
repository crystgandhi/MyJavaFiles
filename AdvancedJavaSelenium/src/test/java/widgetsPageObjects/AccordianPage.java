package widgetsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccordianPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public AccordianPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Accordian link
	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-0']")
	WebElement accordianLink;
	
	public void accordianLinkClick() {
		accordianLink.click();
	}
	@FindBy(xpath = "//div[@id='section1Heading']")
	WebElement section1;
	public void section1Click() {
		section1.click();
	}
	@FindBy(xpath = "//p[contains(text(),'Lorem Ipsum is simply dummy text of the printing a')]")
	WebElement text1;
	public String section1Text() {
		return text1.getText();
	}
	@FindBy(xpath = "//div[@id='section2Heading']")
	WebElement section2;
	public void section2Click() {
		section2.click();
	}
	@FindBy(xpath = "//p[contains(text(),'Contrary to popular belief, Lorem Ipsum is not sim')]")
	WebElement text2;
	public String section2Text() {
		return text2.getText();
	}

	@FindBy(xpath = "//div[@id='section3Heading']")
	WebElement section3;
	public void section3Click() {
		section3.click();
	}
	@FindBy(xpath = "//p[contains(text(),'It is a long established fact that a reader will b')]")
	WebElement text3;
	
	public String section3Text() {
		return text3.getText();
	}

}
