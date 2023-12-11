package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.Amazon.Pages.ProductPage;

import Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Product_Page_Step extends BaseClass{

	ProductPage PP=new ProductPage(BaseClass.driver);

	@When("User clicks on desired product")
	public void user_clicks_on_desired_product() throws Exception{
		PP=new ProductPage(driver);
		PP.ClickOnDesiredProduct();

	}

	@Then("User is able to see price of the product")
	public void user_is_able_to_see_price_of_the_product() throws Exception
	{
		PP.PriceOfTheProduct();
	}

	@Then("user clicks on {string} button")
	public void user_clicks_on_button(String string) throws Exception{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1,500);");
		Thread.sleep(10000);
		PP.ClickOnAddToCartButton();
	}
}
