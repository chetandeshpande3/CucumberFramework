package com.Amazon.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SignInPage extends BaseClass {

	WebDriver driver;

	public SignInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement SignInButton;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElement EmailField;

	@FindBy(xpath = "//input[@id='continue']")
	WebElement Button1;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElement passwordField;

	@FindBy(xpath = "//input[@id='signInSubmit']")
	WebElement continueButton2;


	public void ClickOnAccountsandListButton()
	{
		SignInButton.click();

	}

	public void ClickOnEmailButton() throws InterruptedException
	{
		EmailField.sendKeys("123456789");
	}

	public void Button1()
	{
		Button1.click();

	}

	public void ClickOnPassword()
	{
		passwordField.sendKeys("abcdefghi");;

	}

	public void Button2()
	{
		continueButton2.click();

	}

}
