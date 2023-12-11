package seleniumAdvanced;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItTool {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		WebElement element = driver.findElement(By.xpath("//button[text()='Choose']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
		Thread.sleep(3000);
		String autoItScriptPath = "./AutoItFiles\\Upload.exe";
		try {
			Runtime.getRuntime().exec(autoItScriptPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
