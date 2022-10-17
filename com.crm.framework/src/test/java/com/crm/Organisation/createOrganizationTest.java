package com.crm.Organisation;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.OrganizationCreateLink;
import com.crm.ObjectRepository.ValidationandVerificationPage1;

import junit.framework.Assert;


@Listeners(com.crm.Generic_Utilities.Listeners.class)
public class createOrganizationTest extends BaseClass {
	@Test(groups = {"smokeTest"})
	public void createOrganizationTest() throws Throwable {
		File_Utility flib = new File_Utility();
              WebDriver_Utility wlib = new WebDriver_Utility();
              wlib.waitForPageToLoad(driver);;
		  

 //		  driver.findElement(By.name("user_name")).sendKeys(UserName);
//		  driver.findElement(By.name("user_password")).sendKeys(PassWord);
//		  driver.findElement(By.id("submitButton")).click();
//		  
		  HomePage hp = new HomePage(driver);
		  hp.clickOnOrgamization(driver);
		 // driver.findElement(By.linkText("Organizations")).click();
		  OrganizationCreateLink org = new OrganizationCreateLink(driver);
		  org.ClickOnOrganizationCreateImg();
		  //driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		 
		  Java_Utility jlib = new Java_Utility();
		  int ranNum = jlib.getRandomNum();
		  
		  Excel_Utility elib = new Excel_Utility();
		 // String data = elib.getDataFromExcel("Organization", 0, 0);
		  
		  String data = elib.getDataFromExcel("Organization", 0, 0)+ranNum;
//		  SoftAssert soft = new SoftAssert();
//		  soft.assertEquals("A", "B");
		  Assert.assertEquals(true, false);
		  org.ClickOnOrganizationNameTextField(data);
		  org.ClickOnSaveButton();
//		  driver.findElement(By.name("accountname")).sendKeys(data);
//		  driver.findElement(By.name("button")).click();
		  

		  ValidationandVerificationPage1 val=new ValidationandVerificationPage1();
		  val.organisationValidation(driver, data);
//		  String actData = driver.findElement(By.cssSelector("span.dvHeaderText")).getText();
//		  if (actData.contains(data))
//		  {
//			System.out.println("pass");
//		  }
//		  else
//		  {
//			  System.out.println("fail");
//		  }
//		  hp.signOutHomePage(driver);
//		  soft.assertAll();
//		  driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
//		  driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		  
	}
	/**@Test
	public void edit()
	{
		System.out.println("edited");
	}**/

}
