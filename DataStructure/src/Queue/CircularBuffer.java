/**
 * Implemented circular buffer using array with fixed length
 * Using read index to keep track the oldest element
 * and write index to keep track of the newest element
 * Buffer will overwrite the oldest element when full and read index will move  to next element
 */
package Queue;
public class CircularBuffer implements Queue{

    /**
     * Read index for buffer
     */
    private int readIndex;

    /**
     * Write index for buffer
     */
    private int writeIndex;

    /**
     * Implement buffer using array
     */
    private int[] arr;

    /**
     * Array length, it's also buffer length
     */
    int length;

    /**
     * Boolean if buffer is full
     */
    boolean full;

    /**
     * Constructor with specified length
     * @param length how many elements buffer can have at once
     */
    public CircularBuffer(int length) {
        readIndex = 0;
        writeIndex = 0;
        full = false;
        arr = new int[length];
        this.length = length;
    }

    /**
     * Constructor with default buffer length of 10
     */
    public CircularBuffer() {
        this(10);
    }

    /**
     * Enqueue buffer
     * @param content value
     */
    @Override
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

    /**
     * Dequeue Buffer and return value
     * @return
     */
    @Override
    public int deQueue() {
        int result = arr[readIndex++];
        readIndex %= length;
        full = false;
        return result;
    }

    /**
     * Check if buffer empty
     * @return empty or not
     */
    @Override
    public boolean empty() {
        return (!full && readIndex == writeIndex);
    }

    /**
     * Getter of length
     * @return buffer length
     */
    public int getLength() {
        return length;
    }

    /**
     * Check if all space have been filled with content
     * @return boolean
     */
    public boolean full() {
        return full;
    }

    /**
     * Getter of readIndex
     * @return read index
     */
    public int getReadIndex() {
        return readIndex;
    }

    /**
     * Getter of writeIndex
     * @return write index
     */
    public int getWriteIndex() {
        return writeIndex;
    }
}
