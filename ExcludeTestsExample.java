package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcludeTestsExample {
	WebDriver driver= new ChromeDriver();
	@BeforeTest
	public void launchApplication() {
		driver.get("https://www.saucedemo.com/");
	}
	@Test(priority=0)
	public void validCredentialsLogin() throws InterruptedException {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
	}
	@Test(priority=0)
	public void inValidCredentialsLogin() {
		driver.findElement(By.cssSelector("#user-name")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String errormessage=
		driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
		System.out.println(errormessage);
	}
	@Test(priority=1)
	public void logOut() throws InterruptedException {
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}
	@AfterTest
	public void closeApplication() {
		driver.quit();
	}
}
