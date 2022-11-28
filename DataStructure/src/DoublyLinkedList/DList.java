package DoublyLinkedList;

public class DList {
    private Node head;
    private Node tail;
    int size;

    public DList() {
        head = null;
        size = 0;
    }

    public void pushFront(int item) {
        if (insertEmpty(item)){
            return;
        } else {
            head = new Node(item, null, head);
        }
        size++;
    }

    public void pushBack(int item) {
        if (insertEmpty(item)) {
            return;
        } else {
            head.insertBack(item);
        }
        size++;
    }

    private boolean insertEmpty(int item) {
        if (head != null) {
            return false;
        } else {
            head = new Node(item);
            tail = head;
            size++;
            return true;
        }
    }

    public void push(int item, int index) {
        Node beforeIndex = head.nth(index - 1);
        beforeIndex.insertAfter(item);
    }

    public int popFront() {
        int result = head.content;
        head = head.next;
        head.prev = null;
        return result;
    }

    public int popBack() {
        int result = tail.content;
        tail = tail.prev;
        tail.next = null;
        return result;
    }

    public int pop(int index) {
        Node popNode = head.nth(index);
        popNode.prev.next = popNode.next;
        popNode.next.prev = popNode.prev;
        return popNode.content;
    }

    public int popValue(int value) {
        Node popNode = head.nodeValue(value);
        if (popNode == null) {
            return 0;
        }
        popNode.prev.next = popNode.next;
        popNode.next.prev = popNode.prev;
        return popNode.content;
    }

    public int get(int index) {
        return head.nth(index).content;
    }

    public void reverseList() {
        Node temp = head;
        head = tail;
        tail = temp;
    }
}
