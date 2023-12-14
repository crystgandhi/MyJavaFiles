package demoQaTests;

import java.util.*;

import org.testng.annotations.Test;

import demoQaPageObjects.DemoQaHomePage;
import demoQaPageObjects.ElementsPage;
import demoQaPageObjects.LinksPage;

public class LinksTest extends DemoQaBaseClass {

	ElementsPage elementsPage;
	DemoQaHomePage demoQaHomePage;
	LinksPage links;

	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		elementsPage = new ElementsPage(driver);
		links = new LinksPage(driver);
		demoQaHomePage.elementsLinkClick();
		elementsPage.elements_LinkClick();
		System.out.println(links.getNewTabOpenText());
		links.checkLinks();

		// Get the handle of the main window
		String mainWindowHandle = driver.getWindowHandle();
		System.out.println("Main window : " + mainWindowHandle);
		// Perform actions that open a new window or pop-up
		// Switch to the new window
		links.clickHomeLink();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> handlesIt = handles.iterator();
		while (handlesIt.hasNext()) {
			String Window = handlesIt.next().toString();
			System.out.println(Window);
			if (!Window.equals(mainWindowHandle)) {
				// After performing actions on the new window, switch back to the main window
				driver.switchTo().window(mainWindowHandle);
			}
		}
		links.clickHomeDynamicLink();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(links.getlinksSendAPICallText());
		
		links.createdLinkClick();
		System.out.println(links.getLinkResponse());
		links.noContentLinkClick();
		System.out.println(links.getLinkResponse());
		links.movedLinkClick();
		System.out.println(links.getLinkResponse());
		links.badRequestLinkClick();
		System.out.println(links.getLinkResponse());
		links.unauthorizedLinkClick();
		System.out.println(links.getLinkResponse());
		links.forbiddenLinkClick();
		System.out.println(links.getLinkResponse());
		links.invalid_urlLinkClick();
		System.out.println(links.getLinkResponse());
	}
}
