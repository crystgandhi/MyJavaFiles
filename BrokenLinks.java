package testNGTests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BrokenLinks {

	@Test
	public void brokenLinks() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.safeway.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String titleBySW = driver.getTitle();
		Thread.sleep(3000);
		System.out.println(titleBySW);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String titleByJS = (String) js.executeScript("return document.title");
		Assert.assertEquals(titleBySW, titleByJS);
		System.out.println(titleBySW);
		System.out.println(titleByJS);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberOfLinks = links.size();
		System.out.println(numberOfLinks);
		Iterator<WebElement> it = links.iterator();
		while (it.hasNext()) {
			String url = it.next().getAttribute("href");
			if ((url == null) || (url.isEmpty())) {
				System.out.println("url is empty");
			}
			HttpURLConnection huc;
			try {
				huc = (HttpURLConnection) (new URL(url).openConnection());
				huc.connect();
				if (huc.getResponseCode() >= 400) {
					System.out.println(url + " is broken");
				} else {
					System.out.println(url + " is valid");
				}
			} catch (MalformedURLException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) { // TODO Auto-generated catch
				e.printStackTrace();
			}

		}

	}

}
