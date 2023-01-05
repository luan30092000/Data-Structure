package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularBufferTest {

    CircularBuffer buff;
    @BeforeEach
    void initiate() {
        buff = new CircularBuffer(5);
        for (int i = 1; i < 8; i++) {
            buff.enQueue(i);
        }
    }

    @Test
    void enQueue() {
        int[] assertValue = new int[]{3, 4, 5, 6, 7};
        for (int i = 0; i < 5; i++) {
            assertEquals(assertValue[i], buff.deQueue());
        }
    }

    @Test
    void deQueue() {
        assertEquals(3 ,buff.deQueue());
        assertEquals(4 ,buff.deQueue());
        buff.enQueue(8);
        buff.enQueue(9);
        int[] assertValue = new int[]{5, 6, 7, 8, 9};
        for (int i = 0; i < 5; i++) {
            assertEquals(assertValue[i], buff.deQueue());
        }
    }

    @Test
    void empty() {
        assertEquals(false, buff.empty());
        CircularBuffer newBuffer = new CircularBuffer(10);
        assertEquals(true, newBuffer.empty());
    }
}