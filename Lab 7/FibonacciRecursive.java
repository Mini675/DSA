public class FibonacciRecursive {

    public static int fibonacciRecursive(int N) {
        if (N <= 1)
            return N;
        return fibonacciRecursive(N - 1) + fibonacciRecursive(N - 2);
    }

    public static void printFibonacciRecursive(int N) {
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }
}
