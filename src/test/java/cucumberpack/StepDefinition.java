package cucumberpack;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	@Given("^Login credentials is given$")
	public void login_credentials_is_given() throws Throwable {
	   System.out.println("Login credentials is given");
	   // throw new PendingException();
	}

	@When("^registered user only$")
	public void registered_user_only() throws Throwable {
		 System.out.println("registered user only");
	  //  throw new PendingException();
	}

	@Then("^user should login$")
	public void user_should_login() throws Throwable {
		 System.out.println("user should login");
	   // throw new PendingException();
	}


}
