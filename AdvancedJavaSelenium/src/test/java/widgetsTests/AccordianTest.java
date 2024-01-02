package widgetsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;
import widgetsPageObjects.AccordianPage;
import widgetsPageObjects.ProgressPage;

public class AccordianTest extends DemoQaBaseClass{
	
	DemoQaHomePage demoQaHomePage;
	AccordianPage accordianPage;
	   
		
		@Test
		public void elementsPageTextBoxTest() throws InterruptedException {
			demoQaHomePage = new DemoQaHomePage(driver);
			demoQaHomePage.wigetsLinkClick();
			System.out.println(driver.getCurrentUrl());
			accordianPage=new AccordianPage(driver);
			accordianPage.accordianLinkClick();
			System.out.println(driver.getCurrentUrl());
			System.out.println(accordianPage.section1Text());
			accordianPage.section1Click();
			accordianPage.section2Click();
			Thread.sleep(3000);
			System.out.println(accordianPage.section2Text());
			accordianPage.section3Click();
			Thread.sleep(3000);
			System.out.println(accordianPage.section3Text());

}}
