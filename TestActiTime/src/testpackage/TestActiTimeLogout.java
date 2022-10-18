package testpackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.HomePage;
import pagepackage.LoginPage;

public class TestActiTimeLogout extends BaseTest {
	@Test
	public void testActiTimeLogout() throws IOException 
	{
		//object creation
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		//method calling
		lp.validLoginActiTime(flib.readDataFromPropertyFile(PROP_PATH, "username"),flib.readDataFromPropertyFile(PROP_PATH, "password"));
		
		HomePage hp = new HomePage(driver);
		hp.logoutActitime();
		
	}

}
