package testNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestCase {
	
	@Test(priority=1)
	void openapp()
	{
		System.out.println("opening application");
		Reporter.log("open app ....");
	}
	
	@Test(priority=1, invocationCount=3)
	void login()
	{
		System.out.println("Login to application...");
		Reporter.log("Login to app using username and password");
	}
	
	@Test(priority=1)
	void logout()
	{
		System.out.println("Logout from application...");
		Reporter.log("Logout from aweb app....");
	}
	

}
