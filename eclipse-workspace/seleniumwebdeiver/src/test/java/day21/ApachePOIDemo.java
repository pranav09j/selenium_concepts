package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApachePOIDemo {

	public static void main(String[] args) throws IOException {

		
		File f1 = new File("./ExcelData/testdata.xlsx");
//		File f1 = new File(System.getProperty("user.dir")+ "\\ExcelData\\testdata.xlsx");
		
		//open file in reading mode
		FileInputStream file = new FileInputStream(f1);
		
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
//		XSSFSheet sheet = wb.getSheetAt(0);
		
		 int totalRows = sheet.getLastRowNum();
		 
		 int totalCells = sheet.getRow(0).getLastCellNum();
		 
		 System.out.println("Number of rows " + totalRows);
		 
		 System.out.println("Number of Cells "+ totalCells);
		 
		 
		 for(int r=0; r<=totalRows;r++ )
		 {
			 for(int c=0; c<totalCells; c++)
			 {
				  XSSFCell cell = sheet.getRow(r).getCell(c);
				  System.out.print( cell.toString() + "\t");
				 
			 }
			 System.out.println();
		 }
		
		 wb.close();
		 file.close();

	}

}
