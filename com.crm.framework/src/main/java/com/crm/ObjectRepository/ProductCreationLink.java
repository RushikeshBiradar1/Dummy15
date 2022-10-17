package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCreationLink {
	//Initialization
	public ProductCreationLink(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// Declaration
	@FindBy(xpath = "//img[@alt='Create Product...']") private WebElement productCreateImage;
	@FindBy(name = "productname") private WebElement productNameTextField;
	@FindBy(name = "button") private WebElement saveButton;
	@FindBy(name = "Delete") private WebElement DeleteButton;
	
	//getters Method
	public WebElement getProductCreateImage() {
		return productCreateImage;
	}
	public WebElement getProductNameTextField() {
		return productNameTextField;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	public WebElement getDeleteButton() {
		return DeleteButton;
	}
	//Business Logic
	public void ClickOnCreateProductImg()
	{
		productCreateImage.click();
	}
	public void ClickOnProductNameTextField(String productName)
	{
		productNameTextField.sendKeys(productName);
	}
	public void ClickOnSaveButton()
	{
		saveButton.click();
	}
	
	public void ClickOnDeleteButton()
	{
		DeleteButton.click();
	}
	
	
		
	

}
