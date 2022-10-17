package com.crm.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;
import com.crm.ObjectRepository.ProductCreationLink;
import com.crm.ObjectRepository.ValidationandVerificationPage1;

import junit.framework.Assert;

public class DeleteProduct extends BaseClass {
@Test(groups = {"smokeTest"})
	public void DeleteProductTest() throws Throwable {
//		String key="webdriver.chrome.driver";
//		String value="./drivers/chromedriver.exe";
//		System.setProperty(key, value);
//		WebDriver driver=new ChromeDriver();
	WebDriver_Utility wlib = new WebDriver_Utility();
	wlib.waitForPageToLoad(driver);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		FileInputStream fis = new FileInputStream("./config.properties");
		File_Utility flib = new File_Utility();
//		String URL = flib.getPropertyKeyValue("url");
//		String UserName = flib.getPropertyKeyValue("un");
//		String PassWord = flib.getPropertyKeyValue("pw");
//		driver.get(URL);
		LoginPage lp = new LoginPage(driver);
//		lp.login(UserName, PassWord);
		//		driver.findElement(By.name("user_name")).sendKeys(UserName);
		//		driver.findElement(By.name("user_password")).sendKeys(PassWord);
		//		driver.findElement(By.i;mitButton")).click();

		HomePage hp = new HomePage(driver);
		hp.clickOnProductLinkText(driver);
		//driver.findElement(By.xpath("//a[text()='Products']")).click();
		ProductCreationLink pcreate = new ProductCreationLink(driver);
		pcreate.ClickOnCreateProductImg();
		//driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();

		Java_Utility jlib = new Java_Utility();
		int ranNum = jlib.getRandomNum();
		Excel_Utility elib = new Excel_Utility();
		String data = elib.getDataFromExcel("Organization", 0, 0)+ranNum;
		pcreate.ClickOnProductNameTextField(data);
//		Assert.assertEquals(false, true);
		pcreate.ClickOnSaveButton();
		//		driver.findElement(By.name("productname")).sendKeys(data);
		//		driver.findElement(By.name("button")).click();

		ValidationandVerificationPage1 val=new ValidationandVerificationPage1();
		val.productValidation(driver, data);
//
//		String actData = driver.findElement(By.cssSelector("span.lvtHeaderText")).getText();
//
//		if(actData.contains(data))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		pcreate.ClickOnDeleteButton();
		//driver.findElement(By.xpath("//input[@title='Delete [Alt+D]']")).click();
//		WebDriver_Utility wlib = new WebDriver_Utility();
//		wlib.acceptConfirmationPopup();
          Alert al = driver.switchTo().alert();
          al.accept();
	//	hp.signOutHomePage(driver);
		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();





	}


}
