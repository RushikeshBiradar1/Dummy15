package testpackage;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import generic.WebDriverCommonLib;
import pagepackage.LoginPage;
import pagepackage.UsersPage;

public class TestActiTimeCreateUser extends BaseTest {
	
	@Test
	public void createUserActiTime() throws IOException, InterruptedException, AWTException
	{
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readDataFromPropertyFile(PROP_PATH,"username"), flib.readDataFromPropertyFile(PROP_PATH,"password"));
		
		UsersPage up = new UsersPage(driver);
		up.clickOnusersTab();
		Thread.sleep(3000);
		up.createUserAccount("maheshpbiradar","mahesh789","mahesh789","mahesh","biradar");
		Thread.sleep(3000);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.textToBePresentInElement(up.getsuccessmsg(),"created"));
		up.clickOnusersTab();
		up.deieteTheCreatedUser();
		
		WebDriverCommonLib wb = new WebDriverCommonLib();
		wb.hitTheEnterButton();
		
		
	}

}
