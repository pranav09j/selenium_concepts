package day21;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 {

	public static void main(String[] args) {
		
//		static  table
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total no of rows
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();   //multiple web table
		
		System.out.println("Total no of rows" + " " + rows);
		
//		int rows = driver.findElements(By.tagName("tr")).size();            // single web table
		 
//		System.out.println("Total no of rows" + " " + rows);
		
		
		//Find total no of columns
		
		int columns =  driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]//th")).size();
		
		System.out.println("Total no of columns" + " " +columns);
		

		// Read specific data from row and column
		
		String val  = driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]//td[1]")).getText();
		
		System.out.println(val);
		
		//Read data from all the rows and columns
		
		System.out.println("BookName"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int i=2; i<=rows; i++)
		{
			for(int j=1; j<=columns; j++)
			{
				String value =driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+ "\t");
				
			}
			System.out.println();
		}
		
		System.out.println("******************************************");
		
		//Print all the books whose author is Mukesh
		
//		for(int r=2; r<=rows; r++)
//		{
//			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
//			if(author.equals("Mukesh"))
//			{
//				System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText() + "\t" + author);
//			}
//		}
		
		// find total price of all the books
		
		int total=0;
		for(int r=2; r<=rows; r++)
		{
			String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total = total + Integer.parseInt(price) ;
			
		}
		System.out.println("Total price of all the books"+total);
		
		
		
		
		
	}

}
