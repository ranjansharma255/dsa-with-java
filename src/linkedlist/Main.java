package linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(10);
        list.insertFirst(11);
        list.insertFirst(12);
        list.insertLastWithTail(99);
        list.insertLastWithTail(100);
        list.display();
    }
}
