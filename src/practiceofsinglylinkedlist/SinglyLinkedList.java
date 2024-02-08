package practiceofsinglylinkedlist;

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
        Node n = new Node(data);
        if (size == 0) {
            head = tail = n;
        }
        tail.next = n;
        tail = n;

        size++;
    }

    public void position(int data, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("index out of bounds");
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node n = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }

    public void DeleteFirst() throws Exception {
        if (size == 0) {
            throw new Exception("No Elements in Your LinkedList");
        }
        head = head.next;
        size--;
    }

    public void DeleteLast() {
        Node l1 = head;
        Node l2 = head.next;
        while (l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.next = null;
        tail = l1;
        size--;
    }

    public void DeletePosi(int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Index out of bounds");
        }
        if (index == 0) {
            DeleteFirst();
        } else if (index == size) {
            DeleteLast();

        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }

    public int getFirstindex() throws Exception {
        if (size == 0) {
            throw new Exception("your list is empty");
        }
        return head.data;
    }

    public int getLastIndex() throws Exception {
        if (size == 0) {
            throw new Exception("your list is empty");
        }
        return tail.data;
    }

    public int GetElementByIndex(int index) throws Exception {
        if (size == 0) {
            throw new Exception("your list is empty");
        } else if (index < 0 || index > size) {
            throw new Exception("index out of out bound");
        } else if (index == 0) {
            getFirstindex();
        } else if (index == size) {
            getLastIndex();

        } else {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        return index;
    }


    public void getSize() {
        System.out.println(size);
    }

    public void dishplay() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
