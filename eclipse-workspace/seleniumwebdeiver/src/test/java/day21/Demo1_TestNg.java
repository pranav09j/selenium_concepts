package day21;

import org.testng.annotations.Test;

public class Demo1_TestNg {
	
	@Test(priority=1)
	void openWebsite()
	{
		System.out.println("I am open Method");
	}
	
	@Test(priority=2)
	void loginToWebsite()
	{
		System.out.println("I am loginToWebsite Method");
	}
	
	@Test(priority=3)
	void close()
	{
		
		System.out.println("I am close Method");
	}
	
	

}
