import java.util.Scanner;

public class FibonacciRecursion {
    
    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 5) {
            return n;  // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        sc.close();
    }
}
