import java.util.Scanner;

public class LinkedListMainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of nodes: ");
        int N = scanner.nextInt();

        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= N; i++) {
            current.next = new Node(i);
            current = current.next;
        }

        long startIterative = System.nanoTime();
        LinkedListIterative.printIterative(head);
        long endIterative = System.nanoTime();
        long timeIterative = endIterative - startIterative;

        // Time for recursive approach
        long startRecursive = System.nanoTime();
        LinkedListRecursive.printList(head);
        long endRecursive = System.nanoTime();
        long timeRecursive = endRecursive - startRecursive;

        System.out.println("Time taken by Iterative approach: " + timeIterative + " nanoseconds");
        System.out.println("Time taken by Recursive approach: " + timeRecursive + " nanoseconds");

        if (timeIterative < timeRecursive) {
            System.out.println("Iterative approach is faster.");
        } else {
            System.out.println("Recursive approach is faster.");
        }

        scanner.close();
    }
}
