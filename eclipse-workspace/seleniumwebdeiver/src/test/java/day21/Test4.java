package day21;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println(driver.getTitle());  //getTitle
		
		System.out.println(driver.getCurrentUrl());   //currentUrl
		
		System.out.println("program end");
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		String parentWindowHandle =  driver.getWindowHandle();
		
		
		Thread.sleep(3000);
		
		// click on link
		
		WebElement link1 = driver.findElement(By.linkText("OrangeHRM, Inc"));
		
		link1.click();
		
		
		
		//get all handles
		
		Set<String> window_handles = driver.getWindowHandles();
		
		for(String handle: window_handles)
		{
			System.out.println(handle);
			
			if(!handle.equals(parentWindowHandle))
			{
				
				driver.switchTo().window(handle);
				break;
			}
		}
		
		Thread.sleep(10000);

		driver.findElement(By.name("EmailHomePage")).sendKeys("Pranav@gmail.com");
		
		

		
//		driver.quit();
	}

}
