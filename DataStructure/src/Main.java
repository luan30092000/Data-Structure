import SingleLinkedList.*;
public class Main {


    public static void main(String[] args) {
        SList ll1 = new SList();
        for (int i = 1; i < 10; i++) {
            ll1.pushBack(i);
        }
        System.out.println(ll1.length());
        ll1.print();
        ll1.push(100, 5);
        ll1.print();
        System.out.println("==");
        System.out.println("value " + ll1.get(5));
        System.out.println("==");
        ll1.popIndex(5);
        ll1.print();
        System.out.println("==");
        ll1.popIndex(20);
        ll1.print();
        System.out.println("==3");
        ll1.popValue(7);
        ll1.print();
    }
}