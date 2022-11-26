package DoublyLinkedList;

public class Node {
    int content;
    Node next;
    Node prev;

    Node(int content, Node prev, Node next) {
        this.content = content;
        this.next = next;
        this.prev = prev;
    }

    Node() {
        this(0, null, null);
    }

    Node(int item) {
        this(item, null, null);
    }

    void insertBack(int item) {
        if (next == null) {
            next = new Node(item, this, null);
        } else {
            this.next.insertBack(item);
        }
    }

    Node nth(int index) {
        if (index == 1) {
            return this;
        } else {
            return this.next.nth(index - 1);
        }
    }

    void insertAfter(int item) {
        this.next = new Node(item, this, this.next);
    }

    Node nodeValue(int value) {
        if (this.content == value) {
            return this;
        } else if (next == null) {
            return null;
        } else {
            return this.next.nodeValue(value);
        }
    }
}
