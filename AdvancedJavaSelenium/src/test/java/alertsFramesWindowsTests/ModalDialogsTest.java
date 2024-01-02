package alertsFramesWindowsTests;

import org.testng.annotations.Test;

import alertsFramesWindowsPageObects.BrowserWindowsPage;
import alertsFramesWindowsPageObects.ModalDialogsPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;

public class ModalDialogsTest extends DemoQaBaseClass{
	
	DemoQaHomePage demoQaHomePage;
	ModalDialogsPage modalDialogsPage;
	@Test
	public void alertsTest() throws InterruptedException {
		demoQaHomePage=new DemoQaHomePage(driver);
		demoQaHomePage.alertsFramesWindowsLinkClick();
		System.out.println(driver.getCurrentUrl());
		modalDialogsPage=new ModalDialogsPage(driver);
		modalDialogsPage.modalDialogsLinkClick();
		System.out.println(driver.getCurrentUrl());
		modalDialogsPage.smallModalClick();
		modalDialogsPage.smallModelDialogCloseClcik();
		modalDialogsPage.largeModalClick();
		modalDialogsPage.largeModelDialogCloseClcik();
		

}}
