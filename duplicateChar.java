import java.util.*;
public class Main
{
    static void printDuplicate(String string){
        string = string.toLowerCase();
        char[] str = string.toCharArray();
        for(int i=0; i<str.length; i++){
            int count = 1;
            for(int j = i+1; j<str.length; j++){
                if(str[i] == str[j] && str[i] != ' '){
                    count ++;
                    str[j] = '0';
                }
            }
            if(count > 1 && str[i] != '0'){
                System.out.print(str[i] +" ");
            }
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		printDuplicate(str);
	}
}
// Output:
// Muthmayeen N
// m e n 
