import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int number = num;
        int rev = 0;
        int last = 0;
        do{
            last = num % 10;
            rev = rev*10 + last;
            num = num / 10;
        }while(num != 0);
        System.out.println("reverse of " + number + " is " + rev);
	}
}

// output:
// Hello World
// 1234
// reverse of 1234 is 4321
