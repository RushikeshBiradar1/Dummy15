package com.crm.Campaign;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseTestMethod;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductCreationLink;
import com.crm.ObjectRepository.createCampaign;
import com.crm.ObjectRepository.createCampaignWithProduct;

public class CreateCampignWithProductTest extends BaseClass {
	@Test(groups = {"regressionTest","smokeTest"})
	public void CreateCampignWithProductTest()  throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./config.properties");
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		File_Utility flib = new File_Utility();
		
		
//		String URL = flib.getPropertyKeyValue("url");
//		String UserName = flib.getPropertyKeyValue("un");
//		String PassWord = flib.getPropertyKeyValue("pw");
//		driver.get(URL);
		
		LoginPage lp = new LoginPage(driver);
		//lp.login(UserName, PassWord);
		HomePage hp = new HomePage(driver);
		hp.clickOnProductLinkText(driver);
		ProductCreationLink pcreate = new ProductCreationLink(driver);
		
		pcreate.ClickOnCreateProductImg();
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();
		Excel_Utility elib = new Excel_Utility();
		String pdata = elib.getDataFromExcel("Organization", 0, 0)+ranNum;
		pcreate.ClickOnProductNameTextField(pdata);
		pcreate.ClickOnSaveButton();
		
		hp.ClickOnMoreLinkText();
		hp.ClickOnCampaignLinkText();
	createCampaignWithProduct ccwp = new createCampaignWithProduct(driver);
	   ccwp.clickCampaignCreateImage();
	   ccwp.ClickOnproductAddImg();
		//WebDriver_Utility wlib = new WebDriver_Utility();
		
		ccwp.getWindowhandleToChildBrowser(driver);
		ccwp.ClickOnSearchBoxProduct(pdata);
     	ccwp.ClickOnSearchButton();
     	driver.findElement(By.xpath("//a[text()='"+pdata+"']")).click();
     	ccwp.getWindowhandleToParentBrowser(driver);
     	String cdata = elib.getDataFromExcel("Campaign", 0, 0)+ranNum;
     	ccwp.ClickOnCampaignNameTextField(cdata);
     	ccwp.clickOnSaveButton();
     	//hp.signOutHomePage(driver);
     		

	}

}
