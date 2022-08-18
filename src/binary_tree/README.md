# Binary Tree
BinaryTree class is used to allow coder to create and use a binary tree with multiple pre implemented methods such as
(add, remove, Traverse in-order,etc...)

## Usage
**add() : Void**

This function allow adding new item to the binary tree

**Params**
- ```value``` {int} required input  

**Example**
```java
    BinaryTree x = new BinaryTree();
    x.add(4);
    
    // Add value 4 of type integer to the binary tree
```

**traverseInOrder() : Void**

This function print out the binary tree list in an in-order form 

**Params**
- ```node``` {Node} required input  

**Example**
```java
    BinaryTree x = new BinaryTree();
    
    x.add(4);
    x.add(1);
    x.add(8);
    
    x.traverseInOrder(bt.root);
    // => 1 4 8
```

**traversePreOrder() : Void**

This function print out the binary tree list in an pre-order form 

**Params**
- ```node``` {Node} required input  

**Example**
```java
    BinaryTree x = new BinaryTree();
    
    x.add(4);
    x.add(1);
    x.add(8);
    
    x.traversePreOrder(bt.root);
    // => 4 1 8
```
