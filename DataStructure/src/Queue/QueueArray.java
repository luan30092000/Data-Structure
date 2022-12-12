package Queue;
import Array.CustomerArray;

public class QueueArray implements Queue{

    int readIndex;
    int writeIndex;
    CustomerArray arr;

    public QueueArray() {
        readIndex = 0;
        writeIndex = 0;
        arr = new CustomerArray();
    }

    public void enQueue(int content) {
        arr.pushBack();
    }

    public int deQueue() {

    }

}
