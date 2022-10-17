package testPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
	WebDriver driver;
	@BeforeMethod
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=4sni33n1d71lj");
	}

	@Test
	public void testLogin() throws InterruptedException 
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(6000);
		driver.findElement(By.id("loginButton")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
}