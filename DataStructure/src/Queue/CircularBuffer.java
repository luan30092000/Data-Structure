package Queue;
import Array.CustomerArray;

public class CircularBuffer implements Queue{

    private int readIndex;
    private int writeIndex;
    private int[] arr;
    int length;
    boolean full;

    public CircularBuffer(int length) {
        readIndex = 0;
        writeIndex = 0;
        full = false;
        arr = new int[length];
        this.length = length;
    }

    public void enQueue(int content) {
        if (full) {
            readIndex++;
        }
        arr[writeIndex++] = content;
        writeIndex %= length;
        if (writeIndex == readIndex) {
            full = true;
        }
    }

    public int deQueue() {
        int result = arr[readIndex++];
        readIndex %= length;
        full = false;
        return result;
    }

    public boolean empty() {
        return (!full && readIndex == writeIndex);
    }

    public int getLength() {
        return length;
    }

    public int getReadIndex() {
        return readIndex;
    }

    public int getWriteIndex() {
        return writeIndex;
    }
}
