package day21;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_page {

	private static final String Integer = null;

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0, 500)", "");
//		
//		System.out.println(js.executeScript("return window.pageYOffset"));

		
		//scroll till specified web element 
		 WebElement input_field = driver.findElement(By.xpath("//button[@value='LogIn']"));
//		 input_field.get
//		 org.openqa.selenium.Point p = input_field.getLocation();
//		 
//		int Xval = p.getX();
//		int Yval = p.getY();
//		
//		System.out.println(Xval + "  "+ Yval);
//
//		js.executeScript("window.scrollBy("+Xval+","+Yval+")", "" );
		 js.executeScript("arguments[0].scrollIntoView()", input_field);
		 
		//scroll complete web page
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
//		
//		js.executeScript("document.body.style.zoom='50%'");
//		
//		js.executeScript("document.body.style.zoom='80%'");
	}

}
