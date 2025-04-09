package rerunautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.com");
	}
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	
	@Test(retryAnalyzer=RerunAutomationScripts.class)
	public void TestMethod()
	{
		String title  = driver.getTitle();
		Assert.assertEquals(title, "Google");
	}

}
