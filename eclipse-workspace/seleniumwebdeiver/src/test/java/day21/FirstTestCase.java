package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
	
	

	public static void main(String[] args) throws InterruptedException {
		
//		chromeDriver driver = new chromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();		
//			driver.findElement(By.xpath("//input&[@name='email']")).sendKeys("Pranav123");
//			driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Pranav@123");
//			driver.findElement(By.xpath("//input&[&name='login']")).click();
		
//		 WebElement email_field = driver.findElement(By.id("email"));
//		 
//		 email_field.sendKeys("Pranav123@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("Pranav123@gmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Pranav123");
		
		driver.findElement(By.name("login")).click();
		 
//		driver.findElement(By.linkText("Forgotten password?")).click();		
		
//		driver.findElement(By.partialLinkText("Forgot")).click();
		

	}
	
	
	

}
