package CustomLinkedList;

public class CustomLinkedList {
    private Node head;
    private int size;

    CustomLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push_front(int content) {
        if (size == 0) {
            head = new Node(content, null);
        } else {
            Node newHead = new Node(content, this.head);
            head = newHead;
        }
        size++;
    }

    public void push_back(int content) {
        if (size == 0) {
            head = new Node(content, null);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(content, null);
        }
        size++;
    }

    public int valueAt(int index) {
        if (index < size) {
            return 0;
        } else {
            int result;
            Node temp = new Node(0, null);
            for (int i = 0; i < index; i++) {
                temp = head.next;
            }
            return temp.content;
        }
    }

    public int front() {
        if (size == 0) {
            return 0;
        } else {
            return head.content;
        }
    }

    public int back() {
        Node temp = head;
        if (size == 0) {
            return 0;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp.content;
        }
    }

    public void insert(int content, int index) {
        if (index > size) {
            return;
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

        }
    }

}
