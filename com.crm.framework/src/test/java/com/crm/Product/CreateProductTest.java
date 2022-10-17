package com.crm.Product;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Generic_Utilities.BaseClass;
import com.crm.Generic_Utilities.Excel_Utility;
import com.crm.Generic_Utilities.File_Utility;
import com.crm.Generic_Utilities.Java_Utility;
import com.crm.Generic_Utilities.WebDriver_Utility;
import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.ProductCreationLink;
import com.crm.ObjectRepository.ValidationandVerificationPage1;

import junit.framework.Assert;

//@Listeners(com.crm.Generic_Utilities.Listeners.class)
public class CreateProductTest extends BaseClass {
	@Test(groups = {"regressionTest"})
	public void CreateProductTest() throws Throwable {
		//		 String key="webdriver.chrome.driver";
		//		 String value="./drivers/chromedriver.exe";
		//
		//		System.setProperty(key, value);
		//		WebDriver driver=new ChromeDriver();

		//		driver.manage().window().maximize();
		//		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.waitForPageToLoad(driver);
		//wlib.maximizeTheBrowser();
		File_Utility flib = new File_Utility();
		HomePage hp = new HomePage(driver);
		//		String url = flib.getPropertyKeyValue("url");
		//		driver.get(url);
		//
		//		String username = flib.getPropertyKeyValue("un");
		//		String password = flib.getPropertyKeyValue("pw");
		//		LoginPage lp = new LoginPage(driver);
		//		lp.login(username, password);

		//		driver.findElement(By.name("user_name")).sendKeys(username);
		//		driver.findElement(By.name("user_password")).sendKeys(password);
		//		driver.findElement(By.id("submitButton")).click();

		hp.clickOnProductLinkText(driver);
		//driver.findElement(By.xpath("//a[text()='Products']")).click();

		ProductCreationLink pcreate = new ProductCreationLink(driver);
		pcreate.ClickOnCreateProductImg();

		//driver.findElement(By.xpath("//img[@title='Create Product...']")).click();

		Java_Utility jlib=new Java_Utility();
		int ranNum = jlib.getRandomNum();



		Excel_Utility elib = new Excel_Utility();
		String productName = elib.getDataFromExcel("product", 0, 0)+ranNum;

		pcreate.ClickOnProductNameTextField(productName);
//		Assert.assertEquals(false, true);
		ValidationandVerificationPage1 val=new ValidationandVerificationPage1();
		val.productValidation(driver, productName);
		//		WebElement prodName = driver.findElement(By.xpath("//input[@name='productname']"));
		//		prodName.sendKeys(productName);

		pcreate.ClickOnSaveButton();
		//driver.findElement(By.xpath("(//input[@accesskey='S'])[1]")).click();

		
		pcreate.ClickOnDeleteButton();
		//driver.findElement(By.xpath("(//input[@accesskey='D'])[1]")).click();
		//  WebDriver_Utility wlib = new WebDriver_Utility();
//wlib.acceptConfirmationPopup();
		Alert al = driver.switchTo().alert();
		al.accept();
		//hp.signOutHomePage(driver);
		//		driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
		//		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();

		//driver.quit();

	}

}
