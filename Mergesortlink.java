package DSA.Linkedlist;

// Define a class named Node, which represents a node of a linked list
class Node {
    int data; // Declare an instance variable named data, which stores the integer value of
              // the node
    Node next; // Declare an instance variable named next, which stores the reference to the
               // next node in the linked list

    // Define a constructor for the Node class, which takes an integer parameter
    // named data
    Node(int data) {
        this.data = data; // Assign the value of the parameter data to the instance variable data of the
                          // current node object
        this.next = null; // Assign the value of null to the instance variable next of the current node
                          // object, indicating that there is no next node by default
    }
}

// Define a class named Mergesortlink, which represents a linked list that can
// be sorted using merge sort
public class Mergesortlink {
    public Node head; // Declare a public instance variable named head, which stores the reference to
                      // the first node of the linked list

    // Define a public method named add, which takes an integer parameter named data
    // and adds a new node with that value to the end of the linked list
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node object with the value of the parameter data and assign it
                                       // to a local variable named newNode
        if (head == null) { // Check if the head of the linked list is null, which means the list is empty
            head = newNode; // Assign the value of newNode to the head of the linked list, making it the
                            // first node
        } else { // Mark the beginning of the else block, which executes if the head of the
                 // linked list is not null, which means the list is not empty
            Node temp = head; // Create a local variable named temp and assign it the value of the head of the
                              // linked list, which is the first node
            while (temp.next != null) { // Start a while loop that iterates until the next node of temp is null, which
                                        // means temp is the last node of the list
                temp = temp.next; // Assign the value of the next node of temp to temp, moving it one step forward
                                  // in the list
            }
            temp.next = newNode; // Assign the value of newNode to the next node of temp, making it the last node
                                 // of the list
        }
    }

    // Define a public method named printList, which prints the values of the nodes
    // in the linked list
    public void printList() {
        Node temp = head; // Create a local variable named temp and assign it the value of the head of the
                          // linked list, which is the first node
        while (temp != null) { // Start a while loop that iterates until temp is null, which means the end of
                               // the list is reached
            System.out.print(temp.data + " "); // Print the value of the data instance variable of the temp node,
                                               // followed by a space
            temp = temp.next; // Assign the value of the next node of temp to temp, moving it one step forward
                              // in the list
        }
        System.out.println(); // Print a new line
    }

    // Define a public method named mergeSort, which takes a Node parameter named
    // start and returns a Node object
    // This method sorts the linked list starting from the start node using the
    // merge sort algorithm, which is a recursive divide-and-conquer algorithm that
    // splits the list into two halves, sorts each half recursively, and then merges
    // the two sorted halves into one sorted list
    public Node mergeSort(Node start) {
        if (start == null || start.next == null) { // Check if the start node is null or if the start node has no next
                                                   // node, which means the list is empty or has only one node, which is
                                                   // already sorted
            return start; // Return the start node as the sorted list, which is the base case of the
                          // recursion
        }

        Node middle = getMiddle(start); // Create a local variable named middle and assign it the value returned by the
                                        // private method named getMiddle, which takes a Node parameter named head and
                                        // returns a Node object
        // This method finds the middle node of the linked list starting from the head
        // node, which is used to split the list into two halves
        Node nextOfMiddle = middle.next; // Create a local variable named nextOfMiddle and assign it the value of the
                                         // next node of the middle node, which is the start node of the second half of
                                         // the list
        middle.next = null; // Assign the value of null to the next node of the middle node, which breaks
                            // the link between the two halves of the list

        Node left = mergeSort(start); // Create a local variable named left and assign it the value returned by the
                                      // mergeSort method with the parameter start, which is the start node of the
                                      // first half of the list
        // This line recursively sorts the first half of the list using the merge sort
        // algorithm
        Node right = mergeSort(nextOfMiddle); // Create a local variable named right and assign it the value returned by
                                              // the mergeSort method with the parameter nextOfMiddle, which is the
                                              // start node of the second half of the list
        // This line recursively sorts the second half of the list using the merge sort
        // algorithm

        return merge(left, right); // Return the value returned by the private method named merge, which takes two
                                   // Node parameters named left and right and returns a Node object
        // This method merges the two sorted halves of the list into one sorted list, by
        // comparing the values of the nodes and linking them in ascending order
    }

    // Define a private method named merge, which takes two Node parameters named
    // left and right and returns a Node object
    // This method merges the two sorted halves of the list into one sorted list, by
    // comparing the values of the nodes and linking them in ascending order
    private Node merge(Node left, Node right) {
        Node result = null; // Create a local variable named result and assign it the value of null, which
                            // will store the reference to the first node of the sorted list

        if (left == null) { // Check if the left node is null, which means the first half of the list is
                            // empty
            return right; // Return the right node as the sorted list, which is the second half of the
                          // list
        }
        if (right == null) { // Check if the right node is null, which means the second half of the list is
                             // empty
            return left; // Return the left node as the sorted list, which is the first half of the list
        }

        if (left.data <= right.data) { // Check if the value of the left node is less than or equal to the value of the
                                       // right node, which means the left node should be placed before the right node
                                       // in the sorted list
            result = left; // Assign the value of the left node to the result node, making it the first
                           // node of the sorted list
            result.next = merge(left.next, right); // Assign the value returned by the merge method with the parameters
                                                   // left.next and right to the next node of the result node, which is
                                                   // the second node of the sorted list
            // This line recursively merges the remaining nodes of the first half and the
            // second half of the list, by skipping the left node that was already added to
            // the result list
        } else { // Mark the beginning of the else block, which executes if the value of the left
                 // node is greater than the value of the right node, which means the right node
                 // should be placed before the left node in the sorted list
            result = right; // Assign the value of the right node to the result node, making it the first
                            // node of the sorted list
            result.next = merge(left, right.next); // Assign the value returned by the merge method with the parameters
                                                   // left and right.next to the next node of the result node, which is
                                                   // the second node of the sorted list
            // This line recursively merges the remaining nodes of the first half and the
            // second half of the list, by skipping the right node that was already added to
            // the result list
        }

        return result; // Return the result node as the sorted list, which is the merged list of the
                       // two sorted halves
    }

    // Define a private method named getMiddle, which takes a Node parameter named
    // head and returns a Node object
    // This method finds the middle node of the linked list starting from the head
    // node, which is used to split the list into two halves
    private Node getMiddle(Node head) {
        if (head == null) { // Check if the head node is null, which means the list is empty
            return head; // Return the head node as the middle node, which is null
        }

        Node slow = head, fast = head; // Create two local variables named slow and fast and assign them both the value
                                       // of the head node, which is the first node of the list
        // These variables will be used to traverse the list at different speeds, using
        // the fast-slow pointer technique

        while (fast.next != null && fast.next.next != null) { // Start a while loop that iterates until the next node of
                                                              // the fast node is null or the next next node of the fast
                                                              // node is null, which means the end of the list is
                                                              // reached or the last node of the list is reached
            slow = slow.next; // Assign the value of the next node of the slow node to the slow node, moving
                              // it one step forward in the list
            fast = fast.next.next; // Assign the value of the next next node of the fast node to the fast node,
                                   // moving it two steps forward in the list
        }
        return slow; // Return the slow
    }

    public static void main(String[] args) {
        Mergesortlink list = new Mergesortlink();
        list.add(12);
        list.add(11);
        list.add(13);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Given list:");
        list.printList();

        Node sorted = list.mergeSort(list.head);

        System.out.println("Sorted list:");
        while (sorted != null) {
            System.out.print(sorted.data + " ");
            sorted = sorted.next;
        }
    }
}
