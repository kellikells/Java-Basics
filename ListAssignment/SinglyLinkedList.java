public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = head;
    }

    // setters
    // Add a node to the list
    public void add(int data) {
        // Create a new node
        Node newNode = new Node(data);
        // Checks if the list is empty
        if(head == null) {
            // If the list is empty, the head points to new node
            head = newNode;
        }
        else {
            // starting from the head, keep traversing through nodes until reaching "null"
            Node current_node = head;
            while (current_node.next != null) {
            current_node = current_node.next;
            }
            current_node.next = newNode;
        }
    }


    // ---------------------------------------
    public void remove() {

        // create reference to head
        Node current_node = head;

        if(current_node == null || current_node.next == null) {
            head = null;
        }

        // create reference to current_node.next (because you can't go backwards)
        Node nextNode = current_node.next;
        while(current_node.next != null) {  
            // while the next Node is not the last...
            if(nextNode.next == null) { 
                // if the next,next node is the last...
                current_node.next = null;   
                // drop current_node.next
            }
            // reassigning values ?
            current_node = nextNode;
            nextNode = nextNode.next;
        }
        // return current_node;
      
    }
    //     if(this.head == null) {
    //         System.out.println("nothing to remove");  
    //         return;
    //     }
    //     if(this.head.next == null) {
    //         this.head = null;
    //         System.out.println("there was only 1 node in the list");
    //     } 
    //     else {
    //         Node current_node = this.head;
    //         while (current_node!= null) {
    //             tail = current_node;
    //             current_node = current_node.next;
    //         }
    //         tail.next = current_node.next;
    //     }
    // }


    // Print node
    public void printValues() {
        if (this.head == null) {
            System.out.println("No nodes in list");
            return;
        }
        else {
            Node current_node = this.head;
            int count = 0;
            while(current_node != null) {
            count = count + 1;
            System.out.println("Node " + count + ": " + current_node.data);
            // increment the pointer to the next node
            current_node = current_node.next;
            }
        }
    }
}

// -----------------------------

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
    }
}