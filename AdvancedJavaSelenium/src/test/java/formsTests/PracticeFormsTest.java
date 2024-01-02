package formsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.DynamicPropertiesPage;
import demoQaElementsPageObjects.ElementsPage;
import demoQaElementsPageTests.DemoQaBaseClass;
import formsPageObjects.PracticeFormPage;

public class PracticeFormsTest extends DemoQaBaseClass{
	
	PracticeFormPage practiceFormPage;
	DemoQaHomePage demoQaHomePage;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		practiceFormPage=new PracticeFormPage(driver);
		demoQaHomePage.formsLinkClick();
		practiceFormPage.practiceFormsLInkClick();
		practiceFormPage.enterUserInformation();

}}
