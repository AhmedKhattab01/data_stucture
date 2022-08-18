package queue;

public class Main {
    public static void main(String[] args) {
        Queue x = new Queue();

        x.enqueue(4);
        x.enqueue(5);
        x.enqueue(7);

        System.out.println(x.count());

        System.out.println(x.peek());

        x.dequeue();

        System.out.println(x.count());
        System.out.println(x.peek());
    }
}
