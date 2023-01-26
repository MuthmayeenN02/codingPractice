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
	    	}
		else{
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


// Python

class Solution:
    def isAnagram(self, a, b):
        if sorted(a) == sorted(b):
            return True
        else:
            return False
if __name__ == '__main__':
    a = "Gram"
    b = "armg"
    a.lower()
    b.lower()
    if(Solution().isAnagram(a, b)):
      print("The two strings are anagram of each other")
    else:
      print("The two strings are not anagram of each other")

// C+
#include <bits/stdc++.h>
using namespace std;
bool areAnagram(string str1, string str2)
{
    int n1 = str1.length();
    int n2 = str2.length();
    if (n1 != n2)
        return false;s
    sort(str1.begin(), str1.end());
    sort(str2.begin(), str2.end());
    for (int i = 0; i < n1; i++)
        if (str1[i] != str2[i])
            return false;
 
    return true;
}
 
// Driver code
int main()
{
    string str1 = "gram";
    string str2 = "arm";
    // Function Call
    if (areAnagram(str1, str2))
        cout << "The two strings are anagram of each other";
    else
        cout << "The two strings are not anagram of each "
                "other";
 
    return 0;
}
