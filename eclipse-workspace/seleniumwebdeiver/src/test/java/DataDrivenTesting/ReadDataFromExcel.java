package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static String[][] getData() throws IOException
	{
		
		//reading data from excel
		File f = new File("./ExcelData/Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum();
		
		int cols = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of rows:"+rows);
		System.out.println("Number of columns:"+cols);
		
		String a[][] = new String[rows][cols];
		
		for(int i=1; i<=rows; i++)
		{
		
				XSSFRow current_row = sheet.getRow(i);
			 
			 for(int j=0; j<cols; j++)
			 {
				XSSFCell cell = current_row.getCell(j);
				a[i-1][j] = cell.toString();
			 }
			 
			
		}
		
		return a;
		
	}
	

}
