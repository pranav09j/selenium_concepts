package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		driver.get("https://omayo.blogspot.com/");
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed()
//		boolean status_usernamefield = driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
//		
//		System.out.println(status_usernamefield);
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pranav");
		
		
		//isEnabled() 
//		boolean status = driver.findElement(By.xpath("//input[@id='tb2']")).isEnabled();
//		
//		System.out.println(status);
		
		//isSelected()
//		boolean status_checkbox = driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
//		System.out.println("Before checking/Selecting :"+ "  "+ status_checkbox);
//		
//		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
//		boolean status_checkbox1 = driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
//		System.out.println("After checking/Selecting :"+ "  "+ status_checkbox1);
		
		
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		System.out.println("Before Selection...");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		System.out.println("After selecting male...");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
	}

}
