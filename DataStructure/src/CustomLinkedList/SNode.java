package CustomLinkedList;

class SNode {
    public int content;
    public SNode next;
    int size;
    public SNode(int content, SNode next) {
        this.content = content;
        this.next = next;
    }

    public SNode() {
        this(0, null);
    }

    /**
     * Insert at the end of the list
     * @param item node content
     * @return Node to assign tail node
     */
    SNode insertBack(int item) {
        if (this.next == null) {
            this.next = new SNode(item, null);
            return this.next;
        } else {
            return this.next.insertBack(item);

        }
    }

    /**
     * Return Node at nth index
     * @param index index position
     * @return node at nth index
     */
    SNode nth(int index) {
        if (index == 1 || this.next == null) {
            return this;
        } else {
            return this.next.nth(index - 1);
        }
    }

    void insertAfter(int item) {
        this.next = new SNode(item, next);
    }

    SNode nodeValue(int value) {
        if (this.content == value) {
            return this;
        } else if (this.next == null) {
            return null;
        } else {
            return this.next.nodeValue(value);
        }
    }

}

