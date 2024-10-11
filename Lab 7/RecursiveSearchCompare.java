public class RecursiveSearchComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Getting the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of random integers
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // Random numbers between 0 and 99
        }

        // Asking user for the target value to search
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        // Time for iterative search
        long startIterative = System.nanoTime();
        int iterativeResult = IterativeSearch.searchIterative(arr, target);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time for recursive search
        long startRecursive = System.nanoTime();
        int recursiveResult = RecursiveSearch.searchRecursive(arr, target, 0);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        // Displaying the results
        System.out.println("Iterative Search Result: " + (iterativeResult == 1 ? "Found" : "Not Found"));
        System.out.println("Recursive Search Result: " + (recursiveResult == 1 ? "Found" : "Not Found"));

        // Displaying the time taken by both approaches
        System.out.println("Time taken by Iterative search: " + timeIterative + " nanoseconds");
        System.out.println("Time taken by Recursive search: " + timeRecursive + " nanoseconds");

        if (timeIterative < timeRecursive) {
            System.out.println("Iterative search is faster.");
        } else {
            System.out.println("Recursive search is faster.");
        }

        scanner.close();
    }
}
