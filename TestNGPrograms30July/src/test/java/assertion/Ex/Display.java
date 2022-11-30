package assertion.Ex;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Display {
	
	String b="xyza";
	@Test
	
	public void test1()
	{
		System.out.println("-----1------");
		System.out.println("-----2------");
		
	//	Assert.assertEquals(10, 20);
		
		boolean a=10>20;
		Assert.assertTrue(a);
		System.out.println("-----3------");
		System.out.println("-----4------");
		
		
	}
	@Test
	public void test2()
	{
		System.out.println("-----5------");
		System.out.println("-----6------");
		
		Assert.assertNotNull(b);
		System.out.println("-----7------");
		System.out.println("-----8------");
	}
	
	
	
}
