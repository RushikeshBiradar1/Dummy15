package Simple_Programs;

public class rev {
	public static void main(String[] args) {
		String a="Rushikesh";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
  System.out.println(b);
		
	}
}
