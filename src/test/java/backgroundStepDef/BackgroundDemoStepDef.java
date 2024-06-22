package backgroundStepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoStepDef {
	
	@Before
	public void launchBrowser() {
		System.out.println("Launched chrome");
	}
	@After
	public void closeBrowser() {
		System.out.println("Closed the browser");
	}
	@Given("user is on login screen")
	public void user_is_on_login_screen() {
	    System.out.println("user is on login screen");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("user enters username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("clicked login button");
	}

	@When("clicked on username dashboard")
	public void clicked_on_username_dashboard() {
		System.out.println("on home screen clicked on user profile");
	}

	@Then("Logout is displayed")
	public void logout_is_displayed() {
		System.out.println("Logout is displayed");
	}

	@When("clicked on Admin tab")
	public void clicked_on_admin_tab() {
		System.out.println("on home screen clicked on admin tab");
	}

	@Then("Admin dashboard is displayed")
	public void admin_dashboard_is_displayed() {
		System.out.println("Admin dashboard is displayed");
	}
}
