package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailid;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//span[@class='MuiTouchRipple-root css-w0pj6f']")
	private WebElement loginbutton;
	
	public void EmaidTxField() {
		emailid.sendKeys("testbams@gmail.com");
	}
	public void PasswordTxField() {
		password.sendKeys("facegenie");
	}
	public void LoginButton() {
		loginbutton.submit();
	}
	
	
}
