package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class Test18 {

	public static <JavacsriptExecutor> void main(String[] args) throws InterruptedException {
		
		// handling dynamic table with pagination

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo-opencart.com/admin/index.php?route=common/login");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		//close window if it is available
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		
		driver.findElement(By.xpath("//a[@href='#collapse-5']")).click();   //customers main menu
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click();  //click on submenu
		
		
		String s = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		
		int total_pages = Integer.parseInt(s.substring(s.indexOf("(")+1, s.indexOf("Pages")-1)) ;
		
		System.out.println(total_pages);
		
		//repeating pages
		for(int p=1; p<=total_pages;p++)
		{
			if(p > 1)
			{
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				
				JavacsriptExecutor js = (JavacsriptExecutor) driver;
				((ChromiumDriver) js).executeScript("arguments[0].click()",active_page );
				
//				active_page.click();
				Thread.sleep(3000);
			}
			
			//reading data from page
			
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			
			for(int i=1; i<=rows; i++)
			{
				String customer_name = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[2]")).getText();
				
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+i+"]//td[3]")).getText();
				
				System.out.println(customer_name + "\t" + email);
			}
		}
		
		
		
		
		
		
	}

}
