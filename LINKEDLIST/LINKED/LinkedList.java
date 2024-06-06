package LINKEDLIST.LINKED;

public class LinkedList {

  public static class Node {

    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {
    // Step-1: Create a new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
    } else {
      // Step-2: New node's next will point to Head
      newNode.next = head;
      // Step-3: Head becomes the new node
      head = newNode;
    }
  }

  public void addLast(int data) {
    // Step-1: Create a new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
    } else {
      // Step-2: Set the new node as the next node of the current tail
      tail.next = newNode;
      // Step-3: Update the tail to be the new node
      tail = newNode;
    }
  }

  public void displayList() {
    Node current = head;
    while (current != null) {
      System.out.print( current.data+"->");
      current = current.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedList ll = new LinkedList();
    // ll.addFirst(1);
    // ll.addFirst(2);
    // ll.displayList(); // Display the elements of the linked list
    ll.displayList();
    ll.addLast(10);
    ll.displayList();
    ll.addLast(20);
    ll.displayList();
    ll.addLast(30);
    ll.displayList();
    ll.addLast(40);
    ll.displayList();
    ll.addLast(50);
    ll.displayList();
  }
}
