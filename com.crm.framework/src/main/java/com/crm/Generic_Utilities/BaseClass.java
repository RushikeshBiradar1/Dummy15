package com.crm.Generic_Utilities;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.crm.ObjectRepository.HomePage;
import com.crm.ObjectRepository.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver sDriver;

	@BeforeSuite(groups = {"regressionTest","smokeTest"})
	public void BS()
	{
		System.out.println("DataBase Connection");
	}
	@BeforeTest(groups = {"regressionTest","smokeTest"})
	public void BT()
	{
		System.out.println("Excute in parallel mode");
	}
	
	//Open The Browser
//	@Parameters("BROWSER")
	@BeforeClass(groups = {"regressionTest","smokeTest"})
//	public void BC(String BROWSER) throws Throwable
	public void BC() throws Throwable
	{
		File_Utility flib = new File_Utility();
	//	FileInputStream fis=new FileInputStream("./Config.properties");
		FileInputStream fis = new FileInputStream(iPathConstant.PropertyFile_Path);

		String BROWSER	 = flib.getPropertyKeyValue("browser");
		  if(BROWSER.equalsIgnoreCase("chrome"))
		        {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();

		  }
		   else if(BROWSER.equalsIgnoreCase("firefox"))
		  {
		   WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		  }
		  else if(BROWSER.equalsIgnoreCase("opera"))
		   {
		   WebDriverManager.edgedriver().setup();
		    driver = new EdgeDriver();
		   }
		   else
		   {
			   WebDriverManager.chromedriver().setup();
		     driver = new ChromeDriver();
		     }	
//		  sDriver=driver;
	}
	
	// Login to The Application
	@BeforeMethod(groups = {"regressionTest","smokeTest"})
	public void BM() throws Throwable
	{		
		FileInputStream fis=new FileInputStream(iPathConstant.PropertyFile_Path);
		File_Utility flib = new File_Utility();

		  String URL = flib.getPropertyKeyValue("url");
		  String UserName = flib.getPropertyKeyValue("un");
		  String PassWord = flib.getPropertyKeyValue("pw");
		  driver.get(URL);
		  
		  LoginPage lp = new LoginPage(driver);
		  lp.login(UserName, PassWord);
	}
	
	//LogOut to the Applocation
	@AfterMethod(groups = {"regressionTest","smokeTest"})
	public void AM()
	{
		HomePage hp = new HomePage(driver);
		hp.ClickOnMoreLinkText();
		  hp.signOutHomePage(driver);
	}
	
	// Close the Browser
	@AfterClass(groups = {"regressionTest","smokeTest"})
	public void AC()
	{
          driver.close();
	}
	@AfterTest(groups = {"regressionTest","smokeTest"})
	public void AT()
	{
		System.out.println("Excuted Sucessfully");
	}
	@AfterSuite(groups = {"regressionTest","smokeTest"})
	public void AS()
	{
		System.out.println("DataBase Close");
	}


}
