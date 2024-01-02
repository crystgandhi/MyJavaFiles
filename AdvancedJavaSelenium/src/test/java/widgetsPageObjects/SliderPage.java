package widgetsPageObjects;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SliderPage {

	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public SliderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Slider link Click
	@FindBy(xpath = "//div[@class='element-list collapse show']//li[@id='item-3']")
	WebElement sliderLink;

	public void sliderLinkClick() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(250, 829);");
		sliderLink.click();
	}

	@FindBy(xpath = "//*[@id='sliderContainer']/div[1]/span/input")
	WebElement rangeSlider;

	public boolean rangeSLiderCheck() {
		return rangeSlider.isDisplayed();
	}
        //move slider by 40
	public void moveToolTipArrow() {
		for (int i = 1; i <= 40; i++) {
			rangeSlider.sendKeys(Keys.ARROW_RIGHT);
		}
	}

	@FindBy(xpath = "//*[@id='sliderContainer']/div[1]/span/div/div[2]")
	WebElement rangeSliderToolTipArrow;

	@FindBy(xpath = "//*[@id='sliderValue']")
	WebElement sliderValue;
      // get slider position value
	public String getSliderValue() {
		return sliderValue.getAttribute("value");
	}

}
