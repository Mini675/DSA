class LinkedListRecursive {

    public static void printRecursive(Node head) {
        if (head == null) {
            return;
        }
        
        System.out.print(head.data + " ");
        printRecursive(head.next);
    }

    public static void printList(Node head) {
        System.out.print("Linked List (Recursive): ");
        printRecursive(head);
        System.out.println();
    }
}
