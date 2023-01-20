import java.util.*;
public class Main
{
    static void printRecerse(int[] arr, int n){
        int temp;
        int start = 0;
        int end = n-1;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;end--;
        }
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {1, 2, 3, 4, 5, 6};
		printRecerse(arr, arr.length);
	}
}
// Output:
// Hello World
// 6 5 4 3 2 1 
