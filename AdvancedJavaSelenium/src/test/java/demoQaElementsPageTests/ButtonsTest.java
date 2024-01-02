package demoQaElementsPageTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.ButtonsPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;

public class ButtonsTest extends DemoQaBaseClass{
	
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	ButtonsPage buttons;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage=new DemoQaHomePage(driver);
		elementsPage=new ElementsPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.buttonsLinkClick();
		buttons=new ButtonsPage(driver);
		buttons.buttonsClickActions();
	
	}
}
