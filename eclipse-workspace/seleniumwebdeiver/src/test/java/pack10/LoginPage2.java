package pack10;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Using PageFactory

public class LoginPage2 {
	
	
WebDriver driver;
	
	//Constructor
	LoginPage2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  //Mandatory
	}
	
	//Locators
	
	
	@FindBy(xpath="//input[@placeholder='Username']")
//	@FindBy(how=How.XPATH, using="//input[@placeholder='Username']")
	WebElement txt_username;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement login_btn;
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	//Action Methods
	
	public void setUsername(String user)
	{
		txt_username.sendKeys(user);
	}
	
	public void setPassword(String pass)
	{
		txt_password.sendKeys(pass);
	}
	
	public void noOfLinks()
	{
		System.out.println("Total No of Links:"+links.size());
	}
	
	public void clickOnLogin()
	{
		login_btn.click();
	}

}
