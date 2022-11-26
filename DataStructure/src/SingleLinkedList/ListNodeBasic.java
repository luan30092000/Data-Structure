package SingleLinkedList;

/**
 * Advantages over arrayLists:
 * inserting item int middle of linked list takes constant time (if you have reference of previous node
 * Moreover, list can keep growing util memory run out
 * Disadvantage of LinkedList
 * Finding nth item of a linked list takes time proportional to n -> length of list vs constant time on arrayList
 *
 */
public class ListNodeBasic {
    int item;
    ListNodeBasic next;

    public ListNodeBasic(int item, ListNodeBasic next) {
        this.item = item;
        this.next = next;
    }

    public ListNodeBasic(int item) {
        this(item, null);   // Call first constructor
    }

    /**
     * Insert item after THIS node
     * @param item Node content
     */
    public void insertAfter(int item) {
        next = new ListNodeBasic(item, next);
    }

    /**
     * Recursive method for walking through a linkedlist
     * @param position position in list to return
     * @return return the nth node
     */
    public ListNodeBasic nth(int position) {
        if (position == 1) {
            return this;
        } else if (position < 1 || next == null) {
            return null;
        } else {
            return next.nth(position--);
        }
    }
}

