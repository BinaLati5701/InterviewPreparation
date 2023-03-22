package LinkedList;

 class LinkedList {
     static Node head;

     static class Node {

         int data;
         Node next;

         //constructor
         Node(int d)
         {
             data = d;
             next = null;
         }
     }
//region Time Complexity: O(N), Traversing over the linked list of size N.
     /* Function to reverse the linked list */
     Node reverse(Node node)
     {
         Node prev = null;
         Node current = node;
         Node next = null;
         while (current != null) {
             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         node = prev;
         return node;
     }
     //endregion

     // prints content of double linked list
     void printList(Node node)
     {
         while (node != null) {
             System.out.print(node.data + " ");
             node = node.next;
         }
     }

     // Driver Code
     public static void main(String[] args)
     {
         //First example
         LinkedList list = new LinkedList();
         list.head = new Node(1);
         list.head.next = new Node(2);
         list.head.next.next = new Node(3);
         list.head.next.next.next = new Node(4);
         list.head.next.next.next.next = new Node(5);

         System.out.println("Given linked list");
         list.printList(head);
         head = list.reverse(head);
         System.out.println("");
         System.out.println("Reversed linked list ");
         list.printList(head);

         //Second example
         LinkedList list2 = new LinkedList();
         list2.head = new Node(1);
         list2.head.next = new Node(2);

         System.out.println("\nGiven linked list");
         list2.printList(head);
         head = list2.reverse(head);
         System.out.println("");
         System.out.println("Reversed linked list ");
         list2.printList(head);

         //Third example
         LinkedList list3 = new LinkedList();
         list3.head = new Node(0);

         System.out.println("\nGiven linked list");
         list3.printList(head);
         head = list3.reverse(head);
         System.out.println("");
         System.out.println("Reversed linked list ");
         list3.printList(head);

     }
}
