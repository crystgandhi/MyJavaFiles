package widgetsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;
import widgetsPageObjects.AccordianPage;
import widgetsPageObjects.AutocompletePage;

public class AutocompleteTest extends DemoQaBaseClass{
	
	DemoQaHomePage demoQaHomePage;
	AutocompletePage autocompletePage;
	   
		
		@Test
		public void elementsPageTextBoxTest() throws InterruptedException {
			demoQaHomePage = new DemoQaHomePage(driver);
			demoQaHomePage.wigetsLinkClick();
			System.out.println(driver.getCurrentUrl());
			autocompletePage=new AutocompletePage(driver);
			autocompletePage.autoCompleteLinkClick();
			System.out.println(driver.getCurrentUrl());
			System.out.println(autocompletePage.verifyMultipleColorText());
			autocompletePage.enterMultipleColors();
			//System.out.println(autocompletePage.verifySingleColorText());
			//autocompletePage.enterSingleColors();
			
			
			
		
			

}}
