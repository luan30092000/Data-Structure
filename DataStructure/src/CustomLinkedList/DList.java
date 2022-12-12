package CustomLinkedList;

public class DList {
    private DNode head;
    private DNode tail;
    int size;
    final int NULL = 0;

    public DList() {
        head = null;
        size = NULL;
    }

    public void pushFront(int item) {
        if (insertEmpty(item)){
            return;
        } else {
            head = new DNode(item, null, head);
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
            head = new DNode(item);
            tail = head;
            size++;
            return true;
        }
    }

    public void push(int item, int index) {
        if (insertEmpty(item)) {
            return;
        }
        DNode beforeIndex = head.nth(index - 1);
        beforeIndex.insertAfter(item);
    }

    public int popFront() {
        if (head == null) {
            return NULL;
        }
        int result = head.content;
        head = head.next;
        head.prev = null;
        return result;
    }

    public int popBack() {
        if (head == null) {
            return NULL;
        }
        int result = tail.content;
        tail = tail.prev;
        tail.next = null;
        return result;
    }

    public int pop(int index) {
        if (index > size) {
            return NULL;
        }
        DNode popNode = head.nth(index);
        popNode.prev.next = popNode.next;
        popNode.next.prev = popNode.prev;
        return popNode.content;
    }

    public int popValue(int value) {
        DNode popNode = head.nodeValue(value);
        if (popNode == null) {
            return NULL;
        }
        popNode.prev.next = popNode.next;
        popNode.next.prev = popNode.prev;
        return popNode.content;
    }

    public int get(int index) {
        return head.nth(index).content;
    }

    public void reverseList() {
        DNode temp = head;
        head = tail;
        tail = temp;
    }
}
