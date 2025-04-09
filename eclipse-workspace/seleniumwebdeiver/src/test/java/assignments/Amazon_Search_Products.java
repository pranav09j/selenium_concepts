package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Search_Products {

	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/");
		
		//Without clicking on search button
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		search.sendKeys("Shoes" + Keys.ENTER);
		
		WebElement shoes = driver.findElement(By.xpath("//div[@aria-label='shoes for men']"))
		shoes.click();
				
		Set < String > s= driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		
		String parent  = i.next();
		String child= i.next();
		
		driver.switchTo().window(child);
		
	}

}
