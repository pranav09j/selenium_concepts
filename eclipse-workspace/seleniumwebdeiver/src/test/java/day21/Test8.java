package day21;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	
	
	

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		

		//simple Alert
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
//		 Alert alert1 = driver.switchTo().alert();
//		alert1.accept();
		
		// Confirm
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//		driver.switchTo().alert().accept();
//		
//		String act_result = driver.findElement(By.xpath("//p[@id='result']")).getText();
//		
//		String exp_result = "You clicked: Ok";
		
//		if(act_result.equals(exp_result))
//		{
//			System.out.println("Test Case passed");
//		}
//		else
//		{
//			System.out.println("Test case failed");
//		}
		
		//Prompt
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert prompt_alert = driver.switchTo().alert();
		prompt_alert.sendKeys("Pranav123");
		
		prompt_alert.accept();
		
		
	}

}
