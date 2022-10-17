package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	@Test(dataProvider="DataProvider_Test")
	public void companyDetails(String name, String Pcode, String vendorName) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.linkText("Products")).click();
		driver.findElement(By.xpath("//img[@alt='Create Product...']")).click();
		driver.findElement(By.name("productname")).sendKeys(name);
		driver.findElement(By.name("productcode")).sendKeys(Pcode);
		driver.findElement(By.name("vendor_name")).sendKeys(vendorName);
		driver.findElement(By.name("button")).click();
		driver.quit();
		Thread.sleep(3000);
	}
	
	     @DataProvider
		public Object[][]DataProvider_Test()
		{
	    	 Object[][] objarr=new Object[3][3];
	    	 objarr[0][0]="Honda";
	    	 objarr[0][1]="2735";
	    	 objarr[0][2]="sjgekfe";
	    	 
	    	 objarr[1][0]="kghef";
	    	 objarr[1][1]="sjdhfjke";
	    	 objarr[1][2]="sdj";
	    	 
	    	 objarr[2][0]="sdhgf";
	    	 objarr[2][1]="sdh";
	    	 objarr[2][2]="sdhgfk";
			return objarr;
			
			
		}

}
