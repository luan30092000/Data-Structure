package Array;

public class CustomerArray {
    int[] arr;
    int capacity;
    int size;

    public CustomerArray(int capacity) {
        arr = new int[capacity];
        this.capacity = capacity;
        size = 0;
    }

    public CustomerArray() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int nth(int index) {
        if (index > size) {
            return arr[size - 1];
        } else {
            return arr[index - 1];
        }
    }

    public void pushBack(int val) {
        arr[size] = val;
        size++;
    }

    public void pushFront(int item) {
        if (insertEmpty(item)) {
            return;
        } else {
            if (size == capacity) {
                extendSize();
            }
            shiftRight(0);
            arr[0] = item;
        }
        size++;
    }

    private boolean insertEmpty(int item) {
        if (size == 0) {
            arr[size] = item;
            size++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Push into a specific index, if index > size, push back
     * @param index location
     * @param val content
     */
    public void pushAt(int index, int val) {
        if (size == capacity) {
            extendSize();
        }
        if (index > size) {
            this.pushBack(val);
        } else {
            shiftRight(index - 1);
            arr[index - 1] = val;
            size++;
        }
    }

    /**
     * Pop front value of the array and return value
     * O(1)
     * @return front value of array
     */
    public int popFront() {
        int result = arr[0];
        arr[0] = 0;
        shiftLeft(1);
        size--;
        return result;
    }

    /**
     * Pop value at last index and return value
     * O(1)
     * @return content at last index
     */
    public int popBack() {
        int result = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return result;
    }

    /**
     * shifting all element down so index will be available, use for insertion
     * O(n)
     * @param index location where it will be available
     */
    private void shiftRight(int index) {
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    /**
     * Shift array to the left to fill the index, use for pop/deletion
     * O(n)
     * @param index index content will be deleted
     */
    private void shiftLeft(int index) {
        for (int i = index; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        arr[size - 1] = 0;   // After shift to left, remove last node value because node has been shifted to the left

    }

    /**
     * Extends size of the array to double
     * O(n)
     */
    private void extendSize() {
        int[] newArr = new int[capacity * 2];
        for (int i = 0; i < capacity; i++) {
            newArr[i] = arr[i];
        }
        capacity *= 2;
        arr = newArr;
    }

    /**
     * If array have reached its capacity, use to implement circular buffer queue FIFO
     * @return true if reached, false otherwise
     */
    public boolean maxCapacity() {
        return size == capacity;
    }






}