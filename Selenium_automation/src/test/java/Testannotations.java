import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Testannotations {

	
	@Test()
	void m1()
	{
		System.out.println("This is testone ");
	}
	
	@Test()
	void m2()
	{
		System.out.println("This is testtwo ");
	}
	 
	@AfterClass()
	void m3()
	{
		System.out.println("This is after class ");
	}
	
	@BeforeClass()
	void m4()
	{
		System.out.println("This is before class ");
	}
	
	@AfterMethod()
	void m()
	{
		System.out.println("This is after method  ");
	}
	
	@BeforeMethod()
	void n()
	{
		System.out.println("This is before method ");
	}
	
	@AfterSuite()
	void n1()
	{
		System.out.println("This is after suite ");
	}
	@BeforeSuite()
	void n3()
	{
		System.out.println("This is before suite ");
	}
}
