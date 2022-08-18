# Linked List
LinkedList class is used to allow coder to create and use a Linked List with multiple pre implemented methods such as
(addHead, addTail, removeHead,etc...)

## Usage
**addHead() : Void**

This function add new item to the head of the Linked List.

**Params**
- ```value``` {T} required input  // Generic

**Example**
```java
    DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();
    ints.addHead(1);
    System.out.println(ints.getHead().value);
    
    // => 1
```
<hr>

**addTail() : Void**

This function add new item to the tail of the Linked List.

**Params**
- ```value``` {T} required input  // Generic

**Example**
```java
    DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();
    ints.addTail(1);
    System.out.println(ints.getTail().value);
    
    // => 1
```

<hr>

**removeFirst() : Void**

This function remove the head of the list

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addHead(1);
        System.out.println(ints.getHead().value);
        ints.removeFirst();
        System.out.println(ints.getHead().value);
        
        // => 1   
        // => null
```

<hr>

**removeLast() : Void**

This function remove the head of the list

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addTail(1);
        System.out.println(ints.getTail().value);
        ints.removeLast();
        System.out.println(ints.getTail().value);

        // => 1   
        // => null
```

<hr>

**contains() : Boolean**

This function return a boolean value and used to check if a given item is exist in the list or not, return true if the list contain the item.

**Params**
- ```value``` {T} required input  // Generic type

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();
        
        ints.addHead(2);
        System.out.println(ints.contains(2));
        System.out.println(ints.contains(3));
        
        // => true
        // => false
```

<hr>

**remove() : Boolean**

This function return a boolean value and used to check if a given item is exist in the list or not, if it exists then it will removed from the list.

**Params**
- ```value``` {T} required input  // Generic type

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addHead(2);
        ints.addHead(5);
        ints.addHead(6);

        ints.remove(5);

        System.out.println(ints.contains(5));
        
        // => false
```

<hr>


**getEnumerate() : Void**

This function print out all the list items in original order from head to tail

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addTail(2);
        ints.addTail(5);
        ints.addTail(6);

        ints.getEnumerate();
        
        // => 2 5 6       
```

<hr>

**getEnumerateReverse() : Void**

This function print out all the list items in reverse order from tail to head

**Example**
```java
        DoublyLinkedList<Integer> ints = new DoublyLinkedList<Integer>();

        ints.addHead(2);
        ints.addHead(5);
        ints.addHead(6);

        ints.getEnumerateReverse();
        
        // => 2 5 6       
```

<hr>
