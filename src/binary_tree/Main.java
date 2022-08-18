package binary_tree;

public class Main {
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        bt.add(4);
        bt.add(1);
        bt.add(8);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        bt.delete(1);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.containsNode(4));



    }
}
