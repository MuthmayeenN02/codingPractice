import java.util.*;
public class Main{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 3, 5, 3, 1, 5, 4};
		int n = arr.length;
		ArrayList<Integer> disc = new ArrayList<Integer>();
		disc.add(arr[0]);
		for(int i=1; i<n; i++){
		    int temp = 1;
		    for(int j=0; j<i; j++){
		        if(arr[i] == arr[j]){
		            temp = 0;
		            break;
		        }
		    }
		    if(temp == 1){
		        disc.add(arr[i]);
		    }
		    
		}
		int N = disc.size();
// 		for(int i=0; i<N; i++){
// 		    System.out.println(disc.get(i));
// 		}
		int[] newArray = new int[N];
		for(int i=0; i<N; i++){
		    newArray[i] = disc.get(i).intValue();
		}
		for(int i : newArray){
		    System.out.print(i + " ");
		}
	}
}
// Output:
// Hello World
// 1 3 5 4 

