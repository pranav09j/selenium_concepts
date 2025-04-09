package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {

	public static void main(String[] args) {
		
		// Bootstrap table handling
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		
		int rows = driver.findElements(By.xpath("//div[@role='row']//div[text()='Enabled']")).size();
		
		for(int r=1; r<=rows; r++)
		{
			String username = driver.findElement(By.xpath("//div[@role='row']//div[@role='cell'][2]")).getText();
			String user_role = driver.findElement(By.xpath("//div[@role='row']//div[@role='cell'][3]")).getText();
			
			System.out.println(username + "   " + user_role);
		}
		
		
		
	}

}
