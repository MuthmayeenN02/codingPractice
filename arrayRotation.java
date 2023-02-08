import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int d = 3;
		int n = arr.length;
		for(int i : arr){
		    System.out.print(i + " ");
		}
		System.out.println("");
		int[] temp = new int[n];
		int k = 0;
		for(int i = d; i < n; i++){
		    temp[k] = arr[i];
		    k++;
		}
		for(int i = 0; i < d; i++){
		    temp[k] = arr[i];
		    k++;
		}
		for(int i = 0; i < n; i++){
		    arr[i] = temp[i];
		}
		for(int i : arr){
		    System.out.print(i + " ");
		}
	}
}
// output:
// 1 2 3 4 5 6 7 
// 4 5 6 7 1 2 3

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int d = 3;
		int n = arr.length;
		int p = 1;
		while(p  <= d){
		    int last = arr[0];
		    for(int i = 0; i < n-1; i++){
		        arr[i] = arr[i+1];
		    }
		    arr[n-1] = last;
		    p++;
		}
		for(int i : arr){
		    System.out.print(i + " ");
		}
	}
}
//  output:
//  4 5 6 1 2 3
