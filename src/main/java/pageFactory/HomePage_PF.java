package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;
	
	@FindBy(xpath="//h1")
	@CacheLookup
	WebElement heading;
	

		public HomePage_PF(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
			
		public boolean headingDisplayed() {
			return heading.isDisplayed();
		}
}
