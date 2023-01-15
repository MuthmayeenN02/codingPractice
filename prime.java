import java.util.*;
public class Main
{
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        for(int i = 3; i <=  Math.sqrt(n); i+=2 ){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		boolean primeInfo = isPrime(79);
		if(primeInfo){
		    System.out.println("Yes, its prime");
		}else{
		    System.out.println("No, its prime");
		}
	}
}
// Output :
// Hello World
// Yes, its prime
