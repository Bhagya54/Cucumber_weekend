package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
WebDriver driver;
By heading=By.xpath("//h1");

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
		
	public boolean headingDisplayed() {
		return driver.findElement(heading).isDisplayed();
	}
}
