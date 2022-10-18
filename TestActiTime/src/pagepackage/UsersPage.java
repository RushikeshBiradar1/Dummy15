package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(linkText="Users") private WebElement usersTab;
	@FindBy(xpath="//input[contains(@value,'Create New User')]") private WebElement createUserButton;
	@FindBy(name="username") private WebElement username;
	@FindBy(name="passwordText") private WebElement password;
	@FindBy(name="passwordTextRetype") private WebElement retypePassword;
	@FindBy(name="firstName") private WebElement fristName;
	@FindBy(name="lastName") private WebElement lastName;
	@FindBy(xpath="//input[contains(@value,'   Create User   ')]") private WebElement finalUserCreateButton;
	@FindBy(xpath="//input[contains(@value,'maheshpbiradar')]") private WebElement createdUser;
	@FindBy(xpath="//input[contains(@value,'Delete')]") private WebElement deleteThisUser;
	@FindBy(xpath="//span[@class='successmsg']")private WebElement  successmsg;

	//
	public UsersPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement getCreateUserButton() {
		return createUserButton;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getsuccessmsg()
	{
		return successmsg;
	}
	public WebElement getRetypePassword() {
		return retypePassword;
	}
	public WebElement getFristName() {
		return fristName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getFinalUserCreateButton() {
		return finalUserCreateButton;
	}
	public WebElement getCreatedUser() {
		return createdUser;
	}
	public WebElement getDeleteThisUser() {
		return deleteThisUser;
	}
	
	//operationalmethods
	
	public void clickOnusersTab()
	{
		usersTab.click();
	}
	
	public void createUserAccount(String usersusername,String userspassword, String usersretypepassword, String usersfirstname, String userslastname)
	{
		createUserButton.click();
		username.sendKeys(usersusername);
		password.sendKeys(userspassword);
		retypePassword.sendKeys(usersretypepassword);
		fristName.sendKeys(usersfirstname);
		lastName.sendKeys(userslastname);
		finalUserCreateButton.click();
	}
	public void deieteTheCreatedUser()
	{
		createdUser.click();
		deleteThisUser.click();
	}

}
