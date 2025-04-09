package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest {
	
	@Test(dataProvider = "loginData")
	void login(String username, String password)
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		boolean status  = driver.findElement(By.xpath("//i[@class='icon-2x icon-signout']")).isDisplayed();
		
		Assert.assertTrue(status);
		driver.close();
		
		
		
	}
	
	@DataProvider(name="loginData")
	String[][] pranav() throws IOException
	{
		 String [][] login_data = ReadDataFromExcel.getData();
		 
		 return login_data;
	}

}
