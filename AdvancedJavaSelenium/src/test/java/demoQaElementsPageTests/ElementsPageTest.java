package demoQaElementsPageTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;

public class ElementsPageTest extends DemoQaBaseClass{
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage=new DemoQaHomePage(driver);
		elementsPage=new ElementsPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.textBoxClick();
		System.out.println(elementsPage.enterUserInformation());
	}}

