package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) throws InterruptedException {
		
//		Autosuggestion dynamic dropdown
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");   // search box
		
		Thread.sleep(5000);
		
//		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li//span[contains(text(),'selenium')]"));
		
		System.out.println("Total no of suggestions " + list.size());
		
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("selenium rich foods"))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		

	}

}
