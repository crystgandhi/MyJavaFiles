package alertsFramesWindowsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import alertsFramesWindowsPageObects.FramesPage;
import alertsFramesWindowsPageObects.NestedFramesPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;

public class NestedFramesTest extends DemoQaBaseClass{
	
	DemoQaHomePage demoQaHomePage;
	NestedFramesPage nestedFramesPage;

	@Test
	public void alertsTest() throws InterruptedException {
		demoQaHomePage = new DemoQaHomePage(driver);
		demoQaHomePage.alertsFramesWindowsLinkClick();
		Assert.assertEquals("DEMOQA", driver.getTitle());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		nestedFramesPage=new NestedFramesPage(driver);
		nestedFramesPage.nestedFramesLinkClick();
		System.out.println(driver.getCurrentUrl());
		System.out.println(nestedFramesPage.getFrameInformationText());
		nestedFramesPage.moveToParentFrame();
		System.out.println(nestedFramesPage.getparentFrameText());
		nestedFramesPage.moveToMainWindow(); 
		nestedFramesPage.moveToChildFrame();
		//System.out.println(nestedFramesPage.getChildFrameText());
		
}}
