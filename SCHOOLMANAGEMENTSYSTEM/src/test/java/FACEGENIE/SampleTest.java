package FACEGENIE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ObjectRepository.LogInPage;
import ObjectRepository.LogOutPage;
import ObjectRepository.ManageLicensePage;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facegenie-ams-school.web.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		LogInPage loginpage=new LogInPage(driver);

		loginpage.EmaidTxField();
		loginpage.PasswordTxField();
		loginpage.LoginButton();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlMatches("https://facegenie-ams-school.web.app/dashboard/home"));


		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement click = driver.findElement(By.xpath("//span[contains(text(),'Manage Licenses')]"));
		j.executeScript("arguments[0].click();", click);

		WebElement selectbus = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiFormControl-fullWidth css-1mejovb']"));
		selectbus.click();

		ManageLicensePage page=new ManageLicensePage(driver);
		page.DropDown();

		WebElement EID = driver.findElement(By.xpath("//button[contains(text(),'yash')]"));
		Thread.sleep(2000);
		j.executeScript("arguments[0].scrollIntoView(true);",EID);
		Thread.sleep(2000);
		j.executeScript("arguments[0].click();", EID);

		driver.findElement(By.xpath("//p[contains(text(),'Edit Details')]")).click();

		WebElement empid = driver.findElement(By.xpath("//div[@class='MuiGrid-root css-1rlxlch']/descendant::input[@name='empId']"));
		j.executeScript("arguments[0].value = '';",empid);
		Thread.sleep(2000);
		j.executeScript("arguments[0].value = 'Yash123';",empid);

		WebElement empname = driver.findElement(By.xpath("//div[@class='MuiGrid-root css-1rlxlch']/descendant::input[@name='firstName']"));
		j.executeScript("arguments[0].value = '';",empname);
		Thread.sleep(2000);
		j.executeScript("arguments[0].value = 'YashChopra';",empname);
		Thread.sleep(2000);

		WebElement updatelicense = driver.findElement(By.xpath("//div[@class='MuiGrid-root jss32 css-rfnosa']/descendant::p[contains(text(),'Update License')]"));
		if(updatelicense.isDisplayed())
		{
			j.executeScript("arguments[0].scrollIntoView(true);",updatelicense);
			Thread.sleep(2000);
			updatelicense.click();
		}
		else
		{
			driver.findElement(By.xpath("//div[@class='MuiGrid-root jss42 css-rfnosa']/descendant::p[contains(text(),'Back')]")).click();
		}

		LogOutPage lop=new LogOutPage(driver);
		lop.LogOutButton();
		lop.OkButton();



	}

}
