package Simple_Programs;

public class VowelsFinding {
	public static void main(String[] args) {
		String a="Bhola";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' || a.charAt(i)=='e'|| a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {

				System.out.println(a.charAt(i));
				count++;
				
			}
		}System.out.println(count);
	}

}
