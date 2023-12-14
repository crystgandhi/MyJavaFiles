package demoQaTests;

import org.testng.annotations.Test;

import demoQaPageObjects.DemoQaHomePage;
import demoQaPageObjects.ElementsPage;
import demoQaPageObjects.ButtonsPage;

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
