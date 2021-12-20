package tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.AfterLoginPages;
import pages.LoginPage;


public class AfterLoginTest extends Baseclass {

	
	@Parameters({"Email","Password"})
	@Test
	public void afterLogin(String EmailVal,String PasswordVal) {
		AfterLoginPages AfterLogin = new AfterLoginPages();
		AfterLogin.afterlogin(EmailVal, PasswordVal);
		
		
	}

}