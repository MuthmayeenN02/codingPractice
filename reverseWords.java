import java.util.*;
public class Main{
    static String reverseWords(String str){
        String s[] = str.split(" ");
        String string = "";
        for (int i = s.length -1; i >= 0; i--){
            string = string + s[i] + " ";
        }
        return string;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String string =  reverseWords(str);
        System.out.println(string);
    }
}
// output:
// hello Muthmayeen N
// N Muthmayeen hello 
