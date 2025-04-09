package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
	
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pranav09j");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Pranav@123");
		
		System.out.println(driver.findElement(By.xpath("//button[@id='but1']")).isEnabled());
		
		driver.findElement(By.xpath("//button[@value='LogIn']")).click();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		
	}

}
