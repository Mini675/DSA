import java.util.Scanner;

public class FibonacciIterative {

    public static void A(int N) {
        int a = 0, b = 1, next;
        
        System.out.print("Fibonacci Series (Iterative): ");
        
        for (int i = 1; i <= N; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
