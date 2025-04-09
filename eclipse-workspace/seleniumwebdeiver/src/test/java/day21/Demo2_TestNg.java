package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//open app
//login
//..logout

public class Demo2_TestNg {
	
	WebDriver driver;
	
	@Test(priority=1)
	void openApp()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.get(driver.getCurrentUrl());
		
	}
	
	@Test(priority=2)
	void login() throws InterruptedException
	{
		  WebElement username_field = driver.findElement(By.xpath("//input[@id='Email']"));
		  username_field.clear();
		  Thread.sleep(3000);
		  username_field.sendKeys("admin@yourstore.com");
		  
		  WebElement passwor_field = driver.findElement(By.xpath("//input[@id='Password']"));
		  passwor_field.clear();
		  Thread.sleep(3000);
		  passwor_field.sendKeys("admin");
		  
		  WebElement login_btn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		  login_btn.click();
	}
	
	@Test(priority=3)
	void logout()
	{
		 WebElement logout_btn = driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
		 
		 logout_btn.click();
	}
	
	
}
