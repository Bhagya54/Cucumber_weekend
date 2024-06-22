package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tagsDemoStepDef {
	

	
	@Given("launch browser")
	public void launch_browser() {
	    System.out.println("Launch browser");
	}

	@When("login")
	public void login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("login");
	}

	@Then("login successful")
	public void login_successful() {
	   System.out.println("Login successful");
	}

	@When("sign up")
	public void sign_up() {
	   System.out.println("Sign up");
	}

	@Then("sign up successful")
	public void sign_up_successful() {
	   System.out.println("Sign up successful");
	}
}
