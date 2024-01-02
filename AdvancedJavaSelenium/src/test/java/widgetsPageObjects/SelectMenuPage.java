package widgetsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SelectMenuPage {
	// WebDriver instance to interact with the browser
		public WebDriver driver;

		// Constructor to initialize the WebDriver and PageFactory
		public SelectMenuPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		//Select Menu
		//div[@class='element-list collapse show']//li[@id='item-8']
}
