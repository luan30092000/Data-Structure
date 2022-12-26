package Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueByLinkedListTest {

    private QueueByLinkedList queue;
    @BeforeEach
    void initiata() {
        queue = new QueueByLinkedList();
    }


    @Test
    void enQueue() {
        for (int i = 0; i < 10; i++) {
            queue.enQueue(i);
        }

        for (int i = 0; i < 10; i++) {
            assertEquals(i, queue.deQueue());
        }
    }

    @Test
    void deQueue() {
        queue.enQueue(10);
        assertEquals(10, queue.deQueue());
    }

    @Test
    void empty() {
        assertTrue(queue.empty());
    }
}