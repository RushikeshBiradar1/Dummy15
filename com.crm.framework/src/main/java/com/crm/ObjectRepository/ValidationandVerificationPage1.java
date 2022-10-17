package com.crm.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidationandVerificationPage1 {
	public WebDriver driver;
	public ValidationandVerificationPage1()
	{
		PageFactory.initElements(driver, this);
	}

	//declaration
	@FindBy(css="span.dvHeaderText")
	private WebElement actualOragnisationData;
	
	@FindBy(css="span.lvtHeaderText")
	private WebElement headerText;
	
	//getters methods
	
	@FindBy(xpath="//span[@class=\"dvHeaderText\"]")
	private WebElement verfTitle;
	

	public WebElement getActualOragnisationData() {
		return actualOragnisationData;
	}

	public WebElement getHeaderText() {
		return headerText;
	}

	public WebElement getVerfTitle() {
		return verfTitle;
	}
	
	//business logic
	public void organisationValidation(WebDriver driver,String Name)
	{
		String actData=actualOragnisationData.getText();
		if(actData.contains(Name))
		{
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}
	}
	
	public void productValidation(WebDriver driver,String Name)
	{
		String actData=headerText.getText();
		if(actData.contains(Name))
		{
		System.out.println("pass");
		}
		else
		{
		System.out.println("fail");
		}
	}
	
	public void titleVerification(String data) {
		String title = verfTitle.getText();
		if(title.contains(data)) {
			System.out.println("Campaign Created");
		}
		else {
			System.out.println("Campaign Not Created");
		}
	}


	
	
}
