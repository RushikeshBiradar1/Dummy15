package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkart {
	public class LoginPage {
		
		//Initialization
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//Declaration
		@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']") private WebElement userNameTextField;

		public WebElement getUserNameTextField() {
			return userNameTextField;
		}
		
		//business Logic
		public void ClickOnuserNameTextField(String userName)
		{
			userNameTextField.sendKeys(userName);
		}
	}

}
