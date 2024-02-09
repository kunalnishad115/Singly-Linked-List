package practiceofdoublylinkedlist;

public class Node {
    Node next;
    Node previous;
    int data;

    public Node( int data) {
        this.next = null;
        this.previous = null;
        this.data = data;
    }
}
