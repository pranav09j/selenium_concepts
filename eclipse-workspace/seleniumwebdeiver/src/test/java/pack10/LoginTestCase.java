package pack10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTestCase {
	
	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	
	@Test
	void testLogin()
	{
		LoginPage2 lp = new LoginPage2(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickOnLogin();
		lp.noOfLinks();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
