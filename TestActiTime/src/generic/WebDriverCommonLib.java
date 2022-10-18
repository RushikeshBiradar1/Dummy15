package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseTest {

	//
	public void verifyPageTitle(String expectedTitle, String pageName)
	{
		String actualTitle=driver.getTitle();
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("the title is matched for"+pageName);
		}
		else
		{
			System.out.println("the title is not matched for"+pageName);
		}
	}
	
	//title of the web page
	public String getTitleOfWebpage(String pageName)
	{
		String titleOfPage = driver.getTitle();
		return titleOfPage;
	}
	
	//overloaded method(which has same method name but diff. arguments)
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
	
	//method chaining
	public void maximizeTheBrowser()
	{
		driver.manage().window().maximize();
	}
	
	//method overloading
	public void selectOptionOfDropdown(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}

	public void selectOptionOfDropdown(WebElement element,String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public void selectOptionOfDropdown(String visibleText, WebElement element)//just change the sequence of they arg
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}

	//to Handle PopUp
	public void acceptAlertPopup()
	{
		Alert al = driver.switchTo().alert();
		al.accept();
	}
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
	
	//Actions Class
	public void rightClick(WebElement target) 
	{
		Actions act = new Actions(driver);
		act.contextClick(target).perform();
	}
	
	public void doubleClickFeature(WebElement target) 
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
	}
	
	public void mouseOver(WebElement target) 
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}
	
	public void dragAndDropFeature(WebElement source, WebElement destination) 
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, destination).perform();
	}
	//Robot Class
	public void hitTheEnterButton() throws AWTException
	{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}
	//frequently used CopyPasteOperation
	public void copyTheText() throws AWTException
	{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void pasteTheText() throws AWTException
	{
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
	}
	//vry vry imp ScrollingOperations
	public void scrollDown(int pixelCount)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+pixelCount+")");
	}
	public void scrollUp(int pixelCount)
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
	//Dropdown
	public void getAllOptionsOfDropDown(WebElement element)
	{
		Select sel = new Select(element);
		List<WebElement> allOps = sel.getOptions();
		
		for(int i=1;i<=allOps.size();i++)//for loop
		{
			WebElement op = allOps.get(i);
			String text = op.getText();
			System.out.println(text);
		}
		
		for(WebElement op:allOps)//for each loop
		{
			System.out.println(op.getText());
		}
	}
}
