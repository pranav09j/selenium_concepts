
package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		//location of properties file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\ExcelData\\config.properties");
		
		//loading properties file
		Properties propertiesobj = new Properties();
		propertiesobj.load(file);
		
		//reading data from properties file
		 String url = propertiesobj.getProperty("appurl");
		 String email = propertiesobj.getProperty("email");
		 String pass = propertiesobj.getProperty("password");
		 String ordid = propertiesobj.getProperty("orderid");
		 String custid = propertiesobj.getProperty("customerid");
		 
		 System.out.println(url+ " "+ email+"  "+ pass+"  "+ordid+"  "+custid);
	}

}
