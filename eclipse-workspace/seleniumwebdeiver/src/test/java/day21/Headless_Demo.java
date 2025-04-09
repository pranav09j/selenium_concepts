package day21;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_Demo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");   // setting for headless mode of testing
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String title_of_page = driver.getTitle();
		
		String expected = "Automation Testing Practice";
		
		if(title_of_page.equals(expected))
		{
			System.out.println("Test case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}

	}

}
