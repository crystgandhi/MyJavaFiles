package widgetsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;
import widgetsPageObjects.AccordianPage;
import widgetsPageObjects.ToolTipsPage;

public class ToolTipsTest extends DemoQaBaseClass{
	
	DemoQaHomePage demoQaHomePage;
	ToolTipsPage toolTipsPage;
	
	  	@Test
		public void elementsPageTextBoxTest() throws InterruptedException {
			demoQaHomePage = new DemoQaHomePage(driver);
			demoQaHomePage.wigetsLinkClick();
			System.out.println(driver.getCurrentUrl());
			toolTipsPage=new ToolTipsPage(driver);
			toolTipsPage.toolTipsLinkClick();
			System.out.println(driver.getCurrentUrl());
			System.out.println(toolTipsPage.getPracticeToolTipsText());
			toolTipsPage.toolTIpButton();
			System.out.println(toolTipsPage.toolTIpButton());
			System.out.println(toolTipsPage.toolTIpTextField());
			System.out.println(toolTipsPage.toolTIpContrary());
			System.out.println(toolTipsPage.toolTIpsection11032());
	}
}