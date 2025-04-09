package dropdownDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test16 {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement countrydrpdown = driver.findElement(By.name("country"));
		
		Select s1 = new Select(countrydrpdown);
		
		s1.selectByValue("3");
		
		//count no of options
		
		List<WebElement> options = driver.findElements(By.xpath("//select[@id='country-list']//option"));
		System.out.println(options.size());
		
		 
		 //print options
		 
		 for( WebElement op : options)
		 {
			 System.out.println(op.getText());
		 }
	}

}
