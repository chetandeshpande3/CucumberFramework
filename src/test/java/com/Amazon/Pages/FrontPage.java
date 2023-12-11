package com.Amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FrontPage extends BaseClass {

	WebDriver driver;
	public FrontPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement clickable;
	
	public void EnterYourSearch(String s)
	{
		searchbox.sendKeys(s);
	}
	
	public void ClickButton()
	{
		clickable.click();
	}

}
