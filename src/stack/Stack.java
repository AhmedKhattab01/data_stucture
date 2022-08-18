package stack;

import deque.Deque;

public class Stack<T> {
    Deque<T> store = new Deque();

    public void push(T item)
    {
        store.enqueueHead(item);
    }

    public void Pop()
    {
        store.dequeueHead();
    }

    public T peek() {
        return store.peekHead();
    }

    public int count () {
        return store.count();
    }
}
