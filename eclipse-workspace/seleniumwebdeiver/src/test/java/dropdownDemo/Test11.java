package dropdownDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test11 {

	public static void main(String[] args) throws InterruptedException {

		
		//Select DropDown

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select s1 = new Select(drpCountryEle);
		
		Thread.sleep(6000);
		
		//Select option from dropdown
		
//		s1.selectByValue("2");
		
//		s1.selectByVisibleText("Option 1");
		
//		s1.selectByIndex(1);
		
//		s1.deselectAll();
		
		//capture options from dropdown
		
		List<WebElement> options = s1.getOptions();
		System.out.println("No of options in a drop down"+ " " +options.size());
		
		//printing the options
		
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
//		for(WebElement option : options)
//		{
//			System.out.println(option.getText());
//		}
		
		
		
	}

}
