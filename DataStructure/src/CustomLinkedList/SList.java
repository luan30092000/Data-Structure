package CustomLinkedList;

public class SList {
    private SNode head;
    private SNode tail;
    private int size;
    final int NULL = 0;

    public SList() {
        head = null;
        size = NULL;
    }

    public boolean isEmpty() {
        return size == NULL;
    }

    public void push_front(int content) {
        if (insertEmpty(content)) {
            return;
        } else {
            head = new SNode(content, this.head);
            size++;
        }
    }

    public void push_back(int content) {
        if (insertEmpty(content)) {
            return;
        } else {
            tail.insertAfter(content);
            tail = tail.next;
        }
    }

    public int pop_front() {
        if (head != null) {
            int result = head.content;
            head = head.next;
            size--;
            return result;
        } else {
            return NULL;
        }
    }

    public int pop_back() {
        if (head != null) {
            int result = tail.content;
            tail = head.nth(size - 1);
            size--;
            return result;
        } else {
            return NULL;
        }
    }

    public int pop(int index) {
        if (index > size) {
            return NULL;
        }
        SNode popNode = head.nth(index - 1);
        int result = popNode.next.content;
        popNode.next = popNode.next.next;
        return result;
    }

    public int valueAt(int index) {
        if (index > size) {
            return NULL;
        }
        return head.nth(index).content;
    }

    public int front() {
        if (size == NULL) {
            return NULL;
        } else {
            return head.content;
        }
    }

    public int back() {
        if (tail == null) {
            return NULL;
        } else {
            return tail.content;
        }
    }

    public void insert(int content, int index) {
        if (insertEmpty(content)) {
        } else {
            head.nth(index - 1).insertAfter(content);
        }
    }

    private boolean insertEmpty(int item) {
        if (head == null) {
            head = new SNode(item, null);
            tail = head;
            size++;
            return true;
        } else {
            return false;
        }
    }

}
