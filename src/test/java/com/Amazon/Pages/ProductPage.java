package com.Amazon.Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class ProductPage extends BaseClass {

	WebDriver driver;

	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal' and contains(text(),'iPhone 13 (128GB) - (Product) RED')]")
	WebElement desiredproduct;


	@FindAll({@FindBy(xpath = "//span[@class='a-price-whole' and contains(text(), '51,999')]")})
	List<WebElement> Price;

	@FindBy(xpath = "//input[@id='add-to-cart-button']") 
	WebElement addtocart;


	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	WebElement registerbutton;

	public void ClickOnDesiredProduct()
	{
		desiredproduct.click();
		Set wh=	driver.getWindowHandles();
		Iterator<String> it=wh.iterator();
		String pId=it.next();
		String cId=it.next();
		driver.switchTo().window(cId);
	}

	public void PriceOfTheProduct()
	{
		for(WebElement k:Price)
		{
			System.out.println("Price for iPhone is "+k.getText());
		}

	}

	public void ClickOnAddToCartButton() throws Exception
	{
		addtocart.click();
	}

}
