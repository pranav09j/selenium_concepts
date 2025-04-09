package pack10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without using PageFactory

public class LoginPage {
	
	WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	//Locators
	
	By username_field = By.xpath("//input[@placeholder='Username']");
	By password_field = By.xpath("//input[@placeholder='Password']");
	By login_btn = By.xpath("//button[normalize-space()='Login']");
	
	
	//Action Methods
	
	public void setUsername(String user)
	{
		driver.findElement(username_field).sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		driver.findElement(password_field).sendKeys(pass);
	}
	
	public void clickOnLogin()
	{
		driver.findElement(login_btn).click();
	}
	

}
