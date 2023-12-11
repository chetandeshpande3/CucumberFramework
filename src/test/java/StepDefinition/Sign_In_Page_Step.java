package StepDefinition;

import com.Amazon.Pages.SignInPage;

import Base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sign_In_Page_Step extends BaseClass{

	SignInPage SP=new SignInPage(BaseClass.driver);

	@When("User clicks on AccountsandList button")
	public void user_clicks_on_accountsand_list_button() throws Exception {
		SP=new SignInPage(driver);
		SP.ClickOnAccountsandListButton();
}

	@When("User Enters Email")
	public void user_enters_email() throws Exception{
		SP.ClickOnEmailButton();
		SP.Button1();
	}


	@Then("User enters password")
	public void user_enters_password()throws Exception {
		SP.ClickOnPassword();
		SP.Button2();

	}


}
