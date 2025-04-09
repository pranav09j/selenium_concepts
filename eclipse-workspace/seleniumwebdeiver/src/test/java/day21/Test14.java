package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {

//		hidden dropdown
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		//Login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//clicking on PIM
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//clicked on employee status dropdown
		
		
		Thread.sleep(5000);
		//clicked on dropdown
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][normalize-space()='-- Select --'])[1]")).click();
		
		
		//select single option
		
//		driver.findElement(By.xpath("//span[normalize-space()='Full-Time Contract']")).click();
		
		
		//count number of options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		
		System.out.println(options.size());
		
		
		//print all options from dropdown
		
		for(WebElement op: options)
		{
			System.out.println(op.getText());
		}
		
	}

}
