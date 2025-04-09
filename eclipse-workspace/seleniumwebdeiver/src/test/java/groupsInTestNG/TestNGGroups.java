package groupsInTestNG;

import org.testng.annotations.Test;

public class TestNGGroups {
	
	@Test(groups="functional")
	public void testFunctional()
	{
		System.out.println("Funtional test Executed...");
	}

	
	@Test(groups="smoke")
	public void testSmoke()
	{
		System.out.println("Smoke test Executed...");
	}
	
	@Test(groups= {"functional, regression"})
	public void testFunctionalAndRegression()
	{
		System.out.println("Functional and Regression  test Executed...");
	}

}
