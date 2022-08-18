package linked_list;

public class SinglyLinkedListNode<TNode> {
    public SinglyLinkedListNode(TNode value) {
        this.value = value;
        this.next = null;
    }

    public SinglyLinkedListNode<TNode> next;
    public TNode value;
}
