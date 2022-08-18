package deque;

import linked_list.DoublyLinkedList;

import java.awt.dnd.InvalidDnDOperationException;


public class Deque<T> {

    DoublyLinkedList<T> store = new DoublyLinkedList<>();

    public void enqueueHead(T value) {
        store.addHead(value);
    }

    public void enqueueTail(T value) {
        store.addTail(value);
    }

    public void dequeueHead() {
        store.removeFirst();
    }

    public void dequeueTail() {
        store.removeLast();
    }

    public T peekHead() {
        return store.getHead().value;
    }
    public T peekTail() {
        return store.getTail().value;
    }

    public int count() {
        return store.count;
    }
}
