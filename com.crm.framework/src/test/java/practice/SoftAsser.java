package practice;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class SoftAsser {
	@Test
	public void createCustomerTest()
	{
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("B", "B");
		System.out.println("step3");
		System.out.println("step4");
	}
	@Test
	public void modifyCustomerTest()
	{
		System.out.println("__________________________________________");
		System.out.println("step1");
		System.out.println("step1");
		System.out.println("step3");
	}

}
