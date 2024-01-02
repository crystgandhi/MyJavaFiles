package demoQaElementsPageTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.CheckboxPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;
import demoQaElementsPageObjects.RadioBtnPage;

public class RadioBtnTest extends DemoQaBaseClass{
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	RadioBtnPage radioBtnPage;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage=new DemoQaHomePage(driver);
		elementsPage=new ElementsPage(driver);
		radioBtnPage=new RadioBtnPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.radioBtnLinkClick();
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		radioBtnPage.clickradioBtnYes();
		System.out.println(radioBtnPage.getYesRadioBtnMsg());
		System.out.println(radioBtnPage.clickradioBtnImpressive());
		
	}
}
