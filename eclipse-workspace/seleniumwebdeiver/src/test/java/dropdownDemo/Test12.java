package dropdownDemo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args) {

		
		//Bootstrap Dropdown

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");

		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();	//opens dropdown options
		
		//Select single option
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//Capture all the options from dropdown and find out size
		
		 List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		 System.out.println("No of options"+ " "+options.size());
		 
		 //print all the options
		 
		 for(int i=0; i< options.size(); i++)
		 {
			 
			 System.out.println(options.get(i).getText());
		 }
		 
		 //Select multiple options
		 
		 for( WebElement op: options)
		 {
			 String option = op.getText();
			 
			 if(option.equals("Java") || option.equals("Python") || option.equals("MySQL"))
			 {
				 op.click();
			 }
			 
		 }
	
	}

}
