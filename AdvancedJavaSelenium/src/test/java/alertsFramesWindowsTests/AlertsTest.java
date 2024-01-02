package alertsFramesWindowsTests;


import org.testng.annotations.Test;

import alertsFramesWindowsPageObects.AlertsPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;

public class AlertsTest extends DemoQaBaseClass{
	
	
	DemoQaHomePage demoQaHomePage;
	AlertsPage alertsPage;
	@Test
	public void alertsTest() throws InterruptedException {
		demoQaHomePage=new DemoQaHomePage(driver);
		demoQaHomePage.alertsFramesWindowsLinkClick();
		System.out.println(driver.getCurrentUrl());
		alertsPage =new AlertsPage(driver);
		alertsPage.alertsLinkClick();
		System.out.println(driver.getCurrentUrl());
		System.out.println(alertsPage.clickBtnToSeeAlertText());
		alertsPage.alertBtnClick(); 
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(alertsPage.alertWillAppearMessage());
		alertsPage.timeAlertBtnClick();
		Thread.sleep(8000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(alertsPage.confirmationText());
		alertsPage.confirmationBtnClick();
		driver.switchTo().alert().accept();
		System.out.println(alertsPage.getConfirmationResult());
		System.out.println(alertsPage.promptMessage());
		alertsPage.promptBtnClick();
		driver.switchTo().alert().sendKeys("Selenium");
		driver.switchTo().alert().accept();
		System.out.println(alertsPage.getPromptResult());
		}

}
