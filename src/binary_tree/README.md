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
<hr>

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

<hr>

**traversePreOrder() : Void**

This function print out the binary tree list in a pre-order form 

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

<hr>

**traversePostOrder() : Void**

This function print out the binary tree list in a post-order form 

**Params**
- ```node``` {Node} required input  

**Example**
```java
    BinaryTree x = new BinaryTree();
    
    x.add(4);
    x.add(1);
    x.add(8);
    
    x.traversePostOrder(bt.root);
    // => 1 8 4
```

<hr>

**containsNode() : Boolean**

This function return a boolean value and used to check if a given item is exist in the list or not, return true if the list contain the item.

**Params**
- ```value``` {int} required input  

**Example**
```java
    BinaryTree x = new BinaryTree();
    
    x.add(4);
    x.add(1);
    x.add(8);
    
    System.out.println(bt.containsNode(4));
    // => true
```

<hr>


