package widgetsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;
import widgetsPageObjects.ProgressPage;
import widgetsPageObjects.SliderPage;

public class ProgressTest extends DemoQaBaseClass {
	
	DemoQaHomePage demoQaHomePage;
	ProgressPage progressPage;
	   
		
		@Test
		public void elementsPageTextBoxTest() throws InterruptedException {
			demoQaHomePage = new DemoQaHomePage(driver);
			demoQaHomePage.wigetsLinkClick();
			System.out.println(driver.getCurrentUrl());
			progressPage=new ProgressPage(driver);
			progressPage.progressBarLinkClick();
			System.out.println(driver.getCurrentUrl()); 
			System.out.println(progressPage.getProgressBarText());
			System.out.println(progressPage.progressBarExisting());
			progressPage.startStopButtonClick();
			Thread.sleep(5000);
			progressPage.startStopButtonClick();
			System.out.println(progressPage.getProgressBarValue());
			

}}
