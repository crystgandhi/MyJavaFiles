package advancedJavaSeleniumfiles;




import org.testng.annotations.Test;

import demoQaPageObjects.DemoQaHomePage;
import demoQaTests.DemoQaBaseClass;



public class OpenBrowser extends DemoQaBaseClass{
	DemoQaHomePage demoQaHomePage;
	
	@Test
	public void openHomePageTest () {
		System.out.println("Browser opened");
		demoQaHomePage=new DemoQaHomePage(driver);
		System.out.println(demoQaHomePage.getPageTitle());
		System.out.println(demoQaHomePage.elementsText());
		System.out.println(demoQaHomePage.formsText());
		System.out.println(demoQaHomePage.alertsFramesWindowsText());
		System.out.println(demoQaHomePage.wigetsText());
		System.out.println(demoQaHomePage.interactionsText());
		System.out.println(demoQaHomePage.bookStoreAppilcationsText());
	}

}
