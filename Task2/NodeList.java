package Task2;

public class NodeList {
    private Node head;
    private Node tail;

    private class Node {
        Node next;
        Integer value;

        public Node() {
            next = null;
        }
    }

    public void add(Integer value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = null;
        tail = node;
    }

    public void reverse() {
        Node parentNode = null;
        Node currentNode = head;

        tail = head;

        while (currentNode != null) {
            Node temp = currentNode.next;
            currentNode.next = parentNode;
            parentNode = currentNode;
            currentNode = temp;
        }
        head = parentNode;
        tail.next = null;
    }

    public void printNodeList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println();
    }
}
