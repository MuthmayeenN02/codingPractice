import java.util.*;
public class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 3, 5, 3, 1, 5, 4};
		int n = arr.length;
		boolean[] a = new boolean[n];
		Arrays.fill(a, false);
		for(int i=0; i<n; i++){
		    if(a[i] == true) continue;
		    int count = 0;
		    for(int j=i; j<n; j++){
		        if(arr[i] == arr[j]){
		            count++;
		            a[j] = true;
		        }
		        
		    }
		    System.out.println(arr[i] + " " + count );
		}
	}
}
// output:
// Hello World
// 1 2
// 3 2
// 5 2
// 4 1
