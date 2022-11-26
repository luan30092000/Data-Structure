package DoublyLinkedList;

public class DListNode {
    private Node head;
    private Node tail;
    int size;

    public DListNode() {
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

    public void insert(int item, int index) {
        
    }

}
