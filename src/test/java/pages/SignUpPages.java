package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import tests.Baseclass;

public class SignUpPages {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;


	//*************************WebElements**********************
	@FindBy(linkText="Login/Signup")
	WebElement SignBTN;
	
	@FindBy(linkText="Not a member? Signup")
	WebElement SignUpLink;
	
	@FindBy(css="input[name*='email_id']")
	WebElement Email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement Password;
	
	@FindBy(css="input[name*='pwd2']")
	WebElement ConfirmPWD;
	
	@FindBy(css="input[name*='fname']")
	WebElement FirstName;
	
	@FindBy(css="input[name*='lname']")
	WebElement LastName;
	
	@FindBy(css="input[name*='age']")
	WebElement Age;
	
	@FindBy(css="input[name*='address']")
	WebElement Address;
	
	@FindBy(css="button")
	WebElement SignUpFinal;
	
	public SignUpPages() {
		PageFactory.initElements(driver, this);
	}

	public void signup(String Emailval,String Passwordval,String FirstNameval,String LastNameval,String Ageval,String Addressval) {
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(SignBTN));
		SignBTN.click();
		SignUpLink.click();
		Email.sendKeys(Emailval);
		Password.sendKeys(Passwordval);
		ConfirmPWD.sendKeys(Passwordval);
		FirstName.sendKeys(FirstNameval);
		LastName.sendKeys(LastNameval);
		Age.sendKeys(Ageval);
		Address.sendKeys(Addressval);
		SignUpFinal.click();

	}

}