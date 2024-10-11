class LinkedListIterative {

    public static void printIterative(Node head) {
        Node current = head;
        System.out.print("Linked List (Iterative): ");
        
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
