class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Is aaa palindrom?: " + isPalindromString("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromString("abc"));
        System.out.println("Is bbbb palindrom?: "+ isPalindromString("bbbb"));
        System.out.println("Is defg palindrom?: "+ isPalindromString("defg"));
     
    }
    public static boolean isPalindromString(String text){
        String rev = "";
        boolean output = false;
        for (int i = text.length() - 1; i >=0 ; i--){
            rev = rev + text.charAt(i);
        }
        if (text.equals(rev)){
            output = true;
        }
        return output;
    }
    
}
// output:
// Hello, World!
// Is aaa palindrom?: true
// Is abc palindrom?: false
// Is bbbb palindrom?: true
// Is defg palindrom?: false


// Python
 
def isPalindrome(s):
    return s == s[::-1]
 
 
# Driver code
s = "malayalam"
ans = isPalindrome(s)
print(ans)
        
// C++
#include <iostream>
using namespace std;
string isPalindrome(string S)
{
    string P = S;
    reverse(P.begin(), P.end());
    if (S == P) {
        return "Yes";
    }
    else {
        return "No";
    }
}
 
// Driver Code
int main()
{
    string S = "ABCDCBA";
    cout << isPalindrome(S);
 
    return 0;
}
