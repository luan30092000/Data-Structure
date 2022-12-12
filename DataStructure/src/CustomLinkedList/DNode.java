package CustomLinkedList;

public class DNode {
    int content;
    DNode next;
    DNode prev;

    DNode(int content, DNode prev, DNode next) {
        this.content = content;
        this.next = next;
        this.prev = prev;
    }

    DNode() {
        this(0, null, null);
    }

    DNode(int item) {
        this(item, null, null);
    }

    void insertBack(int item) {
        if (next == null) {
            next = new DNode(item, this, null);
        } else {
            this.next.insertBack(item);
        }
    }

    DNode nth(int index) {
        if (index == 1) {
            return this;
        } else {
            return this.next.nth(index - 1);
        }
    }

    void insertAfter(int item) {
        this.next = new DNode(item, this, this.next);
    }

    DNode nodeValue(int value) {
        if (this.content == value) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.nodeValue(value);
        }
    }
}
