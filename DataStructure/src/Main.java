import SingleLinkedList.*;
public class Main {
    public static void main(String[] args) {
        SList list1 = new SList();
        for (int i = 1; i < 10; i++) {
            list1.pushFront(i);
        }
        list1.print();
        list1.reverseList();
        System.out.println("===========");
        list1.print();
        System.out.println("===========");

    }
}