package demoQaTests;

import org.testng.annotations.Test;

import demoQaPageObjects.DemoQaHomePage;
import demoQaPageObjects.BrokenLinkPage;
import demoQaPageObjects.ElementsPage;

public class BrokenLinksImagesTest extends DemoQaBaseClass{
	
	
	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	BrokenLinkPage brokenLinks;
	

	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		elementsPage = new ElementsPage(driver);
		brokenLinks=new BrokenLinkPage(driver); 
		demoQaHomePage.elementsLinkClick();
		elementsPage.brokenLinkClick();
		System.out.println(brokenLinks.getValidImageText());
		System.out.println(brokenLinks.checkValidImage());
		System.out.println(brokenLinks.getBrokenImageText());
		System.out.println(brokenLinks.checkBrokenImage());
		System.out.println(brokenLinks.getValidLinkText());
		String page1=driver.getCurrentUrl();
		System.out.println(page1);
		brokenLinks.clickValidLink();
		String page2=driver.getCurrentUrl();
		System.out.println(page2);
		driver.navigate().back();
		System.out.println(brokenLinks.getBrokenLinkText());
		brokenLinks.clickBrokenLink();
		String page3=driver.getCurrentUrl();
		System.out.println(page3);
		driver.navigate().back();
		
}}
