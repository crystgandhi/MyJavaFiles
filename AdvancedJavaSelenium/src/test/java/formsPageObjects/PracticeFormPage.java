package formsPageObjects;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeFormPage {
	
	// WebDriver instance to interact with the browser
	public WebDriver driver;

	// Constructor to initialize the WebDriver and PageFactory
	public PracticeFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[normalize-space()='Practice Form']")
	WebElement practiceFormsLink;
	
	public void practiceFormsLInkClick() {
		practiceFormsLink.click();
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(css="#lastName")
	WebElement lastNmae;
	@FindBy(css="input[id='userEmail']")
	WebElement email;
	@FindBy(xpath="//label[@for='gender-radio-2']")
	WebElement gender;
	//label[@for='gender-radio-2']
	//label[@for='gender-radio-3']
	@FindBy(id="userNumber")
	WebElement phoneNumber;
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	WebElement dateOfBirth;
	@FindBy(xpath="//select[contains(@class,'react-datepicker__month-select')]")
	WebElement monthdd;
	
	@FindBy(xpath="//select[@class='react-datepicker__year-select']")
	WebElement yeardd;
	@FindBy(xpath="//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div[6]")
	WebElement date;
	@FindBy(xpath = "//*[@id='subjectsContainer']/div/div[1]")
	WebElement subjects;
	@FindBy(xpath = "//*[@for='hobbies-checkbox-3']")
	WebElement hobbies;
	//label[@for='hobbies-checkbox-2']
	//label[@for='hobbies-checkbox-3']
	@FindBy(id="uploadPicture")
	WebElement upLoadPicture;
	@FindBy(xpath="//textarea[@id='currentAddress']")
	WebElement currentAddress;
	
	@FindBy(xpath="//*[@id='state']")
	WebElement state;
	@FindBy(id="city")
	WebElement city;
	@FindBy(xpath="//*[@id='submit']")
	WebElement submitBtn;
	
public void enterUserInformation() {
	firstName.sendKeys("John");
	lastNmae.sendKeys("Smith");
	email.sendKeys(RandomStringUtils.randomAlphanumeric(5)+"@gmail.com");
	gender.click();
	phoneNumber.sendKeys("9198885959");
	dateOfBirth.click();
	Select selectmonth =new Select(monthdd);
	selectmonth.selectByIndex(1);
	Select selectyear=new Select(yeardd);
	selectyear.selectByValue("2008");
	date.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].value='Technology'", subjects);
	//subjects.sendKeys("Technology");
	hobbies.click();
	upLoadPicture.sendKeys("C://Users//Nikil//Desktop//Files//configurator-custom.jpg");
	currentAddress.sendKeys("1131, Church street");
	
	js.executeScript("arguments[0].scrollIntoView();", state);
	js.executeScript("document.getElementById('state').value='NCR';");
	js.executeScript("document.getElementById('city').value='NewDelhi';");
	js.executeScript("arguments[0].scrollIntoView();", submitBtn);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
	submitBtn.click();
		
	}

}
