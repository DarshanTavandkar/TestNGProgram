package basicTestNG;

import org.testng.annotations.Test;

public class PriorityKeyword {

	@Test(priority = 4)
	public void xyz()
	{
		
		System.out.println("xyz method");	
		
	}
	
	@Test(priority = 3)
	public void pqr()
	{
		
		System.out.println("pqr method");	
		
	}
	
	@Test(priority = 1)
	public void abc()
	{
		
		System.out.println("abc method");	
		
	}
	
	@Test(priority = 2)
	public void efg()
	{
		
		System.out.println("efg method");	
		
	}

	
	
	
}
