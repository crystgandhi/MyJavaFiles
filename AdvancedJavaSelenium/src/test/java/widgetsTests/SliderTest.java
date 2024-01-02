package widgetsTests;

import org.testng.annotations.Test;

import demoQaElementsPageObjects.DemoQaHomePage;
import demoQaElementsPageTests.DemoQaBaseClass;
import widgetsPageObjects.SliderPage;

public class SliderTest extends DemoQaBaseClass{
	
	
   DemoQaHomePage demoQaHomePage;
   SliderPage sliderPage;
	
	@Test
	public void elementsPageTextBoxTest() {
		demoQaHomePage = new DemoQaHomePage(driver);
		demoQaHomePage.wigetsLinkClick();
		System.out.println(driver.getCurrentUrl());
		sliderPage=new SliderPage(driver);
		sliderPage.sliderLinkClick();
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(sliderPage.rangeSLiderCheck());
		sliderPage.moveToolTipArrow();
		System.out.println(sliderPage.getSliderValue());
}}
