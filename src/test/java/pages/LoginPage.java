package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;

import tests.Baseclass;

public class LoginPage {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;
	
	//*************************WebElements**********************
	@FindBy(linkText="Login/Signup")
	WebElement SignBTN;
	
	@FindBy(css="input[name*='email_id']")
	WebElement Email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement Password;
	
	@FindBy(css="button")
	WebElement LoginFinal;
	
	@FindBy(css="h3")
	WebElement Header;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String EmailVal,String PasswordVal) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(SignBTN));
		SignBTN.click();
		Email.sendKeys(EmailVal);
		Password.sendKeys(PasswordVal);
		LoginFinal.click();
	}
	
	public void verify() {
		String ExpText = "SPORTY SHOES - DASHBOARD";
		String ActualText = Header.getText();
		Assert.assertEquals(ActualText, ExpText);
	}
	

}