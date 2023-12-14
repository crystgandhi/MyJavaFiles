package demoQaPageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public ButtonsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='doubleClickBtn']")
	WebElement doubleClick;
	@FindBy(css = "#doubleClickMessage")
	WebElement doubleClickMessage;

	@FindBy(xpath = "//*[@id='rightClickBtn']")
	WebElement rightClcik;
	@FindBy(id = "rightClickMessage")
	WebElement rightClcikNessage;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	WebElement clickBtn;

	@FindBy(css = "p[id='dynamicClickMessage']")
	WebElement dynamicClickMessage;

	public void buttonsClickActions() {
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
		System.out.println(doubleClickMessage.getText());
		act.contextClick(rightClcik).build().perform();
		System.out.println(rightClcikNessage.getText());
		// act.click(clickBtn).build().perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		// Wait until the radio button is clickable
		wait.until(ExpectedConditions.elementToBeClickable(clickBtn));
		act.click(clickBtn).build().perform();
		// clickBtn.click();
		System.out.println(dynamicClickMessage.getText());

	}

}
