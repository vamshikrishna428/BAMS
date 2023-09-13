package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='MuiListItemText-root css-1tsvksn']/child::span[contains(text(),'Log Out')]")
	private WebElement logoutbutton;

	@FindBy(xpath = "//p[contains(text(),'Are you sure you want to log out?')]/following-sibling::div[@class='MuiGrid-root css-rfnosa']/child::button[contains(text(),'Ok')]")
	private WebElement okbutton;


	public void LogOutButton() {
		logoutbutton.click();
	}

	public void OkButton() {
		okbutton.click();
		driver.close();
	}

}
