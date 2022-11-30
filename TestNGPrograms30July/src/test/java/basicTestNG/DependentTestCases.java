package basicTestNG;

import org.testng.annotations.Test;

public class DependentTestCases {

	@Test(priority=-10)
	public void login()
	{
		System.out.println("login method");
		System.out.println(10/0);
	}
	
	@Test(dependsOnMethods= {"login"})
	public void homepage()
	{
		System.out.println("home method");
	}
	
	@Test(dependsOnMethods= {"login"})
	public void watchvideo()
	{
		System.out.println("watch video method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
