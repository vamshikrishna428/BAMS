package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageLicensePage {
	WebDriver driver;
	public ManageLicensePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	//	@FindBys({@FindBy(xpath = "//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-10vfc4x']")})
	@FindBy(xpath = "//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-10vfc4x' and contains(text(),'BUS NO 43 CG-04E-3900')]")
	private WebElement dropdown;
	//li[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root css-10vfc4x' and contains(text(),'BUS NO 44 CG-04E-3200')]
	//	private List<WebElement> dropdown;

	//	public void DropDown() {
	//		int count = dropdown.size();
	//		System.out.println("DropDown Size is = "+count);
	//		for(int i=0;i<count;i++)
	//		{
	//			String dropdowntext = dropdown.get(i).getText();
	//			System.out.println(dropdowntext);
	//		
	//		}
	//		dropdown.get(8).click();
	//	
	public void DropDown() {
		dropdown.click();

	}

}
