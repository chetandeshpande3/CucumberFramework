package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Amazon.Pages.FrontPage;

import Base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Front_Page_Step extends BaseClass{



	@Given("User is on the Amazon Homepage")
	public void user_is_on_the_amazon_homepage() throws Exception {
		setup("edge");


		
	}

	@When("User types {string} in the search box")
	public void user_types_in_the_search_box(String string)throws Exception {
		FrontPage FP=new FrontPage(BaseClass.driver);

		FP.EnterYourSearch(string);
		
		//FP.EnterYourSearch(string);



		
	}


	@When("User click on search button")
	public void user_click_on_search_button() throws Exception {
		FrontPage FP=new FrontPage(BaseClass.driver);
		FP.ClickButton();


		
	}

	@Then("User navigates to Iphone page")
	public void user_navigates_to_iphone_page() throws Exception{
		FrontPage FP=new FrontPage(BaseClass.driver);
		driver.navigate().to("https://www.amazon.in/s?k=iphone&crid=AQNCBOMW9NM7&sprefix=iphon%2Caps%2C188&ref=nb_sb_noss_2");

		
	}






}
