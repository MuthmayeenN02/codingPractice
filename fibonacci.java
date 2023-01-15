public class Main
{
    static void fibonacci(int n){
        int n1 = 0, n2 = 1;
        for (int i = 0; i < n; i++){
            System.out.print(n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 10;
		fibonacci(n);
	}
}
// output:
// Hello World
// 0 1 1 2 3 5 8 13 21 34 
