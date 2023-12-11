package seleniumAdvanced;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomInAndZoomOut {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
        JavascriptExecutor js=(JavascriptExecutor)driver;
        
        js.executeScript("document.body.style.zoom='200%'");
        
        synchronized (driver) {
			try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
        js.executeScript("document.body.style.zoom='40%'");
        synchronized (driver) {
        	try {
				driver.wait(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
        js.executeScript("document.body.style.zoom='100%'");
        WebElement element=driver.findElement(By.id("username"));
        js.executeScript("arguments[0].style.background='yellow'", element);
        js.executeScript("arguments[0].style.border='3px solid red'", element);
        driver.close();
	}

}
