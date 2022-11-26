package SingleLinkedList;

/**
 * SList ensure:
 *      1. The fields of SList (head and size) are "private"
 *      2. No method of SList return an SListNode
 */
public class SList {
    private SListNode head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    /**
     * O(1) insert at head and replace head
     * @param item  content for head node
     */
    public void pushFront(int item) {
        head = new SListNode(item, head);
        size++;
    }

    /**
     * O(n) insert at the back of list
     * @param item  content for last node
     */
    public void pushBack(int item) {
        if (head == null) {
            head = new SListNode(item, null);
        } else {
            head.insertBack(item);
        }
        size++;
    }

    /**
     * O(n) insert a node a specific location
     * @param item  node's content
     * @param index index location
     */
    public void push(int item, int index) {
        if (checkIndex(index)) {
            SListNode nodeBeforeInsert = head.nth(index - 1);
            nodeBeforeInsert.insertAfter(item);
            size++;
        }
    }

    /**
     * O(1) remove head node
     * @return  removed node (head)
     */
    public int popFront() {
        SListNode result = head;
        head = head.next;
        size--;
        return result.item;
    }

    /**
     * O(n) remove last node
     * @return removed node (tail)
     */
    public int popBack() {
        SListNode secondLastNode = head.nth(size - 1);
        int result = secondLastNode.next.item;
        secondLastNode.next = null;
        size--;
        return result;
    }

    /**
     * O(n) remove node at a specific location
     * @param index removed node location
     * @return removed node
     */
    public int popIndex(int index) {
        if (checkIndex(index)) {
            SListNode beforePopNode = head.nth(index - 1);
            SListNode result = beforePopNode.next;
            beforePopNode.next = result.next;
            return result.item;
        } else {
            return 0;
        }
    }

    /**
     * O(n) remove first node with a specified value
     * @param value Node's value
     * @return  removed node or 0 if not cannot find
     */
    public int popValue(int value) {
        SListNode beforeRemoveNode = head.nodeBeforeNodeValue(value);
        if(beforeRemoveNode != null) {
            SListNode removeNode = beforeRemoveNode.next;
            beforeRemoveNode.next = removeNode.next;
            return removeNode.item;
        } else {
            return 0;
        }
    }

    /**
     * Return Node at a specific location
     * @param index returned node location
     * @return  return node
     */
    public int get(int index) {
        if (checkIndex(index)) {
            return head.nth(index).item;
        } else {
            return 0;
        }
    }

    public void reverseList() {
        if (size == 1) {
            return;
        }
        reverseListSupport(null, head);
    }

    /**
     * Reverse list by update direction of node.next; not inserting
     * @param oldHead   latter node after reverse
     * @param newHead   prior node after reverse
     */
    private void reverseListSupport(SListNode oldHead, SListNode newHead) {
        if (newHead == null) {
            head = oldHead;
            return;
        }
        SListNode temp = newHead.next;
        newHead.next = oldHead;
        reverseListSupport(newHead, temp);

//        if (newHead == null) {
//            this.head = oldHead;
//            return;
//        }
//        SListNode tempNext = newHead.next;
//        oldHead.next = null;
//        newHead.next = oldHead;
//        reverseListSupport(newHead, tempNext);
    }



    /**
     * O(1)
     * @return list length
     */
    public int length() {
        return size;
    }

    /**
     * print List
     */
    public void print() {
        printSupport(head);
    }

    /**
     * support print with private parameter
     * @param head use head to recursively iterate
     */
    private void printSupport(SListNode head) {
        if(head == null) {
            return;
        } else {
            System.out.println(head.item);
            printSupport(head.next);
        }
    }

    private boolean checkIndex(int index) {
        return index <= size;
    }

}
