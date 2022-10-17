package com.crm.ObjectRepository;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createCampaignWithProduct {
	//Initialization
	public createCampaignWithProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']") private WebElement campaignCreateImage;
	@FindBy(name = "campaignname") private WebElement CampaignNameTextField;
	@FindBy(name = "button") private WebElement saveButton;
	@FindBy(xpath = "//img[@src='themes/softed/images/select.gif']") private WebElement productAddImg;
	@FindBy(id = "search_txt") private WebElement SearchTextFieldProduct;
	@FindBy(name = "search") private WebElement SearchButton;
	
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
	
	public WebElement getSearchBoxProduct() {
		return SearchTextFieldProduct;
	}
	public WebElement getSearchButton() {
		return SearchButton;
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
	public void ClickOnCampaignNameTextField(String cName)
	{
		CampaignNameTextField.sendKeys(cName);
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
	public void ClickOnSearchBoxProduct(String Product)
	{
		SearchTextFieldProduct.sendKeys(Product);
	}
	public void ClickOnSearchButton()
	{
		SearchButton.click();
	}
	public void getWindowhandleToChildBrowser(WebDriver driver)
	{
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		
		while(it.hasNext())
		{
			String wid = it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Products&action"))
			{
				break;
			}
		}
		
	}
	public void getWindowhandleToParentBrowser(WebDriver driver)
	{
		Set<String> allid = driver.getWindowHandles();
		Iterator<String> it = allid.iterator();
		
		while(it.hasNext())
		{
			String wid = it.next();
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Campaigns&action"))
			{
				break;
			}
		}
		
	}

}
