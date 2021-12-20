package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginPage;


public class LoginPageTest extends Baseclass {
	
	@Parameters({"Email","Password"})
	@Test
	public void LoginTest(String EmailVal,String PasswordVal) {
		
		LoginPage Login = new LoginPage();
		Login.login(EmailVal, PasswordVal);
		Login.verify();
		
		
	}
	

}
