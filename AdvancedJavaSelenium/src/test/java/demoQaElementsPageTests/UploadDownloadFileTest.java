package demoQaElementsPageTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.BrokenLinkPage;
import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageObjects.ElementsPage;
import demoQaElementsPageObjects.UploadDownloadPage;

public class UploadDownloadFileTest extends DemoQaBaseClass{
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	UploadDownloadPage uploadDownloadFile;

	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		elementsPage = new ElementsPage(driver);
		uploadDownloadFile=new UploadDownloadPage(driver);
		demoQaHomePage.elementsLinkClick();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementsPage.uploadAndDownloadLinkClick();
		uploadDownloadFile.getSelectFileText();
		uploadDownloadFile.clickDownLoadLinkBtn();
		uploadDownloadFile.clickUpLoadLinkBtn();

}}
