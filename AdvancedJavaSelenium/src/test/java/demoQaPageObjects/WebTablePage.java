package demoQaPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage {

	
	// WebDriver instance to interact with the browser
		public WebDriver driver;

		// Constructor to initialize the WebDriver and PageFactory
		public WebTablePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "//button[@id='addNewRecordButton']")
		WebElement addBtn;
		public void clickAddBtn() {
			addBtn.click();
		}
		@FindBy(xpath = "/html/body/div[4]/div/div")
		WebElement window;
		public boolean windowOpened() {
			return window.isDisplayed();
		}
		@FindBy(xpath = "//div[@id='registration-form-modal']")
		WebElement registrationForm;
		public String checkRegistrationFormHeading() {
			return registrationForm.getText();
		}
		
		@FindBy(xpath = "//input[@id='firstName']")
		WebElement firstName;
		@FindBy(xpath = "//input[@id='lastName']")
		WebElement lastName;
		@FindBy(xpath = "//input[@id='userEmail']")
		WebElement userEmail;
				@FindBy(xpath = "//input[@id='age']")
		WebElement age;
		@FindBy(xpath = "//input[@id='salary']")
		WebElement salary;
		@FindBy(xpath = "//input[@id='department']")
		WebElement department;
		@FindBy(xpath = "//button[@id='submit']")
		WebElement submit;
		
		public void enterEmployeeInformation(String fName, String lName, String email, String empAge,String salry,String dept) {
			firstName.sendKeys(fName);
			lastName.sendKeys(lName);
			userEmail.sendKeys(email);
			age.sendKeys(empAge);
			salary.sendKeys(salry);
			department.sendKeys(dept);
			submit.click();
		}
		
		
		
		
		
		
		
		
}
