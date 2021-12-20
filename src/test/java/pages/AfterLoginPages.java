package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentTest;

import tests.Baseclass;

public class AfterLoginPages {
	WebDriver driver = Baseclass.driver;
	ExtentTest test = Baseclass.test;

	//*************************WebElements**********************
	@FindBy(linkText="Home")
	WebElement Home;
	
	@FindBy(linkText="Login/Signup")
	WebElement SignBtn;
	
	@FindBy(css="input[name*='email_id']")
	WebElement email;
	
	@FindBy(css="input[name*='pwd']")
	WebElement password;
	
	@FindBy(css="button")
	WebElement LoginFinal;
	
	@FindBy(css="h3")
	WebElement Header;
	
	@FindBy(css="a[href*='cartadditem?id=2']")
	WebElement Item1;

	
	@FindBy(css="a[href*='cartadditem?id=5']")
	WebElement Item2;
	
	@FindBy(linkText="Checkout Now")
	WebElement CheckOut;
	
	@FindBy(linkText="Pay via secure Payment Gateway")
	WebElement PayNow;
	
	@FindBy(linkText="Click to complete checkout")
	WebElement CompleteNow;
	

	public AfterLoginPages() {
		PageFactory.initElements(driver, this);
	}

	public void afterlogin(String EmailVal,String PasswordVal) {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(Home));
		SignBtn.click();
		email.sendKeys(EmailVal);
		password.sendKeys(PasswordVal);
		LoginFinal.click();
		Home.click();
		Item1.click();
		Home.click();
		Item2.click();
		CheckOut.click();
		PayNow.click();
		CompleteNow.click();
	}
	
	public void CartVarify() {
		
	}
}