package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinition {
	
	WebDriver driver;
	LoginPage_PF login;
	HomePage_PF home;
	
	@Given("Open the browser")
	public void open_the_browser() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@Given("Navigated to https:\\/\\/practicetestautomation.com\\/practice-test-login\\/")
	public void navigated_to_https_practicetestautomation_com_practice_test_login() {
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^Entered valid (.*) and (.*)$")
	public void entered_valid_username_and_password(String username,String password) {
	   login=new LoginPage_PF(driver);
	   login.enterUsername(username);
	   login.enterPassword(password);
		//driver.findElement(By.id("username")).sendKeys(username);
	  // driver.findElement(By.id("password")).sendKeys(password);
	   
	}

	@When("Clicked on Login button")
	public void clicked_on_login_button() {
		login.clickLogin();
		//driver.findElement(By.id("submit")).click();
	}

	@Then("Home screen is displayed")
	public void home_screen_is_displayed() {
		home=new HomePage_PF(driver);
	   //WebElement heading = driver.findElement(By.xpath("//h1"));
	   Assert.assertTrue(home.headingDisplayed());
	   System.out.println("Home page is displayed");
	}
	
	

	@Then("Close the browser")
	public void close_the_browser() {
	    driver.close();
	}
}
