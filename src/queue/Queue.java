package queue;

import deque.Deque;

public class Queue<T> {
    Deque<T> store = new Deque<>();

    public void enqueue(T value)
    {
        store.enqueueTail(value);
    }
    public void dequeue() {
        store.dequeueHead();
    }
    public T peek() {
       return store.peekHead();
    }
    public int count() {
        return store.count();
    }
}
