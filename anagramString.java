import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		String s1,s2, str1,str2;
		str1 = input.nextLine();
		str2 = input.nextLine();
		s1 = str1.toLowerCase();
		s2 = str2.toLowerCase();
		if (s1.length() != s2.length()){
		    System.out.println(str1 + " and " + str2 + " are not anagram");
		}else{
		    char[] c1 = s1.toCharArray();
		    char[] c2 = s2.toCharArray();
		    Arrays.sort(c1);
		    Arrays.sort(c2);
		    boolean isEqual = Arrays.equals(c1, c2);
		    if (isEqual == true){
		        System.out.println(str1 + " and " + str2 + " are anagram");
	    	}else{
		        System.out.println(str1 + " and " + str2 + " are not anagram");
	    	}
		}
	}
}
// output:
// Hello World
// Ball
// Llab
// Ball and Llab are anagram
