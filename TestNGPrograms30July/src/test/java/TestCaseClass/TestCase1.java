package TestCaseClass;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
     
	@Test
	public void test1()
	{
		
		System.out.println("test1 method");	
		Reporter.log("test1 passed");
		
	}
		
	@Test
	public void test2()
	{
		
		System.out.println("test2 method");	
		Reporter.log("test2 passed");
		
	}

	@Test
	public void test3()
	{
		
		System.out.println("test3 method");	
		Reporter.log("test3 fail");
		Assert.fail();
		
	}
	
		}	
	
