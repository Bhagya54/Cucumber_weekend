package pageFactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	WebDriver driver;

	@FindBy(how=How.ID,using = "username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement loginbtn;
	
	@FindBy(xpath="xyz")
	List<WebElement> listElement;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);//LoginPage_PF.class
	}
	
	public void enterUsername(String user) {
		username.sendKeys(user);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		loginbtn.click();
	}
	
	
	
}
