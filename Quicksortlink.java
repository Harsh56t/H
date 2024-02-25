package DSA.Linkedlist;

// Java program for Quick Sort on Singly Linked List 

//Sort a linked list using quick sort/

class Node {

    int data; // the data stored in the node
    Node next; // the reference to the next node

    Node(int d) // the constructor of the node class
    {
        this.data = d; // assign the parameter d to the data field
        this.next = null; // initialize the next field to null
    }
}

public class Quicksortlink { // the class name
    Node head; // the reference to the head node of the list

    public void addNode(int data) { // a method to add a new node to the end of the list
        Node newNode = new Node(data); // create a new node with the given data
        if (head == null) { // if the list is empty
            head = newNode; // assign the new node to the head
        } else { // if the list is not empty
            Node temp = head; // create a temporary node to traverse the list
            while (temp.next != null) { // loop until the last node
                temp = temp.next; // move to the next node
            }
            temp.next = newNode; // link the last node to the new node
        }
    }

    void printList(Node n) // a method to print the data of the nodes in the list
    {
        while (n != null) { // loop until the end of the list
            System.out.print(n.data); // print the data of the current node
            System.out.print(" "); // print a space
            n = n.next; // move to the next node
        }
    }

    // Takes first and last node,
    // but do not break any links in
    // the whole linked list
    Node partitionLast(Node start, Node end) // a method to partition the list using the last node as the pivot
    {
        if (start == end || start == null || end == null) { // base case: if the list is empty or has one node
            return start; // return the start node
        }
        Node pivot_prev = start; // a node to track the position of the previous node of the pivot
        Node curr = start; // a node to track the position of the current node
        int pivot = end.data; // the value of the pivot node

        // iterate till one before the end,
        // no need to iterate till the end
        // because end is pivot
        while (start != end) { // loop until the start node reaches the end node
            if (start.data < pivot) { // if the data of the start node is less than the pivot

                // keep tracks of last modified item
                pivot_prev = curr; // update the pivot previous node to the current node
                int temp = curr.data; // swap the data of the current node and the start node
                curr.data = start.data;
                start.data = temp;
                curr = curr.next; // move the current node to the next node
            }
            start = start.next; // move the start node to the next node
        }

        // Swap the position of curr i.e.
        // next suitable index and pivot
        int temp = curr.data; // swap the data of the current node and the end node
        curr.data = pivot;
        end.data = temp;

        // Return one previous to current
        // because current is now pointing to pivot
        return pivot_prev; // return the node before the pivot
    }

    public void sort(Node start, Node end) // a method to sort the list using quick sort
    {
        if (start == null || start == end
                || start == end.next) // base case: if the list is empty or has one node
            return; // do nothing

        // Split list and partition recurse
        Node pivot_prev = partitionLast(start, end); // partition the list using the last node as the pivot and get the
                                                     // node before the pivot
        sort(start, pivot_prev); // recursively sort the left sublist before the pivot

        // If pivot is picked and moved to the start,
        // that means start and pivot is same
        // so pick from next of pivot
        if (pivot_prev != null && pivot_prev == start) { // if the pivot is the first node
            sort(pivot_prev.next, end); // recursively sort the right sublist after the pivot
        }
        // If pivot is in between of the list,
        // start from next of pivot,
        // since we have pivot_prev, so we move two nodes
        else if (pivot_prev != null
                && pivot_prev.next != null) { // if the pivot is not the first or the last node
            sort(pivot_prev.next.next, end); // recursively sort the right sublist after the pivot
        }
    }

    // Driver's Code
    public static void main(String[] args) // the main method
    {
        Quicksortlink list = new Quicksortlink(); // create a new list object
        list.addNode(30); // add some nodes to the list
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(-5);
        list.addNode(23);
        list.addNode(-53);
        list.addNode(50);

        Node n = list.head; // get the head node of the list
        while (n.next != null) { // loop until the last node
            n = n.next; // move to the next node
        }
        System.out.println("Linked List before sorting"); // print a message
        list.printList(list.head); // print the list before sorting

        // Function call
        list.sort(list.head, n); // sort the list using quick sort

        System.out.println("\nLinked List after sorting"); // print a message
        list.printList(list.head); // print the list after sorting
    }
}
