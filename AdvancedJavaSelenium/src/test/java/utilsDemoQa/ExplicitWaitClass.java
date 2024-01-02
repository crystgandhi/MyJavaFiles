package utilsDemoQa;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demoQaElementsPageTests.DemoQaBaseClass;

public class ExplicitWaitClass extends DemoQaBaseClass{
	
	
	public void explicitWaitMethod(WebElement element) {
		
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}

}
