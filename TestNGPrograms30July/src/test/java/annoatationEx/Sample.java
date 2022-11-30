package annoatationEx;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	@BeforeMethod
	public void setup()
	{
		System.out.println("Before method");
	}
		

	@AfterMethod
	public void teardown()
	{
		System.out.println("After method");
	}

	@Test
	public void test1()
	{
		
		System.out.println("test1 method");	
		
	}
		
	@Test
	public void test2()
	{
		
		System.out.println("test2 method");	
		
	}

	
	@Test
	public void test3()
	{
		
		System.out.println("test3 method");	
		
	}
	
	//==========================================================
	
	@BeforeClass
	
	public void beforeclassM()
	{
	   System.out.println("Before class method");	
	}
	
    @AfterClass
	
	public void afterclassM()
	{
    	 System.out.println("After class method");
	}
	//====================================================
	
   @BeforeTest
	
	public void beforetestM()
	{
	   System.out.println("Before test method");	
	}
	
    @AfterTest
	
	public void aftertestM()
	{
    	 System.out.println("After test method");
	}
	
	//=================================================
    
    @BeforeSuite
	
	public void beforesuiteM()
	{
	   System.out.println("Before suite method");	
	}
	
    @AfterSuite
	
	public void aftersuiteM()
	{
    	 System.out.println("After suite method");
	}
	
	
	
}
