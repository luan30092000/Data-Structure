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

    public int at(int index) {
        if (index > size) {
            return 0;
        } else {
            return arr[index - 1];
        }
    }

    public void pushBack(int val) {
        checkSize();
        arr[size] = val;
        size++;
    }

    public void pushFront(int val) {
        if (size == 0) {
            arr[size] = val;
        } else {
            shiftRight(0);
            arr[0] = val;
        }
        size++;
    }

    public void pushAt(int index, int val) {
        checkSize();
        shiftRight(index);
        arr[index] = val;
        size++;
    }

    public int popFront() {
        int result = arr[0];
        arr[0] = 0;
        shiftLeft(0);
        size--;
        return result;
    }

    public int popBack() {
        int result = arr[size - 1];
        arr[size - 1] = 0;
        size--;
        return result;
    }

    public void fillIndex(boolean half) {
        if (half) {
            for (int i = 0; i < capacity / 2; i++) {
                arr[i] = i + 1;
                size++;
            }
        }
        else {
            for (int i = 0; i < capacity; i++) {
                arr[i] = i + 1;
                size++;
            }
        }
    }

    /**
     * shifting all element down so index will be available
     * @param index location where it will be available
     */
    private void shiftRight(int index) {
        if (index > size) {
            return;
        }
        checkSize();
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
    }

    private void shiftLeft(int index) {
        if (index < 0) {
            return;
        }
        checkSize();
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
    }

    private void checkSize()  {
        if (size >= capacity) {
            capacity = capacity * 2;
            int[] newArr = new int[capacity];
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void printAll() {
        System.out.print("[");
        for (int i = 0; i < capacity; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");

        }
        System.out.println("]");
        System.out.println("Size: " + size);
        System.out.println("Capacity: " + capacity);
    }






}