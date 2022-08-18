package deque;

public class Main {
    public static void main(String[] args) {
        Deque x = new Deque();

        x.enqueueHead(2);
        x.enqueueHead(3);
        x.enqueueHead(4);
        x.enqueueHead(7);

        System.out.println(x.peekHead());
        System.out.println(x.peekTail());
        x.dequeueTail();
        System.out.println(x.peekTail());
        System.out.println(x.count());

        x.store.getEnumerate();
    }
}
