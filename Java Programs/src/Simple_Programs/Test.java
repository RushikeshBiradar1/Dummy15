package Simple_Programs;

public class Test {
	public static void main(String[]args)
	{
		
		//palin
		int a=121,b,rev=0,temp=a;
		while(a>0)
		{
			b=a%10;
			a=a/10;
			rev=(rev*10)+b;
		}
		if (temp==rev) {
			System.out.println("pali");

		}else
		{
			System.out.println("no");
		}
	}
}
