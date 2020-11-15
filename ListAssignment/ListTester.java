public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        System.out.println("---1----");
        sll.printValues();

        System.out.println("---2---");
        sll.add(3);
        sll.printValues();

        System.out.println("---3---");
        sll.remove();
        sll.printValues();

        System.out.println("---4---");
        sll.add(5);
        sll.add(4);
        sll.add(10);
        sll.printValues();

        System.out.println("---5---");
        sll.remove();
        sll.printValues();

        System.out.println("---6---");
        sll.add(500);
        sll.add(265);
        sll.add(6546);
        sll.printValues();

        System.out.println("---7---");
        sll.remove();
        sll.printValues();

        System.out.println("---8---");
        sll.remove();
        sll.printValues();

        // System.out.println("-------");
        // sll.find(4);
        
        // System.out.println("-------");
        // sll.add(5);
        // sll.add(4);
        // sll.add(10);
        // sll.printValues();

        // System.out.println("-------");
        // sll.find(4);

        // System.out.println("-------");
        
        // System.out.println("-------");
    }
}