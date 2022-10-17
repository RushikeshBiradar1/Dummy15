package practice;

import org.testng.annotations.Test;

public class dependsOnMethod
{
	@Test
	public void create1()
	{
		System.out.println("hi");
		int a=10,b=0,c;
		c=a%b;
		
	}
	@Test(dependsOnMethods = "create1")

	public void modify()
	{
		System.out.println("hi");
	}
	@Test(dependsOnMethods = "create1")

	public void delete()
	{
		System.out.println("delete");
	}

}
