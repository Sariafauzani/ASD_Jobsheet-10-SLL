public class SLLMain26 {
    public static void main(String[] args) {
        LinkedList26 myLinkedlist = new LinkedList26();
        myLinkedlist.print();
        myLinkedlist.addFirst(800);
        myLinkedlist.print();
        myLinkedlist.addFirst(700);
        myLinkedlist.print();
        myLinkedlist.addLast(500);
        myLinkedlist.print();
        myLinkedlist.insertAfter(700, 300);
        myLinkedlist.print();
        myLinkedlist.insertAt(3, 400);
        myLinkedlist.print();

        System.out.println("Data pada index ke-1: "+myLinkedlist.getData(1));
        System.out.println("Data 300 berada pada index ke: "+myLinkedlist.indexOf(300));

        myLinkedlist.remove(300);
        myLinkedlist.print();
        myLinkedlist.removeFirst();
        myLinkedlist.print();
        myLinkedlist.removeLast();
        myLinkedlist.print();
    }
}