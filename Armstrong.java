import java.util.*;
public class Main
{
    static int digits(int num){
            int count = 0;
            while(num > 0){
                count ++;
                num = num /10;
            }
            return count;
        }
    static boolean isArmstrong(int num){
        int N = digits(num);
        int sum = 0;
        int temp = num;
        while(temp > 0){
            int r = temp % 10;
            sum += Math.pow(r, N);
            temp = temp / 10;
        }
        return sum == num;
    }
    
    public static void main (String[]args)
  {
    // Scanner sc = new Scanner (System.in);
    // int n = sc.nextInt();
    System.out.println("Hello");
    System.out.println(isArmstrong(1634));
    System.out.println(isArmstrong(134));
    System.out.println(isArmstrong(153));
  }
}
// Output :
// Hello
// true
// false
// true

// Python
def order(x):
    n = 0
    while (x != 0):
        n = n+1
        x = x/10
    return n

def isArmstrong(x):
    n = order(x)
    temp = x
    sum1 = 0
    while (temp != 0):
        r = temp % 10
        sum1 = sum1 + pow(r, n)
        temp = temp/10
 
    # If condition satisfies
    return (sum1 == x)
 
 
# Driver Program
x = 153
print(isArmstrong(x))
x = 1253
print(isArmstrong(x))
