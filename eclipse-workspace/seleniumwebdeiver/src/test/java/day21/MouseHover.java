package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		// Mouse Hover action
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://awesomeqa.com/ui/");
		
		 WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		 
		  WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		 
		 Actions act  = new Actions(driver);
		 
		 act.moveToElement(desktop).moveToElement(mac).click().build().perform();

	}

}
