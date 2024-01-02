package widgetsPageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ToolTipsPage {
	// WebDriver instance to interact with the browser
		public WebDriver driver;

		// Constructor to initialize the WebDriver and PageFactory
		public ToolTipsPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
				
		//Tool Tips
		@FindBy(xpath="//div[@class='element-list collapse show']//li[@id='item-6']")
		WebElement toolTipsLink;
		public void toolTipsLinkClick() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(250, 887);");
			toolTipsLink.click();
		}
		@FindBy(xpath="//p[normalize-space()='Practice Tool Tips']")
		WebElement practiceToolTipsText;
		public String getPracticeToolTipsText() {
			return practiceToolTipsText.getText();
		}
		@FindBy(xpath="//button[@id='toolTipButton']")// You hovered over the button")
		WebElement button;
		public String toolTIpButton() {
			Actions action=new Actions(driver);
			action.moveToElement(button).build().perform();
			return button.getAttribute("aria-describedby");
			
		}
		@FindBy(xpath="//input[@id='toolTipTextField']")// You hovered over the text field")
		WebElement textField;
		public String toolTIpTextField() {
			Actions action=new Actions(driver);
			action.moveToElement(textField).build().perform();
			return textField.getAttribute("aria-describedby");
			
		}
		@FindBy(xpath="//a[normalize-space()='Contrary']")// You hovered over the Contrary")
		WebElement Contrary;
		public String toolTIpContrary() {
			Actions action=new Actions(driver);
			action.moveToElement(Contrary).build().perform();
			return Contrary.getAttribute("aria-describedby");
			
		}
		@FindBy(xpath="//a[normalize-space()='1.10.32']")// You hovered over the 1.10.32")
		WebElement section11032;
		public String toolTIpsection11032() {
			Actions action=new Actions(driver);
			action.moveToElement(section11032).build().perform();
			return section11032.getAttribute("aria-describedby");
			
		}
		

}
