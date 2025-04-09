package dependsOnMethodDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 {
	
	@Test(priority=1)
	void login()
	{
		
		System.out.println("I am login method");
		
		Assert.assertTrue(false);
	}
	
	@Test(priority=2, dependsOnMethods="login")
	void search()
	{
		
		System.out.println("I am search ");
	}
	
	@Test(priority=3, dependsOnMethods="search")
	void logout()
	{
		System.out.println("I am logout");
	}

}
