package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondtestCase {

	public static void main(String[] args) {
		
		//1) Launch Browser (chrome)
		WebDriver driver = new ChromeDriver();
		
		//2) open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		// 3) Validate title should be "Your Store"
		 
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your StoreS")) {
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		// 4) close Browser
		
		driver.close();
//		driver.quit();
		
	}

}
