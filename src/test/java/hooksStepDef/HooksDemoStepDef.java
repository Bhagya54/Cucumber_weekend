package hooksStepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksDemoStepDef {
	WebDriver driver;
	@Before(value="@smoke",order=1)
	public void launchBrowser() {
		System.out.println("Before Hook 1 stametement");
		
	}
	
	@After(value="@smoke",order=1)
	public void tearDown() {
		System.out.println("After hook 1 statement");
		
	}
	
	@Before(order=2)
	public void before2() {
		System.out.println("Before Hook 2 stametement");
		
	}
	
	@After(order=2)
	public void after2() {
		System.out.println("After hook 2 statement");
		
	}
	@BeforeStep
	public void beforeStep() {
		System.out.println("Before each Step");
	}
	@AfterStep
	public void afterStep() {
		System.out.println("After each Step");
	}
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("First Step");
		
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
		System.out.println("second Step");
		
	}

	@When("user clicked on login button")
	public void user_clicked_on_login_button() {
		System.out.println("Third Step");
		
	   
	}

	@Then("User is navigated to Home Screen")
	public void user_is_navigated_to_home_screen() {
		System.out.println("Fourth Step");
	}

}
