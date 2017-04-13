package collection;

/**
 * Created by zhoumeng on
 * 2017/4/11.
 * 10:39.
 */
public class MyLinkedList {

    private Node first;
    private Node last;


    public MyLinkedList() {
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("a");
        myLinkedList.add("b");
        myLinkedList.add("c");
        System.out.println(myLinkedList.first());
        System.out.println(myLinkedList.last());
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.size());
    }

    /*
       ----------[0]---[?]---[?]---[?].............[n?]
     */
    public int size() {
        return size();
    }

    public String get(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("error");
            System.out.println();
        }
        // TODO: 4/11/17
        return null;
    }

    public boolean add(String element) {
        if (first == null) {
            Node node = new Node(element, null, null);
            first = node;
            last = node;
        } else {
            Node node = new Node(element, last, null);
            last.next = node;
            last = node;
        }
        return true;
    }

    public String first() {
        return first.element;
    }

    public String last() {
        return last.element;
    }

    private class Node { // node 节点\ [nəʊd]
        String element;
        Node prev; // prev previous 以前的\ ['priːvɪəs]
        Node next;

        public Node(String element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }
}