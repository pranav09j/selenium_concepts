package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {

		
		// Frames/iframes
		

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Frame1
		
		 WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);    // passed frame as WebElement   //Switch to frame1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();   // go back to main page
		
		//Frame 2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Pranav");
		
		driver.switchTo().defaultContent();   // go back to main page
		
		//Frame3
		
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Pratik");
		
		//innner iframe - part of frame3
		
		driver.switchTo().frame(0);   //switching to frame using index --->if there is single frame  
		
		driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
		
//		WebElement rdbutton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", rdbutton);
		
//		driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();
		
//		driver.findElement(By.xpath("//span[normalize-space()='Choose']")).click();
		
		
		
		driver.switchTo().defaultContent();
		
		//Frame5
		//click on link
		// switch to inner iframe
		// check logo presence into inner frame
		
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		 
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		
		
		boolean logoDisplayed =  driver.findElement(By.xpath("//a[@id='logo']")).isDisplayed();
		System.out.println(logoDisplayed);
		
		driver.findElement(By.linkText("One Click Install")).click();
		
	}

}
