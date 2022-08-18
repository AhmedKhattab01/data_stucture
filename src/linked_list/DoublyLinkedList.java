package linked_list;

public class DoublyLinkedList<T> {
    public static class Node<TNode> {
        public TNode value;
        public Node<TNode> next;
        public Node<TNode> previous;
        public Node(TNode value) {
            this.value = value;
        }
    }
    public int count = 0;
    private Node<T> head = null;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    private Node<T> tail = null;

    // Add value to the head (Start) of the list
    public void addHead(T value) {

        // Allocate new node
        Node<T> adding = new Node<>(value);

        if (head == null)
        {
            head = tail = adding;

            head.previous = null;
            tail.next = null;
        }
        else {
            // if there is an existing head node then update its previous pointer to the new node
            if (head != null) {
                head.previous = adding;
            }

            // Set head pointer to a new node
            head = adding;

            // if the list was empty (tail = null) then the head and tail are the same
            if (tail == null) {
                tail = head;
            }

            // Increment the count value which indicate the numbers of items in the list
            count++;
        }
    }

    // Add value to the tail (End) of the list
    public void addTail(T value) {

        // if the list is empty defer to add head
        if (tail == null) {
            addHead(value);
        } else {
            // Allocate the node being added
            Node<T> adding = new Node<>(value);

            // Point the current tail next to the new node
            if (tail != null)
            {
                tail.next = adding;
            }

            // Set the list tail to the new node
            tail = adding;

            // Increment the count value which indicate the numbers of items in the list
            count++;
        }
    }

    public void removeFirst()
    {
        if (count != 0)
        {
            head = head.next;
            count--;

            if (count == 0)
            {
                tail = null;
            }
        }
    }

    public void removeLast()
    {
        if (count != 0)
        {
            tail = tail.previous;
            count--;

            if (count == 0)
            {
                head = null;
            }
        }
    }

    // Find specific value by searching nodes
    private Node<T> find(T value) {
        Node<T> current = head;

        while (current != null) {
            if (current.value.equals(value))
                return current;

            current = current.next;
        }

        return null;
    }

    // Check if the list contains a specific value
    public boolean contains(T value) {
        return find(value) != null;
    }

    // Find item that we want to remove
    public boolean remove(T item) {
        Node<T> found = find(item);

        // if the find function returned null that means that the item is not in the list so return false
        if (found == null) {
            return false;
        }

        Node<T> previous = found.previous; // declare the previous node of the found node
        Node<T> next = found.next; // declare the next node of the found node


        // if the previous node is null that means we are removing the head
        if (previous == null) {
            // Update the head node
            head = next;

            // if the updated head is not null set his previous to null
            if (head != null) {
                head.previous = null;
            }
        }

        // if we are not removing the head, we have a non-null previous value
        // we will update the next value of the previous node to the next node of the node going to be deleted
        else {
            previous.next = next;
        }

        // if the next value equal null that means we are removing the tail
        if (next == null) {
            // update the tail node
            tail = previous;

            // if the updated tail is not null set his next to null
            if (tail != null) {
                tail.next = null;
            }
        }
        // if we are not removing the tail, we have a non-null next value
        // we will update the previous value of the next node to the previous node of the node going to be deleted
        else {
            next.previous = previous;
        }

        count--; // decrement the nodes counts by one because we removed a node
        return true;
    }

    public void getEnumerate()
    {
        Node<T> current = head;

        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }

    public void getEnumerateReverse()
    {
        Node<T> current = tail;

        if(tail == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }

        while (current.previous != null) {
            System.out.println(current.value);
            current = current.previous;
        }
        System.out.println(current.value);
    }
}

