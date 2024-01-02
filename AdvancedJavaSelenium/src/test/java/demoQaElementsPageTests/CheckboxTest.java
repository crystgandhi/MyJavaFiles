package demoQaElementsPageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import demoQaElementsPageObjects.CheckboxPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;

public class CheckboxTest extends DemoQaBaseClass{
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	CheckboxPage checkboxPage;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage=new DemoQaHomePage(driver);
		elementsPage=new ElementsPage(driver);
		checkboxPage=new CheckboxPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.checkBoxLinkClick();
		checkboxPage.checkBoxClick();
		System.out.println(checkboxPage.getResult());
		
	
	}

}
