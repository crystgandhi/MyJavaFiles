package demoQaElementsPageTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;
import demoQaElementsPageObjects.RadioBtnPage;
import demoQaElementsPageObjects.WebTablePage;

public class WebTableTest extends DemoQaBaseClass{
		
	String firstName ="John";
	String lastname="Smith";
	String email=RandomStringUtils.randomAlphanumeric(5)+"@gmail.com";
	String empAge="46";
	String salry ="10000";
	String deptment="Health Insurance";
	
		ElementsPage elementsPage;
		DemoQaHomePage demoQaHomePage;
		WebTablePage webTablePage;
		@Test
		public void elementsPageTextBoxTest() {
			demoQaHomePage=new DemoQaHomePage(driver);
			elementsPage=new ElementsPage(driver);
			demoQaHomePage.elementsLinkClick();
			elementsPage.webTableLinkClick();
			webTablePage =new WebTablePage(driver);
			webTablePage.clickAddBtn();
			//System.out.println(webTablePage.windowOpened());
			
			System.out.println(webTablePage.checkRegistrationFormHeading());
			webTablePage.enterEmployeeInformation(firstName, lastname, email, empAge, salry, deptment);

}}
