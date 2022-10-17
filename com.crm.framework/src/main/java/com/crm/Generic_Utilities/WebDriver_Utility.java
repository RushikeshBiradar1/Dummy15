package com.crm.Generic_Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WebDriver_Utility {
	WebDriver driver;
	
	/**
	 * wait for page to load before identifying any synchronized in DOM
	 * 
	 */
	public void waitForPageToLoad(WebDriver driver) 
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	/**
	 * explicit wait
	 * */
	public void expliciteWait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	/**
	 * To verify page title
	 * @param expectedTitle 
	 * 
	 * @param expectedTitle
	 * @param pageName 
	 * @param pageName
	 */

	public void verifyPageTitle(String expectedTitle,String pageName)
	{
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("The title is matched for "+pageName);
		}
		else
		{
			System.out.println("The title is not matched for "+pageName);
		}
	}
	
	/**
	 * to switch the frame by using index(Method Overloading) 
	 */
	
	public void switchToFrame(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrame(String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}

	public void switchToFrame(WebElement frameElement)
	{
		driver.switchTo().frame(frameElement);
	}

	/**
	 * To maximize the browser
	 * 
	 * */
	public void maximizeTheBrowser()
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * for selecting dropdown option(Method Overloading)
	 * @param element 
	 * @param index 
	 */
	
	public void selectOptionOfDropDown(WebElement ssd, int index) throws InterruptedException
	{
		Select sel = new Select(ssd);
		Thread.sleep(3000);
		sel.selectByIndex(index);
	}
	public void selectOptionOfDropDown(WebElement ssd, String Value) throws InterruptedException
	{
		Select sel = new Select(ssd);
		Thread.sleep(3000);
		sel.selectByValue(Value);
	}
	public void selectOptionOfDropDown(String text, WebElement ssd) throws InterruptedException
	{
		Select sel = new Select(ssd);
		Thread.sleep(3000);
		sel.selectByVisibleText(text);
	}
	
	/**
	 *To handle alert popup 
	 */
	
//	public void acceptAlertPopup()
//	{
//		Alert al = driver.switchTo().alert();
//		al.accept();
//	}

	public void acceptConfirmationPopup()
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public void dismissConfirmationPopup()
	{
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	
	/**
	 * To perform mouse action
	 * 
	 * */
	public void rightClick(WebElement target)
	{
		Actions ts = new Actions(driver);
		ts.contextClick(target).perform();
	}
	public void doubleClickFeatures(WebElement target)
	{
		Actions ts = new Actions(driver);
		ts.doubleClick(target).perform();
	}
	public void mouseHover(WebElement target)
	{
		Actions ts = new Actions(driver);
		ts.moveToElement(target).perform();
	}
	public void dragAndDropFeatures(WebElement source, WebElement destination)
	{
		Actions ts = new Actions(driver);
		ts.dragAndDrop(source, destination).perform();
	}
	
	
/**
 * To perform the scrolling action
 * 
 * 
 * */
	public void scrollup(int pixelCount)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixelCount+")");
	}

	public void scrolldown(int pixelCount)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+(-pixelCount)+")");
	}

	public void scrollLeft(int pixelCount)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+(-pixelCount)+",0)");
	}

	public void scrollRight(int pixelCount)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+pixelCount+",0)");
	}

	public void scrollTillAParticularWebElement(WebElement target)
	{
		Point loc = target.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
	}
	
	/**
	 * To getalloptions of Dropdown
	 */
	
	public void getAllOptionsOfDropDown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allops = sel.getAllSelectedOptions();

		for(WebElement op:allops)
		{
			String text = op.getText();
			System.out.println(text);
		}
	}
	
	public void getWindowHandles(WebDriver driver, String value)
	{
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		while(it.hasNext())
		{
			String wid = it.next();
			if(driver.getTitle().contains(value))
			{
				break;
			}
		}
	}
	
	
}
