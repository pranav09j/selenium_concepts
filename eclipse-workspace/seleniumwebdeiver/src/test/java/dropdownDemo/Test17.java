package dropdownDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws InterruptedException {


//		Autosuggestion dynamic dropdown
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.bjs.com/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("water");
		
		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='container search-suggestion']//b"));
		
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i).getText());
			
////			if(list.get(i).getText().equals("spring water"))
////			{
////				list.get(i).click();
////				break;
////			}
//			
		}
		
		
		
		
		
	}
	
	
	

}
