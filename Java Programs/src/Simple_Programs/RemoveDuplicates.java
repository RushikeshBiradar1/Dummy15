package Simple_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		 String a="Rushikeshhhhhsss";
		 LinkedHashSet<Character> hash = new LinkedHashSet<>();
		 for(int i=0;i<a.length();i++)
		 {
			 hash.add(a.charAt(i));
		 }
		 for(char t: hash) {
		 System.out.print(t);
		 }
	}

}
