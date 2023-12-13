package demoQaTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import demoQaPageObjects.CheckboxPage;
import demoQaPageObjects.DemoQaHomePage;
import demoQaPageObjects.ElementsPage;

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
