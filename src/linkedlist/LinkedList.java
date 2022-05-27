package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if (tail == null) {
            tail = head;
        }

        size += 1;
    }
    public void insertLastWithTail(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void insertLastWithoutTail(int value) { // without tail variant
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index == 0) {
            insertFirst(value);
            return;
        }
        if (index == size) {
            insertLastWithTail(value);
            return;
        }

        Node currentNode = head;

        for (int i = 1; i < index; i++) {
            currentNode = currentNode.next;
        }
        Node newNode = new Node(value, currentNode.next);
        currentNode.next = newNode;
//        newNode.next = nextNode; // performed this on line 63 inside the constructor
        size++;

    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
