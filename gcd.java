import java.util.*;
public class Main
{
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	   // int a = nextInt();
	   // int b = nextInt();
	    int a = 98, b = 56;
	    System.out.println(gcd(a, b)); //output 14
	}
}
