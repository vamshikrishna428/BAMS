package FACEGENIE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.washitup.in/adminlogin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		WebElement phno = driver.findElement(By.xpath("//input[@class='login-input']"));
//		phno.sendKeys("9494445735");
//		driver.findElement(By.xpath("//button[@class='button-login']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='button-login']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("washitup@admin.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WashIt_Up@24");

		driver.findElement(By.xpath("//button[@type='button']")).click();

	}
}
