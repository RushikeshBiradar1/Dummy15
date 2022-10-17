package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createCampaign {
	//Initialization
	public createCampaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement campaignCreateImage;
	@FindBy(name = "campaignname") private WebElement CampaignNameTextField;
	@FindBy(name = "button") private WebElement saveButton;
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']") private WebElement productAddImg;
	
	
	//getters methods
	public WebElement getCampaignCreateImage() {
		return campaignCreateImage;
	}
	public WebElement getCampaignNameTextField() {
		return CampaignNameTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getProductAddImg() {
		return productAddImg;
	}
	
	//Business Logic
	/**
	 * This Method is used for ClickOn +img
	 */
	public void clickCampaignCreateImage()
	{
		campaignCreateImage.click();
	}
	/**
	 * This method is used to pass value to Organization TextField
	 * 
	 */
	public void clickOnOrganizationTextField(String CampName)
	{
		CampaignNameTextField.sendKeys(CampName);
	}
	/**
	 * This Method is used to save Campaign
	 */
	public void clickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void ClickOnproductAddImg()
	{
		productAddImg.click();
	}

}
