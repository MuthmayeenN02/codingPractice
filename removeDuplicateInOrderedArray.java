public class Main {
    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n - 1; i++) { // comparing two elements if first two is not same put it
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
 
        a[j++] = a[n - 1]; // adding last element
 
        return j;
    }
    public static void main(String[] args){
        int a[] = { 1, 1, 2, 2, 2,3 };
        int n = a.length;
        n = removeduplicates(a, n);
        // Printing The array elements
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
