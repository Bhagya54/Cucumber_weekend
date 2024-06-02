package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleStepDefinition {
	WebDriver driver;

	@Given("Open the browser")
	public void open_the_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	}

	@And("Navigate to google.com")
	public void navigate_to_google_com() {
	    driver.get("https://google.com");
	}

	@When("Entered a search keyword")
	public void entered_a_search_keyword() {
	    driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
	}

	@And("Hit the Enter button")
	public void hit_the_enter_button() {
	  new Actions(driver).sendKeys(Keys.ENTER).perform();
	}

	@Then("Google search results appear")
	public void google_search_results_appear() {
	    Assert.assertTrue(driver.getTitle().contains("WebDriver"));
	    System.out.println("Passed");
	}
	
	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
