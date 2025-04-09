package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {


	WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		String filePath = System.getProperty("user.dir") + "\\ExcelData\\caldata.xlsx";
		
		int rows = ExcelUtils.getRowCount(filePath, "Sheet1");
		
		for(int i=1; i<=rows; i++)
		{
			//1)read data from excel
			
			 String princ= ExcelUtils.getCellData(filePath, "Sheet1", i, 0);
			 String rateofinterest= ExcelUtils.getCellData(filePath, "Sheet1", i, 1);
			 String per1= ExcelUtils.getCellData(filePath, "Sheet1", i, 2);
			 String per2= ExcelUtils.getCellData(filePath, "Sheet1", i, 3);
			 String fre = ExcelUtils.getCellData(filePath, "Sheet1", i, 4);
			 String exp_mvalue = ExcelUtils.getCellData(filePath, "Sheet1", i, 5);
			 
			//pass above data into application
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1);
			Select perdrp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			perdrp.selectByVisibleText(per2);
			
			Select freqdrp = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			freqdrp.selectByVisibleText(fre);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			//validation
			 String act_mvalue= driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			 try
			 {
					if(Double.parseDouble(exp_mvalue) == Double.parseDouble(act_mvalue))
					{
						System.out.println("Test passed");
						ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Passed");
						ExcelUtils.fillGreenColor(filePath, "Sheet1", i, 7);
					}
					else
					{
						System.out.println("Test failed");
						ExcelUtils.setCellData(filePath, "Sheet1", i, 7, "Failed");
						ExcelUtils.fillRedColor(filePath, "Sheet1", i, 7);
					}
			 }
			 catch(Exception e)
			 {
				 System.out.println("NUmberFormatExceptionOccured");
			 }
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();  //clicked on clear button
			
		}
		
		driver.close();

	}

}
