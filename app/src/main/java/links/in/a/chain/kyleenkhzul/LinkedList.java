package links.in.a.chain.kyleenkhzul;

class ChainLink {
    public String color;

    // Constructor for ChainLink
    ChainLink(String color) {
        this.color = color;
    }

    // Override toString for better display
    @Override
    public String toString() {
        return color;
    }
}

// Node class to represent each element in the LinkedList
class Node {
    ChainLink data;
    Node next;

    // Constructor for Node
    Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }
}

// Singly LinkedList class definition
class LinkedList {
    private Node head;

    // Method to append a ChainLink to the end of the list
    public void append(ChainLink newLink) {
        Node newNode = new Node(newLink);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to retrieve the ChainLink at a given index
    public ChainLink get(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            current = current.next;
            count++;
        }
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for LinkedList.");
    }

    // Method to display the entire list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
