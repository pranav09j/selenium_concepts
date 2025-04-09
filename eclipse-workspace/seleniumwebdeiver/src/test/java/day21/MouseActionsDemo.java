package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsDemo {

	public static void main(String[] args) {

		
		//Mouse actions
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement copy_text  = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		WebElement point_me = driver.findElement(By.xpath("//buttop[normalize-space()='Point Me']"))
		
		Actions act  = new Actions(driver);
		
		WebElement name_textfield = driver.findElement(By.xpath("//input[@id='name']"));
		
		act.doubleClick(copy_text).perform();
		
//		act.moveToElement(name_textfield).click().sendKeys("Pranav").build().perform();
		
		act.moveToElement(point_me).perform();
		
		// using Action Interface
		Action a1 = act.moveToElement(name_textfield).click().sendKeys("Pranav").build();
		a1.perform();
		
		System.out.println("All executed");
		
	}

}
