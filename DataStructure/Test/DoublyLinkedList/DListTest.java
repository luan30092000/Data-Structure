package DoublyLinkedList;

import CustomLinkedList.DList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DListTest {

    private DList DLList;

    @BeforeEach
    void setup() {
        DLList = new DList();
    }

    @Test
    void pushFront() {
        for (int i = 1; i < 6; i++) {
            DLList.pushFront(i);
        }
        for (int i = 1; i < 6; i++) {
            assertEquals(6 - i, DLList.get(i));
        }
    }

    @Test
    void pushBack() {
        for (int i = 1; i < 6; i++) {
            DLList.pushBack(i);
        }
        for (int i = 1; i < 6; i++) {
            assertEquals(i, DLList.get(i));
        }
    }

    @Test
    void push() {
//        for (int i = 0; i < 6)
    }

    @Test
    void popFront() {
    }

    @Test
    void popBack() {
    }

    @Test
    void pop() {
    }

    @Test
    void popValue() {
    }

    @Test
    void get() {
    }

    @Test
    void reverseList() {
    }
}