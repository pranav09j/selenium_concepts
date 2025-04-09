package DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_DDT {
	
	public static WebDriver driver;
	
	@DataProvider(name="login")
	public String[][] testcase1(){
		
		String [][] a = new String[3][2];
		
		a[0][0] = "Pranavj";
		a[0][1] = "Pran@123";
		a[1][0] = "Aniket";
		a[1][1] = "Ani@1234";
		a[2][0] = "Ajinkya";
		a[2][1] = "Aji@123";
		
		return a;
		
	}
	
	
	@Test(dataProvider="login")
	public void login(String email, String pass)
	{
		driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.name("login")).click();
		
	}
}
