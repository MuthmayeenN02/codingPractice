// calculating count of vowels and consonents
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s = s.toLowerCase();
        int vowels = 0, consonents = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowels += 1;
            }else{
                consonents += 1;
            }
        }
        System.out.println("vowels :" + vowels);
        System.out.println("consonents :" + consonents);
    }
}
// output:
// Hello, World!
// Abe
// vowels :2
// consonents :1
