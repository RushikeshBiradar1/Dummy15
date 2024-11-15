package Simple_Programs;

public class arm {
	public static void main(String[] args) {
	int a=407,b,rev=0,temp=a;
	while(a>0)
	{
		b=a%10;
		a=a/10;
		rev=rev+(b*b*b);
	}
	if(temp==rev)
	{
		System.out.println("");
	}
	
	}

}
