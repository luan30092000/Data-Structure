package SingleLinkedList;

class SListNode {
    int item;
    SListNode next;
    SListNode(int item, SListNode next) {
        this.item = item;
        this.next = next;
    }
    SListNode() {
         this(0, null);
    }
    void insertBack(int item) {
        if (next == null) {
            next = new SListNode(item, null);
        } else {
            next.insertBack(item);
        }
    }
    SListNode nth(int index) {
        if (index == 1) {
            return this;
        } if (index < 1 || next == null) {
            return null;
        } else {
            return next.nth(--index);
        }
    }
    void insertAfter(int item) {
        this.next = new SListNode(item, next);
    }
    SListNode nodeBeforeNodeValue(int value) {
        if (this.next == null) {
            return null;
        } else if (this.next.item == value) {
            return this;
        } else {
            return next.nodeBeforeNodeValue(value);
        }
    }



}
