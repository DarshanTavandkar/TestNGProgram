package assertion.Ex;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Display2 {
	
	SoftAssert sa=new SoftAssert();
	
	String b="xyza";
	@Test
	
	public void test1()
	{
		System.out.println("-----1------");
		System.out.println("-----2------");
		sa.assertEquals(10,20);
		System.out.println("-----3------");
		System.out.println("-----4------");
		sa.assertAll();	
	}
	@Test
	public void test2()
	{
		System.out.println("-----5------");
		System.out.println("-----6------");
		
		
		System.out.println("-----7------");
		System.out.println("-----8------");
	}
	
	
	
}
