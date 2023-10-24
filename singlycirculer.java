package DSA.Linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class singlycirculer {
    public static Node tail = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n\nCircular Linked List Operations\n");
            System.out.println("1. Insert at the beginning");
            System.out.println("2. Insert at the end");
            System.out.println("3. Insert at a specific position");
            System.out.println("4. Delete from the beginning");
            System.out.println("5. Delete from the end");
            System.out.println("6. Delete from a specific position");
            System.out.println("7. Display the linked list");
            System.out.println("8. Exit program");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    insertBegin();
                    break;
                case 2:
                    insertEnd();
                    break;
                case 3:
                    insertPos();
                    break;
                case 4:
                    deleteBegin();
                    break;
                case 5:
                    deleteEnd();
                    break;
                case 6:
                    deletePos();
                    break;
                case 7:
                    displayList();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice");
                    break;
            }
        }
    }

    public static void insertBegin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter element to insert at the beginning: ");
        int Data = scanner.nextInt();

        Node newNode = new Node(Data);

        if (tail == null) { // if the link is empty
            tail = newNode; // make new node as tail
            newNode.next = tail; // make newnode point itself
        } else {
            // if list is not empty
            newNode.next = tail.next; // make newnode point to first node
            tail.next = newNode; // tail point to the newnode

        }

        System.out.println("Node inserted at the beginning");
    }

    public static void insertEnd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter element to insert at the end: ");
        int Data = scanner.nextInt();

        Node newNode = new Node(Data);

        if (tail == null) { // if the link is empty
            tail = newNode; // make new node as tail
            newNode.next = tail; // make newnode point itself

        } else {
            // if list is not empty
            newNode.next = tail.next; // make newnode point to first node
            tail.next = newNode; // tail point to the newnode
            tail = newNode; // Make the new node as the tail

        }

        System.out.println("Node inserted at the end");
    }

    public static void insertPos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the postion to 1");
        int pos = scanner.nextInt();
        System.out.println("Enter the element to isert poition " + pos);
        int newData = scanner.nextInt();

        // If the position is invalid, print an error message and return
        if (pos < 1) {
            System.out.println("Invalid position");
            return;
        }

        // Create a new node with the given data
        Node newNode = new Node(newData);

        // If the list is empty, make the new node as the tail and point it to itself
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        }
        // If the position is 1, make the new node as the head and adjust the tail
        // pointer
        else if (pos == 1) {
            newNode.next = tail.next;
            tail.next = newNode;
        }
        // Otherwise, traverse the list until the previous node of the position is found
        // or the end of the list is reached and insert the new node after it
        else {
            Node ptr = tail.next; // the previous node of the position
            int count = 1; // the counter for the position
            while (count < pos - 1 && ptr != tail) { // loop until pos - 2 or end of list
                ptr = ptr.next; // move to the next node
                count++; // increment the counter
            }
            newNode.next = ptr.next; // link the new node to the next node of the previous node
            ptr.next = newNode; // link the previous node to the new node

            // If the end of the list is reached, make the new node as the tail and adjust
            // the tail pointer
            if (ptr == tail) {
                // tail = newNode;
                System.out.println("invalid position");
            }
        }

    }

    public static void deleteBegin() {
        // check if the list is empty
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        // check if the list has only one node
        if (tail.next == tail) {
            // free the node and set tail to null
            tail = null;
        } else {
            // store the first node in a temporary variable
            Node temp = tail.next;
            // make the second node as the new first node
            tail.next = temp.next;
            // free the first node
            temp = null;
        }
        System.out.println("First node deleted");

    }

    public static void deleteEnd() {
        // check if the list is empty
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        // check if the list has only one node
        if (tail.next == tail) {
            // free the node and set tail to null
            tail = null;
        } else {
            // store the last node in a temporary variable
            Node temp = tail;
            // find the second last node by traversing the list
            while (temp.next != tail) {
                temp = temp.next;
            }
            // make the second last node as the new last node
            temp.next = tail.next;
            // free the old last node
            temp = null;
        }
        System.out.println("Last node deleted");
    }

    public static void deletePos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter postion to delete node");
        int position = scanner.nextInt();
        // If the list is empty, return
        if (tail == null) {
            System.out.println("Empty list");
            return;
        }

        // If the position is 1, delete the head node and update tail
        if (position == 1) {
            if (tail == tail.next) { // the list has only one node
                tail = null;
            } else {
                tail.next = tail.next.next;
            }
            return;
        }

        // Initialize two pointers: current and previous
        Node current = tail.next; // the head of the list
        Node previous = tail;

        // Traverse the list until the position or the end is reached
        int count = 1;
        while (count < position && current != tail) {
            previous = current;
            current = current.next;
            count++;
        }

        // If the position is valid, delete the current node and update previous
        if (count == position) {
            previous.next = current.next;

            // If the current node is tail, update it to previous
            if (current == tail) {
                tail = previous;
            }
        } else {
            // Otherwise, print an error message
            System.out.println("Invalid position");
        }
        System.out.println("position node deleted");
    }

    // A method to display the nodes of the list

    public static void displayList() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail.next;

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(Back to tail)");
    }
}
