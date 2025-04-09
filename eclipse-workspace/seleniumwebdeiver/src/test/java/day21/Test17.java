package day21;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Test17 {

	public static void main(String[] args) throws InterruptedException {

		//Assignment on table and array concept
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		WebElement drpdown1 = driver.findElement(By.xpath("//select[1]"));
		
		WebElement drpdown2 = driver.findElement(By.xpath("//select[2]"));
		
		Select s1= new Select(drpdown1);
		
		s1.selectByValue("Boston");
		
		Select s2= new Select(drpdown2);
		
		s2.selectByValue("London");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		int rows = driver.findElements(By.tagName("tr")).size();
		System.out.println("No of rows"+ rows);
		
		int columns = driver.findElements(By.tagName("th")).size();
		System.out.println("No of columns" + columns);
		
		String[] arr1 = new String[6];
		
		for(int r=2; r<rows; r++)
		{
			
			
			String val =  driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[6]")).getText();
			
//			System.out.println(val);
			
			arr1[r] = val;
			
		
			
		}
		arr1[0]="1";
		arr1[1] = "2";
//		System.out.println(Arrays.toString(arr1));
		
	
		Arrays.sort(arr1);
		
		System.out.println("After sorting"+ Arrays.toString(arr1));
		
		System.out.println(arr1[0]);
		
		for(int r=1; r<rows; r++)
		{
			 List<WebElement> prices = driver.findElements(By.xpath("//table//tbody//tr["+r+"]//td[6]"));
			 
			 for(WebElement p: prices)
			 {
				 
				 if(p.getText().equals(arr1[0]))
				 {
					 driver.findElement(By.xpath("//table//tbody//tr["+r+"]//td[1]")).click();
				 }
			 }

		}
		
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='inputName']")).sendKeys("Pranav");
		driver.findElement(By.name("address")).sendKeys("Wai");
		driver.findElement(By.name("city")).sendKeys("wai");
		driver.findElement(By.name("state")).sendKeys("MH");
		driver.findElement(By.name("zipCode")).sendKeys("412803");
	

		WebElement select = driver.findElement(By.xpath("//select[@name='cardType']"));
		Select s3 = new Select(select);
		s3.selectByValue("visa");

		driver.findElement(By.id("creditCardNumber")).sendKeys("1324556663");
		driver.findElement(By.id("nameOnCard")).sendKeys("Pranav Jadhav");
		
		driver.findElement(By.name("rememberMe")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		String text = driver.findElement(By.xpath("//h1")).getText();
		
		if(text.equals("Thank you for your purchase today!"))
		{
			System.out.println("Test case Pass");
		}
		else {
			System.out.println("Test case failed");
		}
		
	}


}
