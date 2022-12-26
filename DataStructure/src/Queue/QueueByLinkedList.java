package Queue;

import CustomLinkedList.SList;

public class QueueByLinkedList implements Queue{

    SList queue;

    public QueueByLinkedList() {
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

    public boolean empty() {
        return queue.isEmpty();
    }
}
