package linked_list;

public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addTail(1);
        ints.addTail(12);
        ints.addTail(13);

        ints.getEnumerate();

        ints.remove(1);
        System.out.println(ints.contains(1));

        ints.getEnumerate();

        System.out.println(ints.contains(12));
        System.out.println(ints.count);
    }
}