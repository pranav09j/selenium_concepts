package day21;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks_demo {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		 System.out.println("Number of links:"+ links.size());
		 
		 int numberofbrokenlinks = 0;
		 for(WebElement link : links)
		 {
			
			
			@SuppressWarnings("deprecation")
			String url_value = link.getAttribute("href");
			
			if(url_value == null || url_value.isEmpty())
			{
				System.out.println("href is empty or null , so we can't check");
				continue;
			}
			
			//Hit url to the server
			try {
				
				URL myurl = new URL(url_value);  //convert href value from string to URL format
				
				URLConnection conn = myurl.openConnection();   // open connection to server
				HttpURLConnection  co = (HttpURLConnection) conn ;   
				co.connect();               //connect to sever and send the request to server
				
//			 HttpURLConnection conn = (HttpURLConnection) myurl.openConnection();
//			 conn.connect();
				if(co.getResponseCode() >=400)
				{
					System.out.println(myurl + "link is broken");
					numberofbrokenlinks++;
				}
				else
				{
					System.out.println("This is not broken URL");
				}
				
			}
			catch(Exception e)
			{
				System.out.println("Exception occured");
			}
			
		 }

		 System.out.println(numberofbrokenlinks);
		 System.out.println("End");
		 driver.close();
	}

}
