package Queue;

import CustomLinkedList.SList;

public class QueueLinkedList implements Queue{

    SList queue;

    public QueueLinkedList() {
        queue = new SList();
    }

    @Override
    public void enQueue(int content) {
        queue.push_back(content);
    }

    @Override
    public int deQueue() {
        return queue.pop_front();
    }


}
