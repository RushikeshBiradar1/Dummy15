package com.crm.Campaign;

import java.io.FileInputStream;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ValidationandVerificationPage1;
import com.crm.ObjectRepository.createCampaign;

import junit.framework.Assert;

public class CreateCampaignTest extends BaseClass {

//	@Test(groups = {"regressionTest"})
	public void CreateCampaignTest() throws Throwable {

		//		String Key="webdriver.chrome.driver";
		//		String value="./drivers/chromedriver.exe";
		//		System.setProperty(Key, value);
		//		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
//		FileInputStream fis=new FileInputStream("./Config.properties");
		File_Utility flib = new File_Utility();
		LoginPage lp = new LoginPage(driver);

		//		String URL = flib.getPropertyKeyValue("url");
		//		String UserName = flib.getPropertyKeyValue("un");
		//		String PassWord = flib.getPropertyKeyValue("pw");
		//driver.get(URL);

		/**Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String UserName = pro.getProperty("un");
		String PassWord = pro.getProperty("pw");
		driver.get(URL);**/

		//lp.login(UserName, PassWord);
		//		driver.findElement(By.name("user_name")).sendKeys(UserName);
		//		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		//		driver.findElement(By.id;itButton")).click();

		HomePage hp = new HomePage(driver);
		hp.getMorelink().click();
		hp.getCampaignlinkText().click();
		
	
		//		driver.findElement(By.linkText("More")).click();
		//		driver.findElement(By.linkText("Campaigns")).click();
		createCampaign cCamp = new createCampaign(driver);
		cCamp.clickCampaignCreateImage();
//		Assert.assertEquals(false, true);
		//driver.findElement(By.xpath("//img[@alt='Create Campaign...']")).click();

		//		Random ran =new Random();
		//		int RanNum = ran.nextInt(1000);


		Excel_Utility elib = new Excel_Utility();
		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();    
		String data = elib.getDataFromExcel("Campaign", 0, 0)+ranNum;

		/**Workbook book=WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet("Campaign");
		Row row = sh.getRow(0);
		Cell cel = row.getCell(0);
		String data = cel.getStringCellValue()+RanNum;**/
		
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals("A", "A");
		
		
		cCamp.clickOnOrganizationTextField(data);
		// driver.findElement(By.name("campaignname")).sendKeys(data);
		cCamp.clickOnSaveButton();
		//driver.findElement(By.name("button")).click();

		
		ValidationandVerificationPage1 val=new ValidationandVerificationPage1();
		val.organisationValidation(driver, data);
//		String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
//		if(actData.contains(data))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}

//		hp.signOutHomePage(driver);
//		soft.assertAll();

		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

	}
	/**@Test
	public void modify()
	{
		System.out.println("modified");
	}**/

}

