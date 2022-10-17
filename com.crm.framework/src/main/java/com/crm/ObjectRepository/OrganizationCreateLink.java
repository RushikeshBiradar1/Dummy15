package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationCreateLink {
	//Initialization
	public OrganizationCreateLink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement OrganizationCreateImage;
	@FindBy(name = "accountname") private WebElement OrganizationNameTextField;
	@FindBy(name = "button") private WebElement SaveButtonTextField;
	
	//getters methods
	public WebElement getOrganizationCreateImage() {
		return OrganizationCreateImage;
	}
	public WebElement getOrganizationNameTextField() {
		return OrganizationNameTextField;
	}
	public WebElement getSaveButtonTextField() {
		return SaveButtonTextField;
	}
	
	//Business Logic
	public void ClickOnOrganizationCreateImg()
	{
		OrganizationCreateImage.click();
	}
	public void ClickOnOrganizationNameTextField(String OrgName)
	{
		OrganizationNameTextField.sendKeys(OrgName);
	}
	public void ClickOnSaveButton()
	{
		SaveButtonTextField.click();
	}
	

}
