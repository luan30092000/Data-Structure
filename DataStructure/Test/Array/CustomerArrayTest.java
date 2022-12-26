package Array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerArrayTest {

    CustomerArray arr;
    final int CAPACITY = 10;
    int sizeTest;
    int[] testIndex = new int[]{1, 6, 8, 99, 99, 99, 99, 99};
    int[] testValue = new int[]{0, 5, 6, 7, 8, 9, 10, 11};
    int[] testAssertValue = new int[]{0, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10, 11};

    @BeforeEach
    void initiate() {
        sizeTest = 0;
         arr = new CustomerArray(CAPACITY);
         for (int i = 0; i < 5; i++) {
             arr.pushBack(i + 1);
             sizeTest++;
         }
    }

    @Test
    void getSize() {
        assertEquals(sizeTest, arr.getSize());
    }

    @Test
    void getCapacity() {
        assertEquals(CAPACITY, arr.getCapacity());
    }

    @Test
    void isEmpty() {
        assertFalse(arr.isEmpty());
    }

    @Test
    void nth() {
        assertEquals(sizeTest, arr.getSize());
        assertEquals(5, arr.nth(5));
    }

    @Test
    void pushBack() {
        for (int i = 1; i < 5; i++) {
            arr.pushBack(5 + i);
        }

        for (int i = 1; i < 10; i++) {
            assertEquals(i, arr.popFront());
        }
    }

    @Test
    void pushFront() {
        arr.pushFront(0);
        for (int i = 0; i < arr.size; i++) {
            assertEquals(i, arr.nth(i + 1));
        }
    }

    @Test
    void pushAt() {
        for (int i = 0; i < 8; i++) {
            arr.pushAt(testIndex[i], testValue[i]);
        }
        for (int i : testAssertValue) {
            assertEquals(i, arr.popFront());
        }
    }

    @Test
    void popFront() {
        for (int i = 0; i < arr.getSize(); i++) {
            assertEquals(i + 1, arr.popFront());
        }
    }

    @Test
    void popBack() {
        for (int i = 0; i < testIndex.length; i++) {
            arr.pushAt(testIndex[i], testValue[i]);
        }

        for (int i = 1; i <= testAssertValue.length; i++) {
            assertEquals(testAssertValue[testAssertValue.length - i], arr.popBack());
        }
    }

}