package testpackage;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagepackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {

	@Test
	public void validLogin() throws IOException
	{
		//object creation
		LoginPage lp = new LoginPage(driver);
		Flib flib=new Flib();
		
		//method calling
		lp.validLoginActiTime(flib.readDataFromPropertyFile(PROP_PATH,"username"),flib.readDataFromPropertyFile(PROP_PATH,"password"));
	}

}
