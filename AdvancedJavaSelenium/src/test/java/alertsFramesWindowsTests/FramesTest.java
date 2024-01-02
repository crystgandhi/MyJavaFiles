package alertsFramesWindowsTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import alertsFramesWindowsPageObects.FramesPage;
import alertsFramesWindowsPageObects.ModalDialogsPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;

public class FramesTest extends DemoQaBaseClass {

	DemoQaHomePage demoQaHomePage;
	FramesPage framesPage;

	@Test
	public void alertsTest() throws InterruptedException {
		demoQaHomePage = new DemoQaHomePage(driver);
		demoQaHomePage.alertsFramesWindowsLinkClick();
		System.out.println(driver.getTitle());
		Assert.assertEquals("DEMOQA", driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		framesPage = new FramesPage(driver);
		framesPage.framesLinkClick();
		System.out.println(driver.getCurrentUrl());
		System.out.println(framesPage.getFramesDescriptionText());
		System.out.println(framesPage.frame1Existing());
		framesPage.moveToFrame1();
		System.out.println(framesPage.getFrame1Text());
		framesPage.moveToMainWindow();
		System.out.println(framesPage.frame2Existing());
		framesPage.moveToFrame2();
	    System.out.println(framesPage.getFrame2Text());
	    framesPage.scrollToTheBottom();
		

	}

}
