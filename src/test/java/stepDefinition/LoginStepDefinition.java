package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	@Given("Navigated to gmail.com")
	public void navigated_to_gmail_com() {
	    System.out.println("gmail page is loaded");
	}

	@When("Entered valid username and password")
	public void entered_valid_username_and_password() {
	   System.out.println("Entered username");
	   System.out.println("Entered password");
	   
	}

	@When("Clicked on Login button")
	public void clicked_on_login_button() {
		 System.out.println("Clicked on login");
	}

	@Then("Home screen is displayed")
	public void home_screen_is_displayed() {
	   System.out.println("Home screen displayed");
	}
}
