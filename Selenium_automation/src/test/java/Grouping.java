import org.testng.annotations.Test;

public class Grouping {
	
	@Test(groups= {"smoke"})
	void m1()
	{
		System.out.println("This is testone ");
	}
	
	@Test()
	void m2()
	{
		System.out.println("This is testtwo ");
	}
	
	@Test(groups= {"smoke"})
	void m3()
	{
		System.out.println("This is test three  ");
	}
	
	@Test()
	void m4()
	{
		System.out.println("This is test four  ");
	}

}
