package basicTestNG;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 5)
	public void xyz()
	{
		
		System.out.println("xyz method");	
		
	}
	
	@Test
	public void pqr()
	{
		
		System.out.println("pqr method");	
		
	}
	
	@Test
	public void abc()
	{
		
		System.out.println("abc method");	
		
	}
	
	@Test
	public void efg()
	{
		
		System.out.println("efg method");	
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
