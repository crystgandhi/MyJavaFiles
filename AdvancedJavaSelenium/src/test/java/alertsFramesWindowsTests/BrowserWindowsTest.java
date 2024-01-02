package alertsFramesWindowsTests;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import alertsFramesWindowsPageObects.AlertsPage;
import alertsFramesWindowsPageObects.BrowserWindowsPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;

public class BrowserWindowsTest extends DemoQaBaseClass{
	
	
	DemoQaHomePage demoQaHomePage;
	BrowserWindowsPage browserWindowsPage;
	@Test
	public void alertsTest() throws InterruptedException {
		demoQaHomePage=new DemoQaHomePage(driver);
		demoQaHomePage.alertsFramesWindowsLinkClick();
		System.out.println(driver.getCurrentUrl());
		browserWindowsPage=new BrowserWindowsPage(driver);
		browserWindowsPage.browserWindowsLinkClick();
		System.out.println(driver.getCurrentUrl());
		String mainWindowhandle=driver.getWindowHandle();
		System.out.println(mainWindowhandle);
		browserWindowsPage.newTabButtonClick();
		browserWindowsPage.newWindowButtonClick();
		browserWindowsPage.messageWindowButtonkClick();
		
		

}}
