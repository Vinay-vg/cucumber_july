package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("User is on the login page");
	}

	@When("user enters username and password")
	public void user_Enters_Username_And_Password() {
		System.out.println("user enters username and password");
	}

	@When("clicks on login button")
	public void clicksOnLoginButton() {
		System.out.println("clicks on login button");

	}

	@Then("useris navigate to homepage")
	public void userisNavigateToHomepage() {
		System.out.println("useris navigate to homepage");
	}

}
