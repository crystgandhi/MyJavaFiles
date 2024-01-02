package demoQaElementsPageObjects;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public LinksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//strong[normalize-space()='Following links will open new tab']")
	WebElement linksOpenNewTabText;

	public String getNewTabOpenText() {
		return linksOpenNewTabText.getText();
	}

	@FindBy(xpath = "//*[@id='linkWrapper']/p/a")
	List<WebElement> links;
    
	//Get NUmber of links
	public void checkLinks() {
		System.out.println(links.size());
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getAttribute("id"));
		}
	}

	@FindBy(xpath = "//*[@id='simpleLink']")
	WebElement homeLink;
	
	//Click home link, will open in new Tab
	public void clickHomeLink() {
		homeLink.click();
	}
	
	@FindBy(css = "a[id='dynamicLink']")
	WebElement homeDynamicLink;
	
	//Click home dynamic link, will open in new Tab
	public void clickHomeDynamicLink() {
		homeDynamicLink.click();
	}

	@FindBy(xpath = "//strong[text()='Following links will send an api call']")
	WebElement linksSendAPICallText;

	public String getlinksSendAPICallText() {
		return linksSendAPICallText.getText();
	}

	@FindBy(xpath = "//p[@id='linkResponse']")
	WebElement linkResponse;
	
	public String getLinkResponse() {
        return linkResponse.getText();
	}
	@FindBy(xpath="//a[@id='created']")
	WebElement createdLink;
	public void createdLinkClick() {
		createdLink.click();
	}
	
	
	@FindBy(xpath="//a[@id='no-content']")
	WebElement noContentLink;
	public void noContentLinkClick() {
		noContentLink.click();
	}
	
	@FindBy(xpath="//a[@id='moved']")
	WebElement movedLink;
	public void movedLinkClick() {
		movedLink.click();
	}
	@FindBy(xpath="//a[@id='bad-request']")
	WebElement badRequestLink;
	public void badRequestLinkClick() {
		badRequestLink.click();
	}
	@FindBy(xpath="//a[@id='unauthorized']")
	WebElement unauthorizedLink;
	public void unauthorizedLinkClick() {
		unauthorizedLink.click();
	}
	@FindBy(xpath="//a[@id='forbidden']")
	WebElement forbiddenLink;
	public void forbiddenLinkClick() {
		forbiddenLink.click();
	}
	@FindBy(xpath="//a[@id='invalid-url']")
	WebElement invalid_urlLink;
	public void invalid_urlLinkClick() {
		invalid_urlLink.click();
	}
	
	
}
