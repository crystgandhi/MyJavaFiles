package demoQaElementsPageTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.DynamicPropertiesPage;
import demoQaElementsPageObjects.ElementsPage;
import demoQaElementsPageObjects.UploadDownloadPage;

public class DynamicPertiesTest extends DemoQaBaseClass{
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	DynamicPropertiesPage dynamicsProperties;

	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		elementsPage = new ElementsPage(driver);
		dynamicsProperties=new DynamicPropertiesPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.dynamicPropertiesClick();
		System.out.println(dynamicsProperties.enableAfter5Seconds());
		System.out.println(dynamicsProperties.colorChange());
		System.out.println(dynamicsProperties.visibleAfter5Seconds());

}}
