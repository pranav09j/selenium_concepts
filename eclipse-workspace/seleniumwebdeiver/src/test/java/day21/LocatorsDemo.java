package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {


			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			
			//name
//			driver.findElement(By.name("search")).sendKeys("Mac");
			
			//id
//			boolean logoDisplayStatus = driver.findElement(By.id("logo")).isDisplayed();
//			System.out.println(logoDisplayStatus);

			//linktext & partialLinkText
//			driver.findElement(By.linkText("Tablets")).click();
//			driver.findElement(By.partialLinkText("Tab")).click();
			
			
			//className
//			List<WebElement> headerLinks =driver.findElements(By.className("list-inline-item"));
//			System.out.println("Total No of header Links :"+headerLinks.size());
			
			//tagName 
//			List <WebElement> links =driver.findElements(By.tagName("a"));
//			System.out.println("total no of links :"+ links.size());
//			
//			for(Object link: links) {
//				 
//			}
			
//			List <WebElement> images=driver.findElements(By.tagName("imge"));
//			System.out.println("Total no of images on webPage:"+ images.size());
			
			
			//css selector
			
			//Tagname+id
//			driver.findElement(By.cssSelector("input#email")).sendKeys("Pranav223");
			//Tagname+className
//			driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Akshay123");
			//Tagname+attribute
//			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Pranav345");
			//Tagname + className + attribute
//			driver.findElement(By.cssSelector("input.inputtext[name='email']")).sendKeys("Pranav123");
			
			
			//xPath
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Pratik123");
			driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("122344");
			
	}

}
