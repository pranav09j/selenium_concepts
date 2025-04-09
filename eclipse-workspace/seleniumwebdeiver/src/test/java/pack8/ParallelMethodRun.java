package pack8;

import org.testng.annotations.Test;

public class ParallelMethodRun {

	@Test
	void one()
	{
		System.out.println("first" + Thread.currentThread().getId());
	}
	
	@Test
	void second()
	{
		
		System.out.println("Second"+ Thread.currentThread().getId());
	}
	
	@Test
	void third()
	{
		System.out.println("Third" + Thread.currentThread().getId());
	}
}
