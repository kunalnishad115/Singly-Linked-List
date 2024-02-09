package practiceofdoublylinkedlist;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void AddFirst(int data) {
        Node n = new Node(data);
        if (head != null) {
            head.previous = n;
        }
        n.next = head;
        n.previous = null;
        head = n;
        size++;
    }

    public void AddLast(int data) {
        Node n = new Node(data);
        n.next = null;
        if (head == null) {
            n.previous = null;
            head = n;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = n;
        n.previous = temp;
        tail = n;
        size++;

    }

    public void addIndex(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index out of bound");
        } else if (index == 0) {
            AddFirst(data);
        } else if (index == size) {
            AddLast(data);
        } else {

            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node n = new Node(data);
            temp.next.previous = n;
            n.previous = temp;
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public void removeFirst() throws Exception {
//head.next=null;
//head=head.next;
        if (head == null) {
            throw new Exception("your list is empty");
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    public void removeLast() throws Exception {
        if (head == null) {
            throw new Exception("your list is empty");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp = temp.previous;
        temp.next = null;
        size--;
    }

    public void removeAtPosition(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index out of Bounds");
        } else if (index == 0) {
            removeFirst();

        } else if (index == size) {
            removeLast();
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.previous = temp;
            size--;
        }
    }


    public void Size() {
        System.out.println(size);
    }

    public void PrintEle() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
