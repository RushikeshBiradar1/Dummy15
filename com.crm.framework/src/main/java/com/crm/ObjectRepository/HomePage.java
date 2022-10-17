package com.crm.ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Generic_Utilities.WebDriver_Utility;

public class HomePage {
	//Initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindBy(linkText = "Products") private WebElement productlinkText;
	@FindBy(linkText = "More") private WebElement morelink;
	@FindBy(linkText = "Campaigns") private WebElement campaignlinkText;
	@FindBy(linkText = "Organizations") private WebElement organizationLinkText;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']") private WebElement signOutImg;
	@FindBy(linkText = "Sign Out") private WebElement signOutLinkText;
	
	//getters methods
	public WebElement getProductlinkText() {
		return productlinkText;
	}
	public WebElement getMorelink() {
		return morelink;
	}
	public WebElement getCampaignlinkText() {
		return campaignlinkText;
	}
	public WebElement getOrganizationLinkText() {
		return organizationLinkText;
	}
	
	public WebElement getSignOutLinkText() {
		return signOutLinkText;
	}
	
	public WebElement getSignOutImg() {
		return signOutImg;
	}
	
	//Business Logic
	public void signOutHomePage(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.moveToElement(signOutImg).perform();
		signOutLinkText.click();	
	}
	public void moreLink(WebDriver driver)
	{
		WebDriver_Utility wlib = new WebDriver_Utility();
		wlib.mouseHover(morelink);
	}
	public void clickOnOrgamization(WebDriver driver)
	{
		organizationLinkText.click();
	}
	public void clickOnProductLinkText(WebDriver driver)
	{
		productlinkText.click();
	}
	public void ClickOnCampaignLinkText()
	{
		campaignlinkText.click();
	}
	public void ClickOnMoreLinkText()
	{
		morelink.click();
	}
	
}
