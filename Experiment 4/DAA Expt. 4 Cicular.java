/*
Aim : Apply the concept of Linked list and write code to Insert and Delete an element at the 
beginning and at end in Cicular Linked List.
*/

class CircularLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node last;
    public CircularLinkedList() {
        this.last = null;
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (last == null) {
            last = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (last == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (last.next == last) {
            last = null;
        } else {
            last.next = last.next.next;
        }
    }

    public void deleteAtEnd() {
        if (last == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (last.next == last) {
            last = null;
            return;
        }
        
        Node current = last.next;
        while (current.next != last) {
            current = current.next;
        }
        current.next = last.next;
        last = current;
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = last.next;
        System.out.print("Circular list: ");
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != last.next);
        System.out.println("(Head: " + last.next.data + ")");
    }

    public static void main(String[] args) {
        CircularLinkedList cList = new CircularLinkedList();

        System.out.println("Inserting elements into the list...");
        cList.insertAtBeginning(10);
        cList.insertAtEnd(20);
        cList.insertAtBeginning(5);
        cList.display();

        System.out.println("\nDeleting from the beginning...");
        cList.deleteAtBeginning();
        System.out.print("After deleting from beginning: ");
        cList.display();

        System.out.println("\nDeleting from the end...");
        cList.deleteAtEnd();
        System.out.print("After deleting from end: ");
        cList.display();

        System.out.println("\nTesting with an empty list...");
        cList.deleteAtBeginning();
        cList.deleteAtEnd();
        
        System.out.println("\nAdding a single element and deleting it...");
        cList.insertAtBeginning(100);
        cList.display();
        cList.deleteAtBeginning();
        System.out.print("After deleting the only element: ");
        cList.display();
    }
}
