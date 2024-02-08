package practiceoflinkedlist;

public class SinglyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    SinglyLinkedList() {
        head = tail = null;
        size = 0;
    }

    public void addFirst(int data) {
        Node n = new Node(data);

        n.next = head;
        head = n;
        if (size == 0) {
            tail = n;
        }
        size++;
    }

    public void addLast(int data) {
        Node n= new Node(data);
        tail.next=n;
        tail=n;
        if(size==0){
            tail=n;
        }
        size++;
    }

    public void position(int data, int index) {

    }
    public void getSize(){
        System.out.println(size);
    }

    public void dishplay() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
