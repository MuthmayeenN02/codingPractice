import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		ArrayList<Integer> arrli = new ArrayList<Integer>();
	    arrli.add(9);
	    arrli.add(10);
	    arrli.add(11);
	    arrli.add(12);
	    arrli.remove(0);
	    System.out.println(arrli.size());
	    for(int i : arrli){
	        System.out.println(i);
	    }
	    int[] arr = new int[arrli.size()];
	    for(int i =0; i<arrli.size(); i++){
	        arr[i] = arrli.get(i).intValue();
	    }
	}
}
// output:
// Hello World
// 3
// 9
// 11
// 12
