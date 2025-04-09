package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test19 {

	public static void main(String[] args) {
		
		// pagination table handling
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		int pages = driver.findElements(By.xpath("//ul[@id='pagination']//li//a")).size();
		
		System.out.println("Total no of pages:"+pages);
		
		for(int p=1; p<=pages; p++)
		{
			if(p>1)
			{
				driver.findElement(By.xpath("//ul[@id='pagination']//li//a[text()="+p+"]")).click();
			}
			
			int rows = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
			for(int r=1; r<=rows; r++)
			{
				
				String Id = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[1]")).getText();
				String Name = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[2]")).getText();
				String Price = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[3]")).getText();
				
				WebElement selectEle = driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input"));
	
				selectEle.click();
				
				System.out.println(Id+ "           " + Name+ "          "+Price);
			}
			
		}
		
		

	}

}
