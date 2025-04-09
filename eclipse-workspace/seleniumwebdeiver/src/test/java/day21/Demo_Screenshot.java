package day21;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Screenshot {

	public static void main(String[] args) throws IOException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.get("https://demo.nopcommerce.com/");
		
//		TakesScreenshot ts = (TakesScreenshot) driver;

		//Taking screenshot of full page
		
//		File source_file = ts.getScreenshotAs(OutputType.FILE);
//		
//		File target_file = new File("D:\\Photos\\pranav.png");
//		
//		FileUtils.copyFile(source_file, target_file);
		
		
//		 WebElement name_field = driver.findElement(By.xpath("//input[@id='name']"));
//		
//		File source =  name_field.getScreenshotAs(OutputType.FILE);
		
//		File target = new File("./Screenshot/pranav.png");
//		File target = new File(System.getProperty("user.dir")+"\\Screenshot\\pankaj.png");
//		
//		FileUtils.copyFile(source, target);
//		
		
		//capture the screenshot of specific section
		
		 WebElement featuredProducts = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		 
		 File sourceFile = featuredProducts.getScreenshotAs(OutputType.FILE);
		 
		 File targetFile = new File(System.getProperty("user.dir")+ "\\Screenshot\\prouct.jpg");
		 
		 sourceFile.renameTo(targetFile);    // copy source file to target file
		 
		 
		 //Capture Screenshot of specific element
		 
		 WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 
		 File src_file= logo.getScreenshotAs(OutputType.FILE);
		 
		 File tgt_file = new File(System.getProperty("user.dir")+"\\Screenshot\\logo.png");
		 
		 src_file.renameTo(tgt_file);
		
//		driver.close();
		
	}

}
